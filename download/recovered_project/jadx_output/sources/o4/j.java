package o4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class j extends v0 implements i {

    /* renamed from: e, reason: collision with root package name */
    public final z0 f2807e;

    public j(z0 z0Var) {
        this.f2807e = z0Var;
    }

    @Override // o4.i
    public final boolean b(Throwable th) {
        z0 j2 = j();
        if (th instanceof CancellationException) {
            j2.getClass();
        } else if (!j2.r(th) || !j2.y()) {
            return false;
        }
        return true;
    }

    @Override // o4.v0
    public final boolean k() {
        return true;
    }

    @Override // o4.v0
    public final void l(Throwable th) {
        this.f2807e.r(j());
    }
}
