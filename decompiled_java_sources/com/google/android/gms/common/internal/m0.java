package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1090a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f1091b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1092c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f1093d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f1094e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f1095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f1096g;

    public m0(o0 o0Var, l0 l0Var) {
        this.f1096g = o0Var;
        this.f1094e = l0Var;
    }

    public final t2.b a(String str, Executor executor) {
        try {
            Intent a5 = d0.a(this.f1096g.f1099e, this.f1094e);
            this.f1091b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(x2.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                o0 o0Var = this.f1096g;
                w2.a aVar = o0Var.f1101g;
                Context context = o0Var.f1099e;
                l0 l0Var = this.f1094e;
                try {
                    boolean c5 = aVar.c(context, str, a5, this, 4225, executor);
                    this.f1092c = c5;
                    if (c5) {
                        o0Var.f1100f.sendMessageDelayed(o0Var.f1100f.obtainMessage(1, l0Var), o0Var.f1102i);
                        t2.b bVar = t2.b.f3361l;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f1091b = 2;
                    try {
                        o0Var.f1101g.b(o0Var.f1099e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    t2.b bVar2 = new t2.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (c0 e4) {
            return e4.f1042g;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0 o0Var = this.f1096g;
        synchronized (o0Var.f1098d) {
            try {
                o0Var.f1100f.removeMessages(1, this.f1094e);
                this.f1093d = iBinder;
                this.f1095f = componentName;
                Iterator it = this.f1090a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1091b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0 o0Var = this.f1096g;
        synchronized (o0Var.f1098d) {
            try {
                o0Var.f1100f.removeMessages(1, this.f1094e);
                this.f1093d = null;
                this.f1095f = componentName;
                Iterator it = this.f1090a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1091b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
