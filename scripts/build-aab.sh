#!/bin/bash
# Build AAB (Android App Bundle) - Final approach
# This works by:
#   1. Use aapt2 convert to convert existing APK to proto format
#      (this produces a valid proto ResourceTable)
#   2. Use bundletool to assemble AAB from proto APK + dex + assets

set -e

# Configuration
PROJECT_ROOT="/home/z/my-project"
KEYSTORE="$PROJECT_ROOT/upload/note-counter-pro.keystore"
KS_PASS="Notecounter@2026"
KS_ALIAS="notecounter"
KP_PASS="Notecounter@2026"
INPUT_APK="$PROJECT_ROOT/download/note-counter-pro-latest.apk"
OUTPUT_DIR="$PROJECT_ROOT/download"
WORK_DIR="$PROJECT_ROOT/build-aab-work3"

# Android SDK
export ANDROID_HOME="$PROJECT_ROOT/android-sdk"
BUILD_TOOLS="$ANDROID_HOME/build-tools/35.0.0"
AAPT2="$BUILD_TOOLS/aapt2"
APKSIGNER="$BUILD_TOOLS/apksigner"
ZIPALIGN="$BUILD_TOOLS/zipalign"
BUNDLETOOL="$ANDROID_HOME/bundletool.jar"

# Colors
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m'

log() { echo -e "${GREEN}[$(date +%H:%M:%S)]${NC} $1"; }
warn() { echo -e "${YELLOW}[WARN]${NC} $1"; }
err() { echo -e "${RED}[ERROR]${NC} $1"; }

# Clean working dir
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"
cd "$WORK_DIR"

log "=== STEP 1: Convert APK to proto format using aapt2 convert ==="
$AAPT2 convert \
  --output-format proto \
  -o app-proto.apk \
  "$INPUT_APK"
ls -lh app-proto.apk

log "=== STEP 2: Extract proto-format APK contents ==="
mkdir -p extracted
unzip -q app-proto.apk -d extracted
echo "Proto APK contents:"
ls extracted/ | head -10

log "=== STEP 3: Set up AAB base module structure ==="
mkdir -p base/manifest
mkdir -p base/dex
mkdir -p base/res
mkdir -p base/assets
mkdir -p base/root
mkdir -p base/lib

# IMPORTANT: resources.pb goes at the ROOT of base/, NOT inside res/
# This is what bundletool expects (BundleModule$SpecialModuleEntry.RESOURCE_TABLE)

# Copy AndroidManifest.xml (proto format from aapt2 convert)
cp extracted/AndroidManifest.xml base/manifest/
log "Copied AndroidManifest.xml (proto format)"

# Copy resources.pb to base/ root (NOT base/res/)
if [ -f extracted/resources.pb ]; then
  cp extracted/resources.pb base/
  log "Copied resources.pb to root"
else
  err "resources.pb not found!"
  exit 1
fi

# Copy res folder (proto format - PNGs and compiled XMLs)
if [ -d extracted/res ]; then
  # Copy each subdir
  for item in extracted/res/*; do
    if [ -d "$item" ]; then
      dirname=$(basename "$item")
      mkdir -p "base/res/$dirname"
      cp -r "$item"/* "base/res/$dirname/" 2>/dev/null || true
    fi
  done
  log "Copied res/ contents"
fi

# Copy dex files
ls extracted/classes*.dex 2>/dev/null | while read f; do
  cp "$f" base/dex/
  log "Copied $(basename $f)"
done

# Copy assets
if [ -d extracted/assets ]; then
  cp -r extracted/assets/* base/assets/ 2>/dev/null || true
  log "Copied assets/"
fi

# Copy native libs (lib/)
if [ -d extracted/lib ]; then
  cp -r extracted/lib base/
  log "Copied lib/"
fi

# Copy kotlin/ directory (built-ins) - put in root
if [ -d extracted/kotlin ]; then
  cp -r extracted/kotlin base/root/
  log "Copied kotlin/ to root/"
fi

# Copy META-INF/services to root (needed for some plugins)
if [ -d extracted/META-INF/services ]; then
  mkdir -p base/root/META-INF
  cp -r extracted/META-INF/services base/root/META-INF/
  log "Copied META-INF/services to root/"
fi

log "=== STEP 4: Create base.zip module ==="
cd base
zip -r ../base.zip . -x '*.DS_Store' 2>&1 | tail -3
cd ..
ls -lh base.zip

# Verify the zip structure
log "Verifying base.zip structure..."
unzip -l base.zip | grep -E "(resources.pb|AndroidManifest)" | head -5

log "=== STEP 5: Build AAB with bundletool ==="
java -jar "$BUNDLETOOL" build-bundle \
  --modules=base.zip \
  --output=app-unsigned.aab \
  --overwrite 2>&1

ls -lh app-unsigned.aab

log "=== STEP 6: Sign AAB with apksigner (v1+v2+v3) ==="
$APKSIGNER sign \
  --ks "$KEYSTORE" \
  --ks-pass "pass:$KS_PASS" \
  --ks-key-alias "$KS_ALIAS" \
  --key-pass "pass:$KP_PASS" \
  --v1-signing-enabled true \
  --v2-signing-enabled true \
  --v3-signing-enabled true \
  --v4-signing-enabled false \
  --min-sdk-version 24 \
  --out note-counter-pro.aab \
  app-unsigned.aab

log "=== STEP 7: Validate AAB with bundletool ==="
java -jar "$BUNDLETOOL" validate --bundle=note-counter-pro.aab 2>&1 | head -15

log "=== STEP 9: Copy AAB to download dir ==="
mkdir -p "$OUTPUT_DIR"
cp note-counter-pro.aab "$OUTPUT_DIR/"

log "=== AAB BUILT SUCCESSFULLY ==="
ls -lh "$OUTPUT_DIR/note-counter-pro.aab"
echo ""
echo "AAB file: $OUTPUT_DIR/note-counter-pro.aab"
echo "Size: $(du -h $OUTPUT_DIR/note-counter-pro.aab | cut -f1)"
