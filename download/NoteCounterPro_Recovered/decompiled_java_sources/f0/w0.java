package f0;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1426a;

    public w0(View view) {
        this.f1426a = new WeakReference(view);
    }

    public final void a(float f5) {
        View view = (View) this.f1426a.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
    }

    public final void b() {
        View view = (View) this.f1426a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f1426a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(x0 x0Var) {
        View view = (View) this.f1426a.get();
        if (view != null) {
            if (x0Var != null) {
                view.animate().setListener(new v0(x0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f5) {
        View view = (View) this.f1426a.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
    }
}
