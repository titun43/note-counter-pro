package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhii {
    public static void zza(long[] jArr, long[] jArr2, int i5) {
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = (int) jArr[i6];
            jArr[i6] = ((-i5) & (((int) jArr2[i6]) ^ i7)) ^ i7;
        }
    }
}
