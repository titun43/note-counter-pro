package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaec {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzaec(long j2, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.zza = j2;
        this.zzb = j5;
        this.zze = j7;
        this.zzf = j8;
        this.zzg = j9;
        this.zzc = j10;
        this.zzh = zza(j5, 0L, j7, j8, j9, j10);
    }

    public static long zza(long j2, long j5, long j6, long j7, long j8, long j9) {
        if (j7 + 1 >= j8 || 1 + j5 >= j6) {
            return j7;
        }
        long j10 = (long) (((j8 - j7) / (j6 - j5)) * (j2 - j5));
        String str = zzfj.zza;
        return Math.max(j7, Math.min(((j7 + j10) - j9) - (j10 / 20), j8 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    public final /* synthetic */ long zzb() {
        return this.zzf;
    }

    public final /* synthetic */ long zzc() {
        return this.zzg;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ void zzf(long j2, long j5) {
        this.zzd = j2;
        this.zzf = j5;
        zzi();
    }

    public final /* synthetic */ void zzg(long j2, long j5) {
        this.zze = j2;
        this.zzg = j5;
        zzi();
    }

    public final /* synthetic */ long zzh() {
        return this.zzh;
    }
}
