package androidx.lifecycle;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f511g;
    public final /* synthetic */ c1.d h;

    public LegacySavedStateHandleController$tryToAddRecreator$1(o oVar, c1.d dVar) {
        this.f511g = oVar;
        this.h = dVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar == m.ON_START) {
            this.f511g.b(this);
            this.h.d();
        }
    }
}
