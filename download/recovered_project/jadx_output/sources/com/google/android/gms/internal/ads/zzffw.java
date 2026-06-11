package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzffw implements zzfgj {
    private final zzfkz zza;
    private final Executor zzb;
    private final zzgzl zzc = new zzfft(this);

    public zzffw(zzfkz zzfkzVar, Executor executor) {
        this.zza = zzfkzVar;
        this.zzb = executor;
    }

    public final j3.a zza(zzfgk zzfgkVar, zzfgi zzfgiVar, final zzdam zzdamVar) {
        zzfkz zzfkzVar = this.zza;
        Executor executor = this.zzb;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzj(zzgzg.zzw(new zzfgf(zzfkzVar, zzdamVar, executor).zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffu
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzffw.this.zzb(zzdamVar, (zzfgd) obj);
            }
        }, executor), Exception.class, new zzffs(this), executor);
    }

    public final /* synthetic */ j3.a zzb(zzdam zzdamVar, zzfgd zzfgdVar) {
        zzfkz zzfkzVar = this.zza;
        zzflj zzfljVar = zzfgdVar.zzb;
        zzbzu zzbzuVar = zzfgdVar.zza;
        zzfli zza = zzfkzVar.zza(zzfljVar);
        if (zza != null && zzbzuVar != null) {
            zzgzo.zzr(zzdamVar.zza().zzf(zzbzuVar), this.zzc, this.zzb);
        }
        return zzgzo.zza(new zzffv(zzfljVar, zzbzuVar, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ j3.a zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zza(zzfgkVar, zzfgiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
