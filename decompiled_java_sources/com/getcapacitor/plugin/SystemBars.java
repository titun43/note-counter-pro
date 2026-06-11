package com.getcapacitor.plugin;

import android.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.webkit.JavascriptInterface;
import androidx.activity.o;
import com.getcapacitor.Bridge;
import com.getcapacitor.Logger;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.WebViewListener;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.ads.RequestConfiguration;
import f0.a1;
import f0.b1;
import f0.c1;
import f0.d1;
import f0.k0;
import f0.l0;
import f0.m1;
import f0.q1;
import f0.r0;
import f0.r1;
import f0.s1;
import f0.t1;
import f0.y0;
import f0.z0;
import j1.f;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.WeakHashMap;
import k1.j;

@CapacitorPlugin
/* loaded from: classes.dex */
public class SystemBars extends Plugin {
    static final String BAR_GESTURE_BAR = "NavigationBar";
    static final String BAR_STATUS_BAR = "StatusBar";
    static final String INSETS_HANDLING_CSS = "css";
    static final String INSETS_HANDLING_DISABLE = "disable";
    static final String STYLE_DARK = "DARK";
    static final String STYLE_DEFAULT = "DEFAULT";
    static final String STYLE_LIGHT = "LIGHT";
    private static final int WEBVIEW_VERSION_WITH_SAFE_AREA_FIX = 140;
    private static final int WEBVIEW_VERSION_WITH_SAFE_AREA_KEYBOARD_FIX = 144;
    static final String viewportMetaJSFunction = "function capacitorSystemBarsCheckMetaViewport() {\n    const meta = document.querySelectorAll(\"meta[name=viewport]\");\n    if (meta.length == 0) {\n        return false;\n    }\n    // get the last found meta viewport tag\n    const metaContent = meta[meta.length - 1].content;\n    return metaContent.includes(\"viewport-fit=cover\");\n}\ncapacitorSystemBarsCheckMetaViewport();\n";
    private String insetsHandling = INSETS_HANDLING_CSS;
    private boolean hasViewportCover = false;
    private String currentStatusBarStyle = STYLE_DEFAULT;
    private String currentGestureBarStyle = STYLE_DEFAULT;

    private y.c calcSafeAreaInsets(q1 q1Var) {
        y.c f5 = q1Var.f1406a.f(647);
        return q1Var.f1406a.o(8) ? y.c.b(f5.f3729a, f5.f3730b, f5.f3731c, 0) : y.c.b(f5.f3729a, f5.f3730b, f5.f3731c, f5.f3732d);
    }

    private int getBottomInset(y.c cVar, boolean z4) {
        if (getWebViewMajorVersion().intValue() >= WEBVIEW_VERSION_WITH_SAFE_AREA_KEYBOARD_FIX || !z4) {
            return cVar.f3732d;
        }
        return 0;
    }

    private String getStyleForTheme() {
        return (getActivity().getResources().getConfiguration().uiMode & 48) != 32 ? STYLE_LIGHT : STYLE_DARK;
    }

