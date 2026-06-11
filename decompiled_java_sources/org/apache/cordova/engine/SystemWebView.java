package org.apache.cordova.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.apache.cordova.u;
import x4.c;
import x4.f;

/* loaded from: classes.dex */
public class SystemWebView extends WebView {

    /* renamed from: g, reason: collision with root package name */
    public f f2900g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public SystemWebViewEngine f2901i;

    public SystemWebView(Context context) {
        this(context, null);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean onDispatchKeyEvent = this.f2901i.f2906e.onDispatchKeyEvent(keyEvent);
        return onDispatchKeyEvent != null ? onDispatchKeyEvent.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public u getCordovaWebView() {
        SystemWebViewEngine systemWebViewEngine = this.f2901i;
        if (systemWebViewEngine != null) {
            return systemWebViewEngine.getCordovaWebView();
        }
        return null;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.h = (c) webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f2900g = (f) webViewClient;
        super.setWebViewClient(webViewClient);
    }

    public SystemWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
