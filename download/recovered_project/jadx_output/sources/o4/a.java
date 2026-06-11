package o4;

/* loaded from: classes.dex */
public abstract class a extends z0 implements w3.c, t {

    /* renamed from: i, reason: collision with root package name */
    public final w3.h f2785i;

    public a(w3.h hVar, boolean z4) {
        super(z4);
        D((r0) hVar.d(s.h));
        this.f2785i = hVar.l(this);
    }

    @Override // o4.z0
    public final void C(androidx.fragment.app.x xVar) {
        w.g(xVar, this.f2785i);
    }

    @Override // o4.z0
    public final void K(Object obj) {
        if (!(obj instanceof n)) {
            T(obj);
            return;
        }
        n nVar = (n) obj;
        S(n.f2821b.get(nVar) == 1, nVar.f2822a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(u uVar, a aVar, f4.p pVar) {
        int ordinal = uVar.ordinal();
        t3.h hVar = t3.h.f3400a;
        if (ordinal == 0) {
            try {
                t4.b.h(hVar, a.a.o(((y3.a) pVar).create(aVar, this)));
                return;
            } finally {
                th = th;
                if (th instanceof b0) {
                    th = ((b0) th).f2787g;
                }
                resumeWith(b3.g.g(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                a.a.o(((y3.a) pVar).create(aVar, this)).resumeWith(hVar);
                return;
            }
            if (ordinal != 3) {
                throw new androidx.fragment.app.x();
            }
            try {
                w3.h hVar2 = this.f2785i;
                Object m5 = t4.b.m(hVar2, null);
                try {
                    g4.q.a(2, pVar);
                    Object invoke = pVar.invoke(aVar, this);
                    if (invoke != x3.a.f3712g) {
                        resumeWith(invoke);
                    }
                } finally {
                    t4.b.g(hVar2, m5);
                }
            } catch (Throwable th) {
                th = th;
            }
        }
    }

    @Override // w3.c
    public final w3.h getContext() {
        return this.f2785i;
    }

    @Override // o4.t
    public final w3.h k() {
        return this.f2785i;
    }

    @Override // w3.c
    public final void resumeWith(Object obj) {
        Throwable a5 = t3.e.a(obj);
        if (a5 != null) {
            obj = new n(false, a5);
        }
        Object H = H(obj);
        if (H == w.f2838d) {
            return;
        }
        q(H);
    }

    @Override // o4.z0
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void T(Object obj) {
    }

    public void S(boolean z4, Throwable th) {
    }
}
