package f0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class l1 extends k1 {

    /* renamed from: s, reason: collision with root package name */
    public static final q1 f1390s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1390s = q1.g(windowInsets, null);
    }

    public l1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
    }

    @Override // f0.j1, f0.e1, f0.m1
    public y.c f(int i5) {
        Insets insets;
        insets = this.f1358c.getInsets(p1.a(i5));
        return y.c.c(insets);
    }

    @Override // f0.j1, f0.e1, f0.m1
    public boolean o(int i5) {
        boolean isVisible;
        isVisible = this.f1358c.isVisible(p1.a(i5));
        return isVisible;
    }
}
