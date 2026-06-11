package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class y {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, f0 f0Var) {
        Objects.requireNonNull(f0Var);
        androidx.activity.b0 b0Var = new androidx.activity.b0(f0Var, 1);
        androidx.activity.t.k(obj).registerOnBackInvokedCallback(1000000, b0Var);
        return b0Var;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.t.k(obj).unregisterOnBackInvokedCallback(androidx.activity.t.h(obj2));
    }
}
