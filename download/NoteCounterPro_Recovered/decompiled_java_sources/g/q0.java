package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q0 extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f1611d;

    public /* synthetic */ q0(s0 s0Var, int i5) {
        this.f1610c = i5;
        this.f1611d = s0Var;
    }

    @Override // f0.x0
    public final void c() {
        View view;
        int i5 = this.f1610c;
        s0 s0Var = this.f1611d;
        switch (i5) {
            case 0:
                if (s0Var.f1641o && (view = s0Var.f1634g) != null) {
                    view.setTranslationY(0.0f);
                    s0Var.f1631d.setTranslationY(0.0f);
                }
                s0Var.f1631d.setVisibility(8);
                s0Var.f1631d.setTransitioning(false);
                s0Var.f1645s = null;
                androidx.emoji2.text.p pVar = s0Var.f1637k;
                if (pVar != null) {
                    pVar.b(s0Var.f1636j);
                    s0Var.f1636j = null;
                    s0Var.f1637k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = s0Var.f1630c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = f0.r0.f1407a;
                    f0.i0.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                s0Var.f1645s = null;
                s0Var.f1631d.requestLayout();
                break;
        }
    }
}
