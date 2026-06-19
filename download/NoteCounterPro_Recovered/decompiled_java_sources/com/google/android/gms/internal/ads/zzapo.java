package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzapo implements zzaqc {
    private final zzapn zza;
    private final zzer zzb = new zzer(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapo(zzapn zzapnVar) {
        this.zza = zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zza.zza(zzfgVar, zzaexVar, zzaqbVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i5) {
        int i6 = i5 & 1;
        int zzg = i6 != 0 ? zzerVar.zzg() + zzerVar.zzs() : -1;
        if (this.zzf) {
            if (i6 == 0) {
                return;
            }
            this.zzf = false;
            zzerVar.zzh(zzg);
            this.zzd = 0;
        }
        while (zzerVar.zzd() > 0) {
            int i7 = this.zzd;
            if (i7 < 3) {
                if (i7 == 0) {
                    int zzs = zzerVar.zzs();
                    zzerVar.zzh(zzerVar.zzg() - 1);
                    if (zzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzerVar.zzd(), 3 - this.zzd);
                zzer zzerVar2 = this.zzb;
                zzerVar.zzm(zzerVar2.zzi(), this.zzd, min);
                int i8 = this.zzd + min;
                this.zzd = i8;
                if (i8 == 3) {
                    zzerVar2.zzh(0);
                    zzerVar2.zzf(3);
                    zzerVar2.zzk(1);
                    int zzs2 = zzerVar2.zzs();
                    boolean z4 = (zzs2 & 128) != 0;
                    int zzs3 = zzerVar2.zzs();
                    this.zze = z4;
                    this.zzc = (((zzs2 & 15) << 8) | zzs3) + 3;
                    int zzj = zzerVar2.zzj();
                    int i9 = this.zzc;
                    if (zzj < i9) {
                        int zzj2 = zzerVar2.zzj();
                        zzerVar2.zzc(Math.min(4098, Math.max(i9, zzj2 + zzj2)));
                    }
                }
            } else {
                int min2 = Math.min(zzerVar.zzd(), this.zzc - this.zzd);
                zzer zzerVar3 = this.zzb;
                zzerVar.zzm(zzerVar3.zzi(), this.zzd, min2);
                int i10 = this.zzd + min2;
                this.zzd = i10;
                int i11 = this.zzc;
                if (i10 != i11) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzerVar3.zzf(i11);
                    } else {
                        if (zzfj.zzG(zzerVar3.zzi(), 0, i11, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzerVar3.zzf(this.zzc - 4);
                    }
                    zzerVar3.zzh(0);
                    this.zza.zzb(zzerVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
