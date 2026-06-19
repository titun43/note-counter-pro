package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhiv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzc = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzd = {67108863, 33554431};
    private static final int[] zze = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i5 = 0; i5 < 10; i5++) {
            jArr[i5] = jArr2[i5] + jArr3[i5];
        }
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i5 = 0; i5 < 10; i5++) {
            jArr[i5] = jArr2[i5] - jArr3[i5];
        }
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j2 = jArr[8];
        long j5 = jArr[18];
        long j6 = j2 + (j5 << 4);
        jArr[8] = j6;
        long j7 = j5 + j5 + j6;
        jArr[8] = j7;
        jArr[8] = j7 + j5;
        long j8 = jArr[7];
        long j9 = jArr[17];
        long j10 = j8 + (j9 << 4);
        jArr[7] = j10;
        long j11 = j9 + j9 + j10;
        jArr[7] = j11;
        jArr[7] = j11 + j9;
        long j12 = jArr[6];
        long j13 = jArr[16];
        long j14 = j12 + (j13 << 4);
        jArr[6] = j14;
        long j15 = j13 + j13 + j14;
        jArr[6] = j15;
        jArr[6] = j15 + j13;
        long j16 = jArr[5];
        long j17 = jArr[15];
        long j18 = j16 + (j17 << 4);
        jArr[5] = j18;
        long j19 = j17 + j17 + j18;
        jArr[5] = j19;
        jArr[5] = j19 + j17;
        long j20 = jArr[4];
        long j21 = jArr[14];
        long j22 = j20 + (j21 << 4);
        jArr[4] = j22;
        long j23 = j21 + j21 + j22;
        jArr[4] = j23;
        jArr[4] = j23 + j21;
        long j24 = jArr[3];
        long j25 = jArr[13];
        long j26 = j24 + (j25 << 4);
        jArr[3] = j26;
        long j27 = j25 + j25 + j26;
        jArr[3] = j27;
        jArr[3] = j27 + j25;
        long j28 = jArr[2];
        long j29 = jArr[12];
        long j30 = j28 + (j29 << 4);
        jArr[2] = j30;
        long j31 = j29 + j29 + j30;
        jArr[2] = j31;
        jArr[2] = j31 + j29;
        long j32 = jArr[1];
        long j33 = jArr[11];
        long j34 = j32 + (j33 << 4);
        jArr[1] = j34;
        long j35 = j33 + j33 + j34;
        jArr[1] = j35;
        jArr[1] = j35 + j33;
        long j36 = jArr[0];
        long j37 = jArr[10];
        long j38 = j36 + (j37 << 4);
        jArr[0] = j38;
        long j39 = j37 + j37 + j38;
        jArr[0] = j39;
        jArr[0] = j39 + j37;
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i5 = 0;
        while (i5 < 10) {
            long j2 = jArr[i5];
            long j5 = j2 / 67108864;
            jArr[i5] = j2 - (j5 << 26);
            int i6 = i5 + 1;
            long j6 = jArr[i6] + j5;
            jArr[i6] = j6;
            long j7 = j6 / 33554432;
            jArr[i6] = j6 - (j7 << 25);
            i5 += 2;
            jArr[i5] = jArr[i5] + j7;
        }
        long j8 = jArr[0];
        long j9 = jArr[10];
        long j10 = j8 + (j9 << 4);
        jArr[0] = j10;
        long j11 = j9 + j9 + j10;
        jArr[0] = j11;
        long j12 = j11 + j9;
        jArr[0] = j12;
        jArr[10] = 0;
        long j13 = j12 / 67108864;
        jArr[0] = j12 - (j13 << 26);
        jArr[1] = jArr[1] + j13;
    }

    public static void zze(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr2[0];
        long j5 = jArr3[0];
        long j6 = j2 * j5;
        long j7 = jArr3[1];
        long j8 = jArr2[1];
        long j9 = (j8 * j5) + (j2 * j7);
        long j10 = jArr3[2];
        long j11 = jArr2[2];
        long j12 = ((j8 + j8) * j7) + (j2 * j10) + (j11 * j5);
        long j13 = jArr3[3];
        long j14 = jArr2[3];
        long j15 = (j8 * j10) + (j11 * j7) + (j2 * j13) + (j14 * j5);
        long j16 = jArr3[4];
        long j17 = jArr2[4];
        long j18 = (j8 * j13) + (j14 * j7);
        long j19 = j18 + j18 + (j11 * j10) + (j2 * j16) + (j17 * j5);
        long j20 = jArr3[5];
        long j21 = jArr2[5];
        long j22 = (j11 * j13) + (j14 * j10) + (j8 * j16) + (j17 * j7) + (j2 * j20) + (j21 * j5);
        long j23 = jArr3[6];
        long j24 = jArr2[6];
        long j25 = (j14 * j13) + (j8 * j20) + (j21 * j7);
        long j26 = j25 + j25 + (j11 * j16) + (j17 * j10) + (j2 * j23) + (j24 * j5);
        long j27 = jArr3[7];
        long j28 = jArr2[7];
        long j29 = (j14 * j16) + (j17 * j13) + (j11 * j20) + (j21 * j10) + (j8 * j23) + (j24 * j7) + (j2 * j27) + (j28 * j5);
        long j30 = jArr3[8];
        long j31 = jArr2[8];
        long j32 = (j14 * j20) + (j21 * j13) + (j8 * j27) + (j28 * j7);
        long j33 = j32 + j32 + (j17 * j16) + (j11 * j23) + (j24 * j10) + (j2 * j30) + (j31 * j5);
        long j34 = jArr3[9];
        long j35 = jArr2[9];
        long j36 = (j17 * j20) + (j21 * j16) + (j14 * j23) + (j24 * j13) + (j11 * j27) + (j28 * j10) + (j8 * j30) + (j31 * j7) + (j2 * j34) + (j5 * j35);
        long j37 = (j21 * j20) + (j14 * j27) + (j28 * j13) + (j8 * j34) + (j7 * j35);
        long j38 = (j21 * j27) + (j28 * j20) + (j14 * j34) + (j13 * j35);
        long j39 = (j28 * j27) + (j21 * j34) + (j20 * j35);
        long j40 = (j28 * j30) + (j31 * j27) + (j24 * j34) + (j23 * j35);
        long j41 = (j27 * j35) + (j28 * j34);
        zzc(new long[]{j6, j9, j12, j15, j19, j22, j26, j29, j33, j36, j37 + j37 + (j17 * j23) + (j24 * j16) + (j11 * j30) + (j31 * j10), (j21 * j23) + (j24 * j20) + (j17 * j27) + (j28 * j16) + (j14 * j30) + (j31 * j13) + (j11 * j34) + (j10 * j35), j38 + j38 + (j24 * j23) + (j17 * j30) + (j31 * j16), (j24 * j27) + (j28 * j23) + (j21 * j30) + (j31 * j20) + (j17 * j34) + (j16 * j35), j39 + j39 + (j24 * j30) + (j31 * j23), j40, j41 + j41 + (j31 * j30), (j30 * j35) + (j31 * j34), (j35 + j35) * j34}, jArr);
    }

    public static void zzf(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j5 = j2 * j2;
        long j6 = jArr2[1];
        long j7 = (j2 + j2) * j6;
        long j8 = jArr2[2];
        long j9 = (j2 * j8) + (j6 * j6);
        long j10 = jArr2[3];
        long j11 = (j2 * j10) + (j6 * j8);
        long j12 = jArr2[4];
        long j13 = (j8 * j8) + (j6 * 4 * j10) + ((j2 + j2) * j12);
        long j14 = jArr2[5];
        long j15 = (j8 * j10) + (j6 * j12) + (j2 * j14);
        long j16 = jArr2[6];
        long j17 = (j10 * j10) + (j8 * j12) + (j2 * j16) + ((j6 + j6) * j14);
        long j18 = jArr2[7];
        long j19 = (j10 * j12) + (j8 * j14) + (j6 * j16) + (j2 * j18);
        long j20 = jArr2[8];
        long j21 = (j10 * j14) + (j6 * j18);
        long j22 = j21 + j21 + (j8 * j16) + (j2 * j20);
        long j23 = j22 + j22 + (j12 * j12);
        long j24 = jArr2[9];
        long j25 = (j12 * j14) + (j10 * j16) + (j8 * j18) + (j6 * j20) + (j2 * j24);
        long j26 = (j6 * j24) + (j10 * j18);
        long j27 = j26 + j26 + (j14 * j14) + (j12 * j16) + (j8 * j20);
        long j28 = (j14 * j16) + (j12 * j18) + (j10 * j20) + (j8 * j24);
        long j29 = (j10 * j24) + (j14 * j18);
        long j30 = j29 + j29 + (j12 * j20);
        long j31 = j30 + j30 + (j16 * j16);
        long j32 = (j16 * j18) + (j14 * j20) + (j12 * j24);
        long j33 = (j18 * j18) + (j16 * j20) + ((j14 + j14) * j24);
        long j34 = (j16 * j24) + (j18 * j20);
        zzc(new long[]{j5, j7, j9 + j9, j11 + j11, j13, j15 + j15, j17 + j17, j19 + j19, j23, j25 + j25, j27 + j27, j28 + j28, j31, j32 + j32, j33 + j33, j34 + j34, (j18 * 4 * j24) + (j20 * j20), (j20 + j20) * j24, (j24 + j24) * j24}, jArr);
    }

    public static long[] zzg(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = zzb[i5];
            jArr[i5] = (((((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8)) | ((bArr[i6 + 2] & 255) << 16)) | ((bArr[i6 + 3] & 255) << 24)) >> zzc[i5]) & zzd[i5 & 1];
        }
        return jArr;
    }

    public static byte[] zzh(long[] jArr) {
        int i5;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= 2) {
                break;
            }
            int i8 = 0;
            while (i8 < 9) {
                long j2 = copyOf[i8];
                int i9 = -((int) (((j2 >> 31) & j2) >> zze[i8 & 1]));
                copyOf[i8] = j2 + (i9 << r14);
                i8++;
                copyOf[i8] = copyOf[i8] - i9;
            }
            long j5 = copyOf[9];
            copyOf[9] = j5 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j5 >> 31) & j5) >> 25))) * 19);
            i7++;
        }
        long j6 = copyOf[0];
        copyOf[0] = j6 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j6 >> 31) & j6) >> 26)));
        int i10 = 0;
        while (i10 < 2) {
            int i11 = i6;
            while (i11 < 9) {
                long j7 = copyOf[i11];
                int i12 = i6;
                long j8 = j7 >> zze[i11 & 1];
                copyOf[i11] = j7 & zzd[r14];
                i11++;
                copyOf[i11] = copyOf[i11] + ((int) j8);
                i6 = i12;
                i10 = i10;
            }
            i10++;
        }
        int i13 = i6;
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[i13] = (((int) (r2 >> 25)) * 19) + copyOf[i13];
        int i14 = ~((((int) r6) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) copyOf[i15]) ^ zzd[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 + i20)) >> 31;
        }
        copyOf[i13] = copyOf[i13] - (67108845 & i14);
        long j9 = 33554431 & i14;
        copyOf[1] = copyOf[1] - j9;
        for (i5 = 2; i5 < 10; i5 += 2) {
            copyOf[i5] = copyOf[i5] - (67108863 & i14);
            int i21 = i5 + 1;
            copyOf[i21] = copyOf[i21] - j9;
        }
        for (int i22 = i13; i22 < 10; i22++) {
            copyOf[i22] = copyOf[i22] << zzc[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = i13; i23 < 10; i23++) {
            int i24 = zzb[i23];
            long j10 = bArr[i24];
            long j11 = copyOf[i23];
            bArr[i24] = (byte) (j10 | (j11 & 255));
            bArr[i24 + 1] = (byte) (bArr[r5] | ((j11 >> 8) & 255));
            bArr[i24 + 2] = (byte) (bArr[r5] | ((j11 >> 16) & 255));
            bArr[i24 + 3] = (byte) (bArr[r4] | ((j11 >> 24) & 255));
        }
        return bArr;
    }
}
