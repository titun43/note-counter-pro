package org.apache.cordova;

import android.view.View;
import android.webkit.ValueCallback;

/* loaded from: classes.dex */
public interface w {
    boolean canGoBack();

    void clearCache();

    void clearHistory();

    void destroy();

    void evaluateJavascript(String str, ValueCallback valueCallback);

    c0 getCookieManager();

    String getUrl();

    View getView();

    boolean goBack();

    void init(u uVar, n nVar, v vVar, t tVar, k0 k0Var, h0 h0Var);

    void loadUrl(String str, boolean z4);

    void setPaused(boolean z4);
}
