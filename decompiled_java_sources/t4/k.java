package t4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3426a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3427b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3428c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(k kVar, int i5) {
        while (true) {
            k f5 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3427b;
            if (f5 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f5 = (k) obj;
                    if (!f5.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f5);
                }
            }
            if (f5 instanceof i) {
                return (((i) f5).f3424d & i5) == 0 && f5.e(kVar, i5);
            }
            atomicReferenceFieldUpdater.set(kVar, f5);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3426a;
            atomicReferenceFieldUpdater2.set(kVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f5, this, kVar)) {
                if (atomicReferenceFieldUpdater2.get(f5) != this) {
                    break;
                }
            }
            kVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((t4.p) r6).f3439a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3427b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3426a;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar2);
                    if (obj == this) {
                        if (kVar == kVar2) {
                            return kVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != kVar) {
                                break;
                            }
                        }
                        return kVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof p)) {
                        g4.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) atomicReferenceFieldUpdater.get(kVar2);
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void g(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3427b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f3426a.get(this) != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (i()) {
                kVar.f();
                return;
            }
            return;
        }
    }

    public final k h() {
        k kVar;
        Object obj = f3426a.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (kVar = pVar.f3439a) != null) {
            return kVar;
        }
        g4.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (k) obj;
    }

    public boolean i() {
        return f3426a.get(this) instanceof p;
    }

    public String toString() {
        return new j(this) + '@' + o4.w.e(this);
    }
}
