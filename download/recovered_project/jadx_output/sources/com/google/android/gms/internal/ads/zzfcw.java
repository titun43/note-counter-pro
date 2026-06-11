package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfcw implements zzfax {
    final zzgzy zza;
    final List zzb;

    public zzfcw(zzbgo zzbgoVar, zzgzy zzgzyVar, List list) {
        this.zza = zzgzyVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcx(zzfcw.this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 48;
    }
}
