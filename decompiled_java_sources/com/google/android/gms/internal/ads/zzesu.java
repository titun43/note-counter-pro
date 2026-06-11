package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzesu implements zzfax {
    private final x2.b zza;
    private final zzfjk zzb;
    private final long zzc;

    public zzesu(x2.b bVar, zzfjk zzfjkVar, long j2) {
        this.zza = bVar;
        this.zzb = zzfjkVar;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        x2.b bVar = this.zza;
        zzfjk zzfjkVar = this.zzb;
        ((x2.c) bVar).getClass();
        return zzgzo.zza(new zzesv(zzfjkVar, System.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 4;
    }
}
