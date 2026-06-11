package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f1011b;

    public o0(int i5, c cVar) {
        super(i5);
        com.google.android.gms.common.internal.b0.h(cVar, "Null methods are not runnable.");
        this.f1011b = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a(Status status) {
        try {
            this.f1011b.setFailedResult(status);
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void b(Exception exc) {
        try {
            this.f1011b.setFailedResult(new Status(10, androidx.emoji2.text.u.k(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c(a0 a0Var) {
        try {
            this.f1011b.run(a0Var.h);
        } catch (RuntimeException e4) {
            b(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void d(androidx.emoji2.text.p pVar, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) pVar.h;
        c cVar = this.f1011b;
        map.put(cVar, valueOf);
        cVar.addStatusListener(new w(pVar, cVar));
    }
}
