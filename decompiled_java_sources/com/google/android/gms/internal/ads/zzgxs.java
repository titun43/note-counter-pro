package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzgxs {
    public static int zza(int i5, RoundingMode roundingMode) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzgxr.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(((i5 + (-1)) & i5) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i5 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i5);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i5) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i5);
    }

    public static int zzb(int i5, int i6, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i6 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i7 = i5 / i6;
        int i8 = i5 - (i6 * i7);
        if (i8 == 0) {
            return i7;
        }
        int i9 = ((i5 ^ i6) >> 31) | 1;
        switch (zzgxr.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(false);
                return i7;
            case 2:
                return i7;
            case 3:
                if (i9 >= 0) {
                    return i7;
                }
                break;
            case 4:
                break;
            case 5:
                if (i9 <= 0) {
                    return i7;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i8);
                int abs2 = abs - (Math.abs(i6) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i7 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i7;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i7;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i7 + i9;
    }
}
