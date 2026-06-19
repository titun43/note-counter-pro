package h3;

import com.google.android.gms.common.internal.b0;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class n extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1727a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m f1728b = new m();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1729c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f1730d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1731e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f1732f;

    @Override // h3.g
    public final Exception a() {
        Exception exc;
        synchronized (this.f1727a) {
            exc = this.f1732f;
        }
        return exc;
    }

    @Override // h3.g
    public final Object b() {
        Object obj;
        synchronized (this.f1727a) {
            try {
                b0.i("Task is not yet complete", this.f1729c);
                if (this.f1730d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f1732f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f1731e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // h3.g
    public final boolean c() {
        boolean z4;
        synchronized (this.f1727a) {
            try {
                z4 = false;
                if (this.f1729c && !this.f1730d && this.f1732f == null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public final void d(Exception exc) {
        b0.h(exc, "Exception must not be null");
        synchronized (this.f1727a) {
            g();
            this.f1729c = true;
            this.f1732f = exc;
        }
        this.f1728b.b(this);
    }

    public final void e(Object obj) {
        synchronized (this.f1727a) {
            g();
            this.f1729c = true;
            this.f1731e = obj;
        }
        this.f1728b.b(this);
    }

    public final void f() {
        synchronized (this.f1727a) {
            try {
                if (this.f1729c) {
                    return;
                }
                this.f1729c = true;
                this.f1730d = true;
                this.f1728b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        boolean z4;
        if (this.f1729c) {
            int i5 = c.f1712g;
            synchronized (this.f1727a) {
                z4 = this.f1729c;
            }
            if (!z4) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception a5 = a();
        }
    }

    public final void h() {
        synchronized (this.f1727a) {
            try {
                if (this.f1729c) {
                    this.f1728b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
