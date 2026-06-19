package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzgxu {
    public static long zza(long j2, long j5, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j6 = j2 / j5;
        long j7 = j2 - (j5 * j6);
        if (j7 == 0) {
            return j6;
        }
        int i5 = ((int) ((j2 ^ j5) >> 63)) | 1;
        switch (zzgxt.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(false);
                return j6;
            case 2:
                return j6;
            case 3:
                if (i5 >= 0) {
                    return j6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return j6;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j7);
                long abs2 = abs - (Math.abs(j5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j6) == 0)) {
                        return j6;
                    }
                } else if (abs2 <= 0) {
                    return j6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j6 + i5;
    }

    public static long zzb(long j2, long j5) {
        zzgxv.zza("a", j2);
        zzgxv.zza("b", j5);
        if (j2 == 0) {
            return j5;
        }
        if (j5 == 0) {
            return j2;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long j6 = j2 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros2;
        while (j6 != j7) {
            long j8 = j6 - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            j6 = j10 >> Long.numberOfTrailingZeros(j10);
            j7 += j9;
        }
        return j6 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long zzc(long j2, long j5) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (numberOfLeadingZeros > 65) {
            return j2 * j5;
        }
        long j6 = j2 ^ j5;
        long j7 = (j6 >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j5 == Long.MIN_VALUE) & (j2 < 0)))) {
            long j8 = j2 * j5;
            if (j2 == 0 || j8 / j2 == j5) {
                return j8;
            }
        }
        return j7;
    }
}
