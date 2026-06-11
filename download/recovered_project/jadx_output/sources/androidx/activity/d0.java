package androidx.activity;

/* loaded from: classes.dex */
public final class d0 implements d {

    /* renamed from: g, reason: collision with root package name */
    public final y f37g;
    public final /* synthetic */ f0 h;

    public d0(f0 f0Var, y yVar) {
        g4.i.e(yVar, "onBackPressedCallback");
        this.h = f0Var;
        this.f37g = yVar;
    }

    @Override // androidx.activity.d
    public final void cancel() {
        f0 f0Var = this.h;
        u3.e eVar = f0Var.f42b;
        y yVar = this.f37g;
        eVar.remove(yVar);
        if (g4.i.a(f0Var.f43c, yVar)) {
            yVar.handleOnBackCancelled();
            f0Var.f43c = null;
        }
        yVar.removeCancellable(this);
        f4.a enabledChangedCallback$activity_release = yVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        yVar.setEnabledChangedCallback$activity_release(null);
    }
}
