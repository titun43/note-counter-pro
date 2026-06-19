package v1;

import androidx.emoji2.text.u;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class h implements j3.a {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f3572j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f3573k = Logger.getLogger(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public static final y4.b f3574l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3575m;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f3576g;
    public volatile c h;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f3577i;

    static {
        y4.b fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f3574l = fVar;
        if (th != null) {
            f3573k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3575m = new Object();
    }

    public static void b(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f3577i;
            if (f3574l.e(hVar, gVar, g.f3569c)) {
                while (gVar != null) {
                    Thread thread = gVar.f3570a;
                    if (thread != null) {
                        gVar.f3570a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f3571b;
                }
                do {
                    cVar = hVar.h;
                } while (!f3574l.c(hVar, cVar, c.f3559d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f3562c;
                    cVar3.f3562c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f3562c;
                    Runnable runnable = cVar2.f3560a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f3568g;
                        if (hVar.f3576g == eVar) {
                            if (f3574l.d(hVar, eVar, e(eVar.h))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, cVar2.f3561b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f3573k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3556b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f3558a);
        }
        if (obj == f3575m) {
            return null;
        }
        return obj;
    }

    public static Object e(j3.a aVar) {
        Object obj;
        if (aVar instanceof h) {
            Object obj2 = ((h) aVar).f3576g;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar2 = (a) obj2;
            return aVar2.f3555a ? aVar2.f3556b != null ? new a(false, aVar2.f3556b) : a.f3554d : obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        boolean z4 = true;
        if ((!f3572j) && isCancelled) {
            return a.f3554d;
        }
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = z4;
                } catch (Throwable th) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e4) {
                if (isCancelled) {
                    return new a(false, e4);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e4));
            } catch (ExecutionException e5) {
                return new b(e5.getCause());
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f3575m : obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e4) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e4.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e5) {
                sb.append("FAILURE, cause=[");
                sb.append(e5.getCause());
                sb.append("]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // j3.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.h;
        c cVar2 = c.f3559d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f3562c = cVar;
                if (f3574l.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.h;
                }
            } while (cVar != cVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f3576g;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        a aVar = f3572j ? new a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? a.f3553c : a.f3554d;
        h hVar = this;
        boolean z5 = false;
        while (true) {
            if (f3574l.d(hVar, obj, aVar)) {
                b(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                j3.a aVar2 = ((e) obj).h;
                if (!(aVar2 instanceof h)) {
                    aVar2.cancel(z4);
                    break;
                }
                hVar = (h) aVar2;
                obj = hVar.f3576g;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z5 = true;
            } else {
                obj = hVar.f3576g;
                if (!(obj instanceof e)) {
                    return z5;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        Object obj = this.f3576g;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            j3.a aVar = ((e) obj).h;
            return s.c.d(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(g gVar) {
        gVar.f3570a = null;
        while (true) {
            g gVar2 = this.f3577i;
            if (gVar2 == g.f3569c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f3571b;
                if (gVar2.f3570a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f3571b = gVar4;
                    if (gVar3.f3570a == null) {
                        break;
                    }
                } else if (!f3574l.e(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        boolean z4;
        g gVar = g.f3569c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3576g;
        if ((obj != null) && (!(obj instanceof e))) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f3577i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z4 = true;
                do {
                    y4.b bVar = f3574l;
                    bVar.E(gVar3, gVar2);
                    if (bVar.e(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3576g;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(gVar3);
                    } else {
                        gVar2 = this.f3577i;
                    }
                } while (gVar2 != gVar);
            }
            return d(this.f3576g);
        }
        z4 = true;
        while (nanos > 0) {
            Object obj3 = this.f3576g;
            if ((obj3 != null ? z4 : false) && (!(obj3 instanceof e))) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String hVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String j5 = u.j(str, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z5 = (convert == 0 || nanos2 > 1000) ? z4 : false;
            if (convert > 0) {
                String str2 = j5 + convert + " " + lowerCase;
                if (z5) {
                    str2 = u.j(str2, ",");
                }
                j5 = u.j(str2, " ");
            }
            if (z5) {
                j5 = j5 + nanos2 + " nanoseconds ";
            }
            str = u.j(j5, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(u.j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(u.k(str, " for ", hVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3576g instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f3576g != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3576g instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = f();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f3569c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3576g;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return d(obj2);
            }
            g gVar2 = this.f3577i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    y4.b bVar = f3574l;
                    bVar.E(gVar3, gVar2);
                    if (bVar.e(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3576g;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return d(obj);
                    }
                    gVar2 = this.f3577i;
                } while (gVar2 != gVar);
            }
            return d(this.f3576g);
        }
        throw new InterruptedException();
    }
}
