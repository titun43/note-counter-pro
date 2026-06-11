package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f438a;

    public u(z zVar) {
        this.f438a = zVar;
    }

    @Override // androidx.fragment.app.y
    public final void a() {
        z zVar = this.f438a;
        zVar.V.a();
        androidx.lifecycle.k0.d(zVar);
        Bundle bundle = zVar.h;
        zVar.V.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
