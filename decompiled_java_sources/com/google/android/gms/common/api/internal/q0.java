package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class q0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final h3.h f1015b;

    /* renamed from: c, reason: collision with root package name */
    public final j f1016c;

    public q0(j jVar, h3.h hVar) {
        super(4);
        this.f1015b = hVar;
        this.f1016c = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a(Status status) {
        this.f1015b.b(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void b(Exception exc) {
        this.f1015b.b(exc);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c(a0 a0Var) {
        try {
            h(a0Var);
        } catch (DeadObjectException e4) {
            a(r0.e(e4));
            throw e4;
        } catch (RemoteException e5) {
            a(r0.e(e5));
        } catch (RuntimeException e6) {
            this.f1015b.b(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final boolean f(a0 a0Var) {
        androidx.emoji2.text.u.p(a0Var.f944l.get(this.f1016c));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final t2.d[] g(a0 a0Var) {
        androidx.emoji2.text.u.p(a0Var.f944l.get(this.f1016c));
        return null;
    }

    public final void h(a0 a0Var) {
        androidx.emoji2.text.u.p(a0Var.f944l.remove(this.f1016c));
        h3.h hVar = this.f1015b;
        Boolean bool = Boolean.FALSE;
        h3.n nVar = hVar.f1713a;
        synchronized (nVar.f1727a) {
            try {
                if (nVar.f1729c) {
                    return;
                }
                nVar.f1729c = true;
                nVar.f1731e = bool;
                nVar.f1728b.b(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final /* bridge */ /* synthetic */ void d(androidx.emoji2.text.p pVar, boolean z4) {
    }
}
