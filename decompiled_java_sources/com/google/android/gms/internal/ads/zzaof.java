package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaof implements zzaeu {
    private final zzaog zza = new zzaog(null, 0, "audio/ac4");
    private final zzer zzb = new zzer(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        int i5;
        zzer zzerVar = new zzer(10);
        int i6 = 0;
        while (true) {
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int zzG = zzerVar.zzG();
            i6 += zzG + 10;
            zzaelVar.zzj(zzG, false);
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i6, false);
        int i7 = 0;
        int i8 = i6;
        while (true) {
            int i9 = 7;
            zzaelVar2.zzh(zzerVar.zzi(), 0, 7, false);
            zzerVar.zzh(0);
            int zzt = zzerVar.zzt();
            if (zzt == 44096 || zzt == 44097) {
                i7++;
                if (i7 >= 4) {
                    return true;
                }
                byte[] zzi = zzerVar.zzi();
                if (zzi.length < 7) {
                    i5 = -1;
                } else {
                    int i10 = ((zzi[2] & 255) << 8) | (zzi[3] & 255);
                    if (i10 == 65535) {
                        i10 = ((zzi[4] & 255) << 16) | ((zzi[5] & 255) << 8) | (zzi[6] & 255);
                    } else {
                        i9 = 4;
                    }
                    if (zzt == 44097) {
                        i9 += 2;
                    }
                    i5 = i10 + i9;
                }
                if (i5 == -1) {
                    return false;
                }
                zzaelVar2.zzj(i5 - 7, false);
            } else {
                zzaevVar.zzl();
                i8++;
                if (i8 - i6 >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i8, false);
                i7 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
        zzaexVar.zzw(new zzafx(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        zzer zzerVar = this.zzb;
        int zza = zzaevVar.zza(zzerVar.zzi(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
