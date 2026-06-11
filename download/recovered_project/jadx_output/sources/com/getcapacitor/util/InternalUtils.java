package com.getcapacitor.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public class InternalUtils {
    public static PackageInfo getPackageInfo(PackageManager packageManager, String str) {
        return getPackageInfo(packageManager, str, 0L);
    }

    private static PackageInfo getPackageInfoLegacy(PackageManager packageManager, String str, long j2) {
        return packageManager.getPackageInfo(str, (int) j2);
    }

    public static PackageInfo getPackageInfo(PackageManager packageManager, String str, long j2) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            return getPackageInfoLegacy(packageManager, str, (int) j2);
        }
        of = PackageManager.PackageInfoFlags.of(j2);
        packageInfo = packageManager.getPackageInfo(str, of);
        return packageInfo;
    }
}