    private Integer getWebViewMajorVersion() {
        PackageInfo packageInfo;
        String str;
        Context context = getContext();
        boolean z4 = f.f2020a;
        PackageInfo packageInfo2 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfo = android.webkit.WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = f.c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            packageInfo2 = packageInfo;
        } else {
            try {
                String str2 = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
                if (str2 != null) {
                    packageInfo2 = context.getPackageManager().getPackageInfo(str2, 0);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
        if (packageInfo2 == null || (str = packageInfo2.versionName) == null) {
            return 0;
        }
        return Integer.valueOf(str.split("\\.")[0]);
    }

    private void initSafeAreaCSSVariables() {
        q1 q1Var;
        if (INSETS_HANDLING_CSS.equals(this.insetsHandling)) {
            if (Build.VERSION.SDK_INT >= 35) {
                View view = (View) getBridge().getWebView().getParent();
                WeakHashMap weakHashMap = r0.f1407a;
                q1Var = l0.a(view);
            } else {
                q1Var = q1.f1405b;
            }
            if (q1Var != null) {
                y.c calcSafeAreaInsets = calcSafeAreaInsets(q1Var);
                injectSafeAreaCSS(calcSafeAreaInsets.f3730b, calcSafeAreaInsets.f3731c, calcSafeAreaInsets.f3732d, calcSafeAreaInsets.f3729a);
            }
        }
    }

    private void initSystemBars() {
        final String upperCase = getConfig().getString("style", STYLE_DEFAULT).toUpperCase(Locale.US);
        final boolean z4 = getConfig().getBoolean("hidden", false);
        String string = getConfig().getString("insetsHandling", INSETS_HANDLING_CSS);
        if (INSETS_HANDLING_CSS.equals(string) || INSETS_HANDLING_DISABLE.equals(string)) {
            this.insetsHandling = string;
        } else {
            Logger.warn("SystemBars", "Unknown insetsHandling value '" + string + "'. Falling back to 'css'.");
            this.insetsHandling = INSETS_HANDLING_CSS;
        }
        initWindowInsetsListener();
        initSafeAreaCSSVariables();
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.e
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$initSystemBars$0(upperCase, z4);
            }
        });
    }

    private void initWindowInsetsListener() {
        if (INSETS_HANDLING_DISABLE.equals(this.insetsHandling)) {
            return;
        }
        View view = (View) getBridge().getWebView().getParent();
        c cVar = new c(this, 0);
        WeakHashMap weakHashMap = r0.f1407a;
        k0.i(view, cVar);
    }

    private void injectSafeAreaCSS(int i5, int i6, int i7, int i8) {
        float f5 = getActivity().getResources().getDisplayMetrics().density;
        final float f6 = i5 / f5;
        final float f7 = i6 / f5;
        final float f8 = i7 / f5;
        final float f9 = i8 / f5;
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.d
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$injectSafeAreaCSS$7(f6, f7, f8, f9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$3(String str, PluginCall pluginCall) {
        setHidden(true, str);
        pluginCall.resolve();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSystemBars$0(String str, boolean z4) {
        setStyle(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        setHidden(z4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q1 lambda$initWindowInsetsListener$6(View view, q1 q1Var) {
        boolean z4 = getWebViewMajorVersion().intValue() >= WEBVIEW_VERSION_WITH_SAFE_AREA_FIX && this.hasViewportCover;
        m1 m1Var = q1Var.f1406a;
        m1 m1Var2 = q1Var.f1406a;
        y.c f5 = m1Var.f(647);
        y.c f6 = m1Var2.f(8);
        boolean o2 = m1Var2.o(8);
        if (z4) {
            view.setPadding(0, 0, 0, o2 ? f6.f3732d : 0);
            y.c calcSafeAreaInsets = calcSafeAreaInsets(q1Var);
            injectSafeAreaCSS(calcSafeAreaInsets.f3730b, calcSafeAreaInsets.f3731c, calcSafeAreaInsets.f3732d, calcSafeAreaInsets.f3729a);
            int i5 = Build.VERSION.SDK_INT;
            d1 c1Var = i5 >= 34 ? new c1(q1Var) : i5 >= 31 ? new b1(q1Var) : i5 >= 30 ? new a1(q1Var) : i5 >= 29 ? new z0(q1Var) : new y0(q1Var);
            c1Var.c(647, y.c.b(f5.f3729a, f5.f3730b, f5.f3731c, getBottomInset(f5, o2)));
            return c1Var.b();
        }
        if (Build.VERSION.SDK_INT >= 35) {
            view.setPadding(f5.f3729a, f5.f3730b, f5.f3731c, o2 ? f6.f3732d : f5.f3732d);
        }
        int i6 = Build.VERSION.SDK_INT;
        d1 c1Var2 = i6 >= 34 ? new c1(q1Var) : i6 >= 31 ? new b1(q1Var) : i6 >= 30 ? new a1(q1Var) : i6 >= 29 ? new z0(q1Var) : new y0(q1Var);
        c1Var2.c(647, y.c.b(0, 0, 0, 0));
        q1 b2 = c1Var2.b();
        y.c calcSafeAreaInsets2 = calcSafeAreaInsets(b2);
        injectSafeAreaCSS(calcSafeAreaInsets2.f3730b, calcSafeAreaInsets2.f3731c, calcSafeAreaInsets2.f3732d, calcSafeAreaInsets2.f3729a);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$injectSafeAreaCSS$7(float f5, float f6, float f7, float f8) {
        Bridge bridge = this.bridge;
        if (bridge == null || bridge.getWebView() == null) {
            return;
        }
        Locale locale = Locale.US;
        this.bridge.getWebView().evaluateJavascript("try {\n  document.documentElement.style.setProperty(\"--safe-area-inset-top\", \"" + ((int) f5) + "px\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-right\", \"" + ((int) f6) + "px\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-bottom\", \"" + ((int) f7) + "px\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-left\", \"" + ((int) f8) + "px\");\n} catch(e) { console.error('Error injecting safe area CSS:', e); }\n", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDOMReady$4(String str) {
        this.hasViewportCover = str.equals("true");
        getBridge().getWebView().requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDOMReady$5() {
        this.bridge.getWebView().evaluateJavascript(viewportMetaJSFunction, new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStyle$1(String str, String str2, PluginCall pluginCall) {
        setStyle(str, str2);
        pluginCall.resolve();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(String str, PluginCall pluginCall) {
        setHidden(false, str);
        pluginCall.resolve();
    }

    private void setHidden(boolean z4, String str) {
        Window window = getActivity().getWindow();
        j jVar = new j(window.getDecorView());
        int i5 = Build.VERSION.SDK_INT;
        a.a t1Var = i5 >= 35 ? new t1(window, jVar, 1) : i5 >= 30 ? new r1(window, jVar, 1) : i5 >= 26 ? new s1(window, jVar, 0) : new r1(window, jVar, 0);
        if (z4) {
            if (str.isEmpty()) {
                t1Var.n(519);
                return;
            } else if (str.equals(BAR_STATUS_BAR)) {
                t1Var.n(1);
                return;
            } else {
                if (str.equals(BAR_GESTURE_BAR)) {
                    t1Var.n(2);
                    return;
                }
                return;
            }
        }
        if (str.isEmpty()) {
            t1Var.x(519);
        } else if (str.equals(BAR_STATUS_BAR)) {
            t1Var.x(1);
        } else if (str.equals(BAR_GESTURE_BAR)) {
            t1Var.x(2);
        }
    }

    public int getThemeColor(Context context, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i5, typedValue, true);
        return typedValue.data;
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnConfigurationChanged(Configuration configuration) {
        super.handleOnConfigurationChanged(configuration);
        setStyle(this.currentGestureBarStyle, BAR_GESTURE_BAR);
        setStyle(this.currentStatusBarStyle, BAR_STATUS_BAR);
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnStart() {
        super.handleOnStart();
        getBridge().addWebViewListener(new WebViewListener() { // from class: com.getcapacitor.plugin.SystemBars.1
            @Override // com.getcapacitor.WebViewListener
            public void onPageCommitVisible(android.webkit.WebView webView, String str) {
                super.onPageCommitVisible(webView, str);
                SystemBars.this.getBridge().getWebView().requestApplyInsets();
            }
        });
    }

    @PluginMethod
    public void hide(PluginCall pluginCall) {
        getBridge().executeOnMainThread(new b(this, pluginCall.getString("bar", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), pluginCall, 1));
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        getBridge().getWebView().addJavascriptInterface(this, "CapacitorSystemBarsAndroidInterface");
        super.load();
        initSystemBars();
    }

    @JavascriptInterface
    public void onDOMReady() {
        if (INSETS_HANDLING_CSS.equals(this.insetsHandling)) {
            getActivity().runOnUiThread(new o(this, 4));
        }
    }

    @PluginMethod
    public void setAnimation(PluginCall pluginCall) {
        pluginCall.resolve();
    }

    @PluginMethod
    public void setStyle(PluginCall pluginCall) {
        String string = pluginCall.getString("bar", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        getBridge().executeOnMainThread(new com.getcapacitor.a(this, pluginCall.getString("style", STYLE_DEFAULT), string, pluginCall));
    }

    @PluginMethod
    public void show(PluginCall pluginCall) {
        getBridge().executeOnMainThread(new b(this, pluginCall.getString("bar", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), pluginCall, 0));
    }

    private void setStyle(String str, String str2) {
        a.a r1Var;
        if (str.equals(STYLE_DEFAULT)) {
            str = getStyleForTheme();
        }
        Window window = getActivity().getWindow();
        j jVar = new j(window.getDecorView());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            r1Var = new t1(window, jVar, 1);
        } else if (i5 >= 30) {
            r1Var = new r1(window, jVar, 1);
        } else if (i5 >= 26) {
            r1Var = new s1(window, jVar, 0);
        } else {
            r1Var = new r1(window, jVar, 0);
        }
        if (str2.isEmpty() || str2.equals(BAR_STATUS_BAR)) {
            this.currentStatusBarStyle = str;
            r1Var.v(!str.equals(STYLE_DARK));
        }
        if (str2.isEmpty() || str2.equals(BAR_GESTURE_BAR)) {
            this.currentGestureBarStyle = str;
            r1Var.u(!str.equals(STYLE_DARK));
        }
        getActivity().getWindow().getDecorView().setBackgroundColor(getThemeColor(getContext(), R.attr.windowBackground));
    }
}
