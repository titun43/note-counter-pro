package t4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.b0;
import o4.d0;
import o4.g1;
import o4.k0;

/* loaded from: classes.dex */
public final class g extends d0 implements y3.d, w3.c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3414n = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final o4.r f3415j;

    /* renamed from: k, reason: collision with root package name */
    public final y3.c f3416k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3417l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f3418m;

    public g(o4.r rVar, y3.c cVar) {
        super(-1);
        this.f3415j = rVar;
        this.f3416k = cVar;
        this.f3417l = b.f3403b;
        this.f3418m = b.l(cVar.getContext());
    }

    @Override // y3.d
    public final y3.d getCallerFrame() {
        return this.f3416k;
    }

    @Override // w3.c
    public final w3.h getContext() {
        return this.f3416k.getContext();
    }

    @Override // o4.d0
    public final Object h() {
        Object obj = this.f3417l;
        this.f3417l = b.f3403b;
        return obj;
    }

    @Override // w3.c
    public final void resumeWith(Object obj) {
        w3.h context;
        Object m5;
        Throwable a5 = t3.e.a(obj);
        Object nVar = a5 == null ? obj : new o4.n(false, a5);
        o4.r rVar = this.f3415j;
        y3.c cVar = this.f3416k;
        w3.h context2 = cVar.getContext();
        try {
            if (rVar.k(context2)) {
                this.f3417l = nVar;
                this.f2791i = 0;
                b.i(rVar, cVar.getContext(), this);
                return;
            }
            k0 a6 = g1.a();
            if (a6.f2812i >= 4294967296L) {
                this.f3417l = nVar;
                this.f2791i = 0;
                u3.e eVar = a6.f2814k;
                if (eVar == null) {
                    eVar = new u3.e();
                    a6.f2814k = eVar;
                }
                eVar.addLast(this);
                return;
            }
            a6.q(true);
            try {
                context = cVar.getContext();
                m5 = b.m(context, this.f3418m);
            } finally {
                try {
                } finally {
                }
            }
            try {
                cVar.resumeWith(obj);
                while (a6.r()) {
                }
            } finally {
                b.g(context, m5);
            }
        } catch (Throwable th) {
            throw new b0(th, rVar, context2);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3415j + ", " + o4.w.m(this.f3416k) + ']';
    }

    @Override // o4.d0
    public final w3.c c() {
        return this;
    }
}
