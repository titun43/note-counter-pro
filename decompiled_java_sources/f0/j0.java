package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public q1 f1382a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1384c;

    public j0(View view, t tVar) {
        this.f1383b = view;
        this.f1384c = tVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q1 g5 = q1.g(windowInsets, view);
        int i5 = Build.VERSION.SDK_INT;
        t tVar = this.f1384c;
        if (i5 < 30) {
            k0.a(windowInsets, this.f1383b);
            if (g5.equals(this.f1382a)) {
                return tVar.d(view, g5).f();
            }
        }
        this.f1382a = g5;
        q1 d5 = tVar.d(view, g5);
        if (i5 >= 30) {
            return d5.f();
        }
        WeakHashMap weakHashMap = r0.f1407a;
        i0.c(view);
        return d5.f();
    }
}
