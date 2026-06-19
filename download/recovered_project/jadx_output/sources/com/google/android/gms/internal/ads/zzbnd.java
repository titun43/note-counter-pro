package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbnd implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzd;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzar = zzcjlVar.zzar();
        if (zzar == null || (zzd = zzar.zzd()) == null) {
            zzcjlVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeClickMetaReady", zzd);
        }
    }
}
