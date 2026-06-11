package org.apache.cordova;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public interface v {
    void clearLoadTimeoutTimer();

    Boolean onDispatchKeyEvent(KeyEvent keyEvent);

    boolean onNavigationAttempt(String str);

    void onPageFinishedLoading(String str);

    void onPageStarted(String str);

    void onReceivedError(int i5, String str, String str2);
}
