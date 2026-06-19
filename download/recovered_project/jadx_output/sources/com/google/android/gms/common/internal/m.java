package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1087a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static o0 f1088b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f1089c;

    public static o0 a(Context context) {
        synchronized (f1087a) {
            try {
                if (f1088b == null) {
                    f1088b = new o0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1088b;
    }

    public abstract t2.b b(l0 l0Var, g0 g0Var, String str, Executor executor);

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z4) {
        l0 l0Var = new l0(str, str2, z4);
        o0 o0Var = (o0) this;
        b0.h(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = o0Var.f1098d;
        synchronized (hashMap) {
            try {
                m0 m0Var = (m0) hashMap.get(l0Var);
                if (m0Var == null) {
                    String l0Var2 = l0Var.toString();
                    StringBuilder sb = new StringBuilder(l0Var2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(l0Var2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!m0Var.f1090a.containsKey(serviceConnection)) {
                    String l0Var3 = l0Var.toString();
                    StringBuilder sb2 = new StringBuilder(l0Var3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(l0Var3);
                    throw new IllegalStateException(sb2.toString());
                }
                m0Var.f1090a.remove(serviceConnection);
                if (m0Var.f1090a.isEmpty()) {
                    o0Var.f1100f.sendMessageDelayed(o0Var.f1100f.obtainMessage(0, l0Var), o0Var.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
