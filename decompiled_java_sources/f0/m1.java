package f0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f1394b;

    /* renamed from: a, reason: collision with root package name */
    public final q1 f1395a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f1394b = (i5 >= 34 ? new c1() : i5 >= 31 ? new b1() : i5 >= 30 ? new a1() : i5 >= 29 ? new z0() : new y0()).b().f1406a.a().f1406a.b().f1406a.c();
    }

    public m1(q1 q1Var) {
        this.f1395a = q1Var;
    }

    public q1 a() {
        return this.f1395a;
    }

    public q1 b() {
        return this.f1395a;
    }

    public q1 c() {
        return this.f1395a;
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return n() == m1Var.n() && m() == m1Var.m() && Objects.equals(j(), m1Var.j()) && Objects.equals(h(), m1Var.h()) && Objects.equals(e(), m1Var.e());
    }

    public y.c f(int i5) {
        return y.c.f3728e;
    }

    public y.c g() {
        return j();
    }

    public y.c h() {
        return y.c.f3728e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public y.c i() {
        return j();
    }

    public y.c j() {
        return y.c.f3728e;
    }

    public y.c k() {
        return j();
    }

    public q1 l(int i5, int i6, int i7, int i8) {
        return f1394b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i5) {
        return true;
    }

    public void d(View view) {
    }

    public void p(y.c[] cVarArr) {
    }

    public void q(q1 q1Var) {
    }

    public void r(y.c cVar) {
    }

    public void s(int i5) {
    }
}
