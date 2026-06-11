package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhxo {
    public static byte[] zza(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 + i5;
            int digit = Character.digit(str.charAt(i6), 16);
            int digit2 = Character.digit(str.charAt(i6 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i5] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }
}
