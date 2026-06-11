package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
final class zzaqg implements zzaqh {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzaex zzc;
    private final zzagh zzd;
    private final zzaql zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzer zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaqg(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar) {
        this.zzc = zzaexVar;
        this.zzd = zzaghVar;
        this.zze = zzaqlVar;
        int max = Math.max(1, zzaqlVar.zzc / 10);
        this.zzi = max;
        zzer zzerVar = new zzer(zzaqlVar.zzf);
        zzerVar.zzu();
        int zzu = zzerVar.zzu();
        this.zzf = zzu;
        int i5 = zzaqlVar.zzb;
        int i6 = zzaqlVar.zzd;
        int i7 = (((i6 - (i5 * 4)) * 8) / (zzaqlVar.zze * i5)) + 1;
        if (zzu != i7) {
            throw zzat.zzb(s.c.c(new StringBuilder(String.valueOf(i7).length() + 34 + String.valueOf(zzu).length()), "Expected frames per block: ", i7, "; got: ", zzu), null);
        }
        String str = zzfj.zza;
        int i8 = ((max + zzu) - 1) / zzu;
        this.zzg = new byte[i6 * i8];
        this.zzh = new zzer((zzu + zzu) * i5 * i8);
        int i9 = ((zzaqlVar.zzc * zzaqlVar.zzd) * 8) / zzu;
        zzt zztVar = new zzt();
        zztVar.zzm("audio/raw");
        zztVar.zzh(i9);
        zztVar.zzi(i9);
        zztVar.zzn((max + max) * i5);
        zztVar.zzE(zzaqlVar.zzb);
        zztVar.zzF(zzaqlVar.zzc);
        zztVar.zzG(2);
        this.zzj = zztVar.zzM();
    }

    private final void zzd(int i5) {
        long zzt = this.zzl + zzfj.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int zzf = zzf(i5);
        this.zzd.zze(zzt, 1, zzf, this.zzm - zzf, null);
        this.zzn += i5;
        this.zzm -= zzf;
    }

    private final int zze(int i5) {
        int i6 = this.zze.zzb;
        return i5 / (i6 + i6);
    }

    private final int zzf(int i5) {
        return (i5 + i5) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j2) {
        this.zzk = 0;
        this.zzl = j2;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i5, long j2) {
        zzaqo zzaqoVar = new zzaqo(this.zze, this.zzf, i5, j2);
        this.zzc.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzd;
        zzaghVar.zzz(this.zzj);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzaev zzaevVar, long j2) {
        boolean z4;
        int i5;
        int zze;
        int zze2 = zze(this.zzm);
        int i6 = this.zzi;
        String str = zzfj.zza;
        int i7 = this.zzf;
        zzaql zzaqlVar = this.zze;
        int i8 = zzaqlVar.zzd;
        int i9 = ((((i6 - zze2) + i7) - 1) / i7) * i8;
        if (j2 != 0) {
            z4 = false;
            while (!z4) {
                if (this.zzk >= i9) {
                    break;
                }
                int zza2 = zzaevVar.zza(this.zzg, this.zzk, (int) Math.min(i9 - r12, j2));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i5 = this.zzk / i8;
            if (i5 > 0) {
                byte[] bArr = this.zzg;
                zzer zzerVar = this.zzh;
                for (int i10 = 0; i10 < i5; i10++) {
                    int i11 = 0;
                    while (true) {
                        int i12 = zzaqlVar.zzb;
                        if (i11 < i12) {
                            byte[] zzi = zzerVar.zzi();
                            int i13 = (i8 / i12) - 4;
                            int i14 = (i11 * 4) + (i10 * i8);
                            int i15 = bArr[i14 + 1] & 255;
                            int i16 = bArr[i14] & 255;
                            int i17 = i5;
                            int min = Math.min(bArr[i14 + 2] & 255, 88);
                            int[] iArr = zzb;
                            int i18 = iArr[min];
                            int i19 = (i10 * i7 * i12) + i11;
                            int i20 = (short) (i16 | (i15 << 8));
                            int i21 = i19 + i19;
                            zzi[i21] = (byte) (i20 & 255);
                            zzi[i21 + 1] = (byte) (i20 >> 8);
                            int i22 = 0;
                            while (i22 < i13 + i13) {
                                byte b2 = bArr[((i22 / 8) * i12 * 4) + (i12 * 4) + i14 + ((i22 / 2) % 4)];
                                int i23 = i22;
                                int i24 = i23 % 2 == 0 ? b2 & 15 : (b2 & 255) >> 4;
                                int i25 = i24 & 7;
                                int i26 = (((i25 + i25) + 1) * i18) >> 3;
                                if ((i24 & 8) != 0) {
                                    i26 = -i26;
                                }
                                i20 = Math.max(-32768, Math.min(i20 + i26, 32767));
                                i21 = i12 + i12 + i21;
                                zzi[i21] = (byte) (i20 & 255);
                                zzi[i21 + 1] = (byte) (i20 >> 8);
                                min = Math.max(0, Math.min(min + zza[i24], 88));
                                i18 = iArr[min];
                                i22 = i23 + 1;
                            }
                            i11++;
                            i5 = i17;
                        }
                    }
                }
                int i27 = i5;
                int zzf = zzf(i7 * i27);
                zzerVar.zzh(0);
                zzerVar.zzf(zzf);
                this.zzk -= i27 * i8;
                int zze3 = zzerVar.zze();
                this.zzd.zzc(zzerVar, zze3);
                int i28 = this.zzm + zze3;
                this.zzm = i28;
                if (zze(i28) >= i6) {
                    zzd(i6);
                }
            }
            if (z4 && (zze = zze(this.zzm)) > 0) {
                zzd(zze);
            }
            return z4;
        }
        z4 = true;
        while (!z4) {
        }
        i5 = this.zzk / i8;
        if (i5 > 0) {
        }
        if (z4) {
            zzd(zze);
        }
        return z4;
    }
}
