package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfct implements zzfav {
    private final String zza;
    private final String zzb;

    public zzfct(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            zzh.put("doritos", this.zza);
            zzh.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
