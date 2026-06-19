package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaea implements zzafy {
    private final zzaed zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaea(zzaed zzaedVar, long j2, long j5, long j6, long j7, long j8, long j9) {
        this.zza = zzaedVar;
        this.zzb = j2;
        this.zzc = j6;
        this.zzd = j7;
        this.zze = j8;
        this.zzf = j9;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzafz zzafzVar = new zzafz(j2, zzaec.zza(this.zza.zza(j2), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzafw(zzafzVar, zzafzVar);
    }

    public final long zzd(long j2) {
        return this.zza.zza(j2);
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }
}
