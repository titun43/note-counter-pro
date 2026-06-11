package q4;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.k1;
import o4.w;
import t4.s;

/* loaded from: classes.dex */
public class c implements g {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3103i = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3104j = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3105k = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3106l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3107m = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3108n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3109o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3110p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final int f3111g;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i5) {
        this.f3111g = i5;
        if (i5 < 0) {
            throw new IllegalArgumentException(u.i(i5, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f3113a;
        this.bufferEnd$volatile = i5 != 0 ? i5 != Integer.MAX_VALUE ? i5 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f3104j.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f3113a;
            g4.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f3130s;
    }

    public static final k a(c cVar, long j2, k kVar) {
        Object b2;
        c cVar2;
        k kVar2 = e.f3113a;
        d dVar = d.f3112o;
        loop0: while (true) {
            b2 = t4.b.b(kVar, j2, dVar);
            if (!t4.b.e(b2)) {
                s c5 = t4.b.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3106l;
                    s sVar = (s) atomicReferenceFieldUpdater.get(cVar);
                    if (sVar.f3442c >= c5.f3442c) {
                        break loop0;
                    }
                    if (!c5.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, sVar, c5)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != sVar) {
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
        boolean e4 = t4.b.e(b2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3103i;
        if (e4) {
            cVar.i();
            if (kVar.f3442c * e.f3114b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) t4.b.c(b2);
            long j5 = kVar3.f3442c;
            if (j5 <= j2) {
                return kVar3;
            }
            long j6 = e.f3114b * j5;
            while (true) {
                long j7 = h.get(cVar);
                long j8 = 1152921504606846975L & j7;
                if (j8 >= j6) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (h.compareAndSet(cVar2, j7, (((int) (j7 >> 60)) << 60) + j8)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j5 * e.f3114b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, o4.f fVar) {
        fVar.resumeWith(b3.g.g(cVar.p()));
    }

    public static final int e(c cVar, k kVar, int i5, Object obj, long j2, Object obj2, boolean z4) {
        kVar.m(i5, obj);
        if (z4) {
            return cVar.B(kVar, i5, obj, j2, obj2, z4);
        }
        Object k5 = kVar.k(i5);
        if (k5 == null) {
            if (cVar.f(j2)) {
                if (kVar.j(i5, null, e.f3116d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i5, null, obj2)) {
                    return 2;
                }
            }
        } else if (k5 instanceof k1) {
            kVar.m(i5, null);
            if (cVar.y(k5, obj)) {
                kVar.n(i5, e.f3120i);
                return 0;
            }
            androidx.emoji2.text.r rVar = e.f3122k;
            if (kVar.f3137f.getAndSet((i5 * 2) + 1, rVar) == rVar) {
                return 5;
            }
            kVar.l(i5, true);
            return 5;
        }
        return cVar.B(kVar, i5, obj, j2, obj2, z4);
    }

    public static void r(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3105k;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof o4.d)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        o4.d dVar = (o4.d) obj;
        k kVar = e.f3113a;
        androidx.emoji2.text.r f5 = dVar.f(t3.h.f3400a, null);
        if (f5 == null) {
            return false;
        }
        dVar.o(f5);
        return true;
    }

    public final Object A(k kVar, int i5, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f3137f;
        Object k5 = kVar.k(i5);
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (k5 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f3125n;
                }
                if (kVar.j(i5, k5, obj)) {
                    k();
                    return e.f3124m;
                }
            }
        } else if (k5 == e.f3116d && kVar.j(i5, k5, e.f3120i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i5 * 2);
            kVar.m(i5, null);
            return obj2;
        }
        while (true) {
            Object k6 = kVar.k(i5);
            if (k6 == null || k6 == e.f3117e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i5, k6, e.h)) {
                        k();
                        return e.f3126o;
                    }
                } else {
                    if (obj == null) {
                        return e.f3125n;
                    }
                    if (kVar.j(i5, k6, obj)) {
                        k();
                        return e.f3124m;
                    }
                }
            } else if (k6 != e.f3116d) {
                androidx.emoji2.text.r rVar = e.f3121j;
                if (k6 == rVar) {
                    return e.f3126o;
                }
                if (k6 == e.h) {
                    return e.f3126o;
                }
                if (k6 == e.f3123l) {
                    k();
                    return e.f3126o;
                }
                if (k6 != e.f3119g && kVar.j(i5, k6, e.f3118f)) {
                    boolean z4 = k6 instanceof r;
                    if (z4) {
                        k6 = ((r) k6).f3140a;
                    }
                    if (z(k6)) {
                        kVar.n(i5, e.f3120i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i5 * 2);
                        kVar.m(i5, null);
                        return obj3;
                    }
                    kVar.n(i5, rVar);
                    kVar.h();
                    if (z4) {
                        k();
                    }
                    return e.f3126o;
                }
            } else if (kVar.j(i5, k6, e.f3120i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i5 * 2);
                kVar.m(i5, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i5, Object obj, long j2, Object obj2, boolean z4) {
        while (true) {
            Object k5 = kVar.k(i5);
            if (k5 == null) {
                if (!f(j2) || z4) {
                    if (z4) {
                        if (kVar.j(i5, null, e.f3121j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i5, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i5, null, e.f3116d)) {
                    break;
                }
            } else {
                if (k5 != e.f3117e) {
                    androidx.emoji2.text.r rVar = e.f3122k;
                    if (k5 == rVar) {
                        kVar.m(i5, null);
                        return 5;
                    }
                    if (k5 == e.h) {
                        kVar.m(i5, null);
                        return 5;
                    }
                    if (k5 == e.f3123l) {
                        kVar.m(i5, null);
                        i();
                        return 4;
                    }
                    kVar.m(i5, null);
                    if (k5 instanceof r) {
                        k5 = ((r) k5).f3140a;
                    }
                    if (y(k5, obj)) {
                        kVar.n(i5, e.f3120i);
                        return 0;
                    }
                    if (kVar.f3137f.getAndSet((i5 * 2) + 1, rVar) != rVar) {
                        kVar.l(i5, true);
                    }
                    return 5;
                }
                if (kVar.j(i5, k5, e.f3116d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f3104j;
            if (atomicLongFieldUpdater.get(cVar) > j2) {
                break;
            } else {
                cVar = this;
            }
        }
        int i5 = e.f3115c;
        int i6 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3105k;
            if (i6 < i5) {
                long j5 = atomicLongFieldUpdater.get(cVar);
                if (j5 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j5 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i6++;
                }
            } else {
                while (true) {
                    long j6 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j6, (j6 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater.get(cVar);
                    long j8 = atomicLongFieldUpdater2.get(cVar);
                    long j9 = j8 & 4611686018427387903L;
                    boolean z4 = (j8 & 4611686018427387904L) != 0;
                    if (j7 == j9 && j7 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z4) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j8, 4611686018427387904L + j9);
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, j10 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // q4.p
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // q4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Object obj, w3.c cVar) {
        Object q5;
        x3.a aVar;
        Object obj2;
        c cVar2;
        k kVar;
        int i5;
        int i6;
        boolean z4;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3106l;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j2 = andIncrement & 1152921504606846975L;
            boolean s5 = cVar3.s(andIncrement, false);
            int i7 = e.f3114b;
            long j5 = i7;
            long j6 = j2 / j5;
            int i8 = (int) (j2 % j5);
            long j7 = kVar2.f3442c;
            t3.h hVar = t3.h.f3400a;
            if (j7 != j6) {
                k a5 = a(cVar3, j6, kVar2);
                if (a5 != null) {
                    kVar2 = a5;
                } else if (s5) {
                    Object w = w(obj, cVar);
                    if (w == x3.a.f3712g) {
                        return w;
                    }
                }
            }
            int e4 = e(cVar3, kVar2, i8, obj, j2, null, s5);
            if (e4 == 0) {
                kVar2.a();
                return hVar;
            }
            if (e4 == 1) {
                break;
            }
            if (e4 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3103i;
                if (e4 == 3) {
                    o4.f f5 = w.f(a.a.o(cVar));
                    Object obj3 = obj;
                    try {
                        int e5 = e(cVar3, kVar2, i8, obj3, j2, f5, false);
                        try {
                            if (e5 != 0) {
                                if (e5 == 1) {
                                    f5.resumeWith(hVar);
                                } else if (e5 != 2) {
                                    if (e5 != 4) {
                                        String str = "unexpected";
                                        if (e5 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j8 = andIncrement2 & 1152921504606846975L;
                                            boolean s6 = cVar3.s(andIncrement2, false);
                                            int i9 = e.f3114b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j9 = i9;
                                            String str2 = str;
                                            long j10 = j8 / j9;
                                            int i10 = (int) (j8 % j9);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (kVar3.f3442c != j10) {
                                                k a6 = a(cVar3, j10, kVar3);
                                                if (a6 != null) {
                                                    i5 = i9;
                                                    i6 = i10;
                                                    z4 = s6;
                                                    kVar = a6;
                                                } else {
                                                    if (s6) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                kVar = kVar3;
                                                i5 = i9;
                                                i6 = i10;
                                                z4 = s6;
                                            }
                                            int e6 = e(cVar3, kVar, i6, obj3, j8, f5, z4);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar4 = kVar;
                                            int i11 = i6;
                                            obj2 = obj4;
                                            if (e6 == 0) {
                                                kVar4.a();
                                                break;
                                            }
                                            if (e6 == 1) {
                                                break;
                                            }
                                            if (e6 != 2) {
                                                if (e6 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (e6 != 4) {
                                                    if (e6 == 5) {
                                                        kVar4.a();
                                                    }
                                                    kVar3 = kVar4;
                                                    cVar3 = cVar2;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j8 < atomicLongFieldUpdater4.get(cVar2)) {
                                                    kVar4.a();
                                                }
                                            } else if (z4) {
                                                kVar4.h();
                                            } else {
                                                f5.a(kVar4, i11 + i5);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar2 = cVar3;
                                        if (j2 < atomicLongFieldUpdater2.get(cVar2)) {
                                            kVar2.a();
                                        }
                                    }
                                    d(cVar2, obj2, f5);
                                } else {
                                    f5.a(kVar2, i8 + i7);
                                }
                                q5 = f5.q();
                                aVar = x3.a.f3712g;
                                if (q5 != aVar) {
                                    q5 = hVar;
                                }
                                if (q5 != aVar) {
                                    return q5;
                                }
                            } else {
                                kVar2.a();
                            }
                            f5.resumeWith(hVar);
                            q5 = f5.q();
                            aVar = x3.a.f3712g;
                            if (q5 != aVar) {
                            }
                            if (q5 != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            f5.x();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (e4 == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(cVar3)) {
                        kVar2.a();
                    }
                    Object w5 = w(obj, cVar);
                    if (w5 == x3.a.f3712g) {
                        return w5;
                    }
                } else if (e4 == 5) {
                    kVar2.a();
                }
            } else if (s5) {
                kVar2.h();
                Object w6 = w(obj, cVar);
                if (w6 == x3.a.f3712g) {
                    return w6;
                }
            }
        }
    }

    public final boolean f(long j2) {
        return j2 < f3104j.get(this) || j2 < f3103i.get(this) + ((long) this.f3111g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(boolean z4, Throwable th) {
        c cVar;
        androidx.emoji2.text.r rVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z5;
        long j2;
        long j5;
        long j6;
        Object obj;
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (z4) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                if (((int) (j8 >> 60)) == 0) {
                    k kVar = e.f3113a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j8, (j8 & 1152921504606846975L) + (1 << 60)));
            rVar = e.f3130s;
            while (true) {
                atomicReferenceFieldUpdater = f3109o;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, th)) {
                    z5 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                    z5 = false;
                    break;
                }
            }
            if (z4) {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                    int i5 = (int) (j2 >> 60);
                    if (i5 == 0) {
                        j5 = j2 & 1152921504606846975L;
                        j6 = 2;
                    } else {
                        if (i5 != 1) {
                            break;
                        }
                        j5 = j2 & 1152921504606846975L;
                        j6 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j2, (j6 << 60) + j5));
            } else {
                do {
                    j7 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j7, (3 << 60) + (j7 & 1152921504606846975L)));
            }
            i();
            if (z5) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3110p;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    androidx.emoji2.text.r rVar2 = obj == null ? e.f3128q : e.f3129r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, rVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    g4.q.a(1, obj);
                    ((f4.l) obj).a(n());
                    return z5;
                }
            }
            return z5;
        }
        cVar = this;
        rVar = e.f3130s;
        while (true) {
            atomicReferenceFieldUpdater = f3109o;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, th)) {
            }
        }
        if (z4) {
        }
        i();
        if (z5) {
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (q4.k) ((t4.c) t4.c.f3410b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k h(long j2) {
        Object obj;
        long j5;
        Object obj2 = f3108n.get(this);
        k kVar = (k) f3106l.get(this);
        if (kVar.f3442c > ((k) obj2).f3442c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f3107m.get(this);
        if (kVar2.f3442c > ((k) obj2).f3442c) {
            obj2 = kVar2;
        }
        t4.c cVar = (t4.c) obj2;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t4.c.f3409a;
            Object obj3 = atomicReferenceFieldUpdater.get(cVar);
            androidx.emoji2.text.r rVar = t4.b.f3402a;
            obj = null;
            if (obj3 == rVar) {
                break;
            }
            t4.c cVar2 = (t4.c) obj3;
            if (cVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, rVar)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            cVar = cVar2;
        }
        k kVar3 = (k) cVar;
        if (t()) {
            k kVar4 = kVar3;
            loop2: do {
                int i5 = e.f3114b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    j5 = (kVar4.f3442c * e.f3114b) + i5;
                    if (j5 < f3103i.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k5 = kVar4.k(i5);
                        if (k5 != null && k5 != e.f3117e) {
                            if (k5 == e.f3116d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i5, k5, e.f3123l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i5--;
                }
            } while (kVar4 != null);
            j5 = -1;
            if (j5 != -1) {
                j(j5);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((t4.c) t4.c.f3410b.get(kVar5))) {
            for (int i6 = e.f3114b - 1; -1 < i6; i6--) {
                if ((kVar5.f3442c * e.f3114b) + i6 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k6 = kVar5.k(i6);
                    if (k6 != null && k6 != e.f3117e) {
                        if (!(k6 instanceof r)) {
                            if (!(k6 instanceof k1)) {
                                break;
                            }
                            if (kVar5.j(i6, k6, e.f3123l)) {
                                obj = t4.b.f(obj, k6);
                                kVar5.l(i6, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i6, k6, e.f3123l)) {
                                obj = t4.b.f(obj, ((r) k6).f3140a);
                                kVar5.l(i6, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i6, k6, e.f3123l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                x((k1) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((k1) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void i() {
        s(h.get(this), false);
    }

    public final void j(long j2) {
        k kVar = (k) f3107m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3103i;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f3111g + j5, f3104j.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, 1 + j5)) {
                long j6 = e.f3114b;
                long j7 = j5 / j6;
                int i5 = (int) (j5 % j6);
                if (kVar.f3442c != j7) {
                    k l5 = l(j7, kVar);
                    if (l5 != null) {
                        kVar = l5;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i5, j5, null) != e.f3126o) {
                    kVar2.a();
                } else if (j5 < q()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b2;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3108n;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f3104j.getAndIncrement(this);
            long j2 = andIncrement / e.f3114b;
            if (q() <= andIncrement) {
                if (kVar.f3442c < j2 && kVar.b() != null) {
                    v(j2, kVar);
                }
                r(this);
                return;
            }
            if (kVar.f3442c != j2) {
                d dVar = d.f3112o;
                while (true) {
                    b2 = t4.b.b(kVar, j2, dVar);
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
                k kVar2 = null;
                if (t4.b.e(b2)) {
                    i();
                    v(j2, kVar);
                    r(this);
                } else {
                    k kVar3 = (k) t4.b.c(b2);
                    long j5 = kVar3.f3442c;
                    if (j5 > j2) {
                        long j6 = j5 * e.f3114b;
                        if (f3104j.compareAndSet(this, 1 + andIncrement, j6)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f3105k;
                            if ((atomicLongFieldUpdater.addAndGet(this, j6 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i5 = (int) (andIncrement % e.f3114b);
            Object k5 = kVar.k(i5);
            boolean z4 = k5 instanceof k1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3103i;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i5, k5, e.f3119g)) {
                while (true) {
                    Object k6 = kVar.k(i5);
                    if (!(k6 instanceof k1)) {
                        if (k6 != e.f3121j) {
                            if (k6 != null) {
                                if (k6 == e.f3116d || k6 == e.h || k6 == e.f3120i || k6 == e.f3122k || k6 == e.f3123l) {
                                    break loop0;
                                }
                                if (k6 != e.f3118f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k6).toString());
                                }
                            } else if (kVar.j(i5, k6, e.f3117e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i5, k6, new r((k1) k6))) {
                            break loop0;
                        }
                    } else if (kVar.j(i5, k6, e.f3119g)) {
                        if (z(k6)) {
                            kVar.n(i5, e.f3116d);
                            break;
                        } else {
                            kVar.n(i5, e.f3121j);
                            kVar.h();
                        }
                    }
                }
            } else if (z(k5)) {
                kVar.n(i5, e.f3116d);
                break;
            } else {
                kVar.n(i5, e.f3121j);
                kVar.h();
                r(this);
            }
        }
        r(this);
    }

    public final k l(long j2, k kVar) {
        Object b2;
        long j5;
        k kVar2 = e.f3113a;
        d dVar = d.f3112o;
        loop0: while (true) {
            b2 = t4.b.b(kVar, j2, dVar);
            if (!t4.b.e(b2)) {
                s c5 = t4.b.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3107m;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f3442c >= c5.f3442c) {
                        break loop0;
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
        if (t4.b.e(b2)) {
            i();
            if (kVar.f3442c * e.f3114b < q()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) t4.b.c(b2);
            long j6 = kVar3.f3442c;
            if (!u() && j2 <= f3104j.get(this) / e.f3114b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3108n;
                    s sVar2 = (s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f3442c >= j6 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (sVar2.e()) {
                        sVar2.d();
                    }
                }
            }
            if (j6 <= j2) {
                return kVar3;
            }
            long j7 = j6 * e.f3114b;
            do {
                j5 = f3103i.get(this);
                if (j5 >= j7) {
                    break;
                }
            } while (!f3103i.compareAndSet(this, j5, j7));
            if (j6 * e.f3114b < q()) {
                kVar3.a();
            }
        }
        return null;
    }

    @Override // q4.q
    public Object m(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        boolean z4 = false;
        long j2 = 1152921504606846975L;
        boolean z5 = s(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L);
        i iVar = j.f3135a;
        if (z5) {
            return iVar;
        }
        androidx.emoji2.text.q qVar = e.f3121j;
        k kVar = (k) f3106l.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = andIncrement & j2;
            boolean s5 = s(andIncrement, z4);
            int i5 = e.f3114b;
            long j6 = i5;
            long j7 = j5 / j6;
            int i6 = (int) (j5 % j6);
            if (kVar.f3442c != j7) {
                k a5 = a(this, j7, kVar);
                if (a5 != null) {
                    kVar = a5;
                } else {
                    if (s5) {
                        return new h(p());
                    }
                    z4 = false;
                    j2 = 1152921504606846975L;
                }
            }
            int e4 = e(this, kVar, i6, obj, j5, qVar, s5);
            t3.h hVar = t3.h.f3400a;
            if (e4 == 0) {
                kVar.a();
                return hVar;
            }
            if (e4 == 1) {
                return hVar;
            }
            if (e4 == 2) {
                if (s5) {
                    kVar.h();
                    return new h(p());
                }
                k1 k1Var = qVar instanceof k1 ? (k1) qVar : null;
                if (k1Var != null) {
                    k1Var.a(kVar, i6 + i5);
                }
                kVar.h();
                return iVar;
            }
            if (e4 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e4 == 4) {
                if (j5 < f3103i.get(this)) {
                    kVar.a();
                }
                return new h(p());
            }
            if (e4 == 5) {
                kVar.a();
            }
            z4 = false;
            j2 = 1152921504606846975L;
        }
    }

    public final Throwable n() {
        return (Throwable) f3109o.get(this);
    }

    public final Throwable o() {
        Throwable n5 = n();
        return n5 == null ? new l("Channel was closed") : n5;
    }

    public final Throwable p() {
        Throwable n5 = n();
        return n5 == null ? new h3.c("Channel was closed") : n5;
    }

    public final long q() {
        return h.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (q4.k) ((t4.c) t4.c.f3410b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j2, boolean z4) {
        int i5 = (int) (j2 >> 60);
        if (i5 != 0 && i5 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3103i;
            if (i5 == 2) {
                h(1152921504606846975L & j2);
                if (z4) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3107m;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j5 = atomicLongFieldUpdater.get(this);
                        if (q() <= j5) {
                            break;
                        }
                        long j6 = e.f3114b;
                        long j7 = j5 / j6;
                        if (kVar.f3442c != j7 && (kVar = l(j7, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f3442c < j7) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i6 = (int) (j5 % j6);
                            while (true) {
                                Object k5 = kVar.k(i6);
                                if (k5 == null || k5 == e.f3117e) {
                                    if (kVar.j(i6, k5, e.h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (k5 == e.f3116d) {
                                        break;
                                    }
                                    if (k5 != e.f3121j) {
                                        if (k5 != e.f3123l) {
                                            if (k5 != e.f3120i) {
                                                if (k5 != e.h) {
                                                    if (k5 == e.f3119g) {
                                                        break;
                                                    }
                                                    if (k5 != e.f3118f && j5 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f3103i.compareAndSet(this, j5, j5 + 1);
                        }
                    }
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException(u.h(i5, "unexpected close status: ").toString());
                }
                k h5 = h(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i7 = e.f3114b - 1;
                    while (true) {
                        if (-1 >= i7) {
                            break;
                        }
                        long j8 = (h5.f3442c * e.f3114b) + i7;
                        while (true) {
                            Object k6 = h5.k(i7);
                            if (k6 == e.f3120i) {
                                break loop0;
                            }
                            if (k6 == e.f3116d) {
                                if (j8 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (h5.j(i7, k6, e.f3123l)) {
                                    h5.m(i7, null);
                                    h5.h();
                                    break;
                                }
                            } else if (k6 != e.f3117e && k6 != null) {
                                if (!(k6 instanceof k1) && !(k6 instanceof r)) {
                                    androidx.emoji2.text.r rVar = e.f3119g;
                                    if (k6 == rVar || k6 == e.f3118f) {
                                        break loop0;
                                    }
                                    if (k6 != rVar) {
                                        break;
                                    }
                                } else {
                                    if (j8 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    k1 k1Var = k6 instanceof r ? ((r) k6).f3140a : (k1) k6;
                                    if (h5.j(i7, k6, e.f3123l)) {
                                        obj = t4.b.f(obj, k1Var);
                                        h5.m(i7, null);
                                        h5.h();
                                        break;
                                    }
                                }
                            } else if (h5.j(i7, k6, e.f3123l)) {
                                h5.h();
                                break;
                            }
                        }
                        i7--;
                    }
                } while (h5 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((k1) arrayList.get(size), false);
                        }
                    } else {
                        x((k1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (q4.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z4;
        String str;
        StringBuilder sb = new StringBuilder();
        int i5 = (int) (h.get(this) >> 60);
        if (i5 == 2) {
            sb.append("closed,");
        } else if (i5 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f3111g + ',');
        sb.append("data=[");
        int i6 = 0;
        boolean z5 = true;
        List S = u3.h.S(f3107m.get(this), f3106l.get(this), f3108n.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : S) {
            if (((k) obj) != e.f3113a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f3442c;
            do {
                Object next2 = it.next();
                long j5 = ((k) next2).f3442c;
                if (j2 > j5) {
                    next = next2;
                    j2 = j5;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j6 = f3103i.get(this);
        long q5 = q();
        loop2: while (true) {
            int i7 = e.f3114b;
            int i8 = i6;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                long j7 = (kVar.f3442c * e.f3114b) + i8;
                if (j7 >= q5 && j7 >= j6) {
                    break loop2;
                }
                Object k5 = kVar.k(i8);
                boolean z6 = z5;
                Object obj2 = kVar.f3137f.get(i8 * 2);
                if (k5 instanceof o4.d) {
                    str = (j7 >= j6 || j7 < q5) ? (j7 >= q5 || j7 < j6) ? "cont" : "send" : "receive";
                } else if (k5 instanceof r) {
                    str = "EB(" + k5 + ')';
                } else if (g4.i.a(k5, e.f3118f) || g4.i.a(k5, e.f3119g)) {
                    str = "resuming_sender";
                } else {
                    if (k5 != null && !k5.equals(e.f3117e) && !k5.equals(e.f3120i) && !k5.equals(e.h) && !k5.equals(e.f3122k) && !k5.equals(e.f3121j) && !k5.equals(e.f3123l)) {
                        str = k5.toString();
                    }
                    i8++;
                    z5 = z6;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i8++;
                z5 = z6;
            }
            z5 = z4;
            i6 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(n4.i.T(sb)) == ',') {
            g4.i.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f3104j.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j2, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f3442c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3108n;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f3442c >= kVar.f3442c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object w(Object obj, w3.c cVar) {
        o4.f fVar = new o4.f(1, a.a.o(cVar));
        fVar.r();
        fVar.resumeWith(b3.g.g(p()));
        Object q5 = fVar.q();
        return q5 == x3.a.f3712g ? q5 : t3.h.f3400a;
    }

    public final void x(k1 k1Var, boolean z4) {
        if (k1Var instanceof o4.d) {
            ((w3.c) k1Var).resumeWith(b3.g.g(z4 ? o() : p()));
            return;
        }
        if (!(k1Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + k1Var).toString());
        }
        b bVar = (b) k1Var;
        o4.f fVar = bVar.h;
        g4.i.b(fVar);
        bVar.h = null;
        bVar.f3101g = e.f3123l;
        Throwable n5 = bVar.f3102i.n();
        if (n5 == null) {
            fVar.resumeWith(Boolean.FALSE);
        } else {
            fVar.resumeWith(b3.g.g(n5));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof o4.d)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            o4.d dVar = (o4.d) obj;
            k kVar = e.f3113a;
            androidx.emoji2.text.r f5 = dVar.f(obj2, null);
            if (f5 == null) {
                return false;
            }
            dVar.o(f5);
            return true;
        }
        b bVar = (b) obj;
        o4.f fVar = bVar.h;
        g4.i.b(fVar);
        bVar.h = null;
        bVar.f3101g = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f3113a;
        androidx.emoji2.text.r f6 = fVar.f(bool, null);
        if (f6 == null) {
            return false;
        }
        fVar.o(f6);
        return true;
    }
}
