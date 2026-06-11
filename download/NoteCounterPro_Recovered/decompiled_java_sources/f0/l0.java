package f0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class l0 {
    public static q1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q1 g5 = q1.g(rootWindowInsets, null);
        m1 m1Var = g5.f1406a;
        m1Var.q(g5);
        m1Var.d(view.getRootView());
        return g5;
    }

    public static void b(View view, int i5, int i6) {
        view.setScrollIndicators(i5, i6);
    }
}
