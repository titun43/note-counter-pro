package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbxy {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbxy(boolean z4, String str, boolean z5) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = z5;
    }

    public static zzbxy zza(JSONObject jSONObject) {
        return new zzbxy(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
