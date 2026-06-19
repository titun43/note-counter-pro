package o4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class z0 implements r0, e1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2855g = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public z0(boolean z4) {
        this._state$volatile = z4 ? w.f2842i : w.h;
    }

    public static j I(t4.k kVar) {
        while (kVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t4.k.f3427b;
            t4.k f5 = kVar.f();
            if (f5 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (t4.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = f5;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof j) {
                    return (j) kVar;
                }
                if (kVar instanceof a1) {
                    return null;
                }
            }
        }
    }

    public static String P(Object obj) {
        if (!(obj instanceof y0)) {
            return obj instanceof o0 ? ((o0) obj).a() ? "Active" : "New" : obj instanceof n ? "Cancelled" : "Completed";
        }
        y0 y0Var = (y0) obj;
        return y0Var.e() ? "Cancelling" : y0.f2850b.get(y0Var) == 1 ? "Completing" : "Active";
    }

    public final a1 A(o0 o0Var) {
        a1 c5 = o0Var.c();
        if (c5 != null) {
            return c5;
        }
        if (o0Var instanceof h0) {
            return new a1();
        }
        if (o0Var instanceof v0) {
            N((v0) o0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o0Var).toString());
    }

    public boolean B(Throwable th) {
        return false;
    }

    public final void D(r0 r0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        c1 c1Var = c1.f2790a;
        if (r0Var == null) {
            atomicReferenceFieldUpdater.set(this, c1Var);
            return;
        }
        r0Var.start();
        i n5 = r0Var.n(this);
        atomicReferenceFieldUpdater.set(this, n5);
        if (f2855g.get(this) instanceof o0) {
            return;
        }
        n5.d();
        atomicReferenceFieldUpdater.set(this, c1Var);
    }

    public final f0 E(boolean z4, v0 v0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c1 c1Var;
        boolean z5;
        boolean e4;
        v0Var.f2834d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f2855g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj instanceof h0;
            c1Var = c1.f2790a;
            z5 = true;
            if (!z6) {
                if (!(obj instanceof o0)) {
                    z5 = false;
                    break;
                }
                o0 o0Var = (o0) obj;
                a1 c5 = o0Var.c();
                if (c5 == null) {
                    N((v0) obj);
                } else {
                    if (v0Var.k()) {
                        y0 y0Var = o0Var instanceof y0 ? (y0) o0Var : null;
                        Throwable d5 = y0Var != null ? y0Var.d() : null;
                        if (d5 == null) {
                            e4 = c5.e(v0Var, 5);
                        } else if (z4) {
                            v0Var.l(d5);
                            return c1Var;
                        }
                    } else {
                        e4 = c5.e(v0Var, 1);
                    }
                    if (e4) {
                        break;
                    }
                }
            } else {
                h0 h0Var = (h0) obj;
                if (h0Var.f2804a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                M(h0Var);
            }
        }
        if (z5) {
            return v0Var;
        }
        if (z4) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            n nVar = obj2 instanceof n ? (n) obj2 : null;
            v0Var.l(nVar != null ? nVar.f2822a : null);
        }
        return c1Var;
    }

    public boolean F() {
        return false;
    }

    public final boolean G(Object obj) {
        Object Q;
        do {
            Q = Q(f2855g.get(this), obj);
            if (Q == w.f2837c) {
                return false;
            }
            if (Q == w.f2838d) {
                return true;
            }
        } while (Q == w.f2839e);
        p(Q);
        return true;
    }

    public final Object H(Object obj) {
        Object Q;
        do {
            Q = Q(f2855g.get(this), obj);
            if (Q == w.f2837c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                n nVar = obj instanceof n ? (n) obj : null;
                throw new IllegalStateException(str, nVar != null ? nVar.f2822a : null);
            }
        } while (Q == w.f2839e);
        return Q;
    }

    public final void J(a1 a1Var, Throwable th) {
        a1Var.e(new t4.i(4), 4);
        Object obj = t4.k.f3426a.get(a1Var);
        g4.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        androidx.fragment.app.x xVar = null;
        for (t4.k kVar = (t4.k) obj; !kVar.equals(a1Var); kVar = kVar.h()) {
            if ((kVar instanceof v0) && ((v0) kVar).k()) {
                try {
                    ((v0) kVar).l(th);
                } catch (Throwable th2) {
                    if (xVar != null) {
                        a.a.d(xVar, th2);
                    } else {
                        xVar = new androidx.fragment.app.x("Exception in completion handler " + kVar + " for " + this, th2);
                    }
                }
            }
        }
        if (xVar != null) {
            C(xVar);
        }
        t(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [o4.n0] */
    public final void M(h0 h0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = new a1();
        if (!h0Var.f2804a) {
            a1Var = new n0(a1Var);
        }
        do {
            atomicReferenceFieldUpdater = f2855g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, h0Var, a1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == h0Var);
    }

    public final void N(v0 v0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = new a1();
        v0Var.getClass();
        t4.k.f3427b.set(a1Var, v0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t4.k.f3426a;
        atomicReferenceFieldUpdater2.set(a1Var, v0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(v0Var) == v0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(v0Var, v0Var, a1Var)) {
                    if (atomicReferenceFieldUpdater2.get(v0Var) != v0Var) {
                        break;
                    }
                }
                a1Var.g(v0Var);
                break loop0;
            }
            break;
        }
        t4.k h5 = v0Var.h();
        do {
            atomicReferenceFieldUpdater = f2855g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, v0Var, h5)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == v0Var);
    }

    public final int O(Object obj) {
        boolean z4 = obj instanceof h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2855g;
        if (z4) {
            if (((h0) obj).f2804a) {
                return 0;
            }
            h0 h0Var = w.f2842i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof n0)) {
            return 0;
        }
        a1 a1Var = ((n0) obj).f2823a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object Q(Object obj, Object obj2) {
        if (!(obj instanceof o0)) {
            return w.f2837c;
        }
        if (((obj instanceof h0) || (obj instanceof v0)) && !(obj instanceof j) && !(obj2 instanceof n)) {
            o0 o0Var = (o0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2855g;
            Object p0Var = obj2 instanceof o0 ? new p0((o0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, o0Var, p0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != o0Var) {
                    return w.f2839e;
                }
            }
            K(obj2);
            v(o0Var, obj2);
            return obj2;
        }
        o0 o0Var2 = (o0) obj;
        a1 A = A(o0Var2);
        if (A == null) {
            return w.f2839e;
        }
        y0 y0Var = o0Var2 instanceof y0 ? (y0) o0Var2 : null;
        if (y0Var == null) {
            y0Var = new y0(A, null);
        }
        synchronized (y0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y0.f2850b;
            if (atomicIntegerFieldUpdater.get(y0Var) == 1) {
                return w.f2837c;
            }
            atomicIntegerFieldUpdater.set(y0Var, 1);
            if (y0Var != o0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2855g;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, o0Var2, y0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != o0Var2) {
                        return w.f2839e;
                    }
                }
            }
            boolean e4 = y0Var.e();
            n nVar = obj2 instanceof n ? (n) obj2 : null;
            if (nVar != null) {
                y0Var.b(nVar.f2822a);
            }
            Throwable d5 = e4 ? null : y0Var.d();
            if (d5 != null) {
                J(A, d5);
            }
            j I = I(A);
            if (I != null && R(y0Var, I, obj2)) {
                return w.f2838d;
            }
            A.e(new t4.i(2), 2);
            j I2 = I(A);
            return (I2 == null || !R(y0Var, I2, obj2)) ? x(y0Var, obj2) : w.f2838d;
        }
    }

    public final boolean R(y0 y0Var, j jVar, Object obj) {
        while (w.h(jVar.f2807e, false, new x0(this, y0Var, jVar, obj)) == c1.f2790a) {
            jVar = I(jVar);
            if (jVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o4.r0
    public boolean a() {
        Object obj = f2855g.get(this);
        return (obj instanceof o0) && ((o0) obj).a();
    }

    @Override // o4.r0
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new s0(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // w3.h
    public final w3.f d(w3.g gVar) {
        g4.i.e(gVar, "key");
        if (g4.i.a(s.h, gVar)) {
            return this;
        }
        return null;
    }

    @Override // o4.r0
    public final f0 e(boolean z4, boolean z5, u0 u0Var) {
        return E(z5, z4 ? new q0(u0Var) : new h(u0Var, 1));
    }

    @Override // o4.r0
    public final CancellationException g() {
        CancellationException cancellationException;
        Object obj = f2855g.get(this);
        if (!(obj instanceof y0)) {
            if (obj instanceof o0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof n)) {
                return new s0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((n) obj).f2822a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new s0(u(), th, this) : cancellationException;
        }
        Throwable d5 = ((y0) obj).d();
        if (d5 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d5 instanceof CancellationException ? (CancellationException) d5 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = u();
        }
        return new s0(concat, d5, this);
    }

    @Override // w3.f
    public final w3.g getKey() {
        return s.h;
    }

    @Override // o4.r0
    public final f0 h(f4.l lVar) {
        return E(true, new h(lVar, 1));
    }

    @Override // w3.h
    public final w3.h i(w3.g gVar) {
        return z2.b.r(this, gVar);
    }

    @Override // o4.r0
    public final boolean isCancelled() {
        Object obj = f2855g.get(this);
        if (obj instanceof n) {
            return true;
        }
        return (obj instanceof y0) && ((y0) obj).e();
    }

    @Override // w3.h
    public final Object j(Object obj, f4.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // w3.h
    public final w3.h l(w3.h hVar) {
        g4.i.e(hVar, "context");
        return hVar == w3.i.f3631g ? this : (w3.h) hVar.j(this, new o(8));
    }

    @Override // o4.r0
    public final i n(z0 z0Var) {
        j jVar = new j(z0Var);
        jVar.f2834d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2855g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (h0Var.f2804a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                M(h0Var);
            } else {
                boolean z4 = obj instanceof o0;
                c1 c1Var = c1.f2790a;
                if (!z4) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    n nVar = obj2 instanceof n ? (n) obj2 : null;
                    jVar.l(nVar != null ? nVar.f2822a : null);
                    return c1Var;
                }
                a1 c5 = ((o0) obj).c();
                if (c5 == null) {
                    N((v0) obj);
                } else if (!c5.e(jVar, 7)) {
                    boolean e4 = c5.e(jVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof y0) {
                        r4 = ((y0) obj3).d();
                    } else {
                        n nVar2 = obj3 instanceof n ? (n) obj3 : null;
                        if (nVar2 != null) {
                            r4 = nVar2.f2822a;
                        }
                    }
                    jVar.l(r4);
                    if (e4) {
                        break loop0;
                    }
                    return c1Var;
                }
            }
        }
        return jVar;
    }

    public void q(Object obj) {
        p(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == o4.w.f2838d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Object obj) {
        androidx.emoji2.text.r rVar;
        Object obj2 = w.f2837c;
        if (z()) {
            do {
                Object obj3 = f2855g.get(this);
                if (obj3 instanceof o0) {
                    if (obj3 instanceof y0) {
                        if (y0.f2850b.get((y0) obj3) == 1) {
                        }
                    }
                    obj2 = Q(obj3, new n(false, w(obj)));
                }
                obj2 = w.f2837c;
                break;
            } while (obj2 == w.f2839e);
        }
        if (obj2 == w.f2837c) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2855g;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof y0)) {
                    if (!(obj4 instanceof o0)) {
                        rVar = w.f2840f;
                        break;
                    }
                    if (th == null) {
                        th = w(obj);
                    }
                    o0 o0Var = (o0) obj4;
                    if (o0Var.a()) {
                        a1 A = A(o0Var);
                        if (A != null) {
                            y0 y0Var = new y0(A, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, o0Var, y0Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != o0Var) {
                                    break;
                                }
                            }
                            J(A, th);
                            rVar = w.f2837c;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object Q = Q(obj4, new n(false, th));
                        if (Q == w.f2837c) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (Q != w.f2839e) {
                            obj2 = Q;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (y0.f2852d.get((y0) obj4) == w.f2841g) {
                            rVar = w.f2840f;
                        } else {
                            boolean e4 = ((y0) obj4).e();
                            if (th == null) {
                                th = w(obj);
                            }
                            ((y0) obj4).b(th);
                            Throwable d5 = e4 ? null : ((y0) obj4).d();
                            if (d5 != null) {
                                J(((y0) obj4).f2853a, d5);
                            }
                            rVar = w.f2837c;
                        }
                    }
                }
            }
            obj2 = rVar;
        }
        if (obj2 != w.f2837c && obj2 != w.f2838d) {
            if (obj2 == w.f2840f) {
                return false;
            }
            p(obj2);
            return true;
        }
        return true;
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    @Override // o4.r0
    public final boolean start() {
        int O;
        do {
            O = O(f2855g.get(this));
            if (O == 0) {
                return false;
            }
        } while (O != 1);
        return true;
    }

    public final boolean t(Throwable th) {
        if (F()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        i iVar = (i) h.get(this);
        return (iVar == null || iVar == c1.f2790a) ? z4 : iVar.b(th) || z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + P(f2855g.get(this)) + '}');
        sb.append('@');
        sb.append(w.e(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public final void v(o0 o0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        if (iVar != null) {
            iVar.d();
            atomicReferenceFieldUpdater.set(this, c1.f2790a);
        }
        androidx.fragment.app.x xVar = null;
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th = nVar != null ? nVar.f2822a : null;
        if (o0Var instanceof v0) {
            try {
                ((v0) o0Var).l(th);
                return;
            } catch (Throwable th2) {
                C(new androidx.fragment.app.x("Exception in completion handler " + o0Var + " for " + this, th2));
                return;
            }
        }
        a1 c5 = o0Var.c();
        if (c5 != null) {
            c5.e(new t4.i(1), 1);
            Object obj2 = t4.k.f3426a.get(c5);
            g4.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (t4.k kVar = (t4.k) obj2; !kVar.equals(c5); kVar = kVar.h()) {
                if (kVar instanceof v0) {
                    try {
                        ((v0) kVar).l(th);
                    } catch (Throwable th3) {
                        if (xVar != null) {
                            a.a.d(xVar, th3);
                        } else {
                            xVar = new androidx.fragment.app.x("Exception in completion handler " + kVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (xVar != null) {
                C(xVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        z0 z0Var = (z0) ((e1) obj);
        Object obj2 = f2855g.get(z0Var);
        if (obj2 instanceof y0) {
            cancellationException = ((y0) obj2).d();
        } else if (obj2 instanceof n) {
            cancellationException = ((n) obj2).f2822a;
        } else {
            if (obj2 instanceof o0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new s0("Parent job is ".concat(P(obj2)), cancellationException, z0Var) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(y0 y0Var, Object obj) {
        Throwable th = null;
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th2 = nVar != null ? nVar.f2822a : null;
        synchronized (y0Var) {
            y0Var.e();
            ArrayList f5 = y0Var.f(th2);
            if (!f5.isEmpty()) {
                int size = f5.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    Object obj2 = f5.get(i5);
                    i5++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) f5.get(0);
                }
            } else if (y0Var.e()) {
                th = new s0(u(), null, this);
            }
            if (th != null && f5.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f5.size()));
                int size2 = f5.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj3 = f5.get(i6);
                    i6++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        a.a.d(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new n(false, th);
        }
        if (th != null && (t(th) || B(th))) {
            g4.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            n.f2821b.compareAndSet((n) obj, 0, 1);
        }
        K(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2855g;
        Object p0Var = obj instanceof o0 ? new p0((o0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, y0Var, p0Var) && atomicReferenceFieldUpdater.get(this) == y0Var) {
        }
        v(y0Var, obj);
        return obj;
    }

    public boolean y() {
        return true;
    }

    public boolean z() {
        return this instanceof l;
    }

    public void L() {
    }

    public void C(androidx.fragment.app.x xVar) {
        throw xVar;
    }

    public void K(Object obj) {
    }

    public void p(Object obj) {
    }
}
