package org.apache.cordova;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue$EvalBridgeMode extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2881b;

    public NativeToJsMessageQueue$EvalBridgeMode(w wVar, n nVar) {
        this.f2880a = wVar;
        this.f2881b = nVar;
    }

    @Override // org.apache.cordova.e0
    public void onNativeToJsMessageAvailable(h0 h0Var) {
        this.f2881b.getActivity().runOnUiThread(new c0.a(this, h0Var, 13, false));
    }
}
