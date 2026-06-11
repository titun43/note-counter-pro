package androidx.activity;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* loaded from: classes.dex */
public abstract class a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i5) {
        return velocityTracker.getAxisVelocity(i5);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i5, int i6, int i7) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i5, i6, i7);
    }

    public static int f(ViewConfiguration viewConfiguration, int i5, int i6, int i7) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i5, i6, i7);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float h(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void i(TextView textView, int i5, float f5) {
        textView.setLineHeight(i5, f5);
    }

    public static int j(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float k(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float l(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
