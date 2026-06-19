package androidx.fragment.app;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final h f380b;

    public g(h hVar) {
        this.f380b = hVar;
    }

    @Override // androidx.fragment.app.f1
    public final void a(ViewGroup viewGroup) {
        g4.i.e(viewGroup, "container");
        if (this.f380b.x()) {
            throw null;
        }
        viewGroup.getContext();
        throw null;
    }
}
