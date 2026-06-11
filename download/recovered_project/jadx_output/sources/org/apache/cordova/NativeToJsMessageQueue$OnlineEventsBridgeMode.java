package org.apache.cordova;

import org.apache.cordova.engine.SystemWebViewEngine;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue$OnlineEventsBridgeMode extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f2884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2885b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2886c;

    public NativeToJsMessageQueue$OnlineEventsBridgeMode(g0 g0Var) {
        this.f2884a = g0Var;
    }

    @Override // org.apache.cordova.e0
    public void notifyOfFlush(h0 h0Var, boolean z4) {
        if (!z4 || this.f2886c) {
            return;
        }
        this.f2885b = !this.f2885b;
    }

    @Override // org.apache.cordova.e0
    public void onNativeToJsMessageAvailable(h0 h0Var) {
        ((SystemWebViewEngine) ((k1.j) this.f2884a).h).f2908g.getActivity().runOnUiThread(new c0.a(this, h0Var, 15, false));
    }

    @Override // org.apache.cordova.e0
    public void reset() {
        ((SystemWebViewEngine) ((k1.j) this.f2884a).h).f2908g.getActivity().runOnUiThread(new androidx.fragment.app.o(this, 16));
    }
}
