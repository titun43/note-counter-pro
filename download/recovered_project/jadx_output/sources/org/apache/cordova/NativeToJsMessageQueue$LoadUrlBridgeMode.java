package org.apache.cordova;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue$LoadUrlBridgeMode extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f2882a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2883b;

    public NativeToJsMessageQueue$LoadUrlBridgeMode(w wVar, n nVar) {
        this.f2882a = wVar;
        this.f2883b = nVar;
    }

    @Override // org.apache.cordova.e0
    public void onNativeToJsMessageAvailable(h0 h0Var) {
        this.f2883b.getActivity().runOnUiThread(new c0.a(this, h0Var, 14, false));
    }
}
