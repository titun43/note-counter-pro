package com.getcapacitor.community.admob.rewarded;

import com.getcapacitor.community.admob.models.LoadPluginEventNames;

/* loaded from: classes.dex */
public final class RewardAdPluginEvents implements LoadPluginEventNames {
    public static final String FailedToLoad = "onRewardedVideoAdFailedToLoad";
    public static final String Loaded = "onRewardedVideoAdLoaded";
    public static final String Rewarded = "onRewardedVideoAdReward";
    public static final RewardAdPluginEvents INSTANCE = new RewardAdPluginEvents();
    private static final String Showed = "onRewardedVideoAdShowed";
    private static final String FailedToShow = "onRewardedVideoAdFailedToShow";
    private static final String Dismissed = "onRewardedVideoAdDismissed";

    private RewardAdPluginEvents() {
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
