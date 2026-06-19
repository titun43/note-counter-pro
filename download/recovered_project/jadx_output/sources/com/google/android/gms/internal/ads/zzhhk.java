package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhhk {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzc = zzc(bArr, 0, 0);
        long zzc2 = zzc(bArr, 3, 2) & 67108611;
        long zzc3 = zzc(bArr, 6, 4) & 67092735;
        long zzc4 = zzc(bArr, 9, 6) & 66076671;
        long zzc5 = zzc(bArr, 12, 8) & 1048575;
        int i5 = 17;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        int i6 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        while (true) {
            int length = bArr2.length;
            if (i6 >= length) {
                long j9 = j2 + (j5 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j6 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j7 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = ((j13 >> 26) * 5) + j8;
                long j16 = j15 >> 26;
                long j17 = j15 & 67108863;
                long j18 = j17 + 5;
                long j19 = (j5 & 67108863) + j16;
                long j20 = j19 + (j18 >> 26);
                long j21 = (j20 >> 26) + j10;
                long j22 = j12 + (j21 >> 26);
                long j23 = (j14 + (j22 >> 26)) - 67108864;
                long j24 = j23 >> 63;
                long j25 = ~j24;
                long j26 = (j19 & j24) | (j20 & 67108863 & j25);
                long j27 = (j10 & j24) | (j21 & 67108863 & j25);
                long j28 = (j12 & j24) | (j22 & 67108863 & j25);
                long j29 = (j14 & j24) | (j23 & j25);
                long zzb = (((j17 & j24) | (j18 & 67108863 & j25) | (j26 << 26)) & 4294967295L) + zzb(bArr, 16);
                long zzb2 = (((j26 >> 6) | (j27 << 20)) & 4294967295L) + zzb(bArr, 20);
                long zzb3 = (((j28 << 14) | (j27 >> 12)) & 4294967295L) + zzb(bArr, 24);
                long zzb4 = (((j28 >> 18) | (j29 << 8)) & 4294967295L) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzb & 4294967295L, 0);
                long j30 = zzb2 + (zzb >> 32);
                zzd(bArr4, j30 & 4294967295L, 4);
                long j31 = zzb3 + (j30 >> 32);
                zzd(bArr4, j31 & 4294967295L, 8);
                zzd(bArr4, (zzb4 + (j31 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i6);
            System.arraycopy(bArr2, i6, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i5, (byte) 0);
            }
            long j32 = zzc5 * 5;
            long j33 = zzc4 * 5;
            long j34 = zzc3 * 5;
            long zzc6 = j8 + zzc(bArr3, 0, 0);
            long zzc7 = j5 + zzc(bArr3, 3, 2);
            long zzc8 = j2 + zzc(bArr3, 6, 4);
            long zzc9 = j6 + zzc(bArr3, 9, 6);
            long zzc10 = j7 + (zzc(bArr3, 12, 8) | (bArr3[16] << 24));
            long j35 = zzc7 * zzc;
            long j36 = zzc7 * zzc2;
            long j37 = zzc8 * zzc;
            long j38 = zzc7 * zzc3;
            long j39 = zzc8 * zzc2;
            long j40 = zzc9 * zzc;
            long j41 = zzc7 * zzc4;
            long j42 = zzc8 * zzc3;
            long j43 = zzc9 * zzc2;
            long j44 = zzc10 * zzc;
            long j45 = (zzc2 * 5 * zzc10) + (zzc9 * j34) + (zzc8 * j33) + (zzc7 * j32) + (zzc6 * zzc);
            long j46 = j45 & 67108863;
            long j47 = zzc9 * j33;
            long j48 = j34 * zzc10;
            long j49 = j48 + j47 + (zzc8 * j32) + (zzc6 * zzc2) + j35 + (j45 >> 26);
            long j50 = j33 * zzc10;
            long j51 = j50 + (zzc9 * j32) + (zzc6 * zzc3) + j36 + j37 + (j49 >> 26);
            long j52 = (zzc10 * j32) + (zzc6 * zzc4) + j38 + j39 + j40 + (j51 >> 26);
            long j53 = (zzc6 * zzc5) + j41 + j42 + j43 + j44 + (j52 >> 26);
            long j54 = ((j53 >> 26) * 5) + j46;
            j5 = (j49 & 67108863) + (j54 >> 26);
            i6 += 16;
            j2 = j51 & 67108863;
            j6 = j52 & 67108863;
            j7 = j53 & 67108863;
            i5 = 17;
            j8 = j54 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i5) {
        int i6 = bArr[i5] & 255;
        int i7 = bArr[i5 + 1] & 255;
        int i8 = bArr[i5 + 2] & 255;
        return (((bArr[i5 + 3] & 255) << 24) | (i7 << 8) | i6 | (i8 << 16)) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i5, int i6) {
        return (zzb(bArr, i5) >> i6) & 67108863;
    }

    private static void zzd(byte[] bArr, long j2, int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            bArr[i5 + i6] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }
}
