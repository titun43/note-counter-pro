package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class n0 implements Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f1097g;

    public /* synthetic */ n0(o0 o0Var) {
        this.f1097g = o0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 0) {
            o0 o0Var = this.f1097g;
            synchronized (o0Var.f1098d) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) o0Var.f1098d.get(l0Var);
                    if (m0Var != null && m0Var.f1090a.isEmpty()) {
                        if (m0Var.f1092c) {
                            l0 l0Var2 = m0Var.f1094e;
                            o0 o0Var2 = m0Var.f1096g;
                            o0Var2.f1100f.removeMessages(1, l0Var2);
                            o0Var2.f1101g.b(o0Var2.f1099e, m0Var);
                            m0Var.f1092c = false;
                            m0Var.f1091b = 2;
                        }
                        o0Var.f1098d.remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i5 != 1) {
            return false;
        }
        o0 o0Var3 = this.f1097g;
        synchronized (o0Var3.f1098d) {
            try {
                l0 l0Var3 = (l0) message.obj;
                m0 m0Var2 = (m0) o0Var3.f1098d.get(l0Var3);
                if (m0Var2 != null && m0Var2.f1091b == 3) {
                    String valueOf = String.valueOf(l0Var3);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = m0Var2.f1095f;
                    if (componentName == null) {
                        l0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = l0Var3.f1085b;
                        b0.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
