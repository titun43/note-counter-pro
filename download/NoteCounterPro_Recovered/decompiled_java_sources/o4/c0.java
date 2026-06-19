package o4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class c0 extends t4.r {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2789k = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // t4.r, o4.z0
    public final void p(Object obj) {
        q(obj);
    }

    @Override // t4.r, o4.z0
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2789k;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                t4.b.h(w.k(obj), a.a.o(this.f3440j));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
