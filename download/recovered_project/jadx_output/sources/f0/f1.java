package f0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class f1 extends e1 {

    /* renamed from: n, reason: collision with root package name */
    public y.c f1365n;

    public f1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
        this.f1365n = null;
    }

    @Override // f0.m1
    public q1 b() {
        return q1.g(this.f1358c.consumeStableInsets(), null);
    }

    @Override // f0.m1
    public q1 c() {
        return q1.g(this.f1358c.consumeSystemWindowInsets(), null);
    }

    @Override // f0.m1
    public final y.c h() {
        if (this.f1365n == null) {
            WindowInsets windowInsets = this.f1358c;
            this.f1365n = y.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1365n;
    }

    @Override // f0.m1
    public boolean m() {
        return this.f1358c.isConsumed();
    }

    @Override // f0.m1
    public void r(y.c cVar) {
        this.f1365n = cVar;
    }
}
