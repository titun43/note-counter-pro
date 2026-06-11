package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfga implements zzfgj {
    private final zzfgj zza;
    private zzdam zzb;

    public zzfga(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zzb;
    }

    public final synchronized j3.a zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzbzu zzbzuVar;
        this.zzb = zzdamVar;
        if (zzdamVar == null || (zzbzuVar = zzfgkVar.zza) == null) {
            return ((zzffz) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        }
        zzcxj zza = zzdamVar.zza();
        return zza.zzc(zza.zza(zzgzo.zza(zzbzuVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ j3.a zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }
}
