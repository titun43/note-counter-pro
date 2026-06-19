package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaoi implements zzaeu {
    private final zzaoj zza;
    private final zzer zzb;
    private final zzer zzc;
    private final zzeq zzd;
    private zzaex zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaoi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzer zzerVar;
        int i5 = 0;
        while (true) {
            zzerVar = this.zzc;
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
        if (this.zzg == -1) {
            this.zzg = i5;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = i5;
        do {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 2, false);
            zzerVar.zzh(0);
            if (zzaoj.zzf(zzerVar.zzt())) {
                i6++;
                if (i6 >= 4 && i7 > 188) {
                    return true;
                }
                zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
                zzeq zzeqVar = this.zzd;
                zzeqVar.zzf(14);
                int zzj = zzeqVar.zzj(13);
                if (zzj <= 6) {
                    i8++;
                    zzaevVar.zzl();
                    zzaelVar2.zzj(i8, false);
                } else {
                    zzaelVar2.zzj(zzj - 6, false);
                    i7 += zzj;
                }
            } else {
                i8++;
                zzaevVar.zzl();
                zzaelVar2.zzj(i8, false);
            }
            i6 = 0;
            i7 = 0;
        } while (i8 - i5 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = zzaexVar;
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        this.zze.getClass();
        zzer zzerVar = this.zzb;
        int zza = zzaevVar.zza(zzerVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzafx(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(zza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzaoi(int i5) {
        this.zza = new zzaoj(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzer(2048);
        this.zzg = -1L;
        zzer zzerVar = new zzer(10);
        this.zzc = zzerVar;
        byte[] zzi = zzerVar.zzi();
        this.zzd = new zzeq(zzi, zzi.length);
    }
}
