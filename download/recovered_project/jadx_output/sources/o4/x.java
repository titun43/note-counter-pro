package o4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class x extends j0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: o, reason: collision with root package name */
    public static final x f2844o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f2845p;

    static {
        Long l5;
        x xVar = new x();
        f2844o = xVar;
        xVar.q(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f2845p = timeUnit.toNanos(l5.longValue());
    }

    @Override // o4.k0
    public final Thread p() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f2844o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean t5;
        g1.f2801a.set(this);
        try {
            synchronized (this) {
                int i5 = debugStatus;
                if (i5 == 2 || i5 == 3) {
                    if (t5) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long u4 = u();
                    if (u4 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f2845p + nanoTime;
                        }
                        long j5 = j2 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            v();
                            if (t()) {
                                return;
                            }
                            p();
                            return;
                        }
                        if (u4 > j5) {
                            u4 = j5;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (u4 > 0) {
                        int i6 = debugStatus;
                        if (i6 == 2 || i6 == 3) {
                            _thread = null;
                            v();
                            if (t()) {
                                return;
                            }
                            p();
                            return;
                        }
                        LockSupport.parkNanos(this, u4);
                    }
                }
            }
        } finally {
            _thread = null;
            v();
            if (!t()) {
                p();
            }
        }
    }

    @Override // o4.j0
    public final void s(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.s(runnable);
    }

    @Override // o4.j0, o4.k0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // o4.r
    public final String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void v() {
        int i5 = debugStatus;
        if (i5 == 2 || i5 == 3) {
            debugStatus = 3;
            j0.f2808l.set(this, null);
            j0.f2809m.set(this, null);
            notifyAll();
        }
    }
}
