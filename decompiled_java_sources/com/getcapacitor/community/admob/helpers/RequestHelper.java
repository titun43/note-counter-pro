package com.getcapacitor.community.admob.helpers;

import android.os.Bundle;
import com.getcapacitor.community.admob.models.AdOptions;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes.dex */
public final class RequestHelper {
    private RequestHelper() {
    }

    public static AdRequest createRequest(AdOptions adOptions) {
        AdRequest.Builder builder = new AdRequest.Builder();
        if (adOptions.npa) {
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        }
        return builder.build();
    }

    public static String getRequestErrorReason(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 8 ? "Unknown error" : "App Id Missing" : "No fill" : "Network Error" : "Invalid request" : "Internal error";
    }
}
