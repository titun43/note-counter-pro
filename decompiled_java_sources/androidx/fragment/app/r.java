package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class r extends a.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f419m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f420n;

    public r(s sVar, r rVar) {
        this.f420n = sVar;
    }

    @Override // a.a
    public final View r(int i5) {
        switch (this.f419m) {
            case 0:
                Dialog dialog = ((s) this.f420n).f430j0;
                if (dialog != null) {
                    return dialog.findViewById(i5);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.f420n + " does not have a view");
        }
    }

    @Override // a.a
    public final boolean s() {
        switch (this.f419m) {
            case 0:
                return ((s) this.f420n).f433n0;
            default:
                return false;
        }
    }

    public r(z zVar) {
        this.f420n = zVar;
    }
}
