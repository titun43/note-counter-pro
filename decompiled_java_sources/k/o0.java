package k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class o0 implements PopupWindow.OnDismissListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j.d f2180g;
    public final /* synthetic */ p0 h;

    public o0(p0 p0Var, j.d dVar) {
        this.h = p0Var;
        this.f2180g = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.h.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2180g);
        }
    }
}
