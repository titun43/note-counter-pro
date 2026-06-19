package androidx.activity;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, d {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.o f22g;
    public final y h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f23i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f24j;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(f0 f0Var, androidx.lifecycle.o oVar, y yVar) {
        g4.i.e(yVar, "onBackPressedCallback");
        this.f24j = f0Var;
        this.f22g = oVar;
        this.h = yVar;
        oVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar != androidx.lifecycle.m.ON_START) {
            if (mVar != androidx.lifecycle.m.ON_STOP) {
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                d0 d0Var = this.f23i;
                if (d0Var != null) {
                    d0Var.cancel();
                    return;
                }
                return;
            }
        }
        f0 f0Var = this.f24j;
        f0Var.getClass();
        y yVar = this.h;
        g4.i.e(yVar, "onBackPressedCallback");
        f0Var.f42b.addLast(yVar);
        d0 d0Var2 = new d0(f0Var, yVar);
        yVar.addCancellable(d0Var2);
        f0Var.e();
        yVar.setEnabledChangedCallback$activity_release(new e0(0, f0Var, f0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1));
        this.f23i = d0Var2;
    }

    @Override // androidx.activity.d
    public final void cancel() {
        this.f22g.b(this);
        this.h.removeCancellable(this);
        d0 d0Var = this.f23i;
        if (d0Var != null) {
            d0Var.cancel();
        }
        this.f23i = null;
    }
}
