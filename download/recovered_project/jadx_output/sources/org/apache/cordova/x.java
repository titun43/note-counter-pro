package org.apache.cordova;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f2961g;

    public x(y yVar) {
        this.f2961g = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CordovaWebViewImpl.this.f2861a.k("spinner", "stop");
    }
}
