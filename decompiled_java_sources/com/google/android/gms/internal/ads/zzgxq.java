package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgxq {
    public static long zza(double d5) {
        zzgrc.zzb(zzb(d5), "not a normal value");
        int exponent = Math.getExponent(d5);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d5) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean zzb(double d5) {
        return Math.getExponent(d5) <= 1023;
    }
}
