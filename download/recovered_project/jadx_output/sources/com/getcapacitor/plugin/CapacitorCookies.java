package com.getcapacitor.plugin;

import android.webkit.JavascriptInterface;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@CapacitorPlugin
/* loaded from: classes.dex */
public class CapacitorCookies extends Plugin {
    CapacitorCookieManager cookieManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCookies$0(PluginCall pluginCall, String str) {
        String[] split = str.substring(1, str.length() - 1).split(";");
        JSObject jSObject = new JSObject();
        for (String str2 : split) {
            if (str2.length() > 0) {
                String[] split2 = str2.split("=", 2);
                if (split2.length == 2) {
                    String trim = split2[0].trim();
                    String trim2 = split2[1].trim();
                    try {
                        String trim3 = split2[0].trim();
                        Charset charset = StandardCharsets.UTF_8;
                        trim = URLDecoder.decode(trim3, charset.name());
                        trim2 = URLDecoder.decode(split2[1].trim(), charset.name());
                    } catch (UnsupportedEncodingException unused) {
                    }
                    jSObject.put(trim, trim2);
                }
            }
        }
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void clearAllCookies(PluginCall pluginCall) {
        this.cookieManager.removeAllCookies();
        pluginCall.resolve();
    }

    @PluginMethod
    public void clearCookies(PluginCall pluginCall) {
        String string = pluginCall.getString("url");
        for (HttpCookie httpCookie : this.cookieManager.getCookies(string)) {
            this.cookieManager.setCookie(string, httpCookie.getName() + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT");
        }
        pluginCall.resolve();
    }

    @PluginMethod
    public void deleteCookie(PluginCall pluginCall) {
        String string = pluginCall.getString("key");
        if (string == null) {
            pluginCall.reject("Must provide key");
        }
        String string2 = pluginCall.getString("url");
        this.cookieManager.setCookie(string2, string + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT");
        pluginCall.resolve();
    }

    @PluginMethod
    public void getCookies(PluginCall pluginCall) {
        this.bridge.eval("document.cookie", new a(pluginCall, 0));
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnDestroy() {
        super.handleOnDestroy();
        this.cookieManager.removeSessionCookies();
    }

    @JavascriptInterface
    public boolean isEnabled() {
        return getBridge().getConfig().getPluginConfiguration("CapacitorCookies").getBoolean("enabled", false);
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        this.bridge.getWebView().addJavascriptInterface(this, "CapacitorCookiesAndroidInterface");
        CapacitorCookieManager capacitorCookieManager = new CapacitorCookieManager(null, CookiePolicy.ACCEPT_ALL, this.bridge);
        this.cookieManager = capacitorCookieManager;
        capacitorCookieManager.removeSessionCookies();
        CookieHandler.setDefault(this.cookieManager);
        super.load();
    }

    @JavascriptInterface
    public void setCookie(String str, String str2) {
        this.cookieManager.setCookie(str, str2);
    }

    @PluginMethod
    public void setCookie(PluginCall pluginCall) {
        String string = pluginCall.getString("key");
        if (string == null) {
            pluginCall.reject("Must provide key");
        }
        String string2 = pluginCall.getString("value");
        if (string2 == null) {
            pluginCall.reject("Must provide value");
        }
        this.cookieManager.setCookie(pluginCall.getString("url"), string, string2, pluginCall.getString("expires", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), pluginCall.getString("path", "/"));
        pluginCall.resolve();
    }
}
