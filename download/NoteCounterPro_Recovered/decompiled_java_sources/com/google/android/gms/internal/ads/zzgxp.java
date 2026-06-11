package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzgxp {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(double d5, RoundingMode roundingMode) {
        double d6;
        long j2;
        long j5;
        if (!zzgxq.zzb(d5)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzgxo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(zzd(d5));
                d6 = d5;
                if (!((-9.223372036854776E18d) - d6 >= 1.0d) || !(d6 < 9.223372036854776E18d)) {
                    return (long) d6;
                }
                String valueOf = String.valueOf(roundingMode);
                StringBuilder sb = new StringBuilder(String.valueOf(d5).length() + 59 + valueOf.length());
                sb.append("rounded value is out of range for input ");
                sb.append(d5);
                sb.append(" and rounding mode ");
                sb.append(valueOf);
                throw new ArithmeticException(sb.toString());
            case 2:
                if (d5 < 0.0d && !zzd(d5)) {
                    j2 = (long) d5;
                    j5 = -1;
                    d6 = j2 + j5;
                    if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                    }
                }
                d6 = d5;
                if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d5 > 0.0d && !zzd(d5)) {
                    j2 = (long) d5;
                    j5 = 1;
                    d6 = j2 + j5;
                    if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                    }
                }
                d6 = d5;
                if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d6 = d5;
                if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!zzd(d5)) {
                    d6 = ((long) d5) + (d5 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                    }
                }
                d6 = d5;
                if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d6 = Math.rint(d5);
                if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d6 = Math.rint(d5);
                if (Math.abs(d5 - d6) == 0.5d) {
                    d6 = Math.copySign(0.5d, d5) + d5;
                }
                if (!(((-9.223372036854776E18d) - d6 >= 1.0d) & (d6 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d6 = Math.rint(d5);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzb(double d5) {
        if (d5 > 0.0d && zzgxq.zzb(d5)) {
            long zza2 = zzgxq.zza(d5);
            if ((zza2 & ((-1) + zza2)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(double d5, RoundingMode roundingMode) {
        boolean zzb;
        zzgrc.zzb(d5 > 0.0d && zzgxq.zzb(d5), "x must be positive and finite");
        int exponent = Math.getExponent(d5);
        if (Math.getExponent(d5) < -1022) {
            return zzc(d5 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgxo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(zzb(d5));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r1 = !zzb(d5);
                return !r1 ? exponent + 1 : exponent;
            case 4:
                r1 = exponent < 0;
                zzb = zzb(d5);
                r1 &= !zzb;
                if (!r1) {
                }
                break;
            case 5:
                r1 = exponent >= 0;
                zzb = zzb(d5);
                r1 &= !zzb;
                if (!r1) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d5) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r1 = true;
                }
                if (!r1) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzd(double d5) {
        if (zzgxq.zzb(d5)) {
            return d5 == 0.0d || 52 - Long.numberOfTrailingZeros(zzgxq.zza(d5)) <= Math.getExponent(d5);
        }
        return false;
    }
}
