package k;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l2 extends g2 implements h2 {
    public static final Method I;
    public u1.f H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.h2
    public final void e(j.n nVar, j.p pVar) {
        u1.f fVar = this.H;
        if (fVar != null) {
            fVar.e(nVar, pVar);
        }
    }

    @Override // k.h2
    public final void i(j.n nVar, MenuItem menuItem) {
        u1.f fVar = this.H;
        if (fVar != null) {
            fVar.i(nVar, menuItem);
        }
    }

    @Override // k.g2
    public final t1 q(Context context, boolean z4) {
        k2 k2Var = new k2(context, z4);
        k2Var.setHoverListener(this);
        return k2Var;
    }
}
