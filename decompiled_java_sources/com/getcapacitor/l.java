package com.getcapacitor;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.WebView;
import com.getcapacitor.BridgeWebChromeClient;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements BridgeWebChromeClient.PermissionListener, j1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f878a;

    public /* synthetic */ l(Object obj) {
        this.f878a = obj;
    }

    @Override // com.getcapacitor.BridgeWebChromeClient.PermissionListener
    public void onPermissionSelect(Boolean bool) {
        BridgeWebChromeClient.lambda$onPermissionRequest$2((PermissionRequest) this.f878a, bool);
    }

    @Override // j1.e
    public void onPostMessage(WebView webView, j1.c cVar, Uri uri, boolean z4, j1.a aVar) {
        ((MessageHandler) this.f878a).lambda$new$0(webView, cVar, uri, z4, aVar);
    }
}
