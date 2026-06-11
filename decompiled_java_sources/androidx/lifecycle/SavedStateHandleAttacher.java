package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements r {

    /* renamed from: g, reason: collision with root package name */
    public final m0 f513g;

    public SavedStateHandleAttacher(m0 m0Var) {
        this.f513g = m0Var;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar == m.ON_CREATE) {
            tVar.getLifecycle().b(this);
            this.f513g.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
        }
    }
}
