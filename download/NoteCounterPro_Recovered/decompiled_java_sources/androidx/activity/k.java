package androidx.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.getcapacitor.PluginMethod;

/* loaded from: classes.dex */
public abstract class k {
    public static OnBackInvokedDispatcher a(Activity activity) {
        g4.i.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        g4.i.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
        return onBackInvokedDispatcher;
    }

    public static Object b(Bundle bundle, String str) {
        return bundle.getParcelable(str, d.a.class);
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void e(Object obj, Object obj2) {
        g4.i.e(obj, "dispatcher");
        g4.i.e(obj2, PluginMethod.RETURN_CALLBACK);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static void f(Object obj, Object obj2) {
        g4.i.e(obj, "dispatcher");
        g4.i.e(obj2, PluginMethod.RETURN_CALLBACK);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
