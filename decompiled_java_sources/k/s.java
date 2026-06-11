package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class s extends CheckBox {

    /* renamed from: g, reason: collision with root package name */
    public final u f2205g;
    public final q h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f2206i;

    /* renamed from: j, reason: collision with root package name */
    public y f2207j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        t2.a(context);
        s2.a(this, getContext());
        u uVar = new u(this);
        this.f2205g = uVar;
        uVar.c(attributeSet, R.attr.checkboxStyle);
        q qVar = new q(this);
        this.h = qVar;
        qVar.d(attributeSet, R.attr.checkboxStyle);
        z0 z0Var = new z0(this);
        this.f2206i = z0Var;
        z0Var.f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkboxStyle);
    }

    private y getEmojiTextViewHelper() {
        if (this.f2207j == null) {
            this.f2207j = new y(this);
        }
        return this.f2207j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.h;
        if (qVar != null) {
            qVar.a();
        }
        z0 z0Var = this.f2206i;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.h;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.h;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        u uVar = this.f2205g;
        if (uVar != null) {
            return uVar.f2239a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        u uVar = this.f2205g;
        if (uVar != null) {
            return uVar.f2240b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2206i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2206i.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.h;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.h;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        u uVar = this.f2205g;
        if (uVar != null) {
            if (uVar.f2243e) {
                uVar.f2243e = false;
            } else {
                uVar.f2243e = true;
                uVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f2206i;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f2206i;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f2276b.h).k(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.h;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.h;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        u uVar = this.f2205g;
        if (uVar != null) {
            uVar.f2239a = colorStateList;
            uVar.f2241c = true;
            uVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        u uVar = this.f2205g;
        if (uVar != null) {
            uVar.f2240b = mode;
            uVar.f2242d = true;
            uVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f2206i;
        z0Var.l(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f2206i;
        z0Var.m(mode);
        z0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(b3.g.t(getContext(), i5));
    }
}
