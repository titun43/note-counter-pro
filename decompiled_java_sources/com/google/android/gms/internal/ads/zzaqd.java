package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaqd {
    public static int zza(byte[] bArr, int i5, int i6) {
        while (i5 < i6 && bArr[i5] != 71) {
            i5++;
        }
        return i5;
    }

    public static long zzb(zzer zzerVar, int i5, int i6) {
        zzerVar.zzh(i5);
        if (zzerVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int zzB = zzerVar.zzB();
        if ((8388608 & zzB) != 0 || ((zzB >> 8) & 8191) != i6 || (zzB & 32) == 0 || zzerVar.zzs() < 7 || zzerVar.zzd() < 7 || (zzerVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzerVar.zzm(bArr, 0, 6);
        long j2 = bArr[0];
        long j5 = bArr[1];
        long j6 = bArr[2];
        long j7 = bArr[3] & 255;
        return ((j2 & 255) << 25) | ((j5 & 255) << 17) | ((j6 & 255) << 9) | (j7 + j7) | ((bArr[4] & 255) >> 7);
    }
}
