#!/usr/bin/env python3
"""
Compile all resource files in a directory using aapt2.
Each file is compiled individually and combined into a single zip.
"""
import os
import sys
import subprocess
import tempfile
import shutil
from pathlib import Path

def compile_resource_dir(aapt2_path, input_dir, output_zip):
    """Compile all resource files in a directory tree."""
    input_dir = Path(input_dir)
    output_zip = Path(output_zip)
    
    if output_zip.exists():
        output_zip.unlink()
    
    # Find all files to compile
    files_to_compile = []
    for root, dirs, files in os.walk(input_dir):
        for f in files:
            if f.startswith('.'):
                continue
            files_to_compile.append(Path(root) / f)
    
    print(f"Found {len(files_to_compile)} files in {input_dir}")
    
    if not files_to_compile:
        print(f"WARNING: No files found in {input_dir}")
        # Create empty zip
        import zipfile
        with zipfile.ZipFile(output_zip, 'w') as zf:
            pass
        return
    
    # Compile all files at once
    cmd = [aapt2_path, 'compile'] + [str(f) for f in files_to_compile] + ['-o', str(output_zip)]
    print(f"Running: aapt2 compile [{len(files_to_compile)} files] -o {output_zip}")
    result = subprocess.run(cmd, capture_output=True, text=True)
    if result.returncode != 0:
        print(f"STDOUT: {result.stdout}")
        print(f"STDERR: {result.stderr}")
        raise RuntimeError(f"aapt2 compile failed for {input_dir}")
    
    # Verify zip is not empty
    import zipfile
    if output_zip.exists():
        with zipfile.ZipFile(output_zip, 'r') as zf:
            files_in_zip = zf.namelist()
            print(f"  -> {len(files_in_zip)} files compiled")
            if not files_in_zip:
                print(f"  WARNING: zip is empty!")


def main():
    if len(sys.argv) < 4:
        print(f"Usage: {sys.argv[0]} <aapt2_path> <input_dir> <output_zip>")
        sys.exit(1)
    
    aapt2_path = sys.argv[1]
    input_dir = sys.argv[2]
    output_zip = sys.argv[3]
    
    compile_resource_dir(aapt2_path, input_dir, output_zip)


if __name__ == '__main__':
    main()
