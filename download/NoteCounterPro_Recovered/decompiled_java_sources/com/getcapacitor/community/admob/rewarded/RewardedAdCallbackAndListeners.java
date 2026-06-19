package com.getcapacitor.community.admob.rewarded;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.helpers.FullscreenPluginCallback;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.getcapacitor.community.admob.models.AdOptions;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import g4.i;

/* loaded from: classes.dex */
public final class RewardedAdCallbackAndListeners {
    public static final RewardedAdCallbackAndListeners INSTANCE = new RewardedAdCallbackAndListeners();

    private RewardedAdCallbackAndListeners() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnUserEarnedRewardListener$lambda$0(x2.a aVar, PluginCall pluginCall, RewardItem rewardItem) {
        i.e(rewardItem, "item");
        JSObject jSObject = new JSObject();
        jSObject.put("type", rewardItem.getType()).put("amount", rewardItem.getAmount());
        aVar.a(RewardAdPluginEvents.Rewarded, jSObject);
        pluginCall.resolve(jSObject);
    }

    public final OnUserEarnedRewardListener getOnUserEarnedRewardListener(PluginCall pluginCall, x2.a aVar) {
        i.e(pluginCall, "call");
        i.e(aVar, "notifyListenersFunction");
        return new a(aVar, pluginCall, 0);
    }

    public final RewardedAdLoadCallback getRewardedAdLoadCallback(final PluginCall pluginCall, final x2.a aVar, final AdOptions adOptions) {
        i.e(pluginCall, "call");
        i.e(aVar, "notifyListenersFunction");
        i.e(adOptions, "adOptions");
        return new RewardedAdLoadCallback() { // from class: com.getcapacitor.community.admob.rewarded.RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                i.e(loadAdError, "adError");
                aVar.a(RewardAdPluginEvents.FailedToLoad, new AdMobPluginError(loadAdError));
                PluginCall.this.reject(loadAdError.getMessage());
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                i.e(rewardedAd, "ad");
                Boolean bool = PluginCall.this.getBoolean("immersiveMode");
                rewardedAd.setImmersiveMode(bool != null ? bool.booleanValue() : false);
                AdRewardExecutor.mRewardedAd = rewardedAd;
                rewardedAd.setFullScreenContentCallback(new FullscreenPluginCallback(RewardAdPluginEvents.INSTANCE, aVar));
                if (adOptions.ssvInfo.getHasInfo()) {
                    ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
                    String customData = adOptions.ssvInfo.getCustomData();
                    if (customData != null) {
                        builder.setCustomData(customData);
                    }
                    String userId = adOptions.ssvInfo.getUserId();
                    if (userId != null) {
                        builder.setUserId(userId);
                    }
                    AdRewardExecutor.mRewardedAd.setServerSideVerificationOptions(builder.build());
                }
                JSObject jSObject = new JSObject();
                jSObject.put("adUnitId", rewardedAd.getAdUnitId());
                PluginCall.this.resolve(jSObject);
                aVar.a(RewardAdPluginEvents.Loaded, jSObject);
            }
        };
    }
}
