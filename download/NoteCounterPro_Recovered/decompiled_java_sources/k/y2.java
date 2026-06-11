package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y2 implements j.z {

    /* renamed from: g, reason: collision with root package name */
    public j.n f2291g;
    public j.p h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2292i;

    public y2(Toolbar toolbar) {
        this.f2292i = toolbar;
    }

    @Override // j.z
    public final boolean c(j.p pVar) {
        Toolbar toolbar = this.f2292i;
        toolbar.c();
        ViewParent parent = toolbar.f169n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f169n);
            }
            toolbar.addView(toolbar.f169n);
        }
        View actionView = pVar.getActionView();
        toolbar.f170o = actionView;
        this.h = pVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f170o);
            }
            z2 h = Toolbar.h();
            h.f2308a = (toolbar.f175t & 112) | 8388611;
            h.f2309b = 2;
            toolbar.f170o.setLayoutParams(h);
            toolbar.addView(toolbar.f170o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((z2) childAt.getLayoutParams()).f2309b != 2 && childAt != toolbar.f163g) {
                toolbar.removeViewAt(childCount);
                toolbar.K.add(childAt);
            }
        }
        toolbar.requestLayout();
        pVar.C = true;
        pVar.f1979n.p(false);
        KeyEvent.Callback callback = toolbar.f170o;
        if (callback instanceof i.c) {
            ((j.r) ((i.c) callback)).f1993g.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // j.z
    public final boolean d() {
        return false;
    }

    @Override // j.z
    public final boolean f(j.f0 f0Var) {
        return false;
    }

    @Override // j.z
    public final void h() {
        if (this.h != null) {
            j.n nVar = this.f2291g;
            if (nVar != null) {
                int size = nVar.f1948f.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (this.f2291g.getItem(i5) == this.h) {
                        return;
                    }
                }
            }
            k(this.h);
        }
    }

    @Override // j.z
    public final void i(Context context, j.n nVar) {
        j.p pVar;
        j.n nVar2 = this.f2291g;
        if (nVar2 != null && (pVar = this.h) != null) {
            nVar2.d(pVar);
        }
        this.f2291g = nVar;
    }

    @Override // j.z
    public final boolean k(j.p pVar) {
        Toolbar toolbar = this.f2292i;
        KeyEvent.Callback callback = toolbar.f170o;
        if (callback instanceof i.c) {
            ((j.r) ((i.c) callback)).f1993g.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f170o);
        toolbar.removeView(toolbar.f169n);
        toolbar.f170o = null;
        ArrayList arrayList = toolbar.K;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.h = null;
        toolbar.requestLayout();
        pVar.C = false;
        pVar.f1979n.p(false);
        toolbar.v();
        return true;
    }

    @Override // j.z
    public final void b(j.n nVar, boolean z4) {
    }
}
