package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.emoji2.text.u;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaqn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzaev zzaevVar) {
        zzer zzerVar = new zzer(8);
        int i5 = zzaqm.zza(zzaevVar, zzerVar).zza;
        if (i5 != 1380533830 && i5 != 1380333108) {
            return false;
        }
        zzaevVar.zzi(zzerVar.zzi(), 0, 4);
        zzerVar.zzh(0);
        int zzB = zzerVar.zzB();
        if (zzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(zzB);
        zzee.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaql zzb(zzaev zzaevVar) {
        byte[] bArr;
        int i5;
        byte[] bArr2;
        zzer zzerVar = new zzer(16);
        long j2 = zzd(1718449184, zzaevVar, zzerVar).zzb;
        zzgrc.zzi(j2 >= 16);
        zzaevVar.zzi(zzerVar.zzi(), 0, 16);
        zzerVar.zzh(0);
        int zzu = zzerVar.zzu();
        int zzu2 = zzerVar.zzu();
        int zzI = zzerVar.zzI();
        int zzI2 = zzerVar.zzI();
        int zzu3 = zzerVar.zzu();
        int zzu4 = zzerVar.zzu();
        int i6 = ((int) j2) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            zzaevVar.zzi(bArr, 0, i6);
            if (zzu == 65534) {
                if (i6 != 24) {
                    bArr2 = bArr;
                    i5 = 65534;
                    zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
                    return new zzaql(i5, zzu2, zzI, zzI2, zzu3, zzu4, bArr2);
                }
                zzer zzerVar2 = new zzer(bArr);
                zzerVar2.zzu();
                int zzu5 = zzerVar2.zzu();
                if (zzu5 != 0 && zzu5 != zzu4) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzu4).length() + String.valueOf(zzu5).length() + 33 + 19);
                    u.s(sb, "validBits ( ", zzu5, ")  != bitsPerSample( ", zzu4);
                    sb.append(") are not supported");
                    throw zzat.zzc(sb.toString());
                }
                int zzI3 = zzerVar2.zzI();
                if ((zzI3 >> 18) != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzI3).length() + 21);
                    sb2.append("invalid channel mask ");
                    sb2.append(zzI3);
                    throw zzat.zzc(sb2.toString());
                }
                if (zzI3 != 0 && Integer.bitCount(zzI3) != zzu2) {
                    int bitCount = Integer.bitCount(zzI3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bitCount).length() + 46 + String.valueOf(zzI3).length());
                    sb3.append("invalid number of channels (");
                    sb3.append(bitCount);
                    sb3.append(") in channel mask ");
                    sb3.append(zzI3);
                    throw zzat.zzc(sb3.toString());
                }
                zzu = zzerVar2.zzu();
                byte[] bArr3 = new byte[14];
                zzerVar2.zzm(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                    throw zzat.zzc("invalid wav format extension guid");
                }
            }
        } else {
            bArr = zzfj.zzb;
        }
        i5 = zzu;
        bArr2 = bArr;
        zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
        return new zzaql(i5, zzu2, zzI, zzI2, zzu3, zzu4, bArr2);
    }

    public static Pair zzc(zzaev zzaevVar) {
        zzaevVar.zzl();
        zzaqm zzd = zzd(1684108385, zzaevVar, new zzer(8));
        zzaevVar.zzf(8);
        return Pair.create(Long.valueOf(zzaevVar.zzn()), Long.valueOf(zzd.zzb));
    }

    private static zzaqm zzd(int i5, zzaev zzaevVar, zzer zzerVar) {
        zzaqm zza2 = zzaqm.zza(zzaevVar, zzerVar);
        while (true) {
            int i6 = zza2.zza;
            if (i6 == i5) {
                return zza2;
            }
            u.r(new StringBuilder(String.valueOf(i6).length() + 28), "Ignoring unknown WAV chunk: ", i6, "WavHeaderReader");
            long j2 = zza2.zzb;
            long j5 = 8 + j2;
            if ((1 & j2) != 0) {
                j5 = 9 + j2;
            }
            if (j5 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i6);
                throw zzat.zzc(sb.toString());
            }
            zzaevVar.zzf((int) j5);
            zza2 = zzaqm.zza(zzaevVar, zzerVar);
        }
    }
}
