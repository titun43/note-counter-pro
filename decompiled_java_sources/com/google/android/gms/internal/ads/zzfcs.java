package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfcs implements zzfax {
    public zzfcs(zzcdj zzcdjVar, zzgzy zzgzyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        final j3.a zza = zzgzo.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgN)).booleanValue()) {
            zza = zzgzo.zza(null);
        }
        final j3.a zza2 = zzgzo.zza(null);
        return zzgzo.zzo(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfct((String) j3.a.this.get(), (String) zza2.get());
            }
        }, zzcei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 47;
    }
}
