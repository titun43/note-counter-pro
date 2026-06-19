package f0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class i0 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i5 = t0.f1418a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
