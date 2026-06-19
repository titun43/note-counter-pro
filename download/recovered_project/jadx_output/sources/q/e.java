package q;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends z2.b {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3054c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3055d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3056e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3057f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3058g;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3054c = atomicReferenceFieldUpdater;
        this.f3055d = atomicReferenceFieldUpdater2;
        this.f3056e = atomicReferenceFieldUpdater3;
        this.f3057f = atomicReferenceFieldUpdater4;
        this.f3058g = atomicReferenceFieldUpdater5;
    }

    @Override // z2.b
    public final boolean b(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3057f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // z2.b
    public final boolean c(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3058g;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // z2.b
    public final boolean d(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3056e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // z2.b
    public final void u(g gVar, g gVar2) {
        this.f3055d.lazySet(gVar, gVar2);
    }

    @Override // z2.b
    public final void v(g gVar, Thread thread) {
        this.f3054c.lazySet(gVar, thread);
    }
}
