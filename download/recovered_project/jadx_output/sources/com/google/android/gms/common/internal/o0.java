package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o0 extends m {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1098d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f1099e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzg f1100f;

    /* renamed from: g, reason: collision with root package name */
    public final w2.a f1101g;
    public final long h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1102i;

    public o0(Context context, Looper looper) {
        n0 n0Var = new n0(this);
        this.f1099e = context.getApplicationContext();
        this.f1100f = new zzg(looper, n0Var);
        this.f1101g = w2.a.a();
        this.h = 5000L;
        this.f1102i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.m
    public final t2.b b(l0 l0Var, g0 g0Var, String str, Executor executor) {
        t2.b bVar;
        HashMap hashMap = this.f1098d;
        synchronized (hashMap) {
            try {
                m0 m0Var = (m0) hashMap.get(l0Var);
                if (executor == null) {
                    executor = null;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.f1090a.put(g0Var, g0Var);
                    bVar = m0Var.a(str, executor);
                    hashMap.put(l0Var, m0Var);
                } else {
                    this.f1100f.removeMessages(0, l0Var);
                    if (m0Var.f1090a.containsKey(g0Var)) {
                        String l0Var2 = l0Var.toString();
                        StringBuilder sb = new StringBuilder(l0Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(l0Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                    m0Var.f1090a.put(g0Var, g0Var);
                    int i5 = m0Var.f1091b;
                    if (i5 == 1) {
                        g0Var.onServiceConnected(m0Var.f1095f, m0Var.f1093d);
                    } else if (i5 == 2) {
                        bVar = m0Var.a(str, executor);
                    }
                    bVar = null;
                }
                if (m0Var.f1092c) {
                    return t2.b.f3361l;
                }
                if (bVar == null) {
                    bVar = new t2.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
