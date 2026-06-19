package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzapk {
    private final zzaon zza;
    private final zzfg zzb;
    private final zzeq zzc = new zzeq(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzapk(zzaon zzaonVar, zzfg zzfgVar) {
        this.zza = zzaonVar;
        this.zzb = zzfgVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzer zzerVar) {
        long j2;
        char c5;
        zzeq zzeqVar = this.zzc;
        zzerVar.zzm(zzeqVar.zza, 0, 3);
        zzeqVar.zzf(0);
        zzeqVar.zzh(8);
        this.zzd = zzeqVar.zzi();
        this.zze = zzeqVar.zzi();
        zzeqVar.zzh(6);
        zzerVar.zzm(zzeqVar.zza, 0, zzeqVar.zzj(8));
        zzeqVar.zzf(0);
        if (this.zzd) {
            zzeqVar.zzh(4);
            long zzj = zzeqVar.zzj(3);
            zzeqVar.zzh(1);
            int zzj2 = zzeqVar.zzj(15) << 15;
            zzeqVar.zzh(1);
            long zzj3 = zzeqVar.zzj(15);
            zzeqVar.zzh(1);
            if (this.zzf || !this.zze) {
                c5 = 30;
            } else {
                zzeqVar.zzh(4);
                zzeqVar.zzh(1);
                int zzj4 = zzeqVar.zzj(15) << 15;
                zzeqVar.zzh(1);
                c5 = 30;
                long zzj5 = zzeqVar.zzj(15);
                zzeqVar.zzh(1);
                this.zzb.zze((zzeqVar.zzj(3) << 30) | zzj4 | zzj5);
                this.zzf = true;
            }
            j2 = this.zzb.zze((zzj << c5) | zzj2 | zzj3);
        } else {
            j2 = 0;
        }
        zzaon zzaonVar = this.zza;
        zzaonVar.zzc(j2, 4);
        zzaonVar.zzd(zzerVar);
        zzaonVar.zze(false);
    }
}
