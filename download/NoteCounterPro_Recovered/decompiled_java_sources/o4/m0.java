package o4;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m0 extends l0 implements a0 {

    /* renamed from: i, reason: collision with root package name */
    public final Executor f2820i;

    public m0(Executor executor) {
        Method method;
        this.f2820i = executor;
        Method method2 = t4.a.f3401a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = t4.a.f3401a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2820i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && ((m0) obj).f2820i == this.f2820i;
    }

    @Override // o4.r
    public final void f(w3.h hVar, Runnable runnable) {
        try {
            this.f2820i.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            r0 r0Var = (r0) hVar.d(s.h);
            if (r0Var != null) {
                r0Var.b(cancellationException);
            }
            v4.e eVar = e0.f2793a;
            v4.d.f3605i.f(hVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2820i);
    }

    @Override // o4.r
    public final String toString() {
        return this.f2820i.toString();
    }
}
