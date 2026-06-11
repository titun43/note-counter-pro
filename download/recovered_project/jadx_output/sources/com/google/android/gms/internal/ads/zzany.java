package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzany {
    public static long zza(String str) {
        String str2 = zzfj.zza;
        String[] split = str.split("\\.", 2);
        long j2 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j2 = (j2 * 60) + Long.parseLong(str3);
        }
        long j5 = j2 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j5 += Long.parseLong(trim);
        }
        return j5 * 1000;
    }

    public static float zzb(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
