package o4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class j0 extends k0 implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2808l = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_queue$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2809m = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_delayed$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2810n = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // o4.r
    public final void f(w3.h hVar, Runnable runnable) {
        s(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r6 = p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2808l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f2810n.get(this) == 1) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof t4.n)) {
                    if (obj != w.f2836b) {
                        t4.n nVar = new t4.n(8, true);
                        nVar.a((Runnable) obj);
                        nVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                t4.n nVar2 = (t4.n) obj;
                int a5 = nVar2.a(runnable);
                if (a5 == 0) {
                    break;
                }
                if (a5 == 1) {
                    t4.n c5 = nVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a5 == 2) {
                    break;
                }
            } else {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            }
        }
        x.f2844o.s(runnable);
    }

    @Override // o4.k0
    public void shutdown() {
        g1.f2801a.set(null);
        f2810n.set(this, 1);
        androidx.emoji2.text.r rVar = w.f2836b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2808l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof t4.n)) {
                    if (obj != rVar) {
                        t4.n nVar = new t4.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((t4.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (u() <= 0) {
        }
        System.nanoTime();
    }

    public final boolean t() {
        u3.e eVar = this.f2814k;
        if (eVar != null ? eVar.isEmpty() : true) {
            Object obj = f2808l.get(this);
            if (obj != null) {
                if (obj instanceof t4.n) {
                    long j2 = t4.n.f3432f.get((t4.n) obj);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (obj == w.f2836b) {
                }
            }
            return true;
        }
        return false;
    }

    public final long u() {
        Runnable runnable;
        if (!r()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2808l;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof t4.n)) {
                    if (obj != w.f2836b) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                t4.n nVar = (t4.n) obj;
                Object d5 = nVar.d();
                if (d5 != t4.n.f3433g) {
                    runnable = (Runnable) d5;
                    break;
                }
                t4.n c5 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            u3.e eVar = this.f2814k;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f2808l.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof t4.n) {
                        long j2 = t4.n.f3432f.get((t4.n) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == w.f2836b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }
}
