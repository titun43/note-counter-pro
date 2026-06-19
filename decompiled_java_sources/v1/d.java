package v1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends y4.b {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3563i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3564j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3565k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3566l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3567m;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3563i = atomicReferenceFieldUpdater;
        this.f3564j = atomicReferenceFieldUpdater2;
        this.f3565k = atomicReferenceFieldUpdater3;
        this.f3566l = atomicReferenceFieldUpdater4;
        this.f3567m = atomicReferenceFieldUpdater5;
    }

    @Override // y4.b
    public final void E(g gVar, g gVar2) {
        this.f3564j.lazySet(gVar, gVar2);
    }

    @Override // y4.b
    public final void F(g gVar, Thread thread) {
        this.f3563i.lazySet(gVar, thread);
    }

    @Override // y4.b
    public final boolean c(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3566l;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // y4.b
    public final boolean d(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3567m;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // y4.b
    public final boolean e(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3565k;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
