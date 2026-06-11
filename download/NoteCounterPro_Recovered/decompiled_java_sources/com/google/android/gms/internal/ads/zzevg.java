package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzevg implements zzfax {
    private final zzffr zza;

    public zzevg(zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        zzffr zzffrVar = this.zza;
        if (zzffrVar == null) {
            return zzgzo.zza(new zzevf(null));
        }
        String zza = zzffrVar.zza();
        int i5 = x2.f.f3711a;
        return (zza == null || zza.trim().isEmpty()) ? zzgzo.zza(new zzevf(null)) : zzgzo.zza(new zzevf(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 15;
    }
}
