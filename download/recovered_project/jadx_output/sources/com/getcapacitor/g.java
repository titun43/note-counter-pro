package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnCancelListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f868g;
    public final /* synthetic */ JsResult h;

    public /* synthetic */ g(JsResult jsResult, int i5) {
        this.f868g = i5;
        this.h = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f868g) {
            case 0:
                BridgeWebChromeClient.lambda$onJsAlert$4(this.h, dialogInterface);
                break;
            case 1:
                BridgeWebChromeClient.lambda$onJsConfirm$7(this.h, dialogInterface);
                break;
            default:
                BridgeWebChromeClient.lambda$onJsPrompt$10((JsPromptResult) this.h, dialogInterface);
                break;
        }
    }
}
