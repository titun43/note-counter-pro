package com.getcapacitor;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.getcapacitor.BridgeWebChromeClient;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements d.b, BridgeWebChromeClient.ActivityResultListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f884g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f885i;

    public /* synthetic */ o(int i5, Object obj, Object obj2) {
        this.f884g = i5;
        this.h = obj;
        this.f885i = obj2;
    }

    @Override // d.b
    public void c(Object obj) {
        switch (this.f884g) {
            case 0:
                ((Plugin) this.h).lambda$initializeActivityLaunchers$0((Method) this.f885i, (d.a) obj);
                break;
            default:
                ((Plugin) this.h).lambda$initializeActivityLaunchers$1((Method) this.f885i, (Map) obj);
                break;
        }
    }

    @Override // com.getcapacitor.BridgeWebChromeClient.ActivityResultListener
    public void onActivityResult(d.a aVar) {
        BridgeWebChromeClient.lambda$showImageCapturePicker$13((Uri) this.h, (ValueCallback) this.f885i, aVar);
    }
}
