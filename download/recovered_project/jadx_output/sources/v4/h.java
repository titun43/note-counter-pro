package v4;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import o4.l0;

/* loaded from: classes.dex */
public abstract class h extends l0 {

    /* renamed from: i, reason: collision with root package name */
    public c f3609i;

    @Override // o4.r
    public final void f(w3.h hVar, Runnable runnable) {
        c cVar = this.f3609i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3595n;
        cVar.b(runnable, false);
    }
}
