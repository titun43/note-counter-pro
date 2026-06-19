package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzhhc {
    private static final int[] zza = zzd(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr, 0, length);
        System.arraycopy(iArr2, 0, iArr, length, 8);
    }

    public static void zzb(int[] iArr) {
        for (int i5 = 0; i5 < 10; i5++) {
            zzc(iArr, 0, 4, 8, 12);
            zzc(iArr, 1, 5, 9, 13);
            zzc(iArr, 2, 6, 10, 14);
            zzc(iArr, 3, 7, 11, 15);
            zzc(iArr, 0, 5, 10, 15);
            zzc(iArr, 1, 6, 11, 12);
            zzc(iArr, 2, 7, 8, 13);
            zzc(iArr, 3, 4, 9, 14);
        }
    }

    public static void zzc(int[] iArr, int i5, int i6, int i7, int i8) {
        int i9 = iArr[i5] + iArr[i6];
        iArr[i5] = i9;
        int i10 = i9 ^ iArr[i8];
        int i11 = (i10 >>> (-16)) | (i10 << 16);
        iArr[i8] = i11;
        int i12 = iArr[i7] + i11;
        iArr[i7] = i12;
        int i13 = iArr[i6] ^ i12;
        int i14 = (i13 >>> (-12)) | (i13 << 12);
        iArr[i6] = i14;
        int i15 = iArr[i5] + i14;
        iArr[i5] = i15;
        int i16 = iArr[i8] ^ i15;
        int i17 = (i16 >>> (-8)) | (i16 << 8);
        iArr[i8] = i17;
        int i18 = iArr[i7] + i17;
        iArr[i7] = i18;
        int i19 = iArr[i6] ^ i18;
        iArr[i6] = (i19 >>> (-7)) | (i19 << 7);
    }

    public static int[] zzd(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public static int[] zze(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zza(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        zzb(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}
