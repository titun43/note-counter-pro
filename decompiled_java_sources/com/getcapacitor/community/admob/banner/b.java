package com.getcapacitor.community.admob.banner;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f859g;
    public final /* synthetic */ BannerExecutor h;

    public /* synthetic */ b(BannerExecutor bannerExecutor, int i5) {
        this.f859g = i5;
        this.h = bannerExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f859g) {
            case 0:
                this.h.lambda$resumeBanner$2();
                break;
            default:
                this.h.lambda$removeBanner$3();
                break;
        }
    }
}
