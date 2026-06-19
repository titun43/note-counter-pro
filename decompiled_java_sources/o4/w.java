package o4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2835a = new androidx.emoji2.text.r("RESUME_TOKEN", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2836b = new androidx.emoji2.text.r("CLOSED_EMPTY", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2837c = new androidx.emoji2.text.r("COMPLETING_ALREADY", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2838d = new androidx.emoji2.text.r("COMPLETING_WAITING_CHILDREN", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2839e = new androidx.emoji2.text.r("COMPLETING_RETRY", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2840f = new androidx.emoji2.text.r("TOO_LATE_TO_CANCEL", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.emoji2.text.r f2841g = new androidx.emoji2.text.r("SEALED", 2);
    public static final h0 h = new h0(false);

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f2842i = new h0(true);

    public static final t4.d a(w3.h hVar) {
        if (hVar.d(s.h) == null) {
            hVar = hVar.l(new t0());
        }
        return new t4.d(hVar);
    }

    public static z b(t4.d dVar, f4.p pVar) {
        u uVar = u.f2832g;
        w3.h j2 = j(dVar, w3.i.f3631g);
        u uVar2 = u.f2832g;
        z zVar = new z(j2, true, 0);
        zVar.U(uVar, zVar, pVar);
        return zVar;
    }

    public static final void c(w3.h hVar) {
        r0 r0Var = (r0) hVar.d(s.h);
        if (r0Var != null && !r0Var.a()) {
            throw r0Var.g();
        }
    }

    public static final w3.h d(w3.h hVar, w3.h hVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.j(bool, new o(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.j(bool, new o(0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.l(hVar2);
        }
        o oVar = new o(1);
        w3.i iVar = w3.i.f3631g;
        w3.h hVar3 = (w3.h) hVar.j(iVar, oVar);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.j(iVar, new o(2));
        }
        return hVar3.l((w3.h) obj);
    }

    public static final String e(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final f f(w3.c cVar) {
        f fVar;
        f fVar2;
        if (!(cVar instanceof t4.g)) {
            return new f(1, cVar);
        }
        t4.g gVar = (t4.g) cVar;
        androidx.emoji2.text.r rVar = t4.b.f3404c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t4.g.f3414n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            fVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, rVar);
                fVar2 = null;
                break;
            }
            if (obj instanceof f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, rVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                fVar2 = (f) obj;
                break loop0;
            }
            if (obj != rVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (fVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f.f2795m;
            Object obj2 = atomicReferenceFieldUpdater2.get(fVar2);
            if (!(obj2 instanceof m) || ((m) obj2).f2818d == null) {
                f.f2794l.set(fVar2, 536870911);
                atomicReferenceFieldUpdater2.set(fVar2, b.f2786a);
                fVar = fVar2;
            } else {
                fVar2.m();
            }
            if (fVar != null) {
                return fVar;
            }
        }
        return new f(2, cVar);
    }

    public static final void g(Throwable th, w3.h hVar) {
        if (th instanceof b0) {
            th = ((b0) th).f2787g;
        }
        try {
            p4.b bVar = (p4.b) hVar.d(s.f2829g);
            if (bVar != null) {
                bVar.f(th);
            } else {
                t4.b.d(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a.a.d(runtimeException, th);
                th = runtimeException;
            }
            t4.b.d(th, hVar);
        }
    }

    public static final f0 h(r0 r0Var, boolean z4, v0 v0Var) {
        return r0Var instanceof z0 ? ((z0) r0Var).E(z4, v0Var) : r0Var.e(v0Var.k(), z4, new u0(1, v0Var, v0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static z i(t tVar, f4.p pVar) {
        u uVar = u.f2832g;
        w3.h j2 = j(tVar, w3.i.f3631g);
        u uVar2 = u.f2832g;
        z zVar = new z(j2, true, 1 == true ? 1 : 0);
        zVar.U(uVar, zVar, pVar);
        return zVar;
    }

    public static final w3.h j(t tVar, w3.h hVar) {
        w3.h d5 = d(tVar.k(), hVar, true);
        v4.e eVar = e0.f2793a;
        return (d5 == eVar || d5.d(w3.d.f3630g) != null) ? d5 : d5.l(eVar);
    }

    public static final Object k(Object obj) {
        return obj instanceof n ? b3.g.g(((n) obj).f2822a) : obj;
    }

    public static final void l(f fVar, w3.c cVar, boolean z4) {
        Object obj = f.f2795m.get(fVar);
        Throwable d5 = fVar.d(obj);
        Object g5 = d5 != null ? b3.g.g(d5) : fVar.e(obj);
        if (!z4) {
            cVar.resumeWith(g5);
            return;
        }
        g4.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        t4.g gVar = (t4.g) cVar;
        y3.c cVar2 = gVar.f3416k;
        Object obj2 = gVar.f3418m;
        w3.h context = cVar2.getContext();
        Object m5 = t4.b.m(context, obj2);
        i1 o2 = m5 != t4.b.f3405d ? o(cVar2, context, m5) : null;
        try {
            cVar2.resumeWith(g5);
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

    public static final String m(w3.c cVar) {
        Object g5;
        if (cVar instanceof t4.g) {
            return ((t4.g) cVar).toString();
        }
        try {
            g5 = cVar + '@' + e(cVar);
        } catch (Throwable th) {
            g5 = b3.g.g(th);
        }
        if (t3.e.a(g5) != null) {
            g5 = cVar.getClass().getName() + '@' + e(cVar);
        }
        return (String) g5;
    }

    public static final Object n(Object obj) {
        o0 o0Var;
        p0 p0Var = obj instanceof p0 ? (p0) obj : null;
        return (p0Var == null || (o0Var = p0Var.f2825a) == null) ? obj : o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [y3.c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [y3.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [y3.d] */
    public static final i1 o(y3.c cVar, w3.h hVar, Object obj) {
        i1 i1Var = null;
        if (cVar != 0 && hVar.d(j1.f2811g) != null) {
            while (true) {
                if ((cVar instanceof c0) || (cVar = cVar.getCallerFrame()) == 0) {
                    break;
                }
                if (cVar instanceof i1) {
                    i1Var = (i1) cVar;
                    break;
                }
            }
            if (i1Var != null) {
                i1Var.Y(hVar, obj);
            }
        }
        return i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object p(f4.p pVar, w3.h hVar, y3.c cVar) {
        Object n5;
        w3.h context = cVar.getContext();
        w3.h l5 = !((Boolean) hVar.j(Boolean.FALSE, new o(0))).booleanValue() ? context.l(hVar) : d(context, hVar, false);
        c(l5);
        if (l5 == context) {
            t4.r rVar = new t4.r(l5, cVar);
            n5 = a.a.y(rVar, rVar, pVar);
        } else {
            w3.d dVar = w3.d.f3630g;
            if (g4.i.a(l5.d(dVar), context.d(dVar))) {
                i1 i1Var = new i1(l5, cVar);
                w3.h hVar2 = i1Var.f2785i;
                Object m5 = t4.b.m(hVar2, null);
                try {
                    n5 = a.a.y(i1Var, i1Var, pVar);
                } finally {
                    t4.b.g(hVar2, m5);
                }
            } else {
                c0 c0Var = new c0(l5, cVar);
                try {
                    t4.b.h(t3.h.f3400a, a.a.o(((y3.a) pVar).create(c0Var, c0Var)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0.f2789k;
                    while (true) {
                        int i5 = atomicIntegerFieldUpdater.get(c0Var);
                        if (i5 != 0) {
                            if (i5 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            n5 = n(z0.f2855g.get(c0Var));
                            if (n5 instanceof n) {
                                throw ((n) n5).f2822a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c0Var, 0, 1)) {
                            n5 = x3.a.f3712g;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof b0) {
                        th = ((b0) th).f2787g;
                    }
                    c0Var.resumeWith(b3.g.g(th));
                    throw th;
                }
            }
        }
        x3.a aVar = x3.a.f3712g;
        return n5;
    }
}
