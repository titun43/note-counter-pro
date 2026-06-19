package q;

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
    public static final boolean f3062j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f3063k = Logger.getLogger(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public static final z2.b f3064l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3065m;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f3066g;
    public volatile d h;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f3067i;

    static {
        z2.b fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f3064l = fVar;
        if (th != null) {
            f3063k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3065m = new Object();
    }

    public static void b(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f3067i;
        } while (!f3064l.d(hVar, gVar, g.f3059c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f3060a;
            if (thread != null) {
                gVar.f3060a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f3061b;
        }
        do {
            dVar2 = hVar.h;
        } while (!f3064l.b(hVar, dVar2, d.f3050d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f3053c;
            dVar.f3053c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f3053c;
            c(dVar3.f3051a, dVar3.f3052b);
            dVar3 = dVar4;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f3063k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3047a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3049a);
        }
        if (obj == f3065m) {
            return null;
        }
        return obj;
    }

    public static Object e(h hVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object e4 = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(e4 == this ? "this future" : String.valueOf(e4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    @Override // j3.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.h;
        d dVar2 = d.f3050d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3053c = dVar;
                if (f3064l.b(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.h;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f3066g;
        if (obj != null) {
            return false;
        }
        if (!f3064l.c(this, obj, f3062j ? new a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? a.f3045b : a.f3046c)) {
            return false;
        }
        b(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(g gVar) {
        gVar.f3060a = null;
        while (true) {
            g gVar2 = this.f3067i;
            if (gVar2 == g.f3059c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f3061b;
                if (gVar2.f3060a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f3061b = gVar4;
                    if (gVar3.f3060a == null) {
                        break;
                    }
                } else if (!f3064l.d(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        g gVar = g.f3059c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3066g;
        if (obj != null) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f3067i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    z2.b bVar = f3064l;
                    bVar.u(gVar3, gVar2);
                    if (bVar.d(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3066g;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(gVar3);
                    } else {
                        gVar2 = this.f3067i;
                    }
                } while (gVar2 != gVar);
            }
            return d(this.f3066g);
        }
        while (nanos > 0) {
            Object obj3 = this.f3066g;
            if (obj3 != null) {
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
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = j5 + convert + " " + lowerCase;
                if (z4) {
                    str2 = u.j(str2, ",");
                }
                j5 = u.j(str2, " ");
            }
            if (z4) {
                j5 = j5 + nanos2 + " nanoseconds ";
            }
            str = u.j(j5, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(u.j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(u.k(str, " for ", hVar));
    }

    public boolean h(Throwable th) {
        th.getClass();
        if (!f3064l.c(this, null, new c(th))) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3066g instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3066g != null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3066g instanceof a) {
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
        g gVar = g.f3059c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3066g;
            if (obj2 != null) {
                return d(obj2);
            }
            g gVar2 = this.f3067i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    z2.b bVar = f3064l;
                    bVar.u(gVar3, gVar2);
                    if (bVar.d(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3066g;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    gVar2 = this.f3067i;
                } while (gVar2 != gVar);
            }
            return d(this.f3066g);
        }
        throw new InterruptedException();
    }
}
