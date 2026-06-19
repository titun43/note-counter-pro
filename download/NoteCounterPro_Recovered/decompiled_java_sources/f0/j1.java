package f0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class j1 extends i1 {

    /* renamed from: r, reason: collision with root package name */
    public static final q1 f1385r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1385r = q1.g(windowInsets, null);
    }

    public j1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
    }

    @Override // f0.e1, f0.m1
    public y.c f(int i5) {
        Insets insets;
        insets = this.f1358c.getInsets(o1.a(i5));
        return y.c.c(insets);
    }

    @Override // f0.e1, f0.m1
    public boolean o(int i5) {
        boolean isVisible;
        isVisible = this.f1358c.isVisible(o1.a(i5));
        return isVisible;
    }

    @Override // f0.e1, f0.m1
    public final void d(View view) {
    }
}
