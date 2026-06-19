package com.getcapacitor.cordova;

import android.webkit.CookieManager;
import android.webkit.WebView;
import org.apache.cordova.c0;

/* loaded from: classes.dex */
class CapacitorCordovaCookieManager implements c0 {
    private final CookieManager cookieManager;
    protected final WebView webView;

    public CapacitorCordovaCookieManager(WebView webView) {
        this.webView = webView;
        CookieManager cookieManager = CookieManager.getInstance();
        this.cookieManager = cookieManager;
        cookieManager.setAcceptThirdPartyCookies(webView, true);
    }

    public void clearCookies() {
        this.cookieManager.removeAllCookies(null);
    }

    public void flush() {
        this.cookieManager.flush();
    }

    public String getCookie(String str) {
        return this.cookieManager.getCookie(str);
    }

    public void setCookie(String str, String str2) {
        this.cookieManager.setCookie(str, str2);
    }

    public void setCookiesEnabled(boolean z4) {
        this.cookieManager.setAcceptCookie(z4);
    }
}
