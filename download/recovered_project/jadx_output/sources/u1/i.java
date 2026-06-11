package u1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements Executor {
    public final Executor h;

    /* renamed from: j, reason: collision with root package name */
    public volatile Runnable f3508j;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3506g = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public final Object f3507i = new Object();

    public i(Executor executor) {
        this.h = executor;
    }

    public final void a() {
        synchronized (this.f3507i) {
            try {
                Runnable runnable = (Runnable) this.f3506g.poll();
                this.f3508j = runnable;
                if (runnable != null) {
                    this.h.execute(this.f3508j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3507i) {
            try {
                this.f3506g.add(new c0.a(21, this, runnable));
                if (this.f3508j == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
