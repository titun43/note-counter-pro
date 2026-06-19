package com.getcapacitor.community.admob.interstitial;

import a2.b;
import android.app.Activity;
import android.content.Context;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.helpers.AdViewIdHelper;
import com.getcapacitor.community.admob.helpers.RequestHelper;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.getcapacitor.community.admob.models.AdOptions;
import com.getcapacitor.community.admob.models.Executor;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import e0.d;
import x2.a;

/* loaded from: classes.dex */
public class AdInterstitialExecutor extends Executor {
    public static InterstitialAd interstitialAd;
    InterstitialAdCallbackAndListeners adCallbackAndListeners;

    public AdInterstitialExecutor(d dVar, d dVar2, a aVar, String str, InterstitialAdCallbackAndListeners interstitialAdCallbackAndListeners) {
        super(dVar, dVar2, aVar, str, "AdRewardExecutor");
        this.adCallbackAndListeners = interstitialAdCallbackAndListeners;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareInterstitial$0(AdOptions adOptions, PluginCall pluginCall, a aVar) {
        AdRequest createRequest = RequestHelper.createRequest(adOptions);
        InterstitialAd.load((Context) this.activitySupplier.get(), AdViewIdHelper.getFinalAdId(adOptions, createRequest, this.logTag, (Context) this.contextSupplier.get()), createRequest, this.adCallbackAndListeners.getInterstitialAdLoadCallback(pluginCall, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showInterstitial$1(PluginCall pluginCall) {
        try {
            interstitialAd.show((Activity) this.activitySupplier.get());
            pluginCall.resolve();
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    public void prepareInterstitial(PluginCall pluginCall, a aVar) {
        PluginCall pluginCall2;
        AdOptions createInterstitialOptions = AdOptions.getFactory().createInterstitialOptions(pluginCall);
        try {
            pluginCall2 = pluginCall;
        } catch (Exception e4) {
            e = e4;
            pluginCall2 = pluginCall;
        }
        try {
            ((Activity) this.activitySupplier.get()).runOnUiThread(new com.getcapacitor.a(this, createInterstitialOptions, pluginCall2, aVar, 1));
        } catch (Exception e5) {
            e = e5;
            Exception exc = e;
            pluginCall2.reject(exc.getLocalizedMessage(), exc);
        }
    }

    public void showInterstitial(PluginCall pluginCall, a aVar) {
        if (interstitialAd != null) {
            ((Activity) this.activitySupplier.get()).runOnUiThread(new b(6, this, pluginCall));
        } else {
            pluginCall.reject("No Interstitial can be shown. It was not prepared or maybe it failed to be prepared.");
            aVar.a(InterstitialAdPluginPluginEvent.FailedToLoad, new AdMobPluginError(-1, "No Interstitial can be shown. It was not prepared or maybe it failed to be prepared."));
        }
    }
}
