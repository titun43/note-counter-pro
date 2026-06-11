package com.getcapacitor.community.admob.helpers;

import android.content.Context;
import android.util.Log;
import com.getcapacitor.community.admob.models.AdOptions;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/* loaded from: classes.dex */
public final class AdViewIdHelper {
    private AdViewIdHelper() {
    }

    public static void assignIdToAdView(AdView adView, AdOptions adOptions, AdRequest adRequest, String str, Context context) {
        String finalAdId = getFinalAdId(adOptions, adRequest, str, context);
        adView.setAdUnitId(finalAdId);
        Log.d(str, "Ad ID: " + finalAdId);
    }

    public static String getFinalAdId(AdOptions adOptions, AdRequest adRequest, String str, Context context) {
        if (!adOptions.isTesting) {
            return adOptions.adId;
        }
        if (!adRequest.isTestDevice(context)) {
            return adOptions.getTestingId();
        }
        Log.w(str, "This device is registered as Testing Device. The real Ad Id will be used");
        return adOptions.adId;
    }
}
