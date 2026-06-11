package com.getcapacitor;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import org.apache.cordova.k0;

/* loaded from: classes.dex */
public class MessageHandler {
    private Bridge bridge;
    private k0 cordovaPluginManager;
    private j1.a javaScriptReplyProxy;
    private WebView webView;

    public MessageHandler(Bridge bridge, WebView webView, k0 k0Var) {
        this.bridge = bridge;
        this.webView = webView;
        this.cordovaPluginManager = k0Var;
        if (!a.a.q("WEB_MESSAGE_LISTENER") || bridge.getConfig().isUsingLegacyBridge()) {
            webView.addJavascriptInterface(this, "androidBridge");
            return;
        }
        try {
            j1.f.b(webView, "androidBridge", bridge.getAllowedOriginRules(), new l(this));
        } catch (Exception unused) {
            webView.addJavascriptInterface(this, "androidBridge");
        }
    }

    private void callCordovaPluginMethod(final String str, final String str2, final String str3, final String str4) {
        this.bridge.execute(new Runnable() { // from class: com.getcapacitor.n
            @Override // java.lang.Runnable
            public final void run() {
                MessageHandler.this.lambda$callCordovaPluginMethod$2(str2, str3, str, str4);
            }
        });
    }

    private void callPluginMethod(String str, String str2, String str3, JSObject jSObject) {
        this.bridge.callPluginMethod(str2, str3, new PluginCall(this, str2, str, str3, jSObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callCordovaPluginMethod$2(String str, String str2, String str3, String str4) {
        this.cordovaPluginManager.a(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(WebView webView, j1.c cVar, Uri uri, boolean z4, j1.a aVar) {
        if (!z4) {
            Logger.warn("Plugin execution is allowed in Main Frame only");
        } else {
            postMessage(cVar.a());
            this.javaScriptReplyProxy = aVar;
        }
    }

    private void legacySendResponseMessage(PluginResult pluginResult) {
        final String str = "window.Capacitor.fromNative(" + pluginResult.toString() + ")";
        final WebView webView = this.webView;
        webView.post(new Runnable() { // from class: com.getcapacitor.m
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    @JavascriptInterface
    public void postMessage(String str) {
        try {
            JSObject jSObject = new JSObject(str);
            String string = jSObject.getString("type");
            boolean z4 = false;
            boolean z5 = string != null;
            boolean z6 = z5 && string.equals("cordova");
            if (z5 && string.equals("js.error")) {
                z4 = true;
            }
            String string2 = jSObject.getString("callbackId");
            if (z6) {
                String string3 = jSObject.getString("service");
                String string4 = jSObject.getString("action");
                String string5 = jSObject.getString("actionArgs");
                Logger.verbose(Logger.tags("Plugin"), "To native (Cordova plugin): callbackId: " + string2 + ", service: " + string3 + ", action: " + string4 + ", actionArgs: " + string5);
                callCordovaPluginMethod(string2, string3, string4, string5);
                return;
            }
            if (z4) {
                Logger.error("JavaScript Error: " + str);
                return;
            }
            String string6 = jSObject.getString("pluginId");
            String string7 = jSObject.getString("methodName");
            JSObject jSObject2 = jSObject.getJSObject("options", new JSObject());
            Logger.verbose(Logger.tags("Plugin"), "To native (Capacitor plugin): callbackId: " + string2 + ", pluginId: " + string6 + ", methodName: " + string7);
            callPluginMethod(string2, string6, string7, jSObject2);
        } catch (Exception e4) {
            Logger.error("Post message error:", e4);
        }
    }

    public void sendResponseMessage(PluginCall pluginCall, PluginResult pluginResult, PluginResult pluginResult2) {
        j1.a aVar;
        try {
            PluginResult pluginResult3 = new PluginResult();
            pluginResult3.put("save", pluginCall.isKeptAlive());
            pluginResult3.put("callbackId", pluginCall.getCallbackId());
            pluginResult3.put("pluginId", pluginCall.getPluginId());
            pluginResult3.put("methodName", pluginCall.getMethodName());
            if (pluginResult2 != null) {
                pluginResult3.put("success", false);
                pluginResult3.put("error", pluginResult2);
                Logger.debug("Sending plugin error: " + pluginResult3.toString());
            } else {
                pluginResult3.put("success", true);
                if (pluginResult != null) {
                    pluginResult3.put("data", pluginResult);
                }
            }
            if (pluginCall.getCallbackId().equals(PluginCall.CALLBACK_ID_DANGLING)) {
                this.bridge.getApp().fireRestoredResult(pluginResult3);
            } else if (this.bridge.getConfig().isUsingLegacyBridge()) {
                legacySendResponseMessage(pluginResult3);
            } else if (!a.a.q("WEB_MESSAGE_LISTENER") || (aVar = this.javaScriptReplyProxy) == null) {
                legacySendResponseMessage(pluginResult3);
            } else {
                String pluginResult4 = pluginResult3.toString();
                k1.g gVar = (k1.g) aVar;
                gVar.getClass();
                if (!k1.m.f2419d.b()) {
                    throw k1.m.a();
                }
                gVar.f2409a.postMessage(pluginResult4);
            }
        } catch (Exception e4) {
            Logger.error("sendResponseMessage: error: " + e4);
        }
        if (pluginCall.isKeptAlive()) {
            return;
        }
        pluginCall.release(this.bridge);
    }
}
