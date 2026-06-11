package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import com.getcapacitor.PluginMethod;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        g4.i.e(activity, "activity");
        g4.i.e(activityLifecycleCallbacks, PluginMethod.RETURN_CALLBACK);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
