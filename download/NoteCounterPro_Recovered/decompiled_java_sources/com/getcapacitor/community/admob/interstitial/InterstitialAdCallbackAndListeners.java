package com.getcapacitor.community.admob.interstitial;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.helpers.FullscreenPluginCallback;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import g4.i;
import x2.a;

/* loaded from: classes.dex */
public final class InterstitialAdCallbackAndListeners {
    public static final InterstitialAdCallbackAndListeners INSTANCE = new InterstitialAdCallbackAndListeners();

    private InterstitialAdCallbackAndListeners() {
    }

    public final InterstitialAdLoadCallback getInterstitialAdLoadCallback(final PluginCall pluginCall, final a aVar) {
        i.e(pluginCall, "call");
        i.e(aVar, "notifyListenersFunction");
        return new InterstitialAdLoadCallback() { // from class: com.getcapacitor.community.admob.interstitial.InterstitialAdCallbackAndListeners$getInterstitialAdLoadCallback$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                i.e(loadAdError, "adError");
                aVar.a(InterstitialAdPluginPluginEvent.FailedToLoad, new AdMobPluginError(loadAdError));
                PluginCall.this.reject(loadAdError.getMessage());
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                i.e(interstitialAd, "ad");
                Boolean bool = PluginCall.this.getBoolean("immersiveMode");
                interstitialAd.setFullScreenContentCallback(new FullscreenPluginCallback(InterstitialAdPluginPluginEvent.INSTANCE, aVar));
                interstitialAd.setImmersiveMode(bool != null ? bool.booleanValue() : false);
                AdInterstitialExecutor.interstitialAd = interstitialAd;
                JSObject jSObject = new JSObject();
                jSObject.put("adUnitId", interstitialAd.getAdUnitId());
                PluginCall.this.resolve(jSObject);
                aVar.a(InterstitialAdPluginPluginEvent.Loaded, jSObject);
            }
        };
    }
}
