package v4;

import androidx.emoji2.text.r;
import g4.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3582o = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: g, reason: collision with root package name */
    public final m f3583g;
    public final n h;

    /* renamed from: i, reason: collision with root package name */
    public b f3584i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public long f3585j;

    /* renamed from: k, reason: collision with root package name */
    public long f3586k;

    /* renamed from: l, reason: collision with root package name */
    public int f3587l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f3589n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i5) {
        this.f3589n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f3583g = new m();
        this.h = new n();
        this.f3584i = b.f3592j;
        this.nextParkedWorker = c.f3598q;
        int nanoTime = (int) System.nanoTime();
        this.f3587l = nanoTime == 0 ? 42 : nanoTime;
        f(i5);
    }

    public final i a(boolean z4) {
        i e4;
        i e5;
        long j2;
        b bVar = this.f3584i;
        b bVar2 = b.f3590g;
        c cVar = this.f3589n;
        i iVar = null;
        m mVar = this.f3583g;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3596o;
            do {
                j2 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3619b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.h) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i5 = m.f3621d.get(mVar);
                    int i6 = m.f3620c.get(mVar);
                    while (true) {
                        if (i5 == i6 || m.f3622e.get(mVar) == 0) {
                            break;
                        }
                        i6--;
                        i b2 = mVar.b(i6, true);
                        if (b2 != null) {
                            iVar = b2;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f3603l.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f3596o.compareAndSet(cVar, j2, j2 - 4398046511104L));
            this.f3584i = b.f3590g;
        }
        if (z4) {
            boolean z5 = d(cVar.f3599g * 2) == 0;
            if (z5 && (e5 = e()) != null) {
                return e5;
            }
            mVar.getClass();
            i iVar4 = (i) m.f3619b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z5 && (e4 = e()) != null) {
                return e4;
            }
        } else {
            i e6 = e();
            if (e6 != null) {
                return e6;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i5) {
        int i6 = this.f3587l;
        int i7 = i6 ^ (i6 << 13);
        int i8 = i7 ^ (i7 >> 17);
        int i9 = i8 ^ (i8 << 5);
        this.f3587l = i9;
        int i10 = i5 - 1;
        return (i10 & i5) == 0 ? i9 & i10 : (i9 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i5;
    }

    public final i e() {
        int d5 = d(2);
        c cVar = this.f3589n;
        if (d5 == 0) {
            i iVar = (i) cVar.f3602k.d();
            return iVar != null ? iVar : (i) cVar.f3603l.d();
        }
        i iVar2 = (i) cVar.f3603l.d();
        return iVar2 != null ? iVar2 : (i) cVar.f3602k.d();
    }

    public final void f(int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3589n.f3601j);
        sb.append("-worker-");
        sb.append(i5 == 0 ? "TERMINATED" : String.valueOf(i5));
        setName(sb.toString());
        this.indexInArray = i5;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f3584i;
        boolean z4 = bVar2 == b.f3590g;
        if (z4) {
            c.f3596o.addAndGet(this.f3589n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f3584i = bVar;
        }
        return z4;
    }

    public final i i(int i5) {
        long j2;
        i iVar;
        long j5;
        long j6;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3596o;
        c cVar = this.f3589n;
        int i6 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i6 < 2) {
            return null;
        }
        int d5 = d(i6);
        int i7 = 0;
        long j7 = Long.MAX_VALUE;
        while (i7 < i6) {
            d5++;
            if (d5 > i6) {
                d5 = 1;
            }
            a aVar = (a) cVar.f3604m.b(d5);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f3583g;
                if (i5 == 3) {
                    iVar = mVar.a();
                    j2 = 0;
                } else {
                    mVar.getClass();
                    int i8 = m.f3621d.get(mVar);
                    int i9 = m.f3620c.get(mVar);
                    boolean z4 = i5 == 1;
                    while (true) {
                        if (i8 == i9) {
                            j2 = 0;
                            break;
                        }
                        j2 = 0;
                        if (!z4 || m.f3622e.get(mVar) != 0) {
                            int i10 = i8 + 1;
                            iVar = mVar.b(i8, z4);
                            if (iVar != null) {
                                break;
                            }
                            i8 = i10;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                n nVar = this.h;
                if (iVar != null) {
                    nVar.f1704g = iVar;
                    iVar2 = iVar3;
                    j6 = -1;
                    j5 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3619b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j5 = -1;
                            break;
                        }
                        j5 = -1;
                        if (((iVar4.h ? 1 : 2) & i5) == 0) {
                            break;
                        }
                        k.f3617f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f3610g;
                        long j8 = k.f3613b;
                        if (nanoTime < j8) {
                            j6 = j8 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                nVar.f1704g = iVar4;
                                j6 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j6 = -2;
                    iVar2 = iVar3;
                }
                if (j6 == j5) {
                    i iVar5 = (i) nVar.f1704g;
                    nVar.f1704g = iVar2;
                    return iVar5;
                }
                if (j6 > j2) {
                    j7 = Math.min(j7, j6);
                }
            }
            i7++;
            iVar3 = null;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = 0;
        }
        this.f3586k = j7;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j2;
        loop0: while (true) {
            boolean z4 = false;
            while (c.f3597p.get(this.f3589n) != 1) {
                b bVar = this.f3584i;
                b bVar2 = b.f3593k;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a5 = a(this.f3588m);
                if (a5 != null) {
                    this.f3586k = 0L;
                    c cVar = this.f3589n;
                    this.f3585j = 0L;
                    if (this.f3584i == b.f3591i) {
                        this.f3584i = b.h;
                    }
                    if (a5.h) {
                        if (h(b.h) && !cVar.f() && !cVar.e(c.f3596o.get(cVar))) {
                            cVar.f();
                        }
                        try {
                            a5.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        c.f3596o.addAndGet(cVar, -2097152L);
                        if (this.f3584i != bVar2) {
                            this.f3584i = b.f3592j;
                        }
                    } else {
                        try {
                            a5.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.f3588m = false;
                    if (this.f3586k == 0) {
                        Object obj = this.nextParkedWorker;
                        r rVar = c.f3598q;
                        if (obj != rVar) {
                            f3582o.set(this, -1);
                            while (this.nextParkedWorker != c.f3598q) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3582o;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f3589n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f3597p;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.f3584i;
                                    b bVar4 = b.f3593k;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f3591i);
                                    Thread.interrupted();
                                    if (this.f3585j == 0) {
                                        j2 = 2097151;
                                        this.f3585j = System.nanoTime() + this.f3589n.f3600i;
                                    } else {
                                        j2 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f3589n.f3600i);
                                    if (System.nanoTime() - this.f3585j >= 0) {
                                        this.f3585j = 0L;
                                        c cVar3 = this.f3589n;
                                        synchronized (cVar3.f3604m) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3596o;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j2)) > cVar3.f3599g) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i5 = this.indexInArray;
                                                            f(0);
                                                            cVar3.d(this, i5, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j2);
                                                            if (andDecrement != i5) {
                                                                Object b2 = cVar3.f3604m.b(andDecrement);
                                                                g4.i.b(b2);
                                                                a aVar = (a) b2;
                                                                cVar3.f3604m.c(i5, aVar);
                                                                aVar.f(i5);
                                                                cVar3.d(aVar, andDecrement, i5);
                                                            }
                                                            cVar3.f3604m.c(andDecrement, null);
                                                            this.f3584i = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f3589n;
                            if (this.nextParkedWorker == rVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f3595n;
                                while (true) {
                                    long j5 = atomicLongFieldUpdater2.get(cVar4);
                                    int i6 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f3604m.b((int) (j5 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f3595n.compareAndSet(cVar5, j5, ((j5 + 2097152) & (-2097152)) | i6)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z4) {
                        h(b.f3591i);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3586k);
                        this.f3586k = 0L;
                    } else {
                        z4 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f3593k);
    }
}
