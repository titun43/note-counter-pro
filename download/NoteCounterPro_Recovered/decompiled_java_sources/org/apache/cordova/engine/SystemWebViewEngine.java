package org.apache.cordova.engine;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import g.b0;
import k1.j;
import org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode;
import org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode;
import org.apache.cordova.c0;
import org.apache.cordova.h0;
import org.apache.cordova.i;
import org.apache.cordova.k0;
import org.apache.cordova.n;
import org.apache.cordova.r;
import org.apache.cordova.t;
import org.apache.cordova.u;
import org.apache.cordova.v;
import org.apache.cordova.w;
import x4.a;
import x4.c;
import x4.f;

/* loaded from: classes.dex */
public class SystemWebViewEngine implements w {
    public static final String TAG = "SystemWebViewEngine";

    /* renamed from: a, reason: collision with root package name */
    public final SystemWebView f2902a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2903b;

    /* renamed from: c, reason: collision with root package name */
    public r f2904c;

    /* renamed from: d, reason: collision with root package name */
    public i f2905d;

    /* renamed from: e, reason: collision with root package name */
    public v f2906e;

    /* renamed from: f, reason: collision with root package name */
    public u f2907f;

    /* renamed from: g, reason: collision with root package name */
    public n f2908g;
    public k0 h;

    /* renamed from: i, reason: collision with root package name */
    public t f2909i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f2910j;

    public SystemWebViewEngine(Context context, r rVar) {
        this(new SystemWebView(context), rVar);
    }

    @Override // org.apache.cordova.w
    public boolean canGoBack() {
        return this.f2902a.canGoBack();
    }

    @Override // org.apache.cordova.w
    public void clearCache() {
        this.f2902a.clearCache(true);
    }

    @Override // org.apache.cordova.w
    public void clearHistory() {
        this.f2902a.clearHistory();
    }

    @Override // org.apache.cordova.w
    public void destroy() {
        SystemWebView systemWebView = this.f2902a;
        systemWebView.h.destroyLastDialog();
        systemWebView.destroy();
        if (this.f2910j != null) {
            try {
                systemWebView.getContext().unregisterReceiver(this.f2910j);
            } catch (Exception e4) {
                Log.e(TAG, "Error unregistering configuration receiver: " + e4.getMessage(), e4);
            }
        }
    }

    @Override // org.apache.cordova.w
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f2902a.evaluateJavascript(str, valueCallback);
    }

    @Override // org.apache.cordova.w
    public c0 getCookieManager() {
        return this.f2903b;
    }

    public u getCordovaWebView() {
        return this.f2907f;
    }

    @Override // org.apache.cordova.w
    public String getUrl() {
        return this.f2902a.getUrl();
    }

    @Override // org.apache.cordova.w
    public View getView() {
        return this.f2902a;
    }

    @Override // org.apache.cordova.w
    public boolean goBack() {
        SystemWebView systemWebView = this.f2902a;
        if (!systemWebView.canGoBack()) {
            return false;
        }
        systemWebView.goBack();
        return true;
    }

    @Override // org.apache.cordova.w
    public void init(u uVar, n nVar, v vVar, t tVar, k0 k0Var, h0 h0Var) {
        if (this.f2908g != null) {
            throw new IllegalStateException();
        }
        if (this.f2904c == null) {
            this.f2904c = uVar.getPreferences();
        }
        this.f2907f = uVar;
        this.f2908g = nVar;
        this.f2906e = vVar;
        this.f2909i = tVar;
        this.h = k0Var;
        SystemWebView systemWebView = this.f2902a;
        systemWebView.f2901i = this;
        if (systemWebView.f2900g == null) {
            systemWebView.setWebViewClient(new f(this));
        }
        if (systemWebView.h == null) {
            systemWebView.setWebChromeClient(new c(this));
        }
        SystemWebView systemWebView2 = this.f2902a;
        systemWebView2.setInitialScale(0);
        systemWebView2.setVerticalScrollBarEnabled(false);
        WebSettings settings = systemWebView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        String str = Build.MANUFACTURER;
        settings.setSaveFormData(false);
        if (this.f2904c.a("AndroidInsecureFileModeEnabled", false)) {
            settings.setAllowFileAccess(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            this.f2903b.getClass();
            CookieManager.setAcceptFileSchemeCookies(true);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        String path = systemWebView2.getContext().getApplicationContext().getDir("database", 0).getPath();
        settings.setDatabaseEnabled(true);
        String c5 = this.f2904c.c("InspectableWebview", null);
        if (c5 != null ? "true".equals(c5) : (systemWebView2.getContext().getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            try {
                WebView.setWebContentsDebuggingEnabled(true);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            }
        }
        settings.setGeolocationDatabasePath(path);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        String userAgentString = settings.getUserAgentString();
        String c6 = this.f2904c.c("OverrideUserAgent", null);
        if (c6 != null) {
            settings.setUserAgentString(c6);
        } else {
            String c7 = this.f2904c.c("AppendUserAgent", null);
            if (c7 != null) {
                settings.setUserAgentString(userAgentString + " " + c7);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        if (this.f2910j == null) {
            this.f2910j = new b0(settings, 3);
            systemWebView2.getContext().registerReceiver(this.f2910j, intentFilter);
        }
        h0Var.f2924c.add(new NativeToJsMessageQueue$OnlineEventsBridgeMode(new j(this, 24)));
        h0Var.f2924c.add(new NativeToJsMessageQueue$EvalBridgeMode(this, nVar));
        i iVar = new i();
        iVar.f2928c = -1;
        iVar.f2926a = k0Var;
        iVar.f2927b = h0Var;
        this.f2905d = iVar;
        this.f2902a.addJavascriptInterface(new a(iVar), "_cordovaNative");
    }

    @Override // org.apache.cordova.w
    public void loadUrl(String str, boolean z4) {
        this.f2902a.loadUrl(str);
    }

    @Override // org.apache.cordova.w
    public void setPaused(boolean z4) {
        SystemWebView systemWebView = this.f2902a;
        if (z4) {
            systemWebView.onPause();
            systemWebView.pauseTimers();
        } else {
            systemWebView.onResume();
            systemWebView.resumeTimers();
        }
    }

    public void stopLoading() {
        this.f2902a.stopLoading();
    }

    public SystemWebViewEngine(SystemWebView systemWebView) {
        this(systemWebView, (r) null);
    }

    public SystemWebViewEngine(SystemWebView systemWebView, r rVar) {
        this.f2904c = rVar;
        this.f2902a = systemWebView;
        this.f2903b = new j(systemWebView);
    }
}
