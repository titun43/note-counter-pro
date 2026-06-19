package com.getcapacitor.community.admob.rewarded;

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
import com.google.android.gms.ads.rewarded.RewardedAd;
import e0.d;

/* loaded from: classes.dex */
public class AdRewardExecutor extends Executor {
    public static RewardedAd mRewardedAd;

    public AdRewardExecutor(d dVar, d dVar2, x2.a aVar, String str) {
        super(dVar, dVar2, aVar, str, "AdRewardExecutor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareRewardVideoAd$0(AdOptions adOptions, PluginCall pluginCall, x2.a aVar) {
        try {
            AdRequest createRequest = RequestHelper.createRequest(adOptions);
            RewardedAd.load((Context) this.contextSupplier.get(), AdViewIdHelper.getFinalAdId(adOptions, createRequest, this.logTag, (Context) this.contextSupplier.get()), createRequest, RewardedAdCallbackAndListeners.INSTANCE.getRewardedAdLoadCallback(pluginCall, aVar, adOptions));
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRewardVideoAd$1(PluginCall pluginCall, x2.a aVar) {
        mRewardedAd.show((Activity) this.activitySupplier.get(), RewardedAdCallbackAndListeners.INSTANCE.getOnUserEarnedRewardListener(pluginCall, aVar));
    }

    @PluginMethod
    public void prepareRewardVideoAd(PluginCall pluginCall, x2.a aVar) {
        ((Activity) this.activitySupplier.get()).runOnUiThread(new com.getcapacitor.a(this, AdOptions.getFactory().createRewardVideoOptions(pluginCall), pluginCall, aVar, 2));
    }

    @PluginMethod
    public void showRewardVideoAd(PluginCall pluginCall, x2.a aVar) {
        if (mRewardedAd == null) {
            pluginCall.reject("No Reward Video Ad can be shown. It was not prepared or maybe it failed to be prepared.");
            aVar.a(RewardAdPluginEvents.FailedToLoad, new AdMobPluginError(-1, "No Reward Video Ad can be shown. It was not prepared or maybe it failed to be prepared."));
        } else {
            try {
                ((Activity) this.activitySupplier.get()).runOnUiThread(new f((Executor) this, pluginCall, aVar, 2));
            } catch (Exception e4) {
                pluginCall.reject(e4.getLocalizedMessage(), e4);
            }
        }
    }
}
