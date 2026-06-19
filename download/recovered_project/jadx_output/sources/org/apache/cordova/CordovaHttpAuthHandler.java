package org.apache.cordova;

import android.webkit.HttpAuthHandler;

/* loaded from: classes.dex */
public class CordovaHttpAuthHandler implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final HttpAuthHandler f2860a;

    public CordovaHttpAuthHandler(HttpAuthHandler httpAuthHandler) {
        this.f2860a = httpAuthHandler;
    }

    public void cancel() {
        this.f2860a.cancel();
    }

    public void proceed(String str, String str2) {
        this.f2860a.proceed(str, str2);
    }
}
