package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.i0;

/* loaded from: classes.dex */
public abstract class f0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, m mVar) {
        g4.i.e(mVar, "event");
        if (activity instanceof t) {
            o lifecycle = ((t) activity).getLifecycle();
            if (lifecycle instanceof v) {
                ((v) lifecycle).e(mVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            i0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new i0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new i0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
