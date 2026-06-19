package com.getcapacitor;

import android.webkit.ValueCallback;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f853a;

    public /* synthetic */ c(int i5) {
        this.f853a = i5;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        switch (this.f853a) {
            case 0:
                Bridge.lambda$triggerJSEvent$2(str);
                break;
            case 1:
                Bridge.lambda$triggerJSEvent$3(str);
                break;
            default:
                MockCordovaWebViewImpl.lambda$triggerDocumentEvent$1(str);
                break;
        }
    }
}
