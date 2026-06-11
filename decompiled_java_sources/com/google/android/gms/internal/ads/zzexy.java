package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzexy implements zzfav {
    private final Integer zza;

    public zzexy(Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (num != null) {
            zzdahVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
