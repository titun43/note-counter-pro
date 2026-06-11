package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2259g;
    public final /* synthetic */ w1 h;

    public /* synthetic */ v1(w1 w1Var, int i5) {
        this.f2259g = i5;
        this.h = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2259g) {
            case 0:
                ViewParent parent = this.h.f2263j.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                w1 w1Var = this.h;
                w1Var.a();
                View view = w1Var.f2263j;
                if (view.isEnabled() && !view.isLongClickable() && w1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    w1Var.f2266m = true;
                    break;
                }
                break;
        }
    }
}
