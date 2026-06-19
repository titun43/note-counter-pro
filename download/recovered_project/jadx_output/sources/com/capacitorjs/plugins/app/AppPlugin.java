package com.capacitorjs.plugins.app;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import androidx.activity.y;
import b0.e;
import b0.g;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.PluginResult;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.util.InternalUtils;
import g.r;
import java.util.Locale;

@CapacitorPlugin(name = "App")
/* loaded from: classes.dex */
public class AppPlugin extends Plugin {
    private static final String EVENT_BACK_BUTTON = "backButton";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_RESTORED_RESULT = "appRestoredResult";
    private static final String EVENT_RESUME = "resume";
    private static final String EVENT_STATE_CHANGE = "appStateChange";
    private static final String EVENT_URL_OPEN = "appUrlOpen";
    private boolean hasPausedEver = false;
    private y onBackPressedCallback;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Boolean bool) {
        Logger.debug(getLogTag(), "Firing change: " + bool);
        JSObject jSObject = new JSObject();
        jSObject.put("isActive", (Object) bool);
        notifyListeners(EVENT_STATE_CHANGE, jSObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$1(PluginResult pluginResult) {
        Logger.debug(getLogTag(), "Firing restored result");
        notifyListeners(EVENT_RESTORED_RESULT, pluginResult.getWrappedResult(), true);
    }

    private void unsetAppListeners() {
        this.bridge.getApp().setStatusChangeListener(null);
        this.bridge.getApp().setAppRestoredListener(null);
    }

    @PluginMethod
    public void exitApp(PluginCall pluginCall) {
        unsetAppListeners();
        pluginCall.resolve();
        getBridge().getActivity().finish();
    }

    @PluginMethod
    public void getAppLanguage(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        g a5 = r.a();
        Locale locale = !a5.b() ? a5.f689a.f690a.get(0) : null;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        jSObject.put("value", locale.getLanguage());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void getInfo(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        try {
            PackageInfo packageInfo = InternalUtils.getPackageInfo(getContext().getPackageManager(), getContext().getPackageName());
            ApplicationInfo applicationInfo = getContext().getApplicationInfo();
            int i5 = applicationInfo.labelRes;
            jSObject.put("name", i5 == 0 ? applicationInfo.nonLocalizedLabel.toString() : getContext().getString(i5));
            jSObject.put("id", packageInfo.packageName);
            jSObject.put("build", Integer.toString((int) (Build.VERSION.SDK_INT >= 28 ? e.d(packageInfo) : packageInfo.versionCode)));
            jSObject.put("version", packageInfo.versionName);
            pluginCall.resolve(jSObject);
        } catch (Exception unused) {
            pluginCall.reject("Unable to get App Info");
        }
    }

    @PluginMethod
    public void getLaunchUrl(PluginCall pluginCall) {
        Uri intentUri = this.bridge.getIntentUri();
        if (intentUri == null) {
            pluginCall.resolve();
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("url", intentUri.toString());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void getState(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("isActive", this.bridge.getApp().isActive());
        pluginCall.resolve(jSObject);
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnDestroy() {
        unsetAppListeners();
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("url", data.toString());
        notifyListeners(EVENT_URL_OPEN, jSObject, true);
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnPause() {
        super.handleOnPause();
        this.hasPausedEver = true;
        notifyListeners(EVENT_PAUSE, null);
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnResume() {
        super.handleOnResume();
        if (this.hasPausedEver) {
            notifyListeners(EVENT_RESUME, null);
        }
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        boolean z4 = getConfig().getBoolean("disableBackButtonHandler", false);
        this.bridge.getApp().setStatusChangeListener(new a(this));
        this.bridge.getApp().setAppRestoredListener(new a(this));
        this.onBackPressedCallback = new y(!z4) { // from class: com.capacitorjs.plugins.app.AppPlugin.1
            @Override // androidx.activity.y
            public void handleOnBackPressed() {
                if (!AppPlugin.this.hasListeners(AppPlugin.EVENT_BACK_BUTTON)) {
                    if (((Plugin) AppPlugin.this).bridge.getWebView().canGoBack()) {
                        ((Plugin) AppPlugin.this).bridge.getWebView().goBack();
                    }
                } else {
                    JSObject jSObject = new JSObject();
                    jSObject.put("canGoBack", ((Plugin) AppPlugin.this).bridge.getWebView().canGoBack());
                    AppPlugin.this.notifyListeners(AppPlugin.EVENT_BACK_BUTTON, jSObject, true);
                    ((Plugin) AppPlugin.this).bridge.triggerJSEvent("backbutton", "document");
                }
            }
        };
        getActivity().getOnBackPressedDispatcher().a(getActivity(), this.onBackPressedCallback);
    }

    @PluginMethod
    public void minimizeApp(PluginCall pluginCall) {
        getActivity().moveTaskToBack(true);
        pluginCall.resolve();
    }

    @PluginMethod
    public void toggleBackButtonHandler(PluginCall pluginCall) {
        if (this.onBackPressedCallback == null) {
            pluginCall.reject("onBackPressedCallback is not set");
            return;
        }
        this.onBackPressedCallback.setEnabled(pluginCall.getBoolean("enabled").booleanValue());
        pluginCall.resolve();
    }
}
