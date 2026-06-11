package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzefc implements zzefe {
    private final Map zza;
    private final zzgzy zzb;
    private final zzdej zzc;

    public zzefc(Map map, zzgzy zzgzyVar, zzdej zzdejVar) {
        this.zza = map;
        this.zzb = zzgzyVar;
        this.zzc = zzdejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final j3.a zza(final zzbzu zzbzuVar) {
        this.zzc.zzdO(zzbzuVar);
        j3.a zzc = zzgzo.zzc(new zzecr(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjz)).split(",")) {
            final zzikv zzikvVar = (zzikv) this.zza.get(str.trim());
            if (zzikvVar != null) {
                zzc = zzgzo.zzh(zzc, zzecr.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefb
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        return ((zzefe) zzikv.this.zzb()).zza(zzbzuVar);
                    }
                }, this.zzb);
            }
        }
        zzgzo.zzr(zzc, new zzefa(this), zzcei.zzg);
        return zzc;
    }

    public final /* synthetic */ zzdej zzb() {
        return this.zzc;
    }
}
