package f0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final View f1421g;
    public ViewTreeObserver h;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f1422i;

    public v(View view, Runnable runnable) {
        this.f1421g = view;
        this.h = view.getViewTreeObserver();
        this.f1422i = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        v vVar = new v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.h.isAlive();
        View view = this.f1421g;
        if (isAlive) {
            this.h.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f1422i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.h = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.h.isAlive();
        View view2 = this.f1421g;
        if (isAlive) {
            this.h.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
