package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgyb {
    private static final byte[] zza;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < 10; i5++) {
            bArr[i5 + 48] = (byte) i5;
        }
        for (int i6 = 0; i6 < 26; i6++) {
            byte b2 = (byte) (i6 + 10);
            bArr[i6 + 65] = b2;
            bArr[i6 + 97] = b2;
        }
        zza = bArr;
    }

    public static int zza(char c5) {
        if (c5 < 128) {
            return zza[c5];
        }
        return -1;
    }
}
