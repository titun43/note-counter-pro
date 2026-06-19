package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class b0 extends MultiAutoCompleteTextView {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f2028j = {R.attr.popupBackground};

    /* renamed from: g, reason: collision with root package name */
    public final q f2029g;
    public final z0 h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f2030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.autoCompleteTextViewStyle);
        t2.a(context);
        s2.a(this, getContext());
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(getContext(), attributeSet, f2028j, com.lokhnathtechnical.notecounterpro.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f284i).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.l(0));
        }
        r2.u();
        q qVar = new q(this);
        this.f2029g = qVar;
        qVar.d(attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.autoCompleteTextViewStyle);
        z0 z0Var = new z0(this);
        this.h = z0Var;
        z0Var.f(attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.autoCompleteTextViewStyle);
        z0Var.b();
        d0 d0Var = new d0(this);
        this.f2030i = d0Var;
        d0Var.b(attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a5 = d0Var.a(keyListener);
        if (a5 == keyListener) {
            return;
        }
        super.setKeyListener(a5);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f2029g;
        if (qVar != null) {
            qVar.a();
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f2029g;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f2029g;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y4.b.B(editorInfo, onCreateInputConnection, this);
        return this.f2030i.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f2029g;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f2029g;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i5) {
        setDropDownBackgroundDrawable(b3.g.t(getContext(), i5));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f2030i.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2030i.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f2029g;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2029g;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.h;
        z0Var.l(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.h;
        z0Var.m(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.g(context, i5);
        }
    }
}
