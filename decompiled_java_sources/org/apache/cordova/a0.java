package org.apache.cordova;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2894g;
    public final /* synthetic */ CoreAndroid h;

    public /* synthetic */ a0(CoreAndroid coreAndroid, int i5) {
        this.f2894g = i5;
        this.h = coreAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2894g) {
            case 0:
                this.h.webView.getPluginManager().k("spinner", "stop");
                break;
            case 1:
                this.h.webView.clearCache();
                break;
            case 2:
                this.h.webView.clearHistory();
                break;
            default:
                this.h.webView.backHistory();
                break;
        }
    }
}
