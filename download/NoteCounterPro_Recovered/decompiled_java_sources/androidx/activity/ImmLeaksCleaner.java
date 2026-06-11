package androidx.activity;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements androidx.lifecycle.r {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21g = 0;

    static {
        new t3.f(new w(0));
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            throw null;
        }
    }
}
