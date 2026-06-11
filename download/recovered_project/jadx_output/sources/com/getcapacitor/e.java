package com.getcapacitor;

import android.webkit.ValueCallback;
import com.getcapacitor.BridgeWebChromeClient;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BridgeWebChromeClient.ActivityResultListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f866g;
    public final /* synthetic */ ValueCallback h;

    public /* synthetic */ e(ValueCallback valueCallback, int i5) {
        this.f866g = i5;
        this.h = valueCallback;
    }

    @Override // com.getcapacitor.BridgeWebChromeClient.ActivityResultListener
    public final void onActivityResult(d.a aVar) {
        switch (this.f866g) {
            case 0:
                BridgeWebChromeClient.lambda$showVideoCapturePicker$14(this.h, aVar);
                break;
            default:
                BridgeWebChromeClient.lambda$showFilePicker$15(this.h, aVar);
                break;
        }
    }
}
