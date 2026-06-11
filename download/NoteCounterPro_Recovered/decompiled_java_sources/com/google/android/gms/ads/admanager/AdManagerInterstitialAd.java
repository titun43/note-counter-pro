package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbyp;

/* loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        b0.h(context, "Context cannot be null.");
        b0.h(str, "AdUnitId cannot be null.");
        b0.h(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        b0.h(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        b0.d("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzi.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback2 = adManagerInterstitialAdLoadCallback;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        Context context2 = context;
                        try {
                            new zzbrc(context2, str).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback2);
                        } catch (IllegalStateException e4) {
                            zzbyp.zza(context2).zzh(e4, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbrc(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
