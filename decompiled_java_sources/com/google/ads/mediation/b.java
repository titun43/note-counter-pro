package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes.dex */
public final class b extends AdListener implements AppEventListener, zza {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractAdViewAdapter f898g;
    public final MediationBannerListener h;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f898g = abstractAdViewAdapter;
        this.h = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.h.onAdClicked(this.f898g);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.h.onAdClosed(this.f898g);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.h.onAdFailedToLoad(this.f898g, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.h.onAdLoaded(this.f898g);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.h.onAdOpened(this.f898g);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.h.zza(this.f898g, str, str2);
    }
}
