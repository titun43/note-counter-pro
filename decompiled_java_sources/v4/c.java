package v4;

import androidx.emoji2.text.r;
import androidx.emoji2.text.u;
import androidx.fragment.app.x;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import o4.w;
import t4.q;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3595n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3596o = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3597p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final r f3598q = new r("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final int f3599g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3600i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3601j;

    /* renamed from: k, reason: collision with root package name */
    public final f f3602k;

    /* renamed from: l, reason: collision with root package name */
    public final f f3603l;

    /* renamed from: m, reason: collision with root package name */
    public final q f3604m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i5, int i6, String str, long j2) {
        this.f3599g = i5;
        this.h = i6;
        this.f3600i = j2;
        this.f3601j = str;
        if (i5 < 1) {
            throw new IllegalArgumentException(u.i(i5, "Core pool size ", " should be at least 1").toString());
        }
        if (i6 < i5) {
            throw new IllegalArgumentException(u.g(i6, i5, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i6 > 2097150) {
            throw new IllegalArgumentException(u.i(i6, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f3602k = new f();
        this.f3603l = new f();
        this.f3604m = new q((i5 + 1) * 2);
        this.controlState$volatile = i5 << 42;
    }

    public final int a() {
        synchronized (this.f3604m) {
            try {
                if (f3597p.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3596o;
                long j2 = atomicLongFieldUpdater.get(this);
                int i5 = (int) (j2 & 2097151);
                int i6 = i5 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= this.f3599g) {
                    return 0;
                }
                if (i5 >= this.h) {
                    return 0;
                }
                int i7 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i7 <= 0 || this.f3604m.b(i7) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i7);
                this.f3604m.c(i7, aVar);
                if (i7 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i8 = i6 + 1;
                aVar.start();
                return i8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z4) {
        i jVar;
        b bVar;
        k.f3617f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f3610g = nanoTime;
            jVar.h = z4;
        } else {
            jVar = new j(runnable, nanoTime, z4);
        }
        boolean z5 = jVar.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3596o;
        long addAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !g4.i.a(aVar.f3589n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f3584i) != b.f3593k && (jVar.h || bVar != b.h)) {
            aVar.f3588m = true;
            m mVar = aVar.f3583g;
            mVar.getClass();
            jVar = (i) m.f3619b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f3623a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f3620c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f3621d.get(mVar) != 127) {
                    if (jVar.h) {
                        m.f3622e.incrementAndGet(mVar);
                    }
                    int i5 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i5) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i5, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.h ? this.f3603l.a(jVar) : this.f3602k.a(jVar))) {
                throw new RejectedExecutionException(s.c.d(new StringBuilder(), this.f3601j, " was terminated"));
            }
        }
        if (z5) {
            if (f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i5;
        i iVar;
        if (f3597p.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !g4.i.a(aVar.f3589n, this)) {
                aVar = null;
            }
            synchronized (this.f3604m) {
                i5 = (int) (f3596o.get(this) & 2097151);
            }
            if (1 <= i5) {
                int i6 = 1;
                while (true) {
                    Object b2 = this.f3604m.b(i6);
                    g4.i.b(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f3583g;
                        f fVar = this.f3603l;
                        mVar.getClass();
                        i iVar2 = (i) m.f3619b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i a5 = mVar.a();
                            if (a5 == null) {
                                break;
                            } else {
                                fVar.a(a5);
                            }
                        }
                    }
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f3603l.b();
            this.f3602k.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f3602k.d();
                if (iVar == null && (iVar = (i) this.f3603l.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f3593k);
            }
            f3595n.set(this, 0L);
            f3596o.set(this, 0L);
        }
    }

    public final void d(a aVar, int i5, int i6) {
        while (true) {
            long j2 = f3595n.get(this);
            int i7 = (int) (2097151 & j2);
            long j5 = (2097152 + j2) & (-2097152);
            if (i7 == i5) {
                if (i6 == 0) {
                    Object c5 = aVar.c();
                    while (true) {
                        if (c5 == f3598q) {
                            i7 = -1;
                            break;
                        }
                        if (c5 == null) {
                            i7 = 0;
                            break;
                        }
                        a aVar2 = (a) c5;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i7 = b2;
                            break;
                        }
                        c5 = aVar2.c();
                    }
                } else {
                    i7 = i6;
                }
            }
            if (i7 >= 0) {
                if (f3595n.compareAndSet(this, j2, i7 | j5)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j2) {
        int i5 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = this.f3599g;
        if (i5 < i6) {
            int a5 = a();
            if (a5 == 1 && i6 > 1) {
                a();
            }
            if (a5 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final boolean f() {
        r rVar;
        int i5;
        while (true) {
            long j2 = f3595n.get(this);
            a aVar = (a) this.f3604m.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j2) & (-2097152);
                Object c5 = aVar.c();
                while (true) {
                    rVar = f3598q;
                    if (c5 == rVar) {
                        i5 = -1;
                        break;
                    }
                    if (c5 == null) {
                        i5 = 0;
                        break;
                    }
                    a aVar2 = (a) c5;
                    i5 = aVar2.b();
                    if (i5 != 0) {
                        break;
                    }
                    c5 = aVar2.c();
                }
                if (i5 >= 0) {
                    if (f3595n.compareAndSet(this, j2, i5 | j5)) {
                        aVar.g(rVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f3582o.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f3604m;
        int a5 = qVar.a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a5; i10++) {
            a aVar = (a) qVar.b(i10);
            if (aVar != null) {
                m mVar = aVar.f3583g;
                mVar.getClass();
                int i11 = m.f3619b.get(mVar) != null ? (m.f3620c.get(mVar) - m.f3621d.get(mVar)) + 1 : m.f3620c.get(mVar) - m.f3621d.get(mVar);
                int ordinal = aVar.f3584i.ordinal();
                if (ordinal == 0) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i11);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i6++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i7++;
                } else if (ordinal == 3) {
                    i8++;
                    if (i11 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i11);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new x();
                    }
                    i9++;
                }
            }
        }
        long j2 = f3596o.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3601j);
        sb4.append('@');
        sb4.append(w.e(this));
        sb4.append("[Pool Size {core = ");
        int i12 = this.f3599g;
        sb4.append(i12);
        sb4.append(", max = ");
        sb4.append(this.h);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i5);
        sb4.append(", blocking = ");
        sb4.append(i6);
        sb4.append(", parked = ");
        sb4.append(i7);
        sb4.append(", dormant = ");
        sb4.append(i8);
        sb4.append(", terminated = ");
        sb4.append(i9);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3602k.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3603l.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i12 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
