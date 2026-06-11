package q4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.k1;
import o4.w;
import t4.s;
import t4.t;

/* loaded from: classes.dex */
public final class b implements k1 {

    /* renamed from: g, reason: collision with root package name */
    public Object f3101g = e.f3127p;
    public o4.f h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f3102i;

    public b(c cVar) {
        this.f3102i = cVar;
    }

    @Override // o4.k1
    public final void a(s sVar, int i5) {
        o4.f fVar = this.h;
        if (fVar != null) {
            fVar.a(sVar, i5);
        }
    }

    public final Object b(r4.d dVar) {
        k kVar;
        k kVar2;
        Object obj = this.f3101g;
        boolean z4 = true;
        if (obj == e.f3127p || obj == e.f3123l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3107m;
            c cVar = this.f3102i;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.s(c.h.get(cVar), true)) {
                long andIncrement = c.f3103i.getAndIncrement(cVar);
                long j2 = e.f3114b;
                long j5 = andIncrement / j2;
                int i5 = (int) (andIncrement % j2);
                if (kVar3.f3442c != j5) {
                    k l5 = cVar.l(j5, kVar3);
                    if (l5 == null) {
                        continue;
                    } else {
                        kVar = l5;
                    }
                } else {
                    kVar = kVar3;
                }
                Object A = cVar.A(kVar, i5, andIncrement, null);
                androidx.emoji2.text.r rVar = e.f3124m;
                if (A == rVar) {
                    throw new IllegalStateException("unreachable");
                }
                androidx.emoji2.text.r rVar2 = e.f3126o;
                if (A == rVar2) {
                    if (andIncrement < cVar.q()) {
                        kVar.a();
                    }
                    kVar3 = kVar;
                } else {
                    if (A != e.f3125n) {
                        kVar.a();
                        this.f3101g = A;
                        return Boolean.valueOf(z4);
                    }
                    o4.f f5 = w.f(a.a.o(dVar));
                    try {
                        this.h = f5;
                        try {
                            Object A2 = cVar.A(kVar, i5, andIncrement, this);
                            if (A2 == rVar) {
                                a(kVar, i5);
                            } else {
                                if (A2 == rVar2) {
                                    if (andIncrement < cVar.q()) {
                                        kVar.a();
                                    }
                                    k kVar4 = (k) c.f3107m.get(cVar);
                                    while (true) {
                                        if (cVar.s(c.h.get(cVar), true)) {
                                            o4.f fVar = this.h;
                                            g4.i.b(fVar);
                                            this.h = null;
                                            this.f3101g = e.f3123l;
                                            Throwable n5 = cVar.n();
                                            if (n5 == null) {
                                                fVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                fVar.resumeWith(b3.g.g(n5));
                                            }
                                        } else {
                                            long andIncrement2 = c.f3103i.getAndIncrement(cVar);
                                            long j6 = e.f3114b;
                                            long j7 = andIncrement2 / j6;
                                            int i6 = (int) (andIncrement2 % j6);
                                            if (kVar4.f3442c != j7) {
                                                kVar2 = cVar.l(j7, kVar4);
                                                if (kVar2 == null) {
                                                }
                                            } else {
                                                kVar2 = kVar4;
                                            }
                                            Object A3 = cVar.A(kVar2, i6, andIncrement2, this);
                                            if (A3 == e.f3124m) {
                                                a(kVar2, i6);
                                                break;
                                            }
                                            if (A3 == e.f3126o) {
                                                if (andIncrement2 < cVar.q()) {
                                                    kVar2.a();
                                                }
                                                kVar4 = kVar2;
                                            } else {
                                                if (A3 == e.f3125n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                kVar2.a();
                                                this.f3101g = A3;
                                                this.h = null;
                                            }
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.f3101g = A2;
                                    this.h = null;
                                }
                                f5.y(Boolean.TRUE, null);
                            }
                            Object q5 = f5.q();
                            x3.a aVar = x3.a.f3712g;
                            return q5;
                        } catch (Throwable th) {
                            th = th;
                            f5.x();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            this.f3101g = e.f3123l;
            Throwable n6 = cVar.n();
            if (n6 != null) {
                int i7 = t.f3443a;
                throw n6;
            }
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
