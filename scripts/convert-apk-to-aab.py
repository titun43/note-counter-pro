#!/usr/bin/env python3
"""
Convert APK to AAB (Android App Bundle) for Play Store upload.

Usage:
    python3 convert-apk-to-aab.py <input.apk> <keystore> <ks_password> <key_alias> <key_password>

Example:
    python3 convert-apk-to-aab.py note-counter-pro.apk note-counter-pro.keystore Notecounter@2026 notecounter Notecounter@2026

Requirements (auto-installed if missing):
    - apktool
    - aapt2 (from Android SDK build-tools)
    - bundletool
    - apksigner (from Android SDK build-tools)
    - zipalign (from Android SDK build-tools)

Output:
    Creates <input-name>.aab in the same directory as input APK
"""

import os
import sys
import subprocess
import shutil
import tempfile
import urllib.request
from pathlib import Path


def run(cmd, check=True, capture=False):
    """Run a shell command."""
    print(f">>> {cmd}")
    if capture:
        result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
        if check and result.returncode != 0:
            print(f"STDERR: {result.stderr}")
            raise RuntimeError(f"Command failed: {cmd}")
        return result.stdout.strip()
    else:
        result = subprocess.run(cmd, shell=True)
        if check and result.returncode != 0:
            raise RuntimeError(f"Command failed: {cmd}")
        return None


def find_tool(name, search_paths=None):
    """Find a tool in PATH or search paths."""
    # Check PATH first
    path = shutil.which(name)
    if path:
        return path
    
    # Check common Android SDK locations
    if search_paths:
        for sp in search_paths:
            candidate = os.path.join(sp, name)
            if os.path.exists(candidate):
                return candidate
    
    return None


def find_android_sdk():
    """Find Android SDK location."""
    sdk = os.environ.get('ANDROID_HOME') or os.environ.get('ANDROID_SDK_ROOT')
    if sdk and os.path.exists(sdk):
        return sdk
    
    # Common locations
    common = [
        os.path.expanduser('~/Android/Sdk'),
        os.path.expanduser('~/Library/Android/sdk'),
        '/usr/local/lib/android/sdk',
        '/opt/android-sdk',
    ]
    for c in common:
        if os.path.exists(c):
            return c
    
    return None


def find_build_tools():
    """Find build-tools directory and return its path."""
    sdk = find_android_sdk()
    if not sdk:
        return None
    
    bt_dir = os.path.join(sdk, 'build-tools')
    if not os.path.exists(bt_dir):
        return None
    
    # Get latest version
    versions = sorted(os.listdir(bt_dir), reverse=True)
    if versions:
        return os.path.join(bt_dir, versions[0])
    
    return None


def find_android_jar():
    """Find android.jar in SDK."""
    sdk = find_android_sdk()
    if not sdk:
        return None
    
    platforms_dir = os.path.join(sdk, 'platforms')
    if not os.path.exists(platforms_dir):
        return None
    
    # Get latest platform
    platforms = sorted(os.listdir(platforms_dir), reverse=True)
    for p in platforms:
        jar = os.path.join(platforms_dir, p, 'android.jar')
        if os.path.exists(jar):
            return jar
    
    return None


def download_bundletool():
    """Download bundletool if not present."""
    bt_jar = os.path.join(os.path.dirname(__file__), 'bundletool.jar')
    if os.path.exists(bt_jar):
        return bt_jar
    
    print("Downloading bundletool...")
    url = "https://github.com/google/bundletool/releases/download/1.18.3/bundletool-all-1.18.3.jar"
    urllib.request.urlretrieve(url, bt_jar)
    return bt_jar


def find_apktool():
    """Find apktool."""
    # Check common locations
    candidates = [
        '/home/z/my-project/apktool.jar',
        os.path.expanduser('~/apktool.jar'),
        'apktool.jar',
        shutil.which('apktool'),
    ]
    for c in candidates:
        if c and os.path.exists(c):
            return c
    return None


