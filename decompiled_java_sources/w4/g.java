package w4;

import androidx.emoji2.text.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t4.s;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3637b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3638c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3639d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3640e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3641f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final o4.e f3642a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f3642a = new o4.e(this, 2);
    }

    public final void a(b bVar) {
        Object b2;
        i iVar;
        o4.f fVar = bVar.f3632g;
        c cVar = bVar.h;
        while (true) {
            int andDecrement = f3641f.getAndDecrement(this);
            if (andDecrement <= 1) {
                t3.h hVar = t3.h.f3400a;
                if (andDecrement > 0) {
                    c.f3633g.set(cVar, null);
                    fVar.z(hVar, fVar.f2791i, new o4.e(new m4.g(cVar, bVar), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3639d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3640e.getAndIncrement(this);
                e eVar = e.f3635o;
                long j2 = andIncrement / h.f3648f;
                while (true) {
                    b2 = t4.b.b(iVar2, j2, eVar);
                    if (!t4.b.e(b2)) {
                        s c5 = t4.b.c(b2);
                        while (true) {
                            s sVar = (s) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
                            if (sVar.f3442c >= c5.f3442c) {
                                break;
                            }
                            if (!c5.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c5)) {
                                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                    if (c5.e()) {
                                        c5.d();
                                    }
                                    iVar2 = iVar;
                                }
                            }
                            if (sVar.e()) {
                                sVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    iVar2 = iVar;
                }
                i iVar3 = (i) t4.b.c(b2);
                AtomicReferenceArray atomicReferenceArray = iVar3.f3649e;
                int i5 = (int) (andIncrement % h.f3648f);
                while (!atomicReferenceArray.compareAndSet(i5, null, bVar)) {
                    if (atomicReferenceArray.get(i5) != null) {
                        r rVar = h.f3644b;
                        r rVar2 = h.f3645c;
                        while (!atomicReferenceArray.compareAndSet(i5, rVar, rVar2)) {
                            if (atomicReferenceArray.get(i5) != rVar) {
                                break;
                            }
                        }
                        c.f3633g.set(cVar, null);
                        fVar.z(hVar, fVar.f2791i, new o4.e(new m4.g(cVar, bVar), 0));
                        return;
                    }
                }
                bVar.a(iVar3, i5);
                return;
            }
        }
    }

    public final void b() {
        boolean z4;
        int i5;
        Object b2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3641f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z4 = true;
            if (andIncrement >= 1) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3637b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f3638c.getAndIncrement(this);
            long j2 = andIncrement2 / h.f3648f;
            f fVar = f.f3636o;
            while (true) {
                b2 = t4.b.b(iVar, j2, fVar);
                if (!t4.b.e(b2)) {
                    s c5 = t4.b.c(b2);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
                        if (sVar.f3442c >= c5.f3442c) {
                            break;
                        }
                        if (!c5.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c5)) {
                            if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                if (c5.e()) {
                                    c5.d();
                                }
                            }
                        }
                        if (sVar.e()) {
                            sVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            i iVar2 = (i) t4.b.c(b2);
            AtomicReferenceArray atomicReferenceArray = iVar2.f3649e;
            iVar2.a();
            boolean z5 = false;
            if (iVar2.f3442c <= j2) {
                int i6 = (int) (andIncrement2 % h.f3648f);
                Object andSet = atomicReferenceArray.getAndSet(i6, h.f3644b);
                if (andSet == null) {
                    int i7 = h.f3643a;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            r rVar = h.f3644b;
                            r rVar2 = h.f3646d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i6, rVar, rVar2)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i6) != rVar) {
                                    break;
                                }
                            }
                            z4 = true ^ z5;
                        } else if (atomicReferenceArray.get(i6) == h.f3645c) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else if (andSet != h.f3647e) {
                    if (!(andSet instanceof o4.d)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    o4.d dVar = (o4.d) andSet;
                    r f5 = dVar.f(t3.h.f3400a, this.f3642a);
                    if (f5 != null) {
                        dVar.o(f5);
                    }
                }
            }
            z4 = false;
        } while (!z4);
    }
}
