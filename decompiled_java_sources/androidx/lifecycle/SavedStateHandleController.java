package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements r {

    /* renamed from: g, reason: collision with root package name */
    public final String f514g;
    public final j0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f515i;

    public SavedStateHandleController(String str, j0 j0Var) {
        this.f514g = str;
        this.h = j0Var;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            this.f515i = false;
            tVar.getLifecycle().b(this);
        }
    }

    public final void b(o oVar, c1.d dVar) {
        g4.i.e(dVar, "registry");
        g4.i.e(oVar, "lifecycle");
        if (this.f515i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f515i = true;
        oVar.a(this);
        dVar.c(this.f514g, this.h.f548e);
    }
}
