package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzalt {
    private zzagh zzb;
    private zzaex zzc;
    private zzalp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzaln zza = new zzaln();
    private zzalr zzj = new zzalr();

    public void zza(boolean z4) {
        int i5;
        if (z4) {
            this.zzj = new zzalr();
            this.zzf = 0L;
            i5 = 0;
        } else {
            i5 = 1;
        }
        this.zzh = i5;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract long zzb(zzer zzerVar);

    public abstract boolean zzc(zzer zzerVar, long j2, zzalr zzalrVar);

    public final void zze(zzaex zzaexVar, zzagh zzaghVar) {
        this.zzc = zzaexVar;
        this.zzb = zzaghVar;
        zza(true);
    }

    public final void zzf(long j2, long j5) {
        this.zza.zza();
        if (j2 == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzi = zzi(j5);
            this.zze = zzi;
            zzalp zzalpVar = this.zzd;
            String str = zzfj.zza;
            zzalpVar.zzb(zzi);
            this.zzh = 2;
        }
    }

    public final int zzg(zzaev zzaevVar, zzafv zzafvVar) {
        this.zzb.getClass();
        String str = zzfj.zza;
        int i5 = this.zzh;
        if (i5 != 0) {
            if (i5 == 1) {
                zzaevVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i5 != 2) {
                return -1;
            }
            long zza = this.zzd.zza(zzaevVar);
            if (zza >= 0) {
                zzafvVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                zzafy zzc = this.zzd.zzc();
                zzc.getClass();
                this.zzc.zzw(zzc);
                this.zzb.zzN(zzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzaevVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzer zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j2 = this.zzg;
                if (j2 + zzb >= this.zze) {
                    long zzh = zzh(j2);
                    this.zzb.zzc(zzd, zzd.zze());
                    this.zzb.zze(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
            return 0;
        }
        while (true) {
            zzaln zzalnVar = this.zza;
            if (!zzalnVar.zzb(zzaevVar)) {
                this.zzh = 3;
                return -1;
            }
            long zzn = zzaevVar.zzn();
            long j5 = this.zzf;
            this.zzk = zzn - j5;
            if (!zzc(zzalnVar.zzd(), j5, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzz(zzvVar);
                    this.zzm = true;
                }
                zzalp zzalpVar = this.zzj.zzb;
                if (zzalpVar != null) {
                    this.zzd = zzalpVar;
                } else if (zzaevVar.zzo() == -1) {
                    this.zzd = new zzals(null);
                } else {
                    zzalo zzc2 = zzalnVar.zzc();
                    this.zzd = new zzali(this, this.zzf, zzaevVar.zzo(), zzc2.zzd + zzc2.zze, zzc2.zzb, (zzc2.zza & 4) != 0);
                }
                this.zzh = 2;
                zzalnVar.zze();
                return 0;
            }
            this.zzf = zzaevVar.zzn();
        }
    }

    public final long zzh(long j2) {
        return (j2 * 1000000) / this.zzi;
    }

    public final long zzi(long j2) {
        return (this.zzi * j2) / 1000000;
    }

    public void zzj(long j2) {
        this.zzg = j2;
    }
}
