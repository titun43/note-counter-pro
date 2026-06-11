package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdvw {
    public static String zza(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (zzb(optJSONArray2, str) && !zzb(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    private static boolean zzb(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                String optString = jSONArray.optString(i5);
                try {
                } catch (PatternSyntaxException e4) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzms)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
