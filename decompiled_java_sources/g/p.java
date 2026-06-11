package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final Object f1604g = new Object();
    public final ArrayDeque h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public final q f1605i;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f1606j;

    public p(q qVar) {
        this.f1605i = qVar;
    }

    public final void a() {
        synchronized (this.f1604g) {
            try {
                Runnable runnable = (Runnable) this.h.poll();
                this.f1606j = runnable;
                if (runnable != null) {
                    this.f1605i.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f1604g) {
            try {
                this.h.add(new a2.b(8, this, runnable));
                if (this.f1606j == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
