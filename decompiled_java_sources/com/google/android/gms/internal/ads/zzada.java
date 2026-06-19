package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzada {
    private final zzacs zza;
    private final zzact zzf;
    private long zzk;
    private final zzabs zzl;
    private final zzacq zzb = new zzacq();
    private final zzff zzc = new zzff(10);
    private final zzff zzd = new zzff(10);
    private final zzeg zze = new zzeg(16);
    private long zzg = -9223372036854775807L;
    private zzbv zzj = zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzada(zzabs zzabsVar, zzacs zzacsVar, zzact zzactVar) {
        this.zzl = zzabsVar;
        this.zza = zzacsVar;
        this.zzf = zzactVar;
    }

    private static Object zzh(zzff zzffVar) {
        zzgrc.zza(zzffVar.zzc() > 0);
        while (zzffVar.zzc() > 1) {
            zzffVar.zzd();
        }
        Object zzd = zzffVar.zzd();
        zzd.getClass();
        return zzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzff zzffVar = this.zzd;
        if (zzffVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzffVar)).longValue();
        }
        zzff zzffVar2 = this.zzc;
        if (zzffVar2.zzc() > 0) {
            zzffVar2.zza(0L, (zzbv) zzh(zzffVar2));
        }
    }

    public final void zzb(long j2, long j5) {
        while (true) {
            zzeg zzegVar = this.zze;
            if (zzegVar.zzd()) {
                return;
            }
            zzff zzffVar = this.zzd;
            long zzc = zzegVar.zzc();
            Long l5 = (Long) zzffVar.zze(zzc);
            if (l5 != null && l5.longValue() != this.zzk) {
                this.zzk = l5.longValue();
                this.zza.zza(2);
            }
            zzacs zzacsVar = this.zza;
            long j6 = this.zzk;
            zzacq zzacqVar = this.zzb;
            int zzk = zzacsVar.zzk(zzc, j2, j5, j6, false, false, zzacqVar);
            if (zzk != 5 && zzk != 4) {
                this.zzf.zza(zzc, zzacqVar.zza());
            }
            if (zzk == 0 || zzk == 1) {
                this.zzh = zzc;
                long zzb = zzegVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(zzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(zzk == 0 ? System.nanoTime() : zzacqVar.zzb(), zzb, zzacsVar.zzf());
            } else if (zzk == 2 || zzk == 3) {
                this.zzh = zzc;
                zzegVar.zzb();
                final zzabs zzabsVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzabq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabs.this.zza.zzB().zzc();
                    }
                };
                zzabt zzabtVar = zzabsVar.zza;
                zzabtVar.zzC().execute(runnable);
                ((zzadp) zzabtVar.zzz().remove()).zzb();
            } else if (zzk != 4) {
                return;
            } else {
                this.zzh = zzc;
            }
        }
    }

    public final void zzc(int i5, int i6) {
        long j2 = this.zzg;
        this.zzc.zza(j2 == -9223372036854775807L ? 0L : j2 + 1, new zzbv(i5, i6, 1.0f));
    }

    public final void zzd(int i5, long j2) {
        if (this.zze.zzd()) {
            this.zza.zza(i5);
            this.zzk = j2;
        } else {
            zzff zzffVar = this.zzd;
            long j5 = this.zzg;
            zzffVar.zza(j5 == -9223372036854775807L ? -4611686018427387904L : j5 + 1, Long.valueOf(j2));
        }
    }

    public final void zze(long j2) {
        this.zze.zza(j2);
        this.zzg = j2;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j2 = this.zzg;
        if (j2 == -9223372036854775807L) {
            j2 = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j2;
    }

    public final boolean zzg() {
        long j2 = this.zzi;
        return j2 != -9223372036854775807L && this.zzh == j2;
    }
}
