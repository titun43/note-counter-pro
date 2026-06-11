package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class p0 extends g2 implements r0 {
    public CharSequence H;
    public m0 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ s0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.L = s0Var;
        this.J = new Rect();
        this.f2084u = s0Var;
        this.D = true;
        this.E.setFocusable(true);
        this.f2085v = new n0(this);
    }

    @Override // k.r0
    public final CharSequence d() {
        return this.H;
    }

    @Override // k.r0
    public final void h(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // k.r0
    public final void m(int i5) {
        this.K = i5;
    }

    @Override // k.r0
    public final void n(int i5, int i6) {
        ViewTreeObserver viewTreeObserver;
        c0 c0Var = this.E;
        boolean isShowing = c0Var.isShowing();
        s();
        c0Var.setInputMethodMode(2);
        g();
        t1 t1Var = this.f2072i;
        t1Var.setChoiceMode(1);
        t1Var.setTextDirection(i5);
        t1Var.setTextAlignment(i6);
        s0 s0Var = this.L;
        int selectedItemPosition = s0Var.getSelectedItemPosition();
        t1 t1Var2 = this.f2072i;
        if (c0Var.isShowing() && t1Var2 != null) {
            t1Var2.setListSelectionHidden(false);
            t1Var2.setSelection(selectedItemPosition);
            if (t1Var2.getChoiceMode() != 0) {
                t1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = s0Var.getViewTreeObserver()) == null) {
            return;
        }
        j.d dVar = new j.d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        c0Var.setOnDismissListener(new o0(this, dVar));
    }

    @Override // k.g2, k.r0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.I = (m0) listAdapter;
    }

    public final void s() {
        int i5;
        s0 s0Var = this.L;
        Rect rect = s0Var.f2215n;
        c0 c0Var = this.E;
        Drawable background = c0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z4 = l3.f2159a;
            i5 = s0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i5 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = s0Var.getPaddingLeft();
        int paddingRight = s0Var.getPaddingRight();
        int width = s0Var.getWidth();
        int i6 = s0Var.f2214m;
        if (i6 == -2) {
            int a5 = s0Var.a(this.I, c0Var.getBackground());
            int i7 = (s0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a5 > i7) {
                a5 = i7;
            }
            r(Math.max(a5, (width - paddingLeft) - paddingRight));
        } else if (i6 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i6);
        }
        boolean z5 = l3.f2159a;
        this.f2075l = s0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2074k) - this.K) + i5 : paddingLeft + this.K + i5;
    }
}
