package o4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class q0 extends v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2827f = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f2828e;

    public q0(u0 u0Var) {
        this.f2828e = u0Var;
    }

    @Override // o4.v0
    public final boolean k() {
        return true;
    }

    @Override // o4.v0
    public final void l(Throwable th) {
        if (f2827f.compareAndSet(this, 0, 1)) {
            this.f2828e.a(th);
        }
    }
}
