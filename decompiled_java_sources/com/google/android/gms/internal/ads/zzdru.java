package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdru {
    private final Executor zza;
    private final zzdrp zzb;
    private final zzdxt zzc;

    public zzdru(Executor executor, zzdrp zzdrpVar, zzdxt zzdxtVar) {
        this.zza = executor;
        this.zzb = zzdrpVar;
        this.zzc = zzdxtVar;
    }

    public final j3.a zza(JSONObject jSONObject, String str) {
        j3.a zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgzo.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzc.zze(), zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
            if (optJSONObject == null) {
                zza = zzgzo.zza(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzgzo.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zza = "string".equals(optString2) ? zzgzo.zza(new zzdrr(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgzo.zzk(this.zzb.zza(optJSONObject, "image_value", null), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrs
                        @Override // com.google.android.gms.internal.ads.zzgqt
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdrr(optString, (zzbkd) obj);
                        }
                    }, this.zza) : zzgzo.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdrt.zza, this.zza);
    }
}
