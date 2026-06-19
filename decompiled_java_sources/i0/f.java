package i0;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(NestedScrollView nestedScrollView, float f5) {
        try {
            nestedScrollView.setFrameContentVelocity(f5);
        } catch (LinkageError unused) {
        }
    }
}
