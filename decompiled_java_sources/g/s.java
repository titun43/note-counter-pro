package g;

import android.view.ViewGroup;
import f0.w0;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1625g;
    public final /* synthetic */ f0 h;

    public /* synthetic */ s(f0 f0Var, int i5) {
        this.f1625g = i5;
        this.h = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f1625g) {
            case 0:
                f0 f0Var = this.h;
                if ((f0Var.f1536f0 & 1) != 0) {
                    f0Var.x(0);
                }
                if ((f0Var.f1536f0 & 4096) != 0) {
                    f0Var.x(108);
                }
                f0Var.f1535e0 = false;
                f0Var.f1536f0 = 0;
                break;
            default:
                f0 f0Var2 = this.h;
                f0Var2.C.showAtLocation(f0Var2.B, 55, 0, 0);
                w0 w0Var = f0Var2.E;
                if (w0Var != null) {
                    w0Var.b();
                }
                if (!f0Var2.F || (viewGroup = f0Var2.G) == null || !viewGroup.isLaidOut()) {
                    f0Var2.B.setAlpha(1.0f);
                    f0Var2.B.setVisibility(0);
                    break;
                } else {
                    f0Var2.B.setAlpha(0.0f);
                    w0 a5 = f0.r0.a(f0Var2.B);
                    a5.a(1.0f);
                    f0Var2.E = a5;
                    a5.d(new v(this, 0));
                    break;
                }
        }
    }
}
