package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class p0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final u f1012b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.h f1013c;

    /* renamed from: d, reason: collision with root package name */
    public final s f1014d;

    public p0(int i5, u uVar, h3.h hVar, s sVar) {
        super(i5);
        this.f1013c = hVar;
        this.f1012b = uVar;
        this.f1014d = sVar;
        if (i5 == 2 && uVar.f1025b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a(Status status) {
        ((t2.i) this.f1014d).getClass();
        this.f1013c.b(status.f930i != null ? new com.google.android.gms.common.api.s(status) : new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void b(Exception exc) {
        this.f1013c.b(exc);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c(a0 a0Var) {
        h3.h hVar = this.f1013c;
        try {
            u uVar = this.f1012b;
            ((k0) uVar).f1003d.f1020a.accept(a0Var.h, hVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            a(r0.e(e5));
        } catch (RuntimeException e6) {
            hVar.b(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void d(androidx.emoji2.text.p pVar, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) pVar.f274i;
        h3.h hVar = this.f1013c;
        map.put(hVar, valueOf);
        h3.n nVar = hVar.f1713a;
        androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p(pVar, hVar, 4, false);
        nVar.getClass();
        nVar.f1728b.a(new h3.j(h3.i.f1714a, pVar2));
        nVar.h();
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final boolean f(a0 a0Var) {
        return this.f1012b.f1025b;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final t2.d[] g(a0 a0Var) {
        return this.f1012b.f1024a;
    }
}
