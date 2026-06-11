package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgxv {
    public static long zza(String str, long j2) {
        if (j2 >= 0) {
            return j2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
