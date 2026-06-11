package t4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o4.a0;
import o4.y;

/* loaded from: classes.dex */
public final class h extends o4.r implements a0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3419m = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: i, reason: collision with root package name */
    public final o4.r f3420i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3421j;

    /* renamed from: k, reason: collision with root package name */
    public final l f3422k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3423l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(o4.r rVar, int i5) {
        if ((rVar instanceof a0 ? (a0) rVar : null) == null) {
            int i6 = y.f2849a;
        }
        this.f3420i = rVar;
        this.f3421j = i5;
        this.f3422k = new l();
        this.f3423l = new Object();
    }

    @Override // o4.r
    public final void f(w3.h hVar, Runnable runnable) {
        this.f3422k.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3419m;
        if (atomicIntegerFieldUpdater.get(this) < this.f3421j) {
            synchronized (this.f3423l) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f3421j) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable o2 = o();
                if (o2 == null) {
                    return;
                }
                try {
                    b.i(this.f3420i, this, new c0.a(this, o2, 17, false));
                } catch (Throwable th) {
                    f3419m.decrementAndGet(this);
                    throw th;
                }
            }
        }
    }

    public final Runnable o() {
        while (true) {
            Runnable runnable = (Runnable) this.f3422k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3423l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3419m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3422k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // o4.r
    public final String toString() {
        return this.f3420i + ".limitedParallelism(" + this.f3421j + ')';
    }
}
