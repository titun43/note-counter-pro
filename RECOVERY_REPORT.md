# Note Counter Pro - APK Recovery Report

## App Information
| Field | Value |
|---|---|
| **App Name** | Note Counter Pro |
| **Package Name** | com.lokhnathtechnical.notecounterpro |
| **Version** | 2.8.0 (versionCode: 12) |
| **Min SDK** | 24 (Android 7.0) |
| **Target SDK** | 36 (Android 16) |
| **Technology** | Capacitor + Next.js (Hybrid App) |
| **Original APK** | app-release.apk (6.3 MB) |

---

## Project Structure

```
NoteCounterPro_Recovered/
├── app/
│   ├── build.gradle                    # App-level Gradle config
│   ├── proguard-rules.pro              # ProGuard rules
│   └── src/main/
│       ├── AndroidManifest.xml         # App manifest (fully recovered)
│       ├── assets/
│       │   ├── capacitor.config.json   # Capacitor configuration
│       │   ├── capacitor.plugins.json  # Plugin registry
│       │   ├── native-bridge.js        # Capacitor native bridge
│       │   └── public/                 # ⭐ MAIN APP CODE (Next.js web app)
│       │       ├── index.html          # App entry point
│       │       ├── manifest.json       # PWA manifest
│       │       ├── _next/              # Next.js build (JS chunks, CSS, fonts)
│       │       ├── privacy-policy.html
│       │       ├── downloads/          # Downloadable assets
│       │       └── *.png/*.svg/*.ico   # Icons and images
│       ├── java/com/lokhnathtechnical/notecounterpro/
│       │   ├── MainActivity.java       # Main Activity (fully recovered)
│       │   ├── R.java                  # Resource references
│       │   └── plugins/
│       │       ├── ContactPickerPlugin.java  # Custom contact picker
│       │       └── PremiumPlugin.java       # In-app billing
│       └── res/                        # All Android resources (fully recovered)
│           ├── layout/                 # XML layouts
│           ├── mipmap-*/               # App icons (all densities)
│           ├── drawable-*/             # Drawables (all densities)
│           ├── values/                 # Strings, colors, styles, etc.
│           └── xml/                    # Config XMLs
├── decompiled_java_sources/            # All 9,171 decompiled Java files (jadx)
├── decompiled_resources/               # Alternative resource view (jadx)
├── smali_code/                         # Smali bytecode (149 packages)
├── kotlin_metadata/                    # Kotlin metadata files
├── original_signing/                   # Original signing info
├── build.gradle                        # Project-level Gradle config
├── settings.gradle                     # Project settings
├── gradle.properties                   # Gradle properties
└── gradle/wrapper/                     # Gradle wrapper config
```

---

## Recovery Quality Assessment

### ✅ Fully Recovered (100%)
- **AndroidManifest.xml** - Complete with all permissions, activities, services
- **All Resources** - Layouts, drawables, mipmaps, strings, colors, styles
- **Capacitor Config** - capacitor.config.json and plugins.json
- **Web App Assets** - Complete Next.js build output (HTML, JS, CSS, fonts, images)
- **MainActivity.java** - Clean, readable decompiled source
- **Custom Plugins** - ContactPickerPlugin.java, PremiumPlugin.java

### ⚠️ Partially Recovered (Deobfuscation needed)
- **ProGuard Obfuscated Code** - Most Java classes renamed to a, b, c, etc.
  - 149 obfuscated smali packages
  - 9,171 decompiled Java files with obfuscated names
  - Variable names lost in release build

### ❌ Not Recoverable
- **Original Gradle build files** - Reconstructed from APK metadata
- **Kotlin source** - Only bytecode/metadata available
- **Comments & Documentation** - Lost during compilation
- **Git history** - Not included in APK

---

## Capacitor Plugins Used
| Plugin | Package | Class |
|---|---|---|
| AdMob | @capacitor-community/admob | com.getcapacitor.community.admob.AdMob |
| App | @capacitor/app | com.capacitorjs.plugins.app.AppPlugin |
| Filesystem | @capacitor/filesystem | com.capacitorjs.plugins.filesystem.FilesystemPlugin |
| Haptics | @capacitor/haptics | com.capacitorjs.plugins.haptics.HapticsPlugin |
| Share | @capacitor/share | com.capacitorjs.plugins.share.SharePlugin |
| ContactPicker | Custom | com.lokhnathtechnical.notecounterpro.plugins.ContactPickerPlugin |
| Premium | Custom | com.lokhnathtechnical.notecounterpro.plugins.PremiumPlugin |

---

## Key App Features (from analysis)
1. **Cash Note Counter** - Multi-currency support with business mode
2. **Contact Picker** - Read contacts to send payment info
3. **In-App Purchase** - Premium upgrade via Google Play Billing
4. **AdMob Ads** - Banner and Interstitial ads
5. **File Sharing** - Export/share reports
6. **PDF Generation** - pdf.worker.min.mjs found in assets

---

## AdMob Configuration
- **App ID**: ca-app-pub-1742730064755213~6546486804
- **Banner Ad ID**: ca-app-pub-1742730064755213/3078015084
- **Interstitial Ad ID**: ca-app-pub-1742730064755213/1816904301
- **Testing Mode**: Enabled

---

## Premium IAP
- **Product ID**: note_counter_pro_premium
- **Type**: One-time purchase (inapp)
- **Billing Library**: 7.1.1

---

## How to Rebuild

### Option 1: As Android Project (Native side only)
1. Open this folder in Android Studio
2. Let Gradle sync and download dependencies
3. The web assets in `app/src/main/assets/public/` will be loaded by Capacitor
4. Build and run

### Option 2: As Full Capacitor Project (Recommended)
Since this is a Capacitor app, the REAL app logic is in the web assets. To fully rebuild:
1. Create a new Next.js project
2. Extract the web app logic from `app/src/main/assets/public/`
3. The JS chunks in `_next/static/chunks/` contain the app logic (minified)
4. You would need to use a JavaScript beautifier/deobfuscator on the chunks
5. Set up Capacitor with the same plugins listed above
6. Copy the Android native plugins (ContactPickerPlugin, PremiumPlugin)

### Important Note on Web App Recovery
The Next.js JavaScript chunks are **minified but NOT fully obfuscated**. Unlike the Java code, the JavaScript code retains much of its structure. You can use tools like:
- **Prettier** - To format the minified JS
- **Source Map Explorer** - If source maps exist
- **Chrome DevTools** - To analyze the running app

---

## Tools Used for Recovery
| Tool | Version | Purpose |
|---|---|---|
| apktool | 2.9.3 | Resource & smali decompilation |
| jadx | 1.5.1 | Java source decompilation |

---

*Recovery date: 2026-06-12*
*Original file: app-release.apk (6.3 MB)*
