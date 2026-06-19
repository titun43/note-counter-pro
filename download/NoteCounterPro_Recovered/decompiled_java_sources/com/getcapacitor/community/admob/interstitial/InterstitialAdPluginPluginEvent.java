package com.getcapacitor.community.admob.interstitial;

import com.getcapacitor.community.admob.models.LoadPluginEventNames;

/* loaded from: classes.dex */
public final class InterstitialAdPluginPluginEvent implements LoadPluginEventNames {
    public static final String FailedToLoad = "interstitialAdFailedToLoad";
    public static final String Loaded = "interstitialAdLoaded";
    public static final InterstitialAdPluginPluginEvent INSTANCE = new InterstitialAdPluginPluginEvent();
    private static final String Showed = "interstitialAdShowed";
    private static final String FailedToShow = "interstitialAdFailedToShow";
    private static final String Dismissed = "interstitialAdDismissed";

    private InterstitialAdPluginPluginEvent() {
    }

    @Override // com.getcapacitor.community.admob.models.LoadPluginEventNames
    public String getDismissed() {
        return Dismissed;
    }

    @Override // com.getcapacitor.community.admob.models.LoadPluginEventNames
    public String getFailedToShow() {
        return FailedToShow;
    }

    @Override // com.getcapacitor.community.admob.models.LoadPluginEventNames
    public String getShowed() {
        return Showed;
    }
}
