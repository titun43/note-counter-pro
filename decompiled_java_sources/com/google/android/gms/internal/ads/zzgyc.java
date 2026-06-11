package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyc {
    public static long[] zza(long[]... jArr) {
        long j2 = 0;
        for (long[] jArr2 : jArr) {
            j2 += jArr2.length;
        }
        int i5 = (int) j2;
        zzgrc.zze(j2 == ((long) i5), "the total number of elements (%s) in the arrays must fit in an int", j2);
        long[] jArr3 = new long[i5];
        int i6 = 0;
        for (long[] jArr4 : jArr) {
            int length = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i6, length);
            i6 += length;
        }
        return jArr3;
    }
}
