package f0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final x f1427a;

    public y(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1427a = new w(nestedScrollView);
        } else {
            this.f1427a = new t2.i(13);
        }
    }
}
