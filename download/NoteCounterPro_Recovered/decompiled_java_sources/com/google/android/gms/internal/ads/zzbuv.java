package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* loaded from: classes.dex */
public final class zzbuv extends zzbub {
    private final MediationInterscrollerAd zza;

    public zzbuv(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final a3.a zze() {
        return new a3.b(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
