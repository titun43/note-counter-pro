package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class i0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public final h0 f2110e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2111f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2112g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2113i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2114j;

    public i0(h0 h0Var) {
        super(h0Var);
        this.f2112g = null;
        this.h = null;
        this.f2113i = false;
        this.f2114j = false;
        this.f2110e = h0Var;
    }

    @Override // k.d0
    public final void b(AttributeSet attributeSet, int i5) {
        super.b(attributeSet, R.attr.seekBarStyle);
        h0 h0Var = this.f2110e;
        Context context = h0Var.getContext();
        int[] iArr = f.a.f1316g;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) r2.f284i;
        f0.r0.h(h0Var, h0Var.getContext(), iArr, attributeSet, (TypedArray) r2.f284i, R.attr.seekBarStyle, 0);
        Drawable m5 = r2.m(0);
        if (m5 != null) {
            h0Var.setThumb(m5);
        }
        Drawable l5 = r2.l(1);
        Drawable drawable = this.f2111f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2111f = l5;
        if (l5 != null) {
            l5.setCallback(h0Var);
            l5.setLayoutDirection(h0Var.getLayoutDirection());
            if (l5.isStateful()) {
                l5.setState(h0Var.getDrawableState());
            }
            f();
        }
        h0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = n1.b(typedArray.getInt(3, -1), this.h);
            this.f2114j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2112g = r2.k(2);
            this.f2113i = true;
        }
        r2.u();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2111f;
        if (drawable != null) {
            if (this.f2113i || this.f2114j) {
                Drawable mutate = drawable.mutate();
                this.f2111f = mutate;
                if (this.f2113i) {
                    mutate.setTintList(this.f2112g);
                }
                if (this.f2114j) {
                    this.f2111f.setTintMode(this.h);
                }
                if (this.f2111f.isStateful()) {
                    this.f2111f.setState(this.f2110e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2111f != null) {
            int max = this.f2110e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2111f.getIntrinsicWidth();
                int intrinsicHeight = this.f2111f.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i6 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2111f.setBounds(-i5, -i6, i5, i6);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i7 = 0; i7 <= max; i7++) {
                    this.f2111f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
