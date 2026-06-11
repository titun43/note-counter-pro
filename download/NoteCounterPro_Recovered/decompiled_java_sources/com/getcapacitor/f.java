package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f867g;
    public final /* synthetic */ JsResult h;

    public /* synthetic */ f(JsResult jsResult, int i5) {
        this.f867g = i5;
        this.h = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f867g) {
            case 0:
                BridgeWebChromeClient.lambda$onJsAlert$3(this.h, dialogInterface, i5);
                break;
            case 1:
                BridgeWebChromeClient.lambda$onJsConfirm$5(this.h, dialogInterface, i5);
                break;
            case 2:
                BridgeWebChromeClient.lambda$onJsConfirm$6(this.h, dialogInterface, i5);
                break;
            default:
                BridgeWebChromeClient.lambda$onJsPrompt$9((JsPromptResult) this.h, dialogInterface, i5);
                break;
        }
    }
}
