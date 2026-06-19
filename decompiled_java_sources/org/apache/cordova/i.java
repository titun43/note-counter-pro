package org.apache.cordova;

import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public k0 f2926a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f2927b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2928c;

    public final String a(int i5, String str, String str2, String str3, String str4) {
        h0 h0Var = this.f2927b;
        if (!b(i5)) {
            return null;
        }
        if (str4 == null) {
            return "@Null arguments.";
        }
        h0Var.g(true);
        try {
            Thread.currentThread();
            this.f2926a.a(str, str2, str3, str4);
            return h0Var.d(false);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } finally {
                h0Var.g(false);
            }
        }
    }

    public final boolean b(int i5) {
        if (this.f2927b.f2925d == null) {
            return false;
        }
        if (this.f2928c >= 0 && i5 == this.f2928c) {
            return true;
        }
        Log.e("CordovaBridge", "Bridge access attempt with wrong secret token, possibly from malicious code. Disabling exec() bridge!");
        this.f2928c = -1;
        throw new IllegalAccessException();
    }
}
