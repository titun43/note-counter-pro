package org.apache.cordova;

import org.apache.cordova.CordovaWebViewImpl;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CordovaWebViewImpl.EngineClient f2962g;

    public y(CordovaWebViewImpl.EngineClient engineClient) {
        this.f2962g = engineClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CordovaWebViewImpl cordovaWebViewImpl = CordovaWebViewImpl.this;
        try {
            Thread.sleep(2000L);
            if (cordovaWebViewImpl.f2863c.getActivity() != null) {
                cordovaWebViewImpl.f2863c.getActivity().runOnUiThread(new x(this));
            }
        } catch (InterruptedException unused) {
        }
    }
}
