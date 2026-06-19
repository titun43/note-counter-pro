package org.apache.cordova;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaWebViewImpl implements u {
    public static final String TAG = "CordovaWebViewImpl";

    /* renamed from: a, reason: collision with root package name */
    public k0 f2861a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2862b;

    /* renamed from: c, reason: collision with root package name */
    public n f2863c;

    /* renamed from: e, reason: collision with root package name */
    public t f2865e;

    /* renamed from: f, reason: collision with root package name */
    public r f2866f;

    /* renamed from: g, reason: collision with root package name */
    public CoreAndroid f2867g;
    public h0 h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2869j;

    /* renamed from: k, reason: collision with root package name */
    public String f2870k;

    /* renamed from: l, reason: collision with root package name */
    public z f2871l;

    /* renamed from: m, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f2872m;

    /* renamed from: d, reason: collision with root package name */
    public int f2864d = 0;

    /* renamed from: i, reason: collision with root package name */
    public final EngineClient f2868i = new EngineClient();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f2873n = new HashSet();

    public class EngineClient implements v {
        public EngineClient() {
        }

        @Override // org.apache.cordova.v
        public void clearLoadTimeoutTimer() {
            CordovaWebViewImpl.this.f2864d++;
        }

        @Override // org.apache.cordova.v
        public Boolean onDispatchKeyEvent(KeyEvent keyEvent) {
            CordovaWebViewImpl cordovaWebViewImpl = CordovaWebViewImpl.this;
            w wVar = cordovaWebViewImpl.f2862b;
            HashSet hashSet = cordovaWebViewImpl.f2873n;
            int keyCode = keyEvent.getKeyCode();
            boolean z4 = keyCode == 4;
            if (keyEvent.getAction() == 0) {
                if (z4 && cordovaWebViewImpl.f2871l != null) {
                    return Boolean.TRUE;
                }
                if (hashSet.contains(Integer.valueOf(keyCode))) {
                    return Boolean.TRUE;
                }
                if (z4) {
                    return Boolean.valueOf(wVar.canGoBack());
                }
            } else if (keyEvent.getAction() == 1) {
                if (z4 && cordovaWebViewImpl.f2871l != null) {
                    cordovaWebViewImpl.hideCustomView();
                    return Boolean.TRUE;
                }
                if (hashSet.contains(Integer.valueOf(keyCode))) {
                    String str = keyCode != 4 ? keyCode != 82 ? keyCode != 84 ? keyCode != 24 ? keyCode != 25 ? null : "volumedownbutton" : "volumeupbutton" : "searchbutton" : "menubutton" : "backbutton";
                    if (str != null) {
                        cordovaWebViewImpl.a(str);
                        return Boolean.TRUE;
                    }
                } else if (z4) {
                    return Boolean.valueOf(wVar.goBack());
                }
            }
            return null;
        }

        @Override // org.apache.cordova.v
        public boolean onNavigationAttempt(String str) {
            k0 k0Var = CordovaWebViewImpl.this.f2861a;
            synchronized (k0Var.f2937b) {
                try {
                    Iterator it = k0Var.f2937b.values().iterator();
                    while (it.hasNext()) {
                        p pVar = (p) k0Var.f2936a.get(((i0) it.next()).f2929a);
                        if (pVar != null && pVar.onOverrideUrlLoading(str)) {
                            return true;
                        }
                    }
                    if (CordovaWebViewImpl.this.f2861a.l(str)) {
                        return false;
                    }
                    if (CordovaWebViewImpl.this.f2861a.n(str).booleanValue()) {
                        CordovaWebViewImpl.this.showWebPage(str, true, false, null);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.apache.cordova.v
        public void onPageFinishedLoading(String str) {
            clearLoadTimeoutTimer();
            CordovaWebViewImpl cordovaWebViewImpl = CordovaWebViewImpl.this;
            cordovaWebViewImpl.f2861a.k("onPageFinished", str);
            if (cordovaWebViewImpl.f2862b.getView().getVisibility() != 0) {
                new Thread(new y(this)).start();
            }
            if (str.equals("about:blank")) {
                cordovaWebViewImpl.f2861a.k("exit", null);
            }
        }

        @Override // org.apache.cordova.v
        public void onPageStarted(String str) {
            CordovaWebViewImpl.this.f2873n.clear();
            k0 k0Var = CordovaWebViewImpl.this.f2861a;
            synchronized (k0Var.f2936a) {
                try {
                    for (p pVar : k0Var.f2936a.values()) {
                        if (pVar != null) {
                            pVar.onReset();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            CordovaWebViewImpl.this.f2861a.k("onPageStarted", str);
        }

        @Override // org.apache.cordova.v
        public void onReceivedError(int i5, String str, String str2) {
            clearLoadTimeoutTimer();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", i5);
                jSONObject.put("description", str);
                jSONObject.put("url", str2);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            CordovaWebViewImpl.this.f2861a.k("onReceivedError", jSONObject);
        }
    }

    public CordovaWebViewImpl(w wVar) {
        this.f2862b = wVar;
    }

    public static w createEngine(Context context, r rVar) {
        try {
            return (w) Class.forName(rVar.c("webview", SystemWebViewEngine.class.getCanonicalName())).getConstructor(Context.class, r.class).newInstance(context, rVar);
        } catch (Exception e4) {
            throw new RuntimeException("Failed to create webview. ", e4);
        }
    }

    public final void a(String str) {
        if (this.f2867g == null) {
            this.f2867g = (CoreAndroid) this.f2861a.c(CoreAndroid.PLUGIN_NAME);
        }
        CoreAndroid coreAndroid = this.f2867g;
        if (coreAndroid == null) {
            return;
        }
        coreAndroid.fireJavascriptEvent(str);
    }

    @Override // org.apache.cordova.u
    public boolean backHistory() {
        return this.f2862b.goBack();
    }

    public boolean canGoBack() {
        return this.f2862b.canGoBack();
    }

    @Override // org.apache.cordova.u
    public void clearCache() {
        this.f2862b.clearCache();
    }

    @Override // org.apache.cordova.u
    public void clearHistory() {
        this.f2862b.clearHistory();
    }

    @Override // org.apache.cordova.u
    public Context getContext() {
        return this.f2862b.getView().getContext();
    }

    public c0 getCookieManager() {
        return this.f2862b.getCookieManager();
    }

    public w getEngine() {
        return this.f2862b;
    }

    @Override // org.apache.cordova.u
    public k0 getPluginManager() {
        return this.f2861a;
    }

    @Override // org.apache.cordova.u
    public r getPreferences() {
        return this.f2866f;
    }

    public t getResourceApi() {
        return this.f2865e;
    }

    public String getUrl() {
        return this.f2862b.getUrl();
    }

    public View getView() {
        return this.f2862b.getView();
    }

    @Override // org.apache.cordova.u
    public void handleDestroy() {
        if (isInitialized()) {
            this.f2864d++;
            this.f2861a.e();
            loadUrl("about:blank");
            this.f2862b.destroy();
            hideCustomView();
        }
    }

    @Override // org.apache.cordova.u
    public void handlePause(boolean z4) {
        if (isInitialized()) {
            this.f2869j = true;
            this.f2861a.g(z4);
            a("pause");
            if (z4) {
                return;
            }
            this.f2862b.setPaused(true);
        }
    }

    @Override // org.apache.cordova.u
    public void handleResume(boolean z4) {
        if (isInitialized()) {
            this.f2862b.setPaused(false);
            this.f2861a.h(z4);
            if (this.f2869j) {
                a("resume");
            }
        }
    }

    @Override // org.apache.cordova.u
    public void handleStart() {
        if (isInitialized()) {
            this.f2861a.i();
        }
    }

    @Override // org.apache.cordova.u
    public void handleStop() {
        if (isInitialized()) {
            this.f2861a.j();
        }
    }

    @Override // org.apache.cordova.u
    @Deprecated
    public void hideCustomView() {
        z zVar = this.f2871l;
        if (zVar == null) {
            return;
        }
        zVar.setVisibility(8);
        w wVar = this.f2862b;
        ((ViewGroup) wVar.getView().getParent()).removeView(this.f2871l);
        this.f2871l = null;
        this.f2872m.onCustomViewHidden();
        wVar.getView().setVisibility(0);
        wVar.getView().requestFocus();
    }

    public void init(n nVar) {
        init(nVar, new ArrayList(), new r());
    }

    @Override // org.apache.cordova.u
    public boolean isButtonPlumbedToJs(int i5) {
        return this.f2873n.contains(Integer.valueOf(i5));
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return this.f2871l != null;
    }

    public boolean isInitialized() {
        return this.f2863c != null;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z4) {
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.f2862b.loadUrl(str, false);
            return;
        }
        boolean z5 = z4 || this.f2870k == null;
        if (z5) {
            if (this.f2870k != null) {
                this.f2867g = null;
                this.f2861a.d();
            }
            this.f2870k = str;
        }
        int i5 = this.f2864d;
        int b2 = this.f2866f.b(20000, "LoadUrlTimeoutValue");
        n.e eVar = new n.e(this, b2, i5, new c0.a(this, str, 12, false), 1);
        if (this.f2863c.getActivity() != null) {
            this.f2863c.getActivity().runOnUiThread(new n.d(this, b2, eVar, str, z5));
        }
    }

    @Override // org.apache.cordova.u
    public void onNewIntent(Intent intent) {
        k0 k0Var = this.f2861a;
        if (k0Var != null) {
            k0Var.f(intent);
        }
    }

    public Object postMessage(String str, Object obj) {
        return this.f2861a.k(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        h0 h0Var = this.h;
        h0Var.getClass();
        h0Var.b(new f0(str));
    }

    @Override // org.apache.cordova.u
    public void sendPluginResult(l0 l0Var, String str) {
        this.h.a(l0Var, str);
    }

    @Override // org.apache.cordova.u
    public void setButtonPlumbedToJs(int i5, boolean z4) {
        if (i5 != 4 && i5 != 82 && i5 != 24 && i5 != 25) {
            throw new IllegalArgumentException(androidx.emoji2.text.u.h(i5, "Unsupported keycode: "));
        }
        HashSet hashSet = this.f2873n;
        if (z4) {
            hashSet.add(Integer.valueOf(i5));
        } else {
            hashSet.remove(Integer.valueOf(i5));
        }
    }

    @Override // org.apache.cordova.u
    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f2871l != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        Context context = getContext();
        w wVar = this.f2862b;
        z zVar = new z(context, wVar);
        zVar.addView(view);
        this.f2871l = zVar;
        this.f2872m = customViewCallback;
        ViewGroup viewGroup = (ViewGroup) wVar.getView().getParent();
        viewGroup.addView(zVar, new FrameLayout.LayoutParams(-1, -1, 17));
        wVar.getView().setVisibility(8);
        viewGroup.setVisibility(0);
        viewGroup.bringToFront();
    }

    @Override // org.apache.cordova.u
    public void showWebPage(String str, boolean z4, boolean z5, Map<String, Object> map) {
        Intent intent;
        if (z5) {
            this.f2862b.clearHistory();
        }
        if (!z4) {
            if (this.f2861a.l(str)) {
                loadUrlIntoView(str, true);
                return;
            }
            return;
        }
        if (!this.f2861a.n(str).booleanValue()) {
            return;
        }
        Intent intent2 = null;
        try {
            try {
                if (str.startsWith("intent://")) {
                    intent = Intent.parseUri(str, 1);
                } else {
                    intent = new Intent("android.intent.action.VIEW");
                    try {
                        intent.addCategory("android.intent.category.BROWSABLE");
                        Uri parse = Uri.parse(str);
                        if ("file".equals(parse.getScheme())) {
                            intent.setDataAndType(parse, this.f2865e.a(parse));
                        } else {
                            intent.setData(parse);
                        }
                    } catch (ActivityNotFoundException e4) {
                        intent2 = intent;
                        e = e4;
                        if (!str.startsWith("intent://") || intent2 == null || intent2.getStringExtra("browser_fallback_url") == null) {
                            Log.e(TAG, "Error loading url ".concat(str), e);
                            return;
                        } else {
                            showWebPage(intent2.getStringExtra("browser_fallback_url"), z4, z5, map);
                            return;
                        }
                    }
                }
                intent2 = intent;
                if (this.f2863c.getActivity() != null) {
                    this.f2863c.getActivity().startActivity(intent2);
                }
            } catch (ActivityNotFoundException e5) {
                e = e5;
            }
        } catch (URISyntaxException e6) {
            Log.e(TAG, "Error parsing url " + str, e6);
        }
    }

    public void stopLoading() {
        this.f2864d++;
    }

    @Deprecated
    public void clearCache(boolean z4) {
        this.f2862b.clearCache();
    }

    public void init(n nVar, List<i0> list, r rVar) {
        if (this.f2863c != null) {
            throw new IllegalStateException();
        }
        this.f2863c = nVar;
        this.f2866f = rVar;
        this.f2861a = new k0(this, this.f2863c, list);
        w wVar = this.f2862b;
        this.f2865e = new t(wVar.getView().getContext(), this.f2861a);
        h0 h0Var = new h0();
        this.h = h0Var;
        h0Var.f2924c.add(new e0() { // from class: org.apache.cordova.NativeToJsMessageQueue$NoOpBridgeMode
            @Override // org.apache.cordova.e0
            public void onNativeToJsMessageAvailable(h0 h0Var2) {
            }
        });
        h0 h0Var2 = this.h;
        h0Var2.f2924c.add(new NativeToJsMessageQueue$LoadUrlBridgeMode(wVar, nVar));
        if (rVar.a("DisallowOverscroll", false)) {
            wVar.getView().setOverScrollMode(2);
        }
        this.f2862b.init(this, nVar, this.f2868i, this.f2865e, this.f2861a, this.h);
        k0 k0Var = this.f2861a;
        k0Var.getClass();
        k0Var.f2937b.put(CoreAndroid.PLUGIN_NAME, new i0(CoreAndroid.PLUGIN_NAME, "org.apache.cordova.CoreAndroid", true));
        this.f2861a.d();
    }
}
