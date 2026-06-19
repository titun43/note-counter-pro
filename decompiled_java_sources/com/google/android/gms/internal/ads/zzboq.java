package com.google.android.gms.internal.ads;

import com.getcapacitor.Bridge;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzboq implements zzgzl {
    final /* synthetic */ Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbou zzd;

    public zzboq(zzbou zzbouVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        Objects.requireNonNull(zzbouVar);
        this.zzd = zzbouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlz)).booleanValue()) {
            this.zza.put(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM, str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
