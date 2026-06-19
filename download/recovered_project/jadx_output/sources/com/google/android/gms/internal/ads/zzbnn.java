package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class zzbnn implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcjlVar.getContext()).edit();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                edit.remove(jSONArray.getString(i5));
            }
            edit.apply();
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "GMSG clear local storage keys handler");
        }
    }
}
