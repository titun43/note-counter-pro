package com.getcapacitor.community.admob.banner;

import com.getcapacitor.community.admob.models.AdOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f860g;
    public final /* synthetic */ BannerExecutor h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AdOptions f861i;

    public /* synthetic */ c(BannerExecutor bannerExecutor, AdOptions adOptions, int i5) {
        this.f860g = i5;
        this.h = bannerExecutor;
        this.f861i = adOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f860g) {
            case 0:
                this.h.lambda$updateExistingAdView$4(this.f861i);
                break;
            default:
                this.h.lambda$createNewAdView$5(this.f861i);
                break;
        }
    }
}
