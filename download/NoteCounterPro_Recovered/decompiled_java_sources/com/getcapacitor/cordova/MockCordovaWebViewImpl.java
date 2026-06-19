package com.getcapacitor.cordova;

import a2.b;
import a2.f;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;
import org.apache.cordova.c0;
import org.apache.cordova.e0;
import org.apache.cordova.f0;
import org.apache.cordova.h0;
import org.apache.cordova.i0;
import org.apache.cordova.k0;
import org.apache.cordova.l0;
import org.apache.cordova.n;
import org.apache.cordova.r;
import org.apache.cordova.t;
import org.apache.cordova.u;
import org.apache.cordova.w;
import s.c;

/* loaded from: classes.dex */
public class MockCordovaWebViewImpl implements u {
    private Context context;
    private CapacitorCordovaCookieManager cookieManager;
    private n cordova;
    private boolean hasPausedEver;
    private h0 nativeToJsMessageQueue;
    private k0 pluginManager;
    private r preferences;
    private t resourceApi;
    private WebView webView;

    public static class CapacitorEvalBridgeMode extends e0 {
        private final n cordova;
        private final WebView webView;

        public CapacitorEvalBridgeMode(WebView webView, n nVar) {
            this.webView = webView;
            this.cordova = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNativeToJsMessageAvailable$0(h0 h0Var) {
            String e4 = h0Var.e();
            if (e4 != null) {
                this.webView.evaluateJavascript(e4, null);
            }
        }

        @Override // org.apache.cordova.e0
        public void onNativeToJsMessageAvailable(h0 h0Var) {
            this.cordova.getActivity().runOnUiThread(new b(7, this, h0Var));
        }
    }

    public MockCordovaWebViewImpl(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$eval$0(String str, ValueCallback valueCallback) {
        this.webView.evaluateJavascript(str, valueCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$triggerDocumentEvent$1(String str) {
    }

    @Override // org.apache.cordova.u
    public boolean backHistory() {
        return false;
    }

    public boolean canGoBack() {
        return false;
    }

    @Override // org.apache.cordova.u
    public void clearCache() {
    }

    @Override // org.apache.cordova.u
    public void clearHistory() {
    }

    public void eval(String str, ValueCallback<String> valueCallback) {
        new Handler(this.context.getMainLooper()).post(new f(this, str, valueCallback, 4));
    }

    @Override // org.apache.cordova.u
    public Context getContext() {
        return this.webView.getContext();
    }

    public c0 getCookieManager() {
        return this.cookieManager;
    }

    public w getEngine() {
        return null;
    }

    @Override // org.apache.cordova.u
    public k0 getPluginManager() {
        return this.pluginManager;
    }

    @Override // org.apache.cordova.u
    public r getPreferences() {
        return this.preferences;
    }

    public t getResourceApi() {
        return this.resourceApi;
    }

    public String getUrl() {
        return this.webView.getUrl();
    }

    public View getView() {
        return this.webView;
    }

    @Override // org.apache.cordova.u
    public void handleDestroy() {
        if (isInitialized()) {
            this.pluginManager.e();
        }
    }

    @Override // org.apache.cordova.u
    public void handlePause(boolean z4) {
        if (isInitialized()) {
            this.hasPausedEver = true;
            this.pluginManager.g(z4);
            triggerDocumentEvent("pause");
            if (z4) {
                return;
            }
            setPaused(true);
        }
    }

    @Override // org.apache.cordova.u
    public void handleResume(boolean z4) {
        if (isInitialized()) {
            setPaused(false);
            this.pluginManager.h(z4);
            if (this.hasPausedEver) {
                triggerDocumentEvent("resume");
            }
        }
    }

    @Override // org.apache.cordova.u
    public void handleStart() {
        if (isInitialized()) {
            this.pluginManager.i();
        }
    }

    @Override // org.apache.cordova.u
    public void handleStop() {
        if (isInitialized()) {
            this.pluginManager.j();
        }
    }

    @Override // org.apache.cordova.u
    @Deprecated
    public void hideCustomView() {
    }

    public void init(n nVar, List<i0> list, r rVar) {
        this.cordova = nVar;
        this.preferences = rVar;
        k0 k0Var = new k0(this, this.cordova, list);
        this.pluginManager = k0Var;
        this.resourceApi = new t(this.context, k0Var);
        this.pluginManager.d();
    }

    @Override // org.apache.cordova.u
    public boolean isButtonPlumbedToJs(int i5) {
        return false;
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return false;
    }

    public boolean isInitialized() {
        return this.cordova != null;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z4) {
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.webView.loadUrl(str);
        }
    }

    @Override // org.apache.cordova.u
    public void onNewIntent(Intent intent) {
        k0 k0Var = this.pluginManager;
        if (k0Var != null) {
            k0Var.f(intent);
        }
    }

    public Object postMessage(String str, Object obj) {
        return this.pluginManager.k(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        h0 h0Var = this.nativeToJsMessageQueue;
        h0Var.getClass();
        h0Var.b(new f0(str));
    }

    @Override // org.apache.cordova.u
    public void sendPluginResult(l0 l0Var, String str) {
        this.nativeToJsMessageQueue.a(l0Var, str);
    }

    @Override // org.apache.cordova.u
    public void setButtonPlumbedToJs(int i5, boolean z4) {
    }

    public void setPaused(boolean z4) {
        if (z4) {
            this.webView.onPause();
            this.webView.pauseTimers();
        } else {
            this.webView.onResume();
            this.webView.resumeTimers();
        }
    }

    @Override // org.apache.cordova.u
    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Override // org.apache.cordova.u
    public void showWebPage(String str, boolean z4, boolean z5, Map<String, Object> map) {
    }

    public void stopLoading() {
    }

    public void triggerDocumentEvent(String str) {
        eval(c.b("window.Capacitor.triggerEvent('", str, "', 'document');"), new com.getcapacitor.c(2));
    }

    @Deprecated
    public void clearCache(boolean z4) {
    }

    public void init(n nVar, List<i0> list, r rVar, WebView webView) {
        this.cordova = nVar;
        this.webView = webView;
        this.preferences = rVar;
        k0 k0Var = new k0(this, this.cordova, list);
        this.pluginManager = k0Var;
        this.resourceApi = new t(this.context, k0Var);
        h0 h0Var = new h0();
        this.nativeToJsMessageQueue = h0Var;
        h0Var.f2924c.add(new CapacitorEvalBridgeMode(webView, this.cordova));
        this.nativeToJsMessageQueue.f(0);
        this.cookieManager = new CapacitorCordovaCookieManager(webView);
        this.pluginManager.d();
    }
}
