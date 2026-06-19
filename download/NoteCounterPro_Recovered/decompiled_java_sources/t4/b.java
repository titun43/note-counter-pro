package t4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.b0;
import o4.f1;
import o4.g1;
import o4.i1;
import o4.k0;
import o4.r0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3402a = new androidx.emoji2.text.r("CLOSED", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3403b = new androidx.emoji2.text.r("UNDEFINED", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3404c = new androidx.emoji2.text.r("REUSABLE_CLAIMED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3405d = new androidx.emoji2.text.r("NO_THREAD_ELEMENTS", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final o4.o f3406e = new o4.o(4);

    /* renamed from: f, reason: collision with root package name */
    public static final o4.o f3407f = new o4.o(5);

    /* renamed from: g, reason: collision with root package name */
    public static final o4.o f3408g = new o4.o(6);

    public static final void a(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(androidx.emoji2.text.u.h(i5, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(s sVar, long j2, f4.p pVar) {
        while (true) {
            if (sVar.f3442c >= j2 && !sVar.c()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3409a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            androidx.emoji2.text.r rVar = f3402a;
            if (obj == rVar) {
                return rVar;
            }
            s sVar2 = (s) ((c) obj);
            if (sVar2 == null) {
                sVar2 = (s) pVar.invoke(Long.valueOf(sVar.f3442c + 1), sVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(sVar) != null) {
                        break;
                    }
                }
                if (sVar.c()) {
                    sVar.d();
                }
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f3402a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, w3.h hVar) {
        Throwable runtimeException;
        Iterator it = e.f3412a.iterator();
        while (it.hasNext()) {
            try {
                ((p4.b) it.next()).f(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a.a.d(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            a.a.d(th, new f(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f3402a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(w3.h hVar, Object obj) {
        if (obj == f3405d) {
            return;
        }
        if (!(obj instanceof w)) {
            Object j2 = hVar.j(null, f3407f);
            g4.i.c(j2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            androidx.emoji2.text.u.p(j2);
            throw null;
        }
        w wVar = (w) obj;
        f1[] f1VarArr = wVar.f3447b;
        int length = f1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        f1 f1Var = f1VarArr[length];
        g4.i.b(null);
        Object obj2 = wVar.f3446a[length];
        throw null;
    }

    public static final void h(Object obj, w3.c cVar) {
        if (!(cVar instanceof g)) {
            cVar.resumeWith(obj);
            return;
        }
        g gVar = (g) cVar;
        o4.r rVar = gVar.f3415j;
        y3.c cVar2 = gVar.f3416k;
        Throwable a5 = t3.e.a(obj);
        Object nVar = a5 == null ? obj : new o4.n(false, a5);
        w3.h context = cVar2.getContext();
        try {
            if (rVar.k(context)) {
                gVar.f3417l = nVar;
                gVar.f2791i = 1;
                i(rVar, cVar2.getContext(), gVar);
                return;
            }
            k0 a6 = g1.a();
            if (a6.f2812i >= 4294967296L) {
                gVar.f3417l = nVar;
                gVar.f2791i = 1;
                u3.e eVar = a6.f2814k;
                if (eVar == null) {
                    eVar = new u3.e();
                    a6.f2814k = eVar;
                }
                eVar.addLast(gVar);
                return;
            }
            a6.q(true);
            try {
                r0 r0Var = (r0) cVar2.getContext().d(o4.s.h);
                if (r0Var == null || r0Var.a()) {
                    Object obj2 = gVar.f3418m;
                    w3.h context2 = cVar2.getContext();
                    Object m5 = m(context2, obj2);
                    i1 o2 = m5 != f3405d ? o4.w.o(cVar2, context2, m5) : null;
                    try {
                        cVar2.resumeWith(obj);
                    } finally {
                        if (o2 == null || o2.W()) {
                            g(context2, m5);
                        }
                    }
                } else {
                    gVar.resumeWith(b3.g.g(r0Var.g()));
                }
                while (a6.r()) {
                }
            } finally {
                try {
                } finally {
                }
            }
        } catch (Throwable th) {
            throw new b0(th, rVar, context);
        }
    }

    public static final void i(o4.r rVar, w3.h hVar, Runnable runnable) {
        try {
            rVar.f(hVar, runnable);
        } catch (Throwable th) {
            throw new b0(th, rVar, hVar);
        }
    }

    public static final long j(String str, long j2, long j5, long j6) {
        String str2;
        int i5 = u.f3444a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        Long a02 = n4.i.a0(str2);
        if (a02 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = a02.longValue();
        if (j5 <= longValue && longValue <= j6) {
            return longValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j5);
        androidx.emoji2.text.u.t(sb, "..", j6, ", but is '");
        sb.append(longValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int k(String str, int i5, int i6) {
        return (int) j(str, i5, 1, (i6 & 8) != 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2097150);
    }

    public static final Object l(w3.h hVar) {
        Object j2 = hVar.j(0, f3406e);
        g4.i.b(j2);
        return j2;
    }

    public static final Object m(w3.h hVar, Object obj) {
        if (obj == null) {
            obj = l(hVar);
        }
        if (obj == 0) {
            return f3405d;
        }
        if (obj instanceof Integer) {
            return hVar.j(new w(((Number) obj).intValue(), hVar), f3408g);
        }
        androidx.emoji2.text.u.p(obj);
        throw null;
    }
}
