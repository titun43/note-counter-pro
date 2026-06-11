package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class d0 extends ContentFrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f0 f1502o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, i.d dVar) {
        super(dVar, null);
        this.f1502o = f0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1502o.w(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x5 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x5 < -5 || y2 < -5 || x5 > getWidth() + 5 || y2 > getHeight() + 5) {
                f0 f0Var = this.f1502o;
                f0Var.u(f0Var.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i5) {
        setBackgroundDrawable(b3.g.t(getContext(), i5));
    }
}
