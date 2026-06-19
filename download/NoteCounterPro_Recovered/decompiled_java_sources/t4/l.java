package t4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3429a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3429a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a5 = nVar.a(runnable);
            if (a5 == 0) {
                return true;
            }
            if (a5 == 1) {
                n c5 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c5) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a5 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3429a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c5 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c5) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f3429a.get(this);
        nVar.getClass();
        long j2 = n.f3432f.get(nVar);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3429a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d5 = nVar.d();
            if (d5 != n.f3433g) {
                return d5;
            }
            n c5 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c5) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
