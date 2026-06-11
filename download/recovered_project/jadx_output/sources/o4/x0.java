package o4;

/* loaded from: classes.dex */
public final class x0 extends v0 {

    /* renamed from: e, reason: collision with root package name */
    public final z0 f2846e;

    /* renamed from: f, reason: collision with root package name */
    public final y0 f2847f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2848g;
    public final Object h;

    public x0(z0 z0Var, y0 y0Var, j jVar, Object obj) {
        this.f2846e = z0Var;
        this.f2847f = y0Var;
        this.f2848g = jVar;
        this.h = obj;
    }

    @Override // o4.v0
    public final boolean k() {
        return false;
    }

    @Override // o4.v0
    public final void l(Throwable th) {
        j jVar = this.f2848g;
        j I = z0.I(jVar);
        z0 z0Var = this.f2846e;
        y0 y0Var = this.f2847f;
        Object obj = this.h;
        if (I == null || !z0Var.R(y0Var, I, obj)) {
            y0Var.f2853a.e(new t4.i(2), 2);
            j I2 = z0.I(jVar);
            if (I2 == null || !z0Var.R(y0Var, I2, obj)) {
                z0Var.p(z0Var.x(y0Var, obj));
            }
        }
    }
}
