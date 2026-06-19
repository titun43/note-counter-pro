package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1653d;

    public /* synthetic */ v(Object obj, int i5) {
        this.f1652c = i5;
        this.f1653d = obj;
    }

    @Override // b3.g, f0.x0
    public void b() {
        int i5 = this.f1652c;
        Object obj = this.f1653d;
        switch (i5) {
            case 0:
                ((s) obj).h.B.setVisibility(0);
                break;
            case 1:
                f0 f0Var = (f0) obj;
                f0Var.B.setVisibility(0);
                if (f0Var.B.getParent() instanceof View) {
                    View view = (View) f0Var.B.getParent();
                    WeakHashMap weakHashMap = f0.r0.f1407a;
                    f0.i0.c(view);
                    break;
                }
                break;
        }
    }

    @Override // f0.x0
    public final void c() {
        int i5 = this.f1652c;
        Object obj = this.f1653d;
        switch (i5) {
            case 0:
                f0 f0Var = ((s) obj).h;
                f0Var.B.setAlpha(1.0f);
                f0Var.E.d(null);
                f0Var.E = null;
                break;
            case 1:
                f0 f0Var2 = (f0) obj;
                f0Var2.B.setAlpha(1.0f);
                f0Var2.E.d(null);
                f0Var2.E = null;
                break;
            default:
                f0 f0Var3 = (f0) ((androidx.emoji2.text.p) obj).f274i;
                f0Var3.B.setVisibility(8);
                PopupWindow popupWindow = f0Var3.C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (f0Var3.B.getParent() instanceof View) {
                    View view = (View) f0Var3.B.getParent();
                    WeakHashMap weakHashMap = f0.r0.f1407a;
                    f0.i0.c(view);
                }
                f0Var3.B.e();
                f0Var3.E.d(null);
                f0Var3.E = null;
                ViewGroup viewGroup = f0Var3.G;
                WeakHashMap weakHashMap2 = f0.r0.f1407a;
                f0.i0.c(viewGroup);
                break;
        }
    }
}
