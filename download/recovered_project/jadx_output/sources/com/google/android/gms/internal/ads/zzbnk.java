package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbnk implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            String str = (String) map.get("enabled");
            zzboh zzbohVar = zzbog.zza;
            if (!zzgql.zze("true", str) && !zzgql.zze("false", str)) {
                return;
            }
            zzgai.zza(zzcjlVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