def download_apktool():
    """Download apktool if not present."""
    at_jar = os.path.join(os.path.dirname(__file__), 'apktool.jar')
    if os.path.exists(at_jar):
        return at_jar
    
    print("Downloading apktool...")
    url = "https://github.com/iBotPeaches/Apktool/releases/download/v2.9.3/apktool_2.9.3.jar"
    urllib.request.urlretrieve(url, at_jar)
    return at_jar


def convert_apk_to_aab(apk_path, keystore, ks_pass, ks_alias, key_pass):
    """Convert APK to AAB."""
    apk_path = os.path.abspath(apk_path)
    keystore = os.path.abspath(keystore)
    
    if not os.path.exists(apk_path):
        raise FileNotFoundError(f"APK not found: {apk_path}")
    if not os.path.exists(keystore):
        raise FileNotFoundError(f"Keystore not found: {keystore}")
    
    # Find tools
    build_tools = find_build_tools()
    if not build_tools:
        raise RuntimeError(
            "Android SDK build-tools not found. Install Android SDK or set ANDROID_HOME.\n"
            "Common locations checked: ~/Android/Sdk, ~/Library/Android/sdk, /usr/local/lib/android/sdk"
        )
    
    aapt2 = os.path.join(build_tools, 'aapt2')
    apksigner = os.path.join(build_tools, 'apksigner')
    zipalign = os.path.join(build_tools, 'zipalign')
    
    android_jar = find_android_jar()
    if not android_jar:
        raise RuntimeError("android.jar not found in Android SDK platforms")
    
    apktool = find_apktool() or download_apktool()
    bundletool = download_bundletool()
    
    print(f"\n=== Tool Locations ===")
    print(f"aapt2:       {aapt2}")
    print(f"apksigner:   {apksigner}")
    print(f"zipalign:    {zipalign}")
    print(f"android.jar: {android_jar}")
    print(f"apktool:     {apktool}")
    print(f"bundletool:  {bundletool}")
    
    # Create working directory
    work_dir = tempfile.mkdtemp(prefix='apk2aab_')
    print(f"\n=== Working Directory: {work_dir} ===")
    
    try:
        os.chdir(work_dir)
        
        # Step 1: Decompile APK with apktool
        print("\n=== Step 1: Decompiling APK with apktool ===")
        run(f"java -jar {apktool} d -f -o decompiled {apk_path}")
        
        # Step 2: Create base module structure
        print("\n=== Step 2: Creating base module structure ===")
        os.makedirs('base/dex', exist_ok=True)
        os.makedirs('base/res', exist_ok=True)
        os.makedirs('base/assets', exist_ok=True)
        os.makedirs('base/lib', exist_ok=True)
        os.makedirs('base/manifest', exist_ok=True)
        os.makedirs('base/root', exist_ok=True)
        
        # Step 3: Extract APK for dex, assets, lib
        print("\n=== Step 3: Extracting APK for dex/assets/lib ===")
        os.makedirs('apk_extracted', exist_ok=True)
        run(f"unzip -q {apk_path} -d apk_extracted")
        
        # Copy dex files
        for dex in Path('apk_extracted').glob('*.dex'):
            shutil.copy(dex, 'base/dex/')
            print(f"  Copied {dex.name}")
        
        # Copy assets
        if os.path.exists('apk_extracted/assets'):
            shutil.copytree('apk_extracted/assets', 'base/assets', dirs_exist_ok=True)
            print("  Copied assets/")
        
        # Copy lib
        if os.path.exists('apk_extracted/lib'):
            shutil.copytree('apk_extracted/lib', 'base/lib', dirs_exist_ok=True)
            print("  Copied lib/")
        
        # Step 4: Compile resources with aapt2
        print("\n=== Step 4: Compiling resources with aapt2 ===")
        os.makedirs('compiled', exist_ok=True)
        
        # Compile each resource directory
        res_dir = 'decompiled/res'
        if os.path.exists(res_dir):
            # Use aapt2 compile on the whole res folder
            run(f"{aapt2} compile --dir {res_dir} -o compiled/resources.zip")
            print("  Compiled all resources to resources.zip")
        
        # Step 5: Link resources in proto format
        print("\n=== Step 5: Linking resources in proto format ===")
        run(
            f"{aapt2} link --proto-format "
            f"-I {android_jar} "
            f"--manifest decompiled/AndroidManifest.xml "
            f"-o linked.apk "
            f"compiled/resources.zip"
        )
        
        # Step 6: Extract proto-format files
        print("\n=== Step 6: Extracting proto-format files ===")
        os.makedirs('linked', exist_ok=True)
        run(f"unzip -q linked.apk -d linked")
        
        # Copy resources.pb
        if os.path.exists('linked/resources.pb'):
            shutil.copy('linked/resources.pb', 'base/res/')
            print("  Copied resources.pb")
        else:
            print("  WARNING: resources.pb not found in linked output")
        
        # Copy AndroidManifest.xml (in proto format)
        if os.path.exists('linked/AndroidManifest.xml'):
            shutil.copy('linked/AndroidManifest.xml', 'base/manifest/')
            print("  Copied AndroidManifest.xml")
        
        # Copy res folder (PNGs etc in proto format)
        if os.path.exists('linked/res'):
            # Copy contents, not the directory itself
            for item in os.listdir('linked/res'):
                src = os.path.join('linked/res', item)
                dst = os.path.join('base/res', item)
                if os.path.isdir(src):
                    shutil.copytree(src, dst, dirs_exist_ok=True)
                else:
                    shutil.copy(src, dst)
            print("  Copied res/ contents")
        
        # Step 7: Create base.zip module
        print("\n=== Step 7: Creating base.zip module ===")
        os.chdir('base')
        run(f"zip -r ../base.zip . -x '*.DS_Store'")
        os.chdir('..')
        
        # Step 8: Build AAB with bundletool
        print("\n=== Step 8: Building AAB with bundletool ===")
        run(f"java -jar {bundletool} build-bundle --modules=base.zip --output=app-unsigned.aab")
        
        # Step 9: Sign AAB
        print("\n=== Step 9: Signing AAB ===")
        aab_name = Path(apk_path).stem + '.aab'
        aab_path = os.path.join(os.path.dirname(apk_path), aab_name)
        
        run(
            f"{apksigner} sign "
            f"--ks {keystore} "
            f"--ks-pass pass:{ks_pass} "
            f"--ks-key-alias {ks_alias} "
            f"--key-pass pass:{key_pass} "
            f"--v1-signing-enabled true "
            f"--v2-signing-enabled true "
            f"--v3-signing-enabled true "
            f"--v4-signing-enabled false "
            f"--out {aab_path} "
            f"app-unsigned.aab"
        )
        
        # Step 10: Verify
        print("\n=== Step 10: Verifying AAB signature ===")
        run(f"{apksigner} verify --verbose {aab_path}")
        
        # Get file size
        size_mb = os.path.getsize(aab_path) / (1024 * 1024)
        print(f"\n=== SUCCESS ===")
        print(f"AAB file: {aab_path}")
        print(f"Size: {size_mb:.2f} MB")
        
        return aab_path
    
    finally:
        # Cleanup
        os.chdir('/')
        print(f"\nCleaning up working directory: {work_dir}")
        shutil.rmtree(work_dir, ignore_errors=True)


def main():
    if len(sys.argv) != 6:
        print(__doc__)
        sys.exit(1)
    
    apk_path = sys.argv[1]
    keystore = sys.argv[2]
    ks_pass = sys.argv[3]
    ks_alias = sys.argv[4]
    key_pass = sys.argv[5]
    
    try:
        aab_path = convert_apk_to_aab(apk_path, keystore, ks_pass, ks_alias, key_pass)
        print(f"\n✅ AAB created successfully: {aab_path}")
        print(f"\nUpload this AAB to Google Play Console for app release.")
    except Exception as e:
        print(f"\n❌ Error: {e}")
        sys.exit(1)


if __name__ == '__main__':
    main()
