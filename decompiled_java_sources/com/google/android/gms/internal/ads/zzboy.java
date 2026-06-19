package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzboy implements zzboh {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbox zzboxVar = (zzbox) this.zzb.remove(str);
                if (zzboxVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String sb2 = sb.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + concat.length());
                    sb3.append(str3);
                    sb3.append(concat);
                    zzboxVar.zzb(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    zzboxVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(jSONObject2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                    }
                    zzboxVar.zza(jSONObject);
                } catch (JSONException e4) {
                    zzboxVar.zzb(e4.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(String str, zzbox zzboxVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzboxVar);
        }
    }

    public final j3.a zzc(zzbrp zzbrpVar, String str, JSONObject jSONObject) {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzb(uuid, new zzbow(this, zzcenVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbrpVar.zzb(str, jSONObject2);
            return zzcenVar;
        } catch (Exception e4) {
            zzcenVar.zzd(e4);
            return zzcenVar;
        }
    }
}
