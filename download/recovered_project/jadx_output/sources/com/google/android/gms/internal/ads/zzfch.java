package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfch implements zzfav {
    final String zza;
    final int zzb;

    public zzfch(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i5;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i5 = this.zzb) == -1) {
            return;
        }
        try {
            JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh(jSONObject, "pii");
            zzh.put("pvid", str);
            zzh.put("pvid_s", i5);
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e4);
        }
    }
}
