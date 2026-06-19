package org.apache.cordova;

import android.content.Intent;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface n {
    g.k getActivity();

    ExecutorService getThreadPool();

    Object onMessage(String str, Object obj);

    void startActivityForResult(p pVar, Intent intent, int i5);
}
