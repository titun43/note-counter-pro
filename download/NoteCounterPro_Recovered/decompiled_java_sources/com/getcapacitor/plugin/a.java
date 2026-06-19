package com.getcapacitor.plugin;

import android.webkit.ValueCallback;
import com.getcapacitor.PluginCall;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f887b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f886a = i5;
        this.f887b = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f886a) {
            case 0:
                CapacitorCookies.lambda$getCookies$0((PluginCall) this.f887b, (String) obj);
                break;
            default:
                ((SystemBars) this.f887b).lambda$onDOMReady$4((String) obj);
                break;
        }
    }
}
