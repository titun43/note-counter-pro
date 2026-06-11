package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbmw implements zzboh {
    private final zzbmx zza;

    public zzbmw(zzbmx zzbmxVar) {
        this.zza = zzbmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Ad metadata with no name parameter.");
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbp.zzl(new JSONObject((String) map.get("info")));
            } catch (JSONException e4) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to convert ad metadata to JSON.", e4);
            }
        }
        if (bundle != null) {
            this.zza.zza(str, bundle);
        } else {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to convert ad metadata to Bundle.");
        }
    }
}
