package f0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class i1 extends g1 {

    /* renamed from: o, reason: collision with root package name */
    public y.c f1379o;

    /* renamed from: p, reason: collision with root package name */
    public y.c f1380p;

    /* renamed from: q, reason: collision with root package name */
    public y.c f1381q;

    public i1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
        this.f1379o = null;
        this.f1380p = null;
        this.f1381q = null;
    }

    @Override // f0.m1
    public y.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f1380p == null) {
            mandatorySystemGestureInsets = this.f1358c.getMandatorySystemGestureInsets();
            this.f1380p = y.c.c(mandatorySystemGestureInsets);
        }
        return this.f1380p;
    }

    @Override // f0.m1
    public y.c i() {
        Insets systemGestureInsets;
        if (this.f1379o == null) {
            systemGestureInsets = this.f1358c.getSystemGestureInsets();
            this.f1379o = y.c.c(systemGestureInsets);
        }
        return this.f1379o;
    }

    @Override // f0.m1
    public y.c k() {
        Insets tappableElementInsets;
        if (this.f1381q == null) {
            tappableElementInsets = this.f1358c.getTappableElementInsets();
            this.f1381q = y.c.c(tappableElementInsets);
        }
        return this.f1381q;
    }

    @Override // f0.e1, f0.m1
    public q1 l(int i5, int i6, int i7, int i8) {
        WindowInsets inset;
        inset = this.f1358c.inset(i5, i6, i7, i8);
        return q1.g(inset, null);
    }

    @Override // f0.f1, f0.m1
    public void r(y.c cVar) {
    }
}
