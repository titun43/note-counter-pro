package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class d0 extends a.a implements androidx.lifecycle.x0, androidx.lifecycle.t, c1.f, z0 {

    /* renamed from: m, reason: collision with root package name */
    public final g.k f367m;

    /* renamed from: n, reason: collision with root package name */
    public final g.k f368n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f369o;

    /* renamed from: p, reason: collision with root package name */
    public final v0 f370p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g.k f371q;

    public d0(g.k kVar) {
        this.f371q = kVar;
        Handler handler = new Handler();
        this.f367m = kVar;
        this.f368n = kVar;
        this.f369o = handler;
        this.f370p = new v0();
    }

    @Override // androidx.fragment.app.z0
    public final void a(z zVar) {
        this.f371q.onAttachFragment(zVar);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return this.f371q.mFragmentLifecycleRegistry;
    }

    @Override // c1.f
    public final c1.d getSavedStateRegistry() {
        return this.f371q.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.x0
    public final androidx.lifecycle.w0 getViewModelStore() {
        return this.f371q.getViewModelStore();
    }

    @Override // a.a
    public final View r(int i5) {
        return this.f371q.findViewById(i5);
    }

    @Override // a.a
    public final boolean s() {
        Window window = this.f371q.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
