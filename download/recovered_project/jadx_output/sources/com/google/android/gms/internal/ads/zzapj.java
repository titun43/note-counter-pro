package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzapj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public static long zze(zzer zzerVar) {
        int zzg = zzerVar.zzg();
        if (zzerVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzerVar.zzm(bArr, 0, 9);
        zzerVar.zzh(zzg);
        byte b2 = bArr[0];
        if ((b2 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b5 = bArr[2];
        if ((b5 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b6 = bArr[4];
        if ((b6 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j2 = b2;
        long j5 = b5;
        long j6 = (248 & j5) >> 3;
        long j7 = (j5 & 3) << 13;
        return j7 | ((bArr[1] & 255) << 20) | ((j2 & 3) << 28) | (((j2 & 56) >> 3) << 30) | (j6 << 15) | ((bArr[3] & 255) << 5) | ((b6 & 248) >> 3);
    }

    private final int zzf(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i5) {
        return (bArr[i5 + 3] & 255) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5 + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfg zzb() {
        return this.zza;
    }

    public final int zzc(zzaev zzaevVar, zzafv zzafvVar) {
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzaevVar.zzo();
            int min = (int) Math.min(20000L, zzo);
            long j5 = zzo - min;
            if (zzaevVar.zzn() != j5) {
                zzafvVar.zza = j5;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(min);
            zzaevVar.zzl();
            zzaevVar.zzi(zzerVar.zzi(), 0, min);
            int zzg = zzerVar.zzg();
            int zze = zzerVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzerVar.zzi(), zze) == 442) {
                    zzerVar.zzh(zze + 4);
                    long zze2 = zze(zzerVar);
                    if (zze2 != -9223372036854775807L) {
                        j2 = zze2;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j2;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzaevVar);
            return 0;
        }
        if (this.zzd) {
            long j6 = this.zzf;
            if (j6 == -9223372036854775807L) {
                zzf(zzaevVar);
                return 0;
            }
            zzfg zzfgVar = this.zza;
            this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j6);
            zzf(zzaevVar);
            return 0;
        }
        int min2 = (int) Math.min(20000L, zzaevVar.zzo());
        if (zzaevVar.zzn() != 0) {
            zzafvVar.zza = 0L;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(min2);
        zzaevVar.zzl();
        zzaevVar.zzi(zzerVar2.zzi(), 0, min2);
        int zzg2 = zzerVar2.zzg();
        int zze3 = zzerVar2.zze();
        while (true) {
            if (zzg2 >= zze3 - 3) {
                break;
            }
            if (zzg(zzerVar2.zzi(), zzg2) == 442) {
                zzerVar2.zzh(zzg2 + 4);
                long zze4 = zze(zzerVar2);
                if (zze4 != -9223372036854775807L) {
                    j2 = zze4;
                    break;
                }
            }
            zzg2++;
        }
        this.zzf = j2;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
