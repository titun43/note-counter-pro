#!/usr/bin/env python3
"""Resize images for Play Store requirements"""
from PIL import Image
import os

# Source files
icon_src = "/home/z/my-project/download/playstore-package/03-Graphics/app-icon-1024.png"
feature_src = "/home/z/my-project/download/playstore-package/03-Graphics/feature-graphic-1440.png"

# Resize app icon to 512x512 (Play Store requirement)
img = Image.open(icon_src)
print(f"Original icon: {img.size}")
img_resized = img.resize((512, 512), Image.LANCZOS)
img_resized.save("/home/z/my-project/download/playstore-package/03-Graphics/app-icon-512.png", "PNG", optimize=True)
print("Saved app-icon-512.png (512x512)")

# Also keep 1024 version for higher-res use
img.save("/home/z/my-project/download/playstore-package/03-Graphics/app-icon-1024.png", "PNG", optimize=True)
print("Kept app-icon-1024.png (1024x1024)")

# Resize feature graphic to 1024x500 (Play Store requirement)
img = Image.open(feature_src)
print(f"\nOriginal feature graphic: {img.size}")
# Crop to 1024x500 from center
target_w, target_h = 1024, 500
src_w, src_h = img.size
# Calculate crop area (centered)
left = (src_w - target_w) // 2 if src_w > target_w else 0
top = (src_h - target_h) // 2 if src_h > target_h else 0
right = left + target_w if src_w > target_w else src_w
bottom = top + target_h if src_h > target_h else src_h

# If source is smaller, resize first to cover the target area
if src_w < target_w or src_h < target_h:
    # Resize to cover
    ratio = max(target_w / src_w, target_h / src_h)
    new_w = int(src_w * ratio)
    new_h = int(src_h * ratio)
    img = img.resize((new_w, new_h), Image.LANCZOS)
    src_w, src_h = new_w, new_h
    left = (src_w - target_w) // 2
    top = (src_h - target_h) // 2
    right = left + target_w
    bottom = top + target_h

img_cropped = img.crop((left, top, right, bottom))
img_cropped.save("/home/z/my-project/download/playstore-package/03-Graphics/feature-graphic-1024x500.png", "PNG", optimize=True)
print("Saved feature-graphic-1024x500.png (1024x500)")

# Verify
print("\n=== Final Files ===")
for fname in ["app-icon-512.png", "app-icon-1024.png", "feature-graphic-1024x500.png", "feature-graphic-1440.png"]:
    fpath = f"/home/z/my-project/download/playstore-package/03-Graphics/{fname}"
    if os.path.exists(fpath):
        img = Image.open(fpath)
        size_kb = os.path.getsize(fpath) / 1024
        print(f"  {fname}: {img.size}, {size_kb:.1f} KB")

# Remove the source feature graphic (not Play Store size)
src_feature = "/home/z/my-project/download/playstore-package/03-Graphics/feature-graphic-1440.png"
if os.path.exists(src_feature):
    os.remove(src_feature)
    print(f"\nRemoved intermediate file: feature-graphic-1440.png")

print("\nAll graphics ready for Play Store!")
