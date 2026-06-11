package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final c1.d f554a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f555b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f556c;

    /* renamed from: d, reason: collision with root package name */
    public final t3.f f557d;

    public m0(c1.d dVar, x0 x0Var) {
        g4.i.e(dVar, "savedStateRegistry");
        this.f554a = dVar;
        this.f557d = new t3.f(new l0(x0Var, 0));
    }

    @Override // c1.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f556c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((n0) this.f557d.a()).f563d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a5 = ((j0) entry.getValue()).f548e.a();
            if (!g4.i.a(a5, Bundle.EMPTY)) {
                bundle.putBundle(str, a5);
            }
        }
        this.f555b = false;
        return bundle;
    }

    public final void b() {
        if (this.f555b) {
            return;
        }
        Bundle a5 = this.f554a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f556c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a5 != null) {
            bundle.putAll(a5);
        }
        this.f556c = bundle;
        this.f555b = true;
    }
}
