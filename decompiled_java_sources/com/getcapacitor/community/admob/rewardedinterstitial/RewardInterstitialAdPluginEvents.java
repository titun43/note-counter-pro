package com.getcapacitor.community.admob.rewardedinterstitial;

import com.getcapacitor.community.admob.models.LoadPluginEventNames;

/* loaded from: classes.dex */
public final class RewardInterstitialAdPluginEvents implements LoadPluginEventNames {
    public static final String FailedToLoad = "onRewardedInterstitialAdFailedToLoad";
    public static final String Loaded = "onRewardedInterstitialAdLoaded";
    public static final String Rewarded = "onRewardedInterstitialAdReward";
    public static final RewardInterstitialAdPluginEvents INSTANCE = new RewardInterstitialAdPluginEvents();
    private static final String Showed = "onRewardedInterstitialAdShowed";
    private static final String FailedToShow = "onRewardedInterstitialAdFailedToShow";
    private static final String Dismissed = "onRewardedInterstitialAdDismissed";

    private RewardInterstitialAdPluginEvents() {
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
