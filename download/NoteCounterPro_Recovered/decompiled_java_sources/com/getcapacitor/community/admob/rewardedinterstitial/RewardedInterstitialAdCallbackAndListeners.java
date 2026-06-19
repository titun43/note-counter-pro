package com.getcapacitor.community.admob.rewardedinterstitial;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.helpers.FullscreenPluginCallback;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.getcapacitor.community.admob.models.AdOptions;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import g4.i;
import x2.a;

/* loaded from: classes.dex */
public final class RewardedInterstitialAdCallbackAndListeners {
    public static final RewardedInterstitialAdCallbackAndListeners INSTANCE = new RewardedInterstitialAdCallbackAndListeners();

    private RewardedInterstitialAdCallbackAndListeners() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnUserEarnedRewardListener$lambda$0(a aVar, PluginCall pluginCall, RewardItem rewardItem) {
        i.e(rewardItem, "item");
        JSObject jSObject = new JSObject();
        jSObject.put("type", rewardItem.getType()).put("amount", rewardItem.getAmount());
        aVar.a(RewardInterstitialAdPluginEvents.Rewarded, jSObject);
        pluginCall.resolve(jSObject);
    }

    public final OnUserEarnedRewardListener getOnUserEarnedRewardListener(PluginCall pluginCall, a aVar) {
        i.e(pluginCall, "call");
        i.e(aVar, "notifyListenersFunction");
        return new com.getcapacitor.community.admob.rewarded.a(aVar, pluginCall, 1);
    }

    public final RewardedInterstitialAdLoadCallback getRewardedAdLoadCallback(final PluginCall pluginCall, final a aVar, AdOptions adOptions) {
        i.e(pluginCall, "call");
        i.e(aVar, "notifyListenersFunction");
        i.e(adOptions, "adOptions");
        return new RewardedInterstitialAdLoadCallback() { // from class: com.getcapacitor.community.admob.rewardedinterstitial.RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                i.e(loadAdError, "adError");
                a.this.a(RewardInterstitialAdPluginEvents.FailedToLoad, new AdMobPluginError(loadAdError));
                pluginCall.reject(loadAdError.getMessage());
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                i.e(rewardedInterstitialAd, "ad");
                AdRewardInterstitialExecutor.mRewardedInterstitialAd = rewardedInterstitialAd;
                rewardedInterstitialAd.setFullScreenContentCallback(new FullscreenPluginCallback(RewardInterstitialAdPluginEvents.INSTANCE, a.this));
                JSObject jSObject = new JSObject();
                jSObject.put("adUnitId", rewardedInterstitialAd.getAdUnitId());
                pluginCall.resolve(jSObject);
                a.this.a(RewardInterstitialAdPluginEvents.Loaded, jSObject);
            }
        };
    }
}
