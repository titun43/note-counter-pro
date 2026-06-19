package k0;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2316g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2317i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2318j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f4.p pVar, Object obj, w3.c cVar) {
        super(2, cVar);
        this.f2316g = 2;
        this.f2318j = pVar;
        this.f2317i = obj;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2316g) {
            case 0:
                b bVar = new b((List) this.f2318j, cVar, 0);
                bVar.f2317i = obj;
                return bVar;
            case 1:
                return new b((r1.h) this.f2318j, cVar, 1);
            case 2:
                return new b((f4.p) this.f2318j, this.f2317i, cVar);
            case 3:
                return new b((u0.a) this.f2317i, (Uri) this.f2318j, cVar, 3);
            default:
                return new b((v0.a) this.f2317i, (x0.a) this.f2318j, cVar, 4);
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2316g) {
        }
        return ((b) create((o4.t) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0203 -> B:39:0x0206). Please report as a decompilation issue!!! */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        r1.h hVar;
        t3.h hVar2;
        p pVar;
        Object obj2;
        Object obj3;
        char c5;
        q4.c cVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z4;
        Object A;
        q4.k kVar;
        boolean z5;
        int i5 = this.f2316g;
        t3.h hVar3 = t3.h.f3400a;
        Object obj4 = this.f2318j;
        int i6 = 1;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                int i7 = this.h;
                if (i7 == 0) {
                    b3.g.x(obj);
                    w wVar = (w) this.f2317i;
                    this.h = 1;
                    if (a.a.c((List) obj4, wVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return hVar3;
            case 1:
                r1.h hVar4 = (r1.h) obj4;
                AtomicInteger atomicInteger2 = (AtomicInteger) hVar4.f3163j;
                Object obj5 = x3.a.f3712g;
                int i8 = this.h;
                if (i8 == 0) {
                    b3.g.x(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    o4.w.c(((o4.t) hVar4.f3161g).k());
                    pVar = (p) hVar4.h;
                    cVar = (q4.c) hVar4.f3162i;
                    this.f2317i = pVar;
                    this.h = i6;
                    cVar.getClass();
                    atomicLongFieldUpdater = q4.c.h;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = q4.c.f3103i;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q4.c.f3107m;
                    q4.k kVar2 = (q4.k) atomicReferenceFieldUpdater.get(cVar);
                    for (z4 = i6; !cVar.s(atomicLongFieldUpdater.get(cVar), z4); z4 = z5) {
                    }
                    Throwable o2 = cVar.o();
                    int i9 = t4.t.f3443a;
                    throw o2;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    atomicInteger = atomicInteger2;
                    hVar = hVar4;
                    c5 = 2;
                    hVar2 = hVar3;
                    obj2 = obj5;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return hVar2;
                    }
                    obj5 = obj2;
                    hVar3 = hVar2;
                    hVar4 = hVar;
                    atomicInteger2 = atomicInteger;
                    i6 = 1;
                    o4.w.c(((o4.t) hVar4.f3161g).k());
                    pVar = (p) hVar4.h;
                    cVar = (q4.c) hVar4.f3162i;
                    this.f2317i = pVar;
                    this.h = i6;
                    cVar.getClass();
                    atomicLongFieldUpdater = q4.c.h;
                    AtomicLongFieldUpdater atomicLongFieldUpdater22 = q4.c.f3103i;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q4.c.f3107m;
                    q4.k kVar22 = (q4.k) atomicReferenceFieldUpdater2.get(cVar);
                    while (!cVar.s(atomicLongFieldUpdater.get(cVar), z4)) {
                        long andIncrement = atomicLongFieldUpdater22.getAndIncrement(cVar);
                        long j2 = q4.e.f3114b;
                        Object obj6 = obj5;
                        long j5 = andIncrement / j2;
                        int i10 = (int) (andIncrement % j2);
                        hVar2 = hVar3;
                        hVar = hVar4;
                        if (kVar22.f3442c != j5) {
                            q4.k l5 = cVar.l(j5, kVar22);
                            if (l5 == null) {
                                hVar3 = hVar2;
                                obj5 = obj6;
                                hVar4 = hVar;
                                z5 = true;
                            } else {
                                kVar22 = l5;
                            }
                        }
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater22;
                        q4.k kVar3 = kVar22;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        Object A2 = cVar.A(kVar3, i10, andIncrement, null);
                        Object obj7 = q4.e.f3124m;
                        if (A2 == obj7) {
                            throw new IllegalStateException("unexpected");
                        }
                        Object obj8 = q4.e.f3126o;
                        if (A2 == obj8) {
                            if (andIncrement < cVar.q()) {
                                kVar3.a();
                            }
                            atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                            kVar22 = kVar3;
                            obj5 = obj6;
                            hVar4 = hVar;
                            z5 = true;
                            atomicLongFieldUpdater22 = atomicLongFieldUpdater3;
                            hVar3 = hVar2;
                        } else {
                            atomicInteger = atomicInteger2;
                            if (A2 == q4.e.f3125n) {
                                o4.f f5 = o4.w.f(a.a.o(this));
                                try {
                                    A = cVar.A(kVar3, i10, andIncrement, f5);
                                } catch (Throwable th) {
                                    f5.x();
                                    throw th;
                                }
                                if (A == obj7) {
                                    f5.a(kVar3, i10);
                                } else {
                                    if (A == obj8) {
                                        if (andIncrement < cVar.q()) {
                                            kVar3.a();
                                        }
                                        q4.k kVar4 = (q4.k) atomicReferenceFieldUpdater3.get(cVar);
                                        while (true) {
                                            if (cVar.s(atomicLongFieldUpdater.get(cVar), true)) {
                                                f5.resumeWith(b3.g.g(cVar.o()));
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater3.getAndIncrement(cVar);
                                                long j6 = q4.e.f3114b;
                                                long j7 = andIncrement2 / j6;
                                                int i11 = (int) (andIncrement2 % j6);
                                                if (kVar4.f3442c == j7) {
                                                    kVar = kVar4;
                                                } else {
                                                    q4.k l6 = cVar.l(j7, kVar4);
                                                    if (l6 != null) {
                                                        kVar = l6;
                                                    }
                                                }
                                                Object A3 = cVar.A(kVar, i11, andIncrement2, f5);
                                                q4.k kVar5 = kVar;
                                                if (A3 == q4.e.f3124m) {
                                                    f5.a(kVar5, i11);
                                                } else if (A3 == q4.e.f3126o) {
                                                    if (andIncrement2 < cVar.q()) {
                                                        kVar5.a();
                                                    }
                                                    kVar4 = kVar5;
                                                } else {
                                                    if (A3 == q4.e.f3125n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar5.a();
                                                    f5.y(A3, null);
                                                }
                                            }
                                        }
                                        f5.x();
                                        throw th;
                                    }
                                    kVar3.a();
                                    f5.y(A, null);
                                }
                                obj3 = f5.q();
                                x3.a aVar2 = x3.a.f3712g;
                            } else {
                                kVar3.a();
                                obj3 = A2;
                            }
                            obj2 = obj6;
                            if (obj3 == obj2) {
                                return obj2;
                            }
                            this.f2317i = null;
                            c5 = 2;
                            this.h = 2;
                            if (pVar.invoke(obj3, this) == obj2) {
                                return obj2;
                            }
                            if (atomicInteger.decrementAndGet() == 0) {
                            }
                        }
                    }
                    Throwable o22 = cVar.o();
                    int i92 = t4.t.f3443a;
                    throw o22;
                }
                pVar = (p) this.f2317i;
                b3.g.x(obj);
                atomicInteger = atomicInteger2;
                hVar2 = hVar3;
                hVar = hVar4;
                obj2 = obj5;
                obj3 = obj;
                this.f2317i = null;
                c5 = 2;
                this.h = 2;
                if (pVar.invoke(obj3, this) == obj2) {
                }
                if (atomicInteger.decrementAndGet() == 0) {
                }
            case 2:
                x3.a aVar3 = x3.a.f3712g;
                int i12 = this.h;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return obj;
                }
                b3.g.x(obj);
                Object obj9 = this.f2317i;
                this.h = 1;
                Object invoke = ((f4.p) obj4).invoke(obj9, this);
                return invoke == aVar3 ? aVar3 : invoke;
            case 3:
                x3.a aVar4 = x3.a.f3712g;
                int i13 = this.h;
                if (i13 == 0) {
                    b3.g.x(obj);
                    this.h = 1;
                    return ((u0.a) this.f2317i).f3493a.d((Uri) obj4, this) == aVar4 ? aVar4 : hVar3;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b3.g.x(obj);
                return hVar3;
            default:
                x3.a aVar5 = x3.a.f3712g;
                int i14 = this.h;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return obj;
                }
                b3.g.x(obj);
                this.h = 1;
                Object b2 = ((v0.a) this.f2317i).f3552a.b((x0.a) obj4, this);
                return b2 == aVar5 ? aVar5 : b2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, w3.c cVar, int i5) {
        super(2, cVar);
        this.f2316g = i5;
        this.f2317i = obj;
        this.f2318j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, w3.c cVar, int i5) {
        super(2, cVar);
        this.f2316g = i5;
        this.f2318j = obj;
    }
}
