package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalm implements zzaeu {
    private zzaex zza;
    private zzalt zzb;
    private boolean zzc;

    private final boolean zzh(zzaev zzaevVar) {
        zzalo zzaloVar = new zzalo();
        if (zzaloVar.zzc(zzaevVar, true) && (zzaloVar.zza & 2) == 2) {
            int min = Math.min(zzaloVar.zze, 8);
            zzer zzerVar = new zzer(min);
            zzaevVar.zzi(zzerVar.zzi(), 0, min);
            zzerVar.zzh(0);
            if (zzerVar.zzd() >= 5 && zzerVar.zzs() == 127 && zzerVar.zzz() == 1179402563) {
                this.zzb = new zzalk();
            } else {
                zzerVar.zzh(0);
                try {
                    if (zzagn.zzd(1, zzerVar, true)) {
                        this.zzb = new zzalv();
                    }
                } catch (zzat unused) {
                }
                zzerVar.zzh(0);
                if (zzalq.zzd(zzerVar)) {
                    this.zzb = new zzalq();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        try {
            return zzh(zzaevVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzaevVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzaevVar.zzl();
        }
        if (!this.zzc) {
            zzagh zzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        zzalt zzaltVar = this.zzb;
        if (zzaltVar != null) {
            zzaltVar.zzf(j2, j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
