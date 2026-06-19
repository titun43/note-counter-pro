package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k.l2;
import k.p0;
import k.s0;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1885g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d(Object obj, int i5) {
        this.f1885g = i5;
        this.h = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1885g) {
            case 0:
                h hVar = (h) this.h;
                ArrayList arrayList = hVar.f1917n;
                if (hVar.a() && arrayList.size() > 0) {
                    int i5 = 0;
                    if (!((g) arrayList.get(0)).f1909a.D) {
                        View view = hVar.f1924u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i5 < size) {
                                Object obj = arrayList.get(i5);
                                i5++;
                                ((g) obj).f1909a.g();
                            }
                            break;
                        } else {
                            hVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                e0 e0Var = (e0) this.h;
                l2 l2Var = e0Var.f1892n;
                if (e0Var.a() && !l2Var.D) {
                    View view2 = e0Var.f1897s;
                    if (view2 != null && view2.isShown()) {
                        l2Var.g();
                        break;
                    } else {
                        e0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                s0 s0Var = (s0) this.h;
                if (!s0Var.getInternalPopup().a()) {
                    s0Var.f2213l.n(s0Var.getTextDirection(), s0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = s0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                p0 p0Var = (p0) this.h;
                s0 s0Var2 = p0Var.L;
                p0Var.getClass();
                if (!s0Var2.isAttachedToWindow() || !s0Var2.getGlobalVisibleRect(p0Var.J)) {
                    p0Var.dismiss();
                    break;
                } else {
                    p0Var.s();
                    p0Var.g();
                    break;
                }
                break;
        }
    }
}
