package o4;

/* loaded from: classes.dex */
public final class i1 extends t4.r {

    /* renamed from: k, reason: collision with root package name */
    public final ThreadLocal f2806k;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i1(w3.h hVar, y3.c cVar) {
        super(hVar.d(r0) == null ? hVar.l(r0) : hVar, cVar);
        j1 j1Var = j1.f2811g;
        this.f2806k = new ThreadLocal();
        if (cVar.getContext().d(w3.d.f3630g) instanceof r) {
            return;
        }
        Object m5 = t4.b.m(hVar, null);
        t4.b.g(hVar, m5);
        Y(hVar, m5);
    }

    @Override // t4.r
    public final void V() {
        X();
    }

    public final boolean W() {
        boolean z4 = this.threadLocalIsSet && this.f2806k.get() == null;
        this.f2806k.remove();
        return !z4;
    }

    public final void X() {
        if (this.threadLocalIsSet) {
            t3.c cVar = (t3.c) this.f2806k.get();
            if (cVar != null) {
                t4.b.g((w3.h) cVar.f3394g, cVar.h);
            }
            this.f2806k.remove();
        }
    }

    public final void Y(w3.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f2806k.set(new t3.c(hVar, obj));
    }

    @Override // t4.r, o4.z0
    public final void q(Object obj) {
        X();
        Object k5 = w.k(obj);
        y3.c cVar = this.f3440j;
        w3.h context = cVar.getContext();
        Object m5 = t4.b.m(context, null);
        i1 o2 = m5 != t4.b.f3405d ? w.o(cVar, context, m5) : null;
        try {
            cVar.resumeWith(k5);
            if (o2 == null || o2.W()) {
                t4.b.g(context, m5);
            }
        } catch (Throwable th) {
            if (o2 == null || o2.W()) {
                t4.b.g(context, m5);
            }
            throw th;
        }
    }
}
