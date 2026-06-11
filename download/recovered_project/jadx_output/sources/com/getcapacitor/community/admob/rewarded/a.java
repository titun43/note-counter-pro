package com.getcapacitor.community.admob.rewarded;

import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.rewardedinterstitial.RewardedInterstitialAdCallbackAndListeners;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnUserEarnedRewardListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2.a f863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginCall f864c;

    public /* synthetic */ a(x2.a aVar, PluginCall pluginCall, int i5) {
        this.f862a = i5;
        this.f863b = aVar;
        this.f864c = pluginCall;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        switch (this.f862a) {
            case 0:
                RewardedAdCallbackAndListeners.getOnUserEarnedRewardListener$lambda$0(this.f863b, this.f864c, rewardItem);
                break;
            default:
                RewardedInterstitialAdCallbackAndListeners.getOnUserEarnedRewardListener$lambda$0(this.f863b, this.f864c, rewardItem);
                break;
        }
    }
}
