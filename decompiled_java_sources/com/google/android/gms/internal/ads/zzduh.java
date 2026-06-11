package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzduh implements zzikg {
    private final zzikp zza;

    private zzduh(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzduh zza(zzikp zzikpVar) {
        return new zzduh(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbgj.zza.EnumC0000zza enumC0000zza = ((zzdaw) this.zza).zza().zzp.zza == 3 ? zzbgj.zza.EnumC0000zza.REWARDED_INTERSTITIAL : zzbgj.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD;
        zziko.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
