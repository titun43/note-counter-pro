package com.getcapacitor;

import com.getcapacitor.community.admob.interstitial.AdInterstitialExecutor;
import com.getcapacitor.community.admob.models.AdOptions;
import com.getcapacitor.community.admob.models.Executor;
import com.getcapacitor.community.admob.rewarded.AdRewardExecutor;
import com.getcapacitor.community.admob.rewardedinterstitial.AdRewardInterstitialExecutor;
import com.getcapacitor.plugin.SystemBars;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f847g;
    public final /* synthetic */ PluginCall h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f848i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f849j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f850k;

    public /* synthetic */ a(Bridge bridge, PluginHandle pluginHandle, String str, PluginCall pluginCall) {
        this.f847g = 0;
        this.f848i = bridge;
        this.f849j = pluginHandle;
        this.f850k = str;
        this.h = pluginCall;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f847g) {
            case 0:
                ((Bridge) this.f848i).lambda$callPluginMethod$0((PluginHandle) this.f849j, (String) this.f850k, this.h);
                break;
            case 1:
                ((AdInterstitialExecutor) this.f848i).lambda$prepareInterstitial$0((AdOptions) this.f849j, this.h, (x2.a) this.f850k);
                break;
            case 2:
                ((AdRewardExecutor) this.f848i).lambda$prepareRewardVideoAd$0((AdOptions) this.f849j, this.h, (x2.a) this.f850k);
                break;
            case 3:
                ((AdRewardInterstitialExecutor) this.f848i).lambda$prepareRewardInterstitialAd$0((AdOptions) this.f849j, this.h, (x2.a) this.f850k);
                break;
            default:
                ((SystemBars) this.f848i).lambda$setStyle$1((String) this.f850k, (String) this.f849j, this.h);
                break;
        }
    }

    public /* synthetic */ a(Executor executor, AdOptions adOptions, PluginCall pluginCall, x2.a aVar, int i5) {
        this.f847g = i5;
        this.f848i = executor;
        this.f849j = adOptions;
        this.h = pluginCall;
        this.f850k = aVar;
    }

    public /* synthetic */ a(SystemBars systemBars, String str, String str2, PluginCall pluginCall) {
        this.f847g = 4;
        this.f848i = systemBars;
        this.f850k = str;
        this.f849j = str2;
        this.h = pluginCall;
    }
}
