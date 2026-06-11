package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaoc implements zzaeu {
    private final zzaod zza = new zzaod(null, 0, "audio/ac3");
    private final zzer zzb = new zzer(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzer zzerVar = new zzer(10);
        int i5 = 0;
        while (true) {
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int zzG = zzerVar.zzG();
            i5 += zzG + 10;
            zzaelVar.zzj(zzG, false);
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i5, false);
        int i6 = 0;
        int i7 = i5;
        while (true) {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 6, false);
            zzerVar.zzh(0);
            if (zzerVar.zzt() != 2935) {
                zzaevVar.zzl();
                i7++;
                if (i7 - i5 >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i7, false);
                i6 = 0;
            } else {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                int zzd = zzadv.zzd(zzerVar.zzi());
                if (zzd == -1) {
                    return false;
                }
                zzaelVar2.zzj(zzd - 6, false);
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
        int zza = zzaevVar.zza(zzerVar.zzi(), 0, 2786);
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
