package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfa {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzfa(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        String str = this.zzc;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } catch (JSONException unused) {
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public final Bundle zzc() {
        return this.zzb;
    }
}
