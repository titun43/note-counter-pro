package com.getcapacitor.community.admob.rewardedinterstitial;

import a2.f;
import android.app.Activity;
import android.content.Context;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.community.admob.helpers.AdViewIdHelper;
import com.getcapacitor.community.admob.helpers.RequestHelper;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.getcapacitor.community.admob.models.AdOptions;
import com.getcapacitor.community.admob.models.Executor;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import e0.d;
import x2.a;

/* loaded from: classes.dex */
public class AdRewardInterstitialExecutor extends Executor {
    public static RewardedInterstitialAd mRewardedInterstitialAd;

    public AdRewardInterstitialExecutor(d dVar, d dVar2, a aVar, String str) {
        super(dVar, dVar2, aVar, str, "AdRewardExecutor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareRewardInterstitialAd$0(AdOptions adOptions, PluginCall pluginCall, a aVar) {
        try {
            AdRequest createRequest = RequestHelper.createRequest(adOptions);
            RewardedInterstitialAd.load((Context) this.contextSupplier.get(), AdViewIdHelper.getFinalAdId(adOptions, createRequest, this.logTag, (Context) this.contextSupplier.get()), createRequest, RewardedInterstitialAdCallbackAndListeners.INSTANCE.getRewardedAdLoadCallback(pluginCall, aVar, adOptions));
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRewardInterstitialAd$1(PluginCall pluginCall, a aVar) {
        mRewardedInterstitialAd.show((Activity) this.activitySupplier.get(), RewardedInterstitialAdCallbackAndListeners.INSTANCE.getOnUserEarnedRewardListener(pluginCall, aVar));
    }

    @PluginMethod
    public void prepareRewardInterstitialAd(PluginCall pluginCall, a aVar) {
        ((Activity) this.activitySupplier.get()).runOnUiThread(new com.getcapacitor.a(this, AdOptions.getFactory().createRewardInterstitialOptions(pluginCall), pluginCall, aVar, 3));
    }

    @PluginMethod
    public void showRewardInterstitialAd(PluginCall pluginCall, a aVar) {
        if (mRewardedInterstitialAd == null) {
            pluginCall.reject("No Reward Interstitial Video Ad can be shown. It was not prepared or maybe it failed to be prepared.");
            aVar.a(RewardInterstitialAdPluginEvents.FailedToLoad, new AdMobPluginError(-1, "No Reward Interstitial Video Ad can be shown. It was not prepared or maybe it failed to be prepared."));
        } else {
            try {
                ((Activity) this.activitySupplier.get()).runOnUiThread(new f((Executor) this, pluginCall, aVar, 3));
            } catch (Exception e4) {
                pluginCall.reject(e4.getLocalizedMessage(), e4);
            }
        }
    }
}
