package i;

import android.view.View;
import android.view.animation.Interpolator;
import f0.w0;
import f0.x0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f1787c;

    /* renamed from: d, reason: collision with root package name */
    public x0 f1788d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1789e;

    /* renamed from: b, reason: collision with root package name */
    public long f1786b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f1790f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1785a = new ArrayList();

    public final void a() {
        if (this.f1789e) {
            ArrayList arrayList = this.f1785a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ((w0) obj).b();
            }
            this.f1789e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f1789e) {
            return;
        }
        ArrayList arrayList = this.f1785a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            w0 w0Var = (w0) obj;
            long j2 = this.f1786b;
            if (j2 >= 0) {
                w0Var.c(j2);
            }
            Interpolator interpolator = this.f1787c;
            if (interpolator != null && (view = (View) w0Var.f1426a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1788d != null) {
                w0Var.d(this.f1790f);
            }
            View view2 = (View) w0Var.f1426a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1789e = true;
    }
}
