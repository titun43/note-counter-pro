package s;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3284g;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f3284g = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f3284g.o(0);
        return true;
    }
}
