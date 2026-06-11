package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzajk extends zzaek implements zzajr {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzajk(long j2, long j5, int i5, int i6, boolean z4) {
        super(j2, j5, i5, i6, false);
        this.zza = j5;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = j2 != -1 ? j2 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        return zzd(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzb;
    }

    public final zzajk zzh(long j2) {
        return new zzajk(j2, this.zza, this.zzb, this.zzc, false);
    }
}
