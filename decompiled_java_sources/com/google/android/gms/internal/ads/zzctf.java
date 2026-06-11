package com.google.android.gms.internal.ads;

import com.getcapacitor.Bridge;

/* loaded from: classes.dex */
public final class zzctf {
    private final zzdxz zza;
    private final zzfjc zzb;

    public zzctf(zzdxz zzdxzVar, zzfjc zzfjcVar) {
        this.zza = zzdxzVar;
        this.zzb = zzfjcVar;
    }

    public final void zza(long j2, int i5) {
        zzdxy zza = this.zza.zza();
        zza.zza(this.zzb.zzb.zzb);
        zza.zzc("action", "ad_closed");
        zza.zzc("show_time", String.valueOf(j2));
        zza.zzc("ad_format", "app_open_ad");
        int i6 = i5 - 1;
        zza.zzc("acr", i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzd();
    }
}
