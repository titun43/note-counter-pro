package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzafx implements zzafy {
    private final long zza;
    private final zzafw zzb;

    public zzafx(long j2, long j5) {
        this.zza = j2;
        zzafz zzafzVar = j5 == 0 ? zzafz.zza : new zzafz(0L, j5);
        this.zzb = new zzafw(zzafzVar, zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        return this.zzb;
    }
}
