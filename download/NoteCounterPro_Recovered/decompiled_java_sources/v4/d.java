package v4;

import java.util.concurrent.Executor;
import o4.l0;
import o4.r;
import t4.u;

/* loaded from: classes.dex */
public final class d extends l0 implements Executor {

    /* renamed from: i, reason: collision with root package name */
    public static final d f3605i = new d();

    /* renamed from: j, reason: collision with root package name */
    public static final r f3606j;

    static {
        l lVar = l.f3618i;
        int i5 = u.f3444a;
        if (64 >= i5) {
            i5 = 64;
        }
        f3606j = lVar.m(t4.b.k("kotlinx.coroutines.io.parallelism", i5, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(w3.i.f3631g, runnable);
    }

    @Override // o4.r
    public final void f(w3.h hVar, Runnable runnable) {
        f3606j.f(hVar, runnable);
    }

    @Override // o4.r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
