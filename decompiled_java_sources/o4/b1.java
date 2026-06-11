package o4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class b1 extends w3.a implements r0 {
    public static final b1 h = new b1(s.h);

    @Override // o4.r0
    public final boolean a() {
        return true;
    }

    @Override // o4.r0
    public final f0 e(boolean z4, boolean z5, u0 u0Var) {
        return c1.f2790a;
    }

    @Override // o4.r0
    public final CancellationException g() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // o4.r0
    public final f0 h(f4.l lVar) {
        return c1.f2790a;
    }

    @Override // o4.r0
    public final boolean isCancelled() {
        return false;
    }

    @Override // o4.r0
    public final i n(z0 z0Var) {
        return c1.f2790a;
    }

    @Override // o4.r0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // o4.r0
    public final void b(CancellationException cancellationException) {
    }
}
