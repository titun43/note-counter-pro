package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f901a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialListener f902b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f901a = abstractAdViewAdapter;
        this.f902b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f902b.onAdClosed(this.f901a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f902b.onAdOpened(this.f901a);
    }
}
