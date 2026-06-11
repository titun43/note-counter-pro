package k;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f2248d;

    public u0(z0 z0Var, int i5, int i6, WeakReference weakReference) {
        this.f2248d = z0Var;
        this.f2245a = i5;
        this.f2246b = i6;
        this.f2247c = weakReference;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new androidx.activity.o(this, 8));
    }

    public final void b(Typeface typeface) {
        int i5;
        if (Build.VERSION.SDK_INT >= 28 && (i5 = this.f2245a) != -1) {
            typeface = y0.a(typeface, i5, (this.f2246b & 2) != 0);
        }
        z0 z0Var = this.f2248d;
        if (z0Var.f2306m) {
            z0Var.f2305l = typeface;
            TextView textView = (TextView) this.f2247c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new v0(textView, z0Var.f2303j, 0, typeface));
                } else {
                    textView.setTypeface(typeface, z0Var.f2303j);
                }
            }
        }
    }
}
