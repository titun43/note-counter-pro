package o4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class v0 extends t4.k implements f0, o0 {

    /* renamed from: d, reason: collision with root package name */
    public z0 f2834d;

    @Override // o4.o0
    public final boolean a() {
        return true;
    }

    @Override // o4.o0
    public final a1 c() {
        return null;
    }

    @Override // o4.f0
    public final void d() {
        z0 j2 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f2855g;
            Object obj = atomicReferenceFieldUpdater.get(j2);
            if (obj instanceof v0) {
                if (obj != this) {
                    return;
                }
                h0 h0Var = w.f2842i;
                while (!atomicReferenceFieldUpdater.compareAndSet(j2, obj, h0Var)) {
                    if (atomicReferenceFieldUpdater.get(j2) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof o0) || ((o0) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t4.k.f3426a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof t4.p) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                g4.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                t4.k kVar = (t4.k) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = t4.k.f3428c;
                t4.p pVar = (t4.p) atomicReferenceFieldUpdater3.get(kVar);
                if (pVar == null) {
                    pVar = new t4.p(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                kVar.f();
                return;
            }
        }
    }

    public r0 getParent() {
        return j();
    }

    public final z0 j() {
        z0 z0Var = this.f2834d;
        if (z0Var != null) {
            return z0Var;
        }
        g4.i.g("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // t4.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + w.e(this) + "[job@" + w.e(j()) + ']';
    }
}
