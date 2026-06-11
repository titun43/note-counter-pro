package k;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class f2 implements View.OnTouchListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2 f2069g;

    public f2(g2 g2Var) {
        this.f2069g = g2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g2 g2Var = this.f2069g;
        c2 c2Var = g2Var.w;
        Handler handler = g2Var.A;
        c0 c0Var = g2Var.E;
        int action = motionEvent.getAction();
        int x5 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0 && c0Var != null && c0Var.isShowing() && x5 >= 0 && x5 < c0Var.getWidth() && y2 >= 0 && y2 < c0Var.getHeight()) {
            handler.postDelayed(c2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(c2Var);
        return false;
    }
}
