package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements r {

    /* renamed from: g, reason: collision with root package name */
    public final e f510g;
    public final r h;

    public DefaultLifecycleObserverAdapter(e eVar, r rVar) {
        this.f510g = eVar;
        this.h = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        int i5 = f.f541a[mVar.ordinal()];
        if (i5 == 3) {
            this.f510g.onResume();
        } else if (i5 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        r rVar = this.h;
        if (rVar != null) {
            rVar.a(tVar, mVar);
        }
    }
}
