package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeua implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final zzcdz zzc;

    public zzeua(zzgzy zzgzyVar, zzfjk zzfjkVar, zzcdz zzcdzVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = zzcdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeua.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzeub zzc() {
        return new zzeub(this.zzb.zzk, this.zzc.zzl());
    }
}
