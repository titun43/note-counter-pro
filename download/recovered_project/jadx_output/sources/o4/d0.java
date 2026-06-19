package o4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class d0 extends v4.i {

    /* renamed from: i, reason: collision with root package name */
    public int f2791i;

    public d0(int i5) {
        super(0L, false);
        this.f2791i = i5;
    }

    public abstract w3.c c();

    public Throwable d(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            return nVar.f2822a;
        }
        return null;
    }

    public final void g(Throwable th) {
        w.g(new v("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r4 = (o4.r0) r5.d(o4.s.h);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            w3.c c5 = c();
            g4.i.c(c5, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            t4.g gVar = (t4.g) c5;
            y3.c cVar = gVar.f3416k;
            Object obj = gVar.f3418m;
            w3.h context = cVar.getContext();
            Object m5 = t4.b.m(context, obj);
            r0 r0Var = null;
            i1 o2 = m5 != t4.b.f3405d ? w.o(cVar, context, m5) : null;
            try {
                w3.h context2 = cVar.getContext();
                Object h = h();
                Throwable d5 = d(h);
                if (d5 == null) {
                    int i5 = this.f2791i;
                    boolean z4 = true;
                    if (i5 != 1 && i5 != 2) {
                        z4 = false;
                    }
                }
                if (r0Var != null && !r0Var.a()) {
                    CancellationException g5 = r0Var.g();
                    b(g5);
                    cVar.resumeWith(b3.g.g(g5));
                } else if (d5 != null) {
                    cVar.resumeWith(b3.g.g(d5));
                } else {
                    cVar.resumeWith(e(h));
                }
                if (o2 == null || o2.W()) {
                    t4.b.g(context, m5);
                }
            } catch (Throwable th) {
                if (o2 == null || o2.W()) {
                    t4.b.g(context, m5);
                }
                throw th;
            }
        } catch (b0 e4) {
            w.g(e4.f2787g, c().getContext());
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
