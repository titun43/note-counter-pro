package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdqw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdqw(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdqw zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzdqw(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqv((com.google.android.gms.ads.internal.util.zzbl) this.zza.zzb(), (x2.b) this.zzb.zzb(), zzfmk.zzc());
    }
}
