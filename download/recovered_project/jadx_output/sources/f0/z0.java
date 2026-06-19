package f0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class z0 extends d1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f1433c;

    public z0() {
        this.f1433c = androidx.lifecycle.g0.g();
    }

    @Override // f0.d1
    public q1 b() {
        WindowInsets build;
        a();
        build = this.f1433c.build();
        q1 g5 = q1.g(build, null);
        g5.f1406a.p(this.f1352b);
        return g5;
    }

    @Override // f0.d1
    public void d(y.c cVar) {
        this.f1433c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // f0.d1
    public void e(y.c cVar) {
        this.f1433c.setStableInsets(cVar.d());
    }

    @Override // f0.d1
    public void f(y.c cVar) {
        this.f1433c.setSystemGestureInsets(cVar.d());
    }

    @Override // f0.d1
    public void g(y.c cVar) {
        this.f1433c.setSystemWindowInsets(cVar.d());
    }

    @Override // f0.d1
    public void h(y.c cVar) {
        this.f1433c.setTappableElementInsets(cVar.d());
    }

    public z0(q1 q1Var) {
        super(q1Var);
        WindowInsets.Builder g5;
        WindowInsets f5 = q1Var.f();
        if (f5 != null) {
            g5 = androidx.lifecycle.g0.h(f5);
        } else {
            g5 = androidx.lifecycle.g0.g();
        }
        this.f1433c = g5;
    }
}
