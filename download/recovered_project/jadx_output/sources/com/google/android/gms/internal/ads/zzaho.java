package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaho implements zzaeu {
    private zzaex zzb;
    private zzahv zzc;
    private zzaev zzd;
    private zzagd zze;
    private zzakw zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzer zza = new zzer(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        int i5;
        zzer zzerVar = new zzer(16);
        boolean z4 = true;
        while (true) {
            zzerVar.zza(8);
            if (!zzaevVar.zzh(zzerVar.zzi(), 0, 8, true)) {
                return false;
            }
            long zzz = zzerVar.zzz();
            int zzB = zzerVar.zzB();
            if (zzz != 1) {
                i5 = 8;
            } else {
                if (!zzaevVar.zzh(zzerVar.zzi(), 8, 8, true)) {
                    return false;
                }
                zzz = zzerVar.zzJ();
                i5 = 16;
            }
            long j2 = i5;
            if (zzz < j2) {
                return false;
            }
            int i6 = (int) (zzz - j2);
            if (z4) {
                if (zzB != 1718909296 || i6 < 8) {
                    return false;
                }
                zzerVar.zza(4);
                zzael zzaelVar = (zzael) zzaevVar;
                zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
                if (zzerVar.zzB() != 1751476579) {
                    return false;
                }
                zzaelVar.zzj(i6 - 4, false);
            } else {
                if (zzB == 1836086884) {
                    return true;
                }
                if (i6 != 0) {
                    ((zzael) zzaevVar).zzj(i6, false);
                }
            }
            z4 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        while (true) {
            int i5 = this.zzg;
            if (i5 == 0) {
                if (this.zzj == 0) {
                    zzer zzerVar = this.zza;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzerVar.zzh(0);
                    this.zzi = zzerVar.zzz();
                    this.zzh = zzerVar.zzB();
                }
                long j2 = this.zzi;
                if (j2 == 1) {
                    zzer zzerVar2 = this.zza;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    j2 = zzerVar2.zzJ();
                    this.zzi = j2;
                }
                if (this.zzh == 1836086884) {
                    long zzn = zzaevVar.zzn();
                    this.zzk = zzn;
                    long j5 = this.zzj;
                    zzahv zzahvVar = new zzahv(0L, zzn - j5, -9223372036854775807L, zzn, j2 - j5);
                    this.zzc = zzahvVar;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzagh zzu = zzaexVar.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/heic");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar));
                    zzu.zzz(zztVar.zzM());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i5 == 1) {
                zzaevVar.zzf((int) (this.zzi - this.zzj));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzaevVar != this.zzd) {
                        this.zzd = zzaevVar;
                        this.zze = new zzagd(zzaevVar, this.zzk);
                    }
                    zzakw zzakwVar = this.zzf;
                    zzakwVar.getClass();
                    int zzd = zzakwVar.zzd(this.zze, zzafvVar);
                    if (zzd == 1) {
                        zzafvVar.zza += this.zzk;
                    }
                    return zzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzk);
                this.zze = zzagdVar;
                if (this.zzf.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzf;
                    long j6 = this.zzk;
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzakwVar2.zzc(new zzagf(j6, zzaexVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        if (j2 != 0) {
            if (this.zzg == 3) {
                zzakw zzakwVar = this.zzf;
                zzakwVar.getClass();
                zzakwVar.zze(j2, j5);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}
