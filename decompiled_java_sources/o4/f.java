package o4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class f extends d0 implements d, y3.d, k1 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2794l = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decisionAndIndex$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2795m = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2796n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final w3.c f2797j;

    /* renamed from: k, reason: collision with root package name */
    public final w3.h f2798k;

    public f(int i5, w3.c cVar) {
        super(i5);
        this.f2797j = cVar;
        this.f2798k = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f2786a;
    }

    public static Object A(d1 d1Var, Object obj, int i5, f4.q qVar) {
        if (obj instanceof n) {
            return obj;
        }
        if (i5 != 1 && i5 != 2) {
            return obj;
        }
        if (qVar != null || (d1Var instanceof g0)) {
            return new m(obj, d1Var instanceof g0 ? (g0) d1Var : null, qVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void v(d1 d1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + d1Var + ", already has " + obj).toString());
    }

    @Override // o4.k1
    public final void a(t4.s sVar, int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f2794l;
            i6 = atomicIntegerFieldUpdater.get(this);
            if ((i6 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, ((i6 >> 29) << 29) + i5));
        t(sVar);
    }

    @Override // o4.d0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof n) {
                return;
            }
            if (!(obj instanceof m)) {
                cancellationException2 = cancellationException;
                m mVar = new m(obj, (g0) null, (f4.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            m mVar2 = (m) obj;
            if (mVar2.f2819e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            m a5 = m.a(mVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            g0 g0Var = mVar2.f2816b;
            if (g0Var != null) {
                i(g0Var);
            }
            f4.q qVar = mVar2.f2817c;
            if (qVar != null) {
                j(qVar, cancellationException, mVar2.f2815a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // o4.d0
    public final w3.c c() {
        return this.f2797j;
    }

    @Override // o4.d0
    public final Throwable d(Object obj) {
        Throwable d5 = super.d(obj);
        if (d5 != null) {
            return d5;
        }
        return null;
    }

    @Override // o4.d0
    public final Object e(Object obj) {
        return obj instanceof m ? ((m) obj).f2815a : obj;
    }

    @Override // o4.d
    public final androidx.emoji2.text.r f(Object obj, f4.q qVar) {
        androidx.emoji2.text.r rVar = w.f2835a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof d1)) {
                return null;
            }
            Object A = A((d1) obj2, obj, this.f2791i, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!u()) {
                m();
            }
            return rVar;
        }
    }

    @Override // y3.d
    public final y3.d getCallerFrame() {
        w3.c cVar = this.f2797j;
        if (cVar instanceof y3.d) {
            return (y3.d) cVar;
        }
        return null;
    }

    @Override // w3.c
    public final w3.h getContext() {
        return this.f2798k;
    }

    @Override // o4.d0
    public final Object h() {
        return f2795m.get(this);
    }

    public final void i(g0 g0Var) {
        try {
            g0Var.f2800a.d();
        } catch (Throwable th) {
            w.g(new androidx.fragment.app.x("Exception in invokeOnCancellation handler for " + this, th), this.f2798k);
        }
    }

    public final void j(f4.q qVar, Throwable th, Object obj) {
        w3.h hVar = this.f2798k;
        try {
            qVar.invoke(th, obj, hVar);
        } catch (Throwable th2) {
            w.g(new androidx.fragment.app.x("Exception in resume onCancellation handler for " + this, th2), hVar);
        }
    }

    public final void k(t4.s sVar, Throwable th) {
        w3.h hVar = this.f2798k;
        int i5 = f2794l.get(this) & 536870911;
        if (i5 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i5, hVar);
        } catch (Throwable th2) {
            w.g(new androidx.fragment.app.x("Exception in invokeOnCancellation handler for " + this, th2), hVar);
        }
    }

    public final void l(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d1) {
                boolean z4 = (obj instanceof g0) || (obj instanceof t4.s);
                if (th == null) {
                    th2 = new CancellationException("Continuation " + this + " was cancelled normally");
                } else {
                    th2 = th;
                }
                g gVar = new g(z4, th2);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                d1 d1Var = (d1) obj;
                if (d1Var instanceof g0) {
                    i((g0) obj);
                } else if (d1Var instanceof t4.s) {
                    k((t4.s) obj, th);
                }
                if (!u()) {
                    m();
                }
                n(this.f2791i);
                return;
            }
            return;
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2796n;
        f0 f0Var = (f0) atomicReferenceFieldUpdater.get(this);
        if (f0Var == null) {
            return;
        }
        f0Var.d();
        atomicReferenceFieldUpdater.set(this, c1.f2790a);
    }

    public final void n(int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f2794l;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i7 = i6 >> 29;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i5 == 4;
                w3.c cVar = this.f2797j;
                if (!z4 && (cVar instanceof t4.g)) {
                    boolean z5 = i5 == 1 || i5 == 2;
                    int i8 = this.f2791i;
                    if (z5 == (i8 == 1 || i8 == 2)) {
                        t4.g gVar = (t4.g) cVar;
                        r rVar = gVar.f3415j;
                        w3.h context = gVar.f3416k.getContext();
                        try {
                            if (rVar.k(context)) {
                                t4.b.i(rVar, context, this);
                                return;
                            }
                            k0 a5 = g1.a();
                            if (a5.f2812i >= 4294967296L) {
                                u3.e eVar = a5.f2814k;
                                if (eVar == null) {
                                    eVar = new u3.e();
                                    a5.f2814k = eVar;
                                }
                                eVar.addLast(this);
                                return;
                            }
                            a5.q(true);
                            try {
                                w.l(this, cVar, true);
                                do {
                                } while (a5.r());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            throw new b0(th, rVar, context);
                        }
                    }
                }
                w.l(this, cVar, z4);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 1073741824 + (536870911 & i6)));
    }

    @Override // o4.d
    public final void o(Object obj) {
        n(this.f2791i);
    }

    public Throwable p(z0 z0Var) {
        return z0Var.g();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        r0 r0Var;
        boolean u4 = u();
        do {
            atomicIntegerFieldUpdater = f2794l;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (u4) {
                    x();
                }
                Object obj = f2795m.get(this);
                if (obj instanceof n) {
                    throw ((n) obj).f2822a;
                }
                int i7 = this.f2791i;
                if ((i7 != 1 && i7 != 2) || (r0Var = (r0) this.f2798k.d(s.h)) == null || r0Var.a()) {
                    return e(obj);
                }
                CancellationException g5 = r0Var.g();
                b(g5);
                throw g5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 536870912 + (536870911 & i5)));
        if (((f0) f2796n.get(this)) == null) {
            s();
        }
        if (u4) {
            x();
        }
        return x3.a.f3712g;
    }

    public final void r() {
        f0 s5 = s();
        if (s5 == null || (f2795m.get(this) instanceof d1)) {
            return;
        }
        s5.d();
        f2796n.set(this, c1.f2790a);
    }

    @Override // w3.c
    public final void resumeWith(Object obj) {
        Throwable a5 = t3.e.a(obj);
        if (a5 != null) {
            obj = new n(false, a5);
        }
        z(obj, this.f2791i, null);
    }

    public final f0 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = (r0) this.f2798k.d(s.h);
        if (r0Var == null) {
            return null;
        }
        f0 h = w.h(r0Var, true, new h(this, 0));
        do {
            atomicReferenceFieldUpdater = f2796n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, h)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        v(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(d1 d1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof g0) || (obj instanceof t4.s)) {
                break;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (!n.f2821b.compareAndSet(nVar, 0, 1)) {
                    v(d1Var, obj);
                    throw null;
                }
                if (obj instanceof g) {
                    Throwable th = nVar.f2822a;
                    if (d1Var instanceof g0) {
                        i((g0) d1Var);
                        return;
                    } else {
                        k((t4.s) d1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof m)) {
                if (d1Var instanceof t4.s) {
                    return;
                }
                m mVar = new m(obj, (g0) d1Var, (f4.q) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            m mVar2 = (m) obj;
            if (mVar2.f2816b != null) {
                v(d1Var, obj);
                throw null;
            }
            if (d1Var instanceof t4.s) {
                return;
            }
            g0 g0Var = (g0) d1Var;
            if (mVar2.f2819e != null) {
                i(g0Var);
                return;
            }
            m a5 = m.a(mVar2, g0Var, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w());
        sb.append('(');
        sb.append(w.m(this.f2797j));
        sb.append("){");
        Object obj = f2795m.get(this);
        sb.append(obj instanceof d1 ? "Active" : obj instanceof g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(w.e(this));
        return sb.toString();
    }

    public final boolean u() {
        if (this.f2791i != 2) {
            return false;
        }
        w3.c cVar = this.f2797j;
        g4.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return t4.g.f3414n.get((t4.g) cVar) != null;
    }

    public String w() {
        return "CancellableContinuation";
    }

    public final void x() {
        w3.c cVar = this.f2797j;
        Throwable th = null;
        t4.g gVar = cVar instanceof t4.g ? (t4.g) cVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t4.g.f3414n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                androidx.emoji2.text.r rVar = t4.b.f3404c;
                if (obj == rVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, rVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != rVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m();
            l(th);
        }
    }

    public final void y(Object obj, f4.q qVar) {
        z(obj, this.f2791i, qVar);
    }

    public final void z(Object obj, int i5, f4.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d1) {
                Object A = A((d1) obj2, obj, i5, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!u()) {
                    m();
                }
                n(i5);
                return;
            }
            if (obj2 instanceof g) {
                g gVar = (g) obj2;
                if (g.f2799c.compareAndSet(gVar, 0, 1)) {
                    if (qVar != null) {
                        j(qVar, gVar.f2822a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
