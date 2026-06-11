package k0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import o4.k1;
import o4.o0;
import o4.z0;

/* loaded from: classes.dex */
public final class j extends g4.j implements f4.l {
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2352i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2353j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i5, Object obj, Object obj2) {
        super(1);
        this.h = i5;
        this.f2352i = obj;
        this.f2353j = obj2;
    }

    @Override // f4.l
    public final Object a(Object obj) {
        Object hVar;
        t3.h hVar2;
        t3.h hVar3;
        switch (this.h) {
            case 0:
                Throwable th = (Throwable) obj;
                ((o) this.f2352i).a(th);
                q4.c cVar = (q4.c) ((r1.h) this.f2353j).f3162i;
                cVar.g(false, th);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = q4.c.f3103i;
                    long j2 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = q4.c.h;
                    long j5 = atomicLongFieldUpdater2.get(cVar);
                    boolean z4 = true;
                    if (cVar.s(j5, true)) {
                        hVar = new q4.h(cVar.n());
                    } else {
                        long j6 = j5 & 1152921504606846975L;
                        q4.i iVar = q4.j.f3135a;
                        if (j2 >= j6) {
                            hVar = iVar;
                        } else {
                            Object obj2 = q4.e.f3122k;
                            q4.k kVar = (q4.k) q4.c.f3107m.get(cVar);
                            while (true) {
                                if (cVar.s(atomicLongFieldUpdater2.get(cVar), z4)) {
                                    hVar = new q4.h(cVar.n());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j7 = q4.e.f3114b;
                                    q4.i iVar2 = iVar;
                                    long j8 = andIncrement / j7;
                                    int i5 = (int) (andIncrement % j7);
                                    if (kVar.f3442c != j8) {
                                        q4.k l5 = cVar.l(j8, kVar);
                                        if (l5 == null) {
                                            continue;
                                            iVar = iVar2;
                                            z4 = true;
                                        } else {
                                            kVar = l5;
                                        }
                                    }
                                    Object A = cVar.A(kVar, i5, andIncrement, obj2);
                                    if (A == q4.e.f3124m) {
                                        k1 k1Var = obj2 instanceof k1 ? (k1) obj2 : null;
                                        if (k1Var != null) {
                                            k1Var.a(kVar, i5);
                                        }
                                        cVar.C(andIncrement);
                                        kVar.h();
                                        hVar = iVar2;
                                    } else if (A == q4.e.f3126o) {
                                        if (andIncrement < cVar.q()) {
                                            kVar.a();
                                        }
                                        iVar = iVar2;
                                        z4 = true;
                                    } else {
                                        if (A == q4.e.f3125n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        hVar = A;
                                    }
                                }
                            }
                        }
                    }
                    hVar2 = null;
                    if (hVar instanceof q4.i) {
                        hVar = null;
                    }
                    hVar3 = t3.h.f3400a;
                    if (hVar != null) {
                        m mVar = (m) hVar;
                        if (mVar instanceof l) {
                            ((l) mVar).f2356b.G(new o4.n(false, th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th));
                        }
                        hVar2 = hVar3;
                    }
                } while (hVar2 != null);
                return hVar3;
            default:
                Throwable th2 = (Throwable) obj;
                q.i iVar3 = (q.i) this.f2352i;
                if (th2 == null) {
                    o4.z zVar = (o4.z) this.f2353j;
                    zVar.getClass();
                    Object obj3 = z0.f2855g.get(zVar);
                    if (obj3 instanceof o0) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (obj3 instanceof o4.n) {
                        throw ((o4.n) obj3).f2822a;
                    }
                    iVar3.a(o4.w.n(obj3));
                } else if (th2 instanceof CancellationException) {
                    iVar3.f3071d = true;
                    q.l lVar = iVar3.f3069b;
                    if (lVar != null && lVar.h.cancel(true)) {
                        iVar3.f3068a = null;
                        iVar3.f3069b = null;
                        iVar3.f3070c = null;
                    }
                } else {
                    iVar3.b(th2);
                }
                return t3.h.f3400a;
        }
    }
}
