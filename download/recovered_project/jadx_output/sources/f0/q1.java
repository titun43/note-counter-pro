package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f1405b;

    /* renamed from: a, reason: collision with root package name */
    public final m1 f1406a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            f1405b = l1.f1390s;
        } else if (i5 >= 30) {
            f1405b = j1.f1385r;
        } else {
            f1405b = m1.f1394b;
        }
    }

    public q1(WindowInsets windowInsets) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            this.f1406a = new l1(this, windowInsets);
            return;
        }
        if (i5 >= 31) {
            this.f1406a = new k1(this, windowInsets);
            return;
        }
        if (i5 >= 30) {
            this.f1406a = new j1(this, windowInsets);
            return;
        }
        if (i5 >= 29) {
            this.f1406a = new i1(this, windowInsets);
        } else if (i5 >= 28) {
            this.f1406a = new g1(this, windowInsets);
        } else {
            this.f1406a = new f1(this, windowInsets);
        }
    }

    public static y.c e(y.c cVar, int i5, int i6, int i7, int i8) {
        int max = Math.max(0, cVar.f3729a - i5);
        int max2 = Math.max(0, cVar.f3730b - i6);
        int max3 = Math.max(0, cVar.f3731c - i7);
        int max4 = Math.max(0, cVar.f3732d - i8);
        return (max == i5 && max2 == i6 && max3 == i7 && max4 == i8) ? cVar : y.c.b(max, max2, max3, max4);
    }

    public static q1 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        q1 q1Var = new q1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = r0.f1407a;
            q1 a5 = l0.a(view);
            m1 m1Var = q1Var.f1406a;
            m1Var.q(a5);
            m1Var.d(view.getRootView());
            m1Var.s(view.getWindowSystemUiVisibility());
        }
        return q1Var;
    }

    public final int a() {
        return this.f1406a.j().f3732d;
    }

    public final int b() {
        return this.f1406a.j().f3729a;
    }

    public final int c() {
        return this.f1406a.j().f3731c;
    }

    public final int d() {
        return this.f1406a.j().f3730b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            return Objects.equals(this.f1406a, ((q1) obj).f1406a);
        }
        return false;
    }

    public final WindowInsets f() {
        m1 m1Var = this.f1406a;
        if (m1Var instanceof e1) {
            return ((e1) m1Var).f1358c;
        }
        return null;
    }

    public final int hashCode() {
        m1 m1Var = this.f1406a;
        if (m1Var == null) {
            return 0;
        }
        return m1Var.hashCode();
    }

    public q1() {
        this.f1406a = new m1(this);
    }
}
