package g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.lokhnathtechnical.notecounterpro.R;
import f0.a1;
import f0.b1;
import f0.c1;
import f0.d1;
import f0.q1;
import f0.y0;
import f0.z0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.k3;
import k.l3;

/* loaded from: classes.dex */
public final class t implements f0.t, j.y {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f1650g;

    public /* synthetic */ t(f0 f0Var) {
        this.f1650g = f0Var;
    }

    @Override // j.y
    public void b(j.n nVar, boolean z4) {
        this.f1650g.t(nVar);
    }

    @Override // f0.t
    public q1 d(View view, q1 q1Var) {
        int i5;
        boolean z4;
        q1 q1Var2;
        boolean z5;
        int d5 = q1Var.d();
        f0 f0Var = this.f1650g;
        Context context = f0Var.f1544q;
        int d6 = q1Var.d();
        ActionBarContextView actionBarContextView = f0Var.B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i5 = 0;
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f0Var.B.getLayoutParams();
            if (f0Var.B.isShown()) {
                if (f0Var.f1539i0 == null) {
                    f0Var.f1539i0 = new Rect();
                    f0Var.f1540j0 = new Rect();
                }
                Rect rect = f0Var.f1539i0;
                Rect rect2 = f0Var.f1540j0;
                rect.set(q1Var.b(), q1Var.d(), q1Var.c(), q1Var.a());
                ViewGroup viewGroup = f0Var.G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z6 = l3.f2159a;
                    k3.a(viewGroup, rect, rect2);
                } else {
                    if (!l3.f2159a) {
                        l3.f2159a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            l3.f2160b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                l3.f2160b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = l3.f2160b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e4) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                        }
                    }
                }
                int i6 = rect.top;
                int i7 = rect.left;
                int i8 = rect.right;
                ViewGroup viewGroup2 = f0Var.G;
                WeakHashMap weakHashMap = f0.r0.f1407a;
                q1 a5 = f0.l0.a(viewGroup2);
                int b2 = a5 == null ? 0 : a5.b();
                int c5 = a5 == null ? 0 : a5.c();
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.rightMargin = i8;
                    z5 = true;
                }
                if (i6 <= 0 || f0Var.I != null) {
                    View view2 = f0Var.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c5) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c5;
                            f0Var.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    f0Var.I = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c5;
                    f0Var.G.addView(f0Var.I, -1, layoutParams);
                }
                View view4 = f0Var.I;
                r12 = view4 != null;
                if (r12 && view4.getVisibility() != 0) {
                    View view5 = f0Var.I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? v.a.getColor(context, R.color.abc_decor_view_status_guard_light) : v.a.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!f0Var.N && r12) {
                    d6 = 0;
                }
                z4 = r12;
                i5 = 0;
                r12 = z5;
            } else {
                i5 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z4 = false;
                } else {
                    z4 = false;
                    r12 = false;
                }
            }
            if (r12) {
                f0Var.B.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = f0Var.I;
        if (view6 != null) {
            view6.setVisibility(z4 ? i5 : 8);
        }
        if (d5 != d6) {
            int b5 = q1Var.b();
            int c6 = q1Var.c();
            int a6 = q1Var.a();
            int i11 = Build.VERSION.SDK_INT;
            d1 c1Var = i11 >= 34 ? new c1(q1Var) : i11 >= 31 ? new b1(q1Var) : i11 >= 30 ? new a1(q1Var) : i11 >= 29 ? new z0(q1Var) : new y0(q1Var);
            c1Var.g(y.c.b(b5, d6, c6, a6));
            q1Var2 = c1Var.b();
        } else {
            q1Var2 = q1Var;
        }
        WeakHashMap weakHashMap2 = f0.r0.f1407a;
        WindowInsets f5 = q1Var2.f();
        if (f5 == null) {
            return q1Var2;
        }
        WindowInsets b6 = f0.i0.b(view, f5);
        return !b6.equals(f5) ? q1.g(b6, view) : q1Var2;
    }

    @Override // j.y
    public boolean k(j.n nVar) {
        Window.Callback callback = this.f1650g.f1545r.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, nVar);
        return true;
    }
}
