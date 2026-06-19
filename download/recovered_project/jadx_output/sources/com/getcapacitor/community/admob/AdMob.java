package com.getcapacitor.community.admob;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.community.admob.banner.BannerExecutor;
import com.getcapacitor.community.admob.consent.AdConsentExecutor;
import com.getcapacitor.community.admob.helpers.AuthorizationStatusEnum;
import com.getcapacitor.community.admob.interstitial.AdInterstitialExecutor;
import com.getcapacitor.community.admob.interstitial.InterstitialAdCallbackAndListeners;
import com.getcapacitor.community.admob.rewarded.AdRewardExecutor;
import com.getcapacitor.community.admob.rewardedinterstitial.AdRewardInterstitialExecutor;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import org.json.JSONException;

@CapacitorPlugin(permissions = {@Permission(alias = "network", strings = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"})})
/* loaded from: classes.dex */
public class AdMob extends Plugin {
    public static final JSArray EMPTY_TESTING_DEVICES = new JSArray();
    private final BannerExecutor bannerExecutor = new BannerExecutor(new a(this, 16), new a(this, 1), new a(this, 4), getLogTag());
    private final AdRewardExecutor adRewardExecutor = new AdRewardExecutor(new a(this, 16), new a(this, 1), new a(this, 5), getLogTag());
    private final AdRewardInterstitialExecutor adRewardInterstitialExecutor = new AdRewardInterstitialExecutor(new a(this, 16), new a(this, 1), new a(this, 6), getLogTag());
    private final AdInterstitialExecutor adInterstitialExecutor = new AdInterstitialExecutor(new a(this, 16), new a(this, 1), new a(this, 2), getLogTag(), InterstitialAdCallbackAndListeners.INSTANCE);
    private final AdConsentExecutor adConsentExecutor = new AdConsentExecutor(new a(this, 16), new a(this, 1), new a(this, 3), getLogTag());

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        if (r6.equals("ParentalGuidance") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setRequestConfiguration(PluginCall pluginCall) {
        String str;
        JSArray array = pluginCall.getBoolean("initializeForTesting", Boolean.FALSE).booleanValue() ? pluginCall.getArray("testingDevices", EMPTY_TESTING_DEVICES) : EMPTY_TESTING_DEVICES;
        Boolean bool = pluginCall.getBoolean("tagForChildDirectedTreatment");
        char c5 = 0;
        int i5 = bool == null ? -1 : bool.booleanValue() ? 1 : 0;
        Boolean bool2 = pluginCall.getBoolean("tagForUnderAgeOfConsent");
        int i6 = bool2 == null ? -1 : bool2.booleanValue() ? 1 : 0;
        String string = pluginCall.getString("maxAdContentRating");
        try {
            if (string != null) {
                switch (string.hashCode()) {
                    case -799080211:
                        break;
                    case 2602746:
                        if (string.equals("Teen")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1578448460:
                        if (string.equals("MatureAudience")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1584505032:
                        if (string.equals("General")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_PG;
                        break;
                    case 1:
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_T;
                        break;
                    case 2:
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_MA;
                        break;
                    case 3:
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_G;
                        break;
                }
                MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTestDeviceIds(array.toList()).setTagForChildDirectedTreatment(i5).setTagForUnderAgeOfConsent(i6).setMaxAdContentRating(str).build());
                return;
            }
            MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTestDeviceIds(array.toList()).setTagForChildDirectedTreatment(i5).setTagForUnderAgeOfConsent(i6).setMaxAdContentRating(str).build());
            return;
        } catch (JSONException e4) {
            pluginCall.reject(e4.toString());
            return;
        }
        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @PluginMethod
    public void hideBanner(PluginCall pluginCall) {
        this.bannerExecutor.hideBanner(pluginCall);
    }

    @PluginMethod
    public void initialize(PluginCall pluginCall) {
        setRequestConfiguration(pluginCall);
        try {
            MobileAds.initialize(getContext(), new OnInitializationCompleteListener(this) { // from class: com.getcapacitor.community.admob.AdMob.1
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });
            this.bannerExecutor.initialize();
            pluginCall.resolve();
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    @PluginMethod
    public void prepareInterstitial(PluginCall pluginCall) {
        this.adInterstitialExecutor.prepareInterstitial(pluginCall, new a(this, 0));
    }

    @PluginMethod
    public void prepareRewardInterstitialAd(PluginCall pluginCall) {
        this.adRewardInterstitialExecutor.prepareRewardInterstitialAd(pluginCall, new a(this, 7));
    }

    @PluginMethod
    public void prepareRewardVideoAd(PluginCall pluginCall) {
        this.adRewardExecutor.prepareRewardVideoAd(pluginCall, new a(this, 9));
    }

    @PluginMethod
    public void removeBanner(PluginCall pluginCall) {
        this.bannerExecutor.removeBanner(pluginCall);
    }

    @PluginMethod
    public void requestConsentInfo(PluginCall pluginCall) {
        this.adConsentExecutor.requestConsentInfo(pluginCall, new a(this, 8));
    }

    @PluginMethod
    public void requestTrackingAuthorization(PluginCall pluginCall) {
        pluginCall.resolve();
    }

    @PluginMethod
    public void resetConsentInfo(PluginCall pluginCall) {
        this.adConsentExecutor.resetConsentInfo(pluginCall, new a(this, 13));
    }

    @PluginMethod
    public void resumeBanner(PluginCall pluginCall) {
        this.bannerExecutor.resumeBanner(pluginCall);
    }

    @PluginMethod
    public void setApplicationMuted(PluginCall pluginCall) {
        Boolean bool = pluginCall.getBoolean("muted");
        if (bool == null) {
            pluginCall.reject("muted property cannot be null");
        } else {
            MobileAds.setAppMuted(bool.booleanValue());
            pluginCall.resolve();
        }
    }

    @PluginMethod
    public void setApplicationVolume(PluginCall pluginCall) {
        Float f5 = pluginCall.getFloat("volume");
        if (f5 == null) {
            pluginCall.reject("volume property cannot be null");
        } else {
            MobileAds.setAppVolume(f5.floatValue());
            pluginCall.resolve();
        }
    }

    @PluginMethod
    public void showBanner(PluginCall pluginCall) {
        this.bannerExecutor.showBanner(pluginCall);
    }

    @PluginMethod
    public void showConsentForm(PluginCall pluginCall) {
        this.adConsentExecutor.showConsentForm(pluginCall, new a(this, 12));
    }

    @PluginMethod
    public void showInterstitial(PluginCall pluginCall) {
        this.adInterstitialExecutor.showInterstitial(pluginCall, new a(this, 14));
    }

    @PluginMethod
    public void showPrivacyOptionsForm(PluginCall pluginCall) {
        this.adConsentExecutor.showPrivacyOptionsForm(pluginCall, new a(this, 10));
    }

    @PluginMethod
    public void showRewardInterstitialAd(PluginCall pluginCall) {
        this.adRewardInterstitialExecutor.showRewardInterstitialAd(pluginCall, new a(this, 15));
    }

    @PluginMethod
    public void showRewardVideoAd(PluginCall pluginCall) {
        this.adRewardExecutor.showRewardVideoAd(pluginCall, new a(this, 11));
    }

    @PluginMethod
    public void trackingAuthorizationStatus(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("status", AuthorizationStatusEnum.AUTHORIZED.getStatus());
        pluginCall.resolve(jSObject);
    }
}
