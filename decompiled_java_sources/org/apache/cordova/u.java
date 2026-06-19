package org.apache.cordova;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebChromeClient;
import java.util.Map;

/* loaded from: classes.dex */
public interface u {
    boolean backHistory();

    void clearCache();

    void clearHistory();

    Context getContext();

    k0 getPluginManager();

    r getPreferences();

    void handleDestroy();

    void handlePause(boolean z4);

    void handleResume(boolean z4);

    void handleStart();

    void handleStop();

    void hideCustomView();

    boolean isButtonPlumbedToJs(int i5);

    void onNewIntent(Intent intent);

    void sendPluginResult(l0 l0Var, String str);

    void setButtonPlumbedToJs(int i5, boolean z4);

    void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    void showWebPage(String str, boolean z4, boolean z5, Map map);
}
