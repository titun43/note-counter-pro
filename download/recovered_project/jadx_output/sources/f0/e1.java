package f0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e1 extends m1 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1353i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f1354j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f1355k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f1356l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f1357m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f1358c;

    /* renamed from: d, reason: collision with root package name */
    public y.c[] f1359d;

    /* renamed from: e, reason: collision with root package name */
    public y.c f1360e;

    /* renamed from: f, reason: collision with root package name */
    public q1 f1361f;

    /* renamed from: g, reason: collision with root package name */
    public y.c f1362g;
    public int h;

    public e1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var);
        this.f1360e = null;
        this.f1358c = windowInsets;
    }

    public static boolean A(int i5, int i6) {
        return (i5 & 6) == (i6 & 6);
    }

    private y.c t(int i5, boolean z4) {
        y.c cVar = y.c.f3728e;
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0) {
                cVar = y.c.a(cVar, u(i6, z4));
            }
        }
        return cVar;
    }

    private y.c v() {
        q1 q1Var = this.f1361f;
        return q1Var != null ? q1Var.f1406a.h() : y.c.f3728e;
    }

    private y.c w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f1353i) {
            y();
        }
        Method method = f1354j;
        if (method != null && f1355k != null && f1356l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1356l.get(f1357m.get(invoke));
                if (rect != null) {
                    return y.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void y() {
        try {
            f1354j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1355k = cls;
            f1356l = cls.getDeclaredField("mVisibleInsets");
            f1357m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1356l.setAccessible(true);
            f1357m.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f1353i = true;
    }

    @Override // f0.m1
    public void d(View view) {
        y.c w = w(view);
        if (w == null) {
            w = y.c.f3728e;
        }
        z(w);
    }

    @Override // f0.m1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Objects.equals(this.f1362g, e1Var.f1362g) && A(this.h, e1Var.h);
    }

    @Override // f0.m1
    public y.c f(int i5) {
        return t(i5, false);
    }

    @Override // f0.m1
    public final y.c j() {
        if (this.f1360e == null) {
            WindowInsets windowInsets = this.f1358c;
            this.f1360e = y.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1360e;
    }

    @Override // f0.m1
    public q1 l(int i5, int i6, int i7, int i8) {
        q1 g5 = q1.g(this.f1358c, null);
        int i9 = Build.VERSION.SDK_INT;
        d1 c1Var = i9 >= 34 ? new c1(g5) : i9 >= 31 ? new b1(g5) : i9 >= 30 ? new a1(g5) : i9 >= 29 ? new z0(g5) : new y0(g5);
        c1Var.g(q1.e(j(), i5, i6, i7, i8));
        c1Var.e(q1.e(h(), i5, i6, i7, i8));
        return c1Var.b();
    }

    @Override // f0.m1
    public boolean n() {
        return this.f1358c.isRound();
    }

    @Override // f0.m1
    public boolean o(int i5) {
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0 && !x(i6)) {
                return false;
            }
        }
        return true;
    }

    @Override // f0.m1
    public void p(y.c[] cVarArr) {
        this.f1359d = cVarArr;
    }

    @Override // f0.m1
    public void q(q1 q1Var) {
        this.f1361f = q1Var;
    }

    @Override // f0.m1
    public void s(int i5) {
        this.h = i5;
    }

    public y.c u(int i5, boolean z4) {
        y.c h;
        int i6;
        y.c cVar = y.c.f3728e;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 8) {
                    y.c[] cVarArr = this.f1359d;
                    h = cVarArr != null ? cVarArr[z2.b.l(8)] : null;
                    if (h != null) {
                        return h;
                    }
                    y.c j2 = j();
                    y.c v5 = v();
                    int i7 = j2.f3732d;
                    if (i7 > v5.f3732d) {
                        return y.c.b(0, 0, 0, i7);
                    }
                    y.c cVar2 = this.f1362g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i6 = this.f1362g.f3732d) > v5.f3732d) {
                        return y.c.b(0, 0, 0, i6);
                    }
                } else {
                    if (i5 == 16) {
                        return i();
                    }
                    if (i5 == 32) {
                        return g();
                    }
                    if (i5 == 64) {
                        return k();
                    }
                    if (i5 == 128) {
                        q1 q1Var = this.f1361f;
                        i e4 = q1Var != null ? q1Var.f1406a.e() : e();
                        if (e4 != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return y.c.b(i8 >= 28 ? b0.e.i(e4.f1378a) : 0, i8 >= 28 ? b0.e.k(e4.f1378a) : 0, i8 >= 28 ? b0.e.j(e4.f1378a) : 0, i8 >= 28 ? b0.e.h(e4.f1378a) : 0);
                        }
                    }
                }
            } else {
                if (z4) {
                    y.c v6 = v();
                    y.c h5 = h();
                    return y.c.b(Math.max(v6.f3729a, h5.f3729a), 0, Math.max(v6.f3731c, h5.f3731c), Math.max(v6.f3732d, h5.f3732d));
                }
                if ((this.h & 2) == 0) {
                    y.c j5 = j();
                    q1 q1Var2 = this.f1361f;
                    h = q1Var2 != null ? q1Var2.f1406a.h() : null;
                    int i9 = j5.f3732d;
                    if (h != null) {
                        i9 = Math.min(i9, h.f3732d);
                    }
                    return y.c.b(j5.f3729a, 0, j5.f3731c, i9);
                }
            }
        } else {
            if (z4) {
                return y.c.b(0, Math.max(v().f3730b, j().f3730b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return y.c.b(0, j().f3730b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean x(int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 8 && i5 != 128) {
                return true;
            }
        }
        return !u(i5, false).equals(y.c.f3728e);
    }

    public void z(y.c cVar) {
        this.f1362g = cVar;
    }
}
