package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzesn implements zzfax {
    private final Context zza;

    public zzesn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return zzgzo.zza(new zzeso(v.a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 2;
    }
}
