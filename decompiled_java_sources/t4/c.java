package t4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3409a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3410b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void a() {
        f3410b.set(this, null);
    }

    public final c b() {
        Object obj = f3409a.get(this);
        if (obj == b.f3402a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean c();

    public final void d() {
        c b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3410b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.c()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c b5 = b();
            g4.i.b(b5);
            while (b5.c() && (b2 = b5.b()) != null) {
                b5 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b5);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b5, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(b5) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f3409a.set(cVar, b5);
            }
            if (!b5.c() || b5.b() == null) {
                if (cVar == null || !cVar.c()) {
                    return;
                }
            }
        }
    }
}
