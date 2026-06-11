package q;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements j3.a {

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f3073g;
    public final k h = new k(this);

    public l(i iVar) {
        this.f3073g = new WeakReference(iVar);
    }

    @Override // j3.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.h.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        i iVar = (i) this.f3073g.get();
        boolean cancel = this.h.cancel(z4);
        if (cancel && iVar != null) {
            iVar.f3068a = null;
            iVar.f3069b = null;
            iVar.f3070c.i(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.f3066g instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    public final String toString() {
        return this.h.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.h.get(j2, timeUnit);
    }
}
