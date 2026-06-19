package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzbgx {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            return null;
        }
    }

    public static final SharedPreferences zzb(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            return null;
        }
    }
}
