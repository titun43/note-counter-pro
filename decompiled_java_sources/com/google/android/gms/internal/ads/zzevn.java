package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzevn implements zzfax {
    private final zzgzy zza;

    public zzevn(zzgzy zzgzyVar) {
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                return new zzevo(System.currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 55;
    }
}
