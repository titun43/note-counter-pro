package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzezf implements zzfax {
    private final zzgzy zza;
    private final zzdzc zzb;

    public zzezf(zzgzy zzgzyVar, zzdzc zzdzcVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzezf.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzezg zzc() {
        return new zzezg(this.zzb.zzb());
    }
}
