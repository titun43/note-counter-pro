package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzahj implements zzaeu {
    private zzaex zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzahh zzo;
    private zzahn zzp;
    private final zzer zza = new zzer(4);
    private final zzer zzb = new zzer(9);
    private final zzer zzc = new zzer(11);
    private final zzer zzd = new zzer();
    private final zzahk zze = new zzahk();
    private int zzg = 1;

    private final zzer zzh(zzaev zzaevVar) {
        zzer zzerVar = this.zzd;
        if (this.zzl > zzerVar.zzj()) {
            int zzj = zzerVar.zzj();
            zzerVar.zzb(new byte[Math.max(zzj + zzj, this.zzl)], 0);
        } else {
            zzerVar.zzh(0);
        }
        zzerVar.zzf(this.zzl);
        zzaevVar.zzc(zzerVar.zzi(), 0, this.zzl);
        return zzerVar;
    }

    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 3, false);
        zzerVar.zzh(0);
        if (zzerVar.zzx() != 4607062) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 2, false);
        zzerVar.zzh(0);
        if ((zzerVar.zzt() & 250) != 0) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        int zzB = zzerVar.zzB();
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(zzB, false);
        zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        return zzerVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        boolean z4;
        boolean z5;
        this.zzf.getClass();
        while (true) {
            int i5 = this.zzg;
            int i6 = 8;
            if (i5 == 1) {
                zzer zzerVar = this.zzb;
                if (!zzaevVar.zzb(zzerVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzerVar.zzh(0);
                zzerVar.zzk(4);
                int zzs = zzerVar.zzs();
                int i7 = zzs & 4;
                int i8 = zzs & 1;
                if (i7 != 0 && this.zzo == null) {
                    this.zzo = new zzahh(this.zzf.zzu(8, 1));
                }
                if (i8 != 0 && this.zzp == null) {
                    this.zzp = new zzahn(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzerVar.zzB() - 5;
                this.zzg = 2;
            } else if (i5 == 2) {
                zzaevVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i5 == 3) {
                zzer zzerVar2 = this.zzc;
                if (!zzaevVar.zzb(zzerVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzerVar2.zzh(0);
                this.zzk = zzerVar2.zzs();
                this.zzl = zzerVar2.zzx();
                this.zzm = zzerVar2.zzx();
                this.zzm = ((zzerVar2.zzs() << 24) | this.zzm) * 1000;
                zzerVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException();
                }
                long j2 = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                int i9 = this.zzk;
                if (i9 != 8) {
                    i6 = i9;
                } else if (this.zzo != null) {
                    zzi();
                    z4 = this.zzo.zzf(zzh(zzaevVar), j2);
                    z5 = true;
                    if (!this.zzh && z4) {
                        this.zzh = true;
                        this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (!z5) {
                        return 0;
                    }
                }
                if (i6 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        z4 = this.zzp.zzf(zzh(zzaevVar), j2);
                        z5 = true;
                    }
                    zzaevVar.zzf(this.zzl);
                    z4 = false;
                    z5 = false;
                } else {
                    if (i6 == 18 && !this.zzn) {
                        zzahk zzahkVar = this.zze;
                        boolean zzf = zzahkVar.zzf(zzh(zzaevVar), j2);
                        long zzc = zzahkVar.zzc();
                        if (zzc != -9223372036854775807L) {
                            this.zzf.zzw(new zzafq(zzahkVar.zze(), zzahkVar.zzd(), zzc));
                            this.zzn = true;
                        }
                        z4 = zzf;
                        z5 = true;
                    }
                    zzaevVar.zzf(this.zzl);
                    z4 = false;
                    z5 = false;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (!z5) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        if (j2 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
