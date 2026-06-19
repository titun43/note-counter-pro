package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class r extends Button {

    /* renamed from: g, reason: collision with root package name */
    public final q f2202g;
    public final z0 h;

    /* renamed from: i, reason: collision with root package name */
    public y f2203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        t2.a(context);
        s2.a(this, getContext());
        q qVar = new q(this);
        this.f2202g = qVar;
        qVar.d(attributeSet, R.attr.buttonStyle);
        z0 z0Var = new z0(this);
        this.h = z0Var;
        z0Var.f(attributeSet, R.attr.buttonStyle);
        z0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private y getEmojiTextViewHelper() {
        if (this.f2203i == null) {
            this.f2203i = new y(this);
        }
        return this.f2203i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f2202g;
        if (qVar != null) {
            qVar.a();
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l3.f2161c) {
            return super.getAutoSizeMaxTextSize();
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            return Math.round(z0Var.f2302i.f2121e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l3.f2161c) {
            return super.getAutoSizeMinTextSize();
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            return Math.round(z0Var.f2302i.f2120d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l3.f2161c) {
            return super.getAutoSizeStepGranularity();
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            return Math.round(z0Var.f2302i.f2119c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l3.f2161c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        z0 z0Var = this.h;
        return z0Var != null ? z0Var.f2302i.f2122f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (l3.f2161c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            return z0Var.f2302i.f2117a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return z2.b.C(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f2202g;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f2202g;
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

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        z0 z0Var = this.h;
        if (z0Var == null || l3.f2161c) {
            return;
        }
        z0Var.f2302i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        z0 z0Var = this.h;
        if (z0Var != null) {
            i1 i1Var = z0Var.f2302i;
            if (l3.f2161c || !i1Var.f()) {
                return;
            }
            i1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i6, int i7, int i8) {
        if (l3.f2161c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
            return;
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.i(i5, i6, i7, i8);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i5) {
        if (l3.f2161c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
            return;
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.j(iArr, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i5) {
        if (l3.f2161c) {
            super.setAutoSizeTextTypeWithDefaults(i5);
            return;
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.k(i5);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f2202g;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f2202g;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z2.b.D(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f2276b.h).k(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.f2295a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f2202g;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2202g;
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

    @Override // android.widget.TextView
    public final void setTextSize(int i5, float f5) {
        boolean z4 = l3.f2161c;
        if (z4) {
            super.setTextSize(i5, f5);
            return;
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            i1 i1Var = z0Var.f2302i;
            if (z4 || i1Var.f()) {
                return;
            }
            i1Var.g(i5, f5);
        }
    }
}
