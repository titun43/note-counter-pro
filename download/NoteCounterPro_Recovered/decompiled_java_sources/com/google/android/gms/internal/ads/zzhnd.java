package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhnd {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i5 = 0;
        while (i5 < 16) {
            int i6 = i5 + 1;
            byte b2 = bArr[i5];
            byte b5 = (byte) ((b2 + b2) & 254);
            bArr2[i5] = b5;
            if (i5 < 15) {
                bArr2[i5] = (byte) (((bArr[i6] >> 7) & 1) | b5);
            }
            i5 = i6;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
