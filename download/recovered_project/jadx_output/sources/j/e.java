package j;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1886g;
    public final /* synthetic */ v h;

    public /* synthetic */ e(v vVar, int i5) {
        this.f1886g = i5;
        this.h = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i5 = this.f1886g;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1886g) {
            case 0:
                h hVar = (h) this.h;
                ViewTreeObserver viewTreeObserver = hVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        hVar.D = view.getViewTreeObserver();
                    }
                    hVar.D.removeGlobalOnLayoutListener(hVar.f1918o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                e0 e0Var = (e0) this.h;
                ViewTreeObserver viewTreeObserver2 = e0Var.f1899u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        e0Var.f1899u = view.getViewTreeObserver();
                    }
                    e0Var.f1899u.removeGlobalOnLayoutListener(e0Var.f1893o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
