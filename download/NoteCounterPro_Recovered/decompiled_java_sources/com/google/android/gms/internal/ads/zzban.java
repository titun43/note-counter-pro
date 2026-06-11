package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class zzban {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static String zza(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b2 = bArr[i5];
            char[] cArr2 = zzb;
            int i6 = i5 + i5;
            cArr[i6] = cArr2[(b2 & 255) >>> 4];
            cArr[i6 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] zzb(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i5 = 0; i5 < length; i5 += 2) {
            bArr[i5 / 2] = (byte) (Character.digit(str.charAt(i5 + 1), 16) + (Character.digit(str.charAt(i5), 16) << 4));
        }
        return bArr;
    }

    public static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zzd() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long zzf(double d5, int i5, DisplayMetrics displayMetrics) {
        return Math.round(d5 / displayMetrics.density);
    }
}
