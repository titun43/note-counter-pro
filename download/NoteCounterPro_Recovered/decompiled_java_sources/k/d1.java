package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class d1 extends TextView {

    /* renamed from: g, reason: collision with root package name */
    public final q f2043g;
    public final z0 h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f2044i;

    /* renamed from: j, reason: collision with root package name */
    public y f2045j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2046k;

    /* renamed from: l, reason: collision with root package name */
    public k1.j f2047l;

    /* renamed from: m, reason: collision with root package name */
    public Future f2048m;

    public d1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private y getEmojiTextViewHelper() {
        if (this.f2045j == null) {
            this.f2045j = new y(this);
        }
        return this.f2045j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f2043g;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a1 getSuperCaller() {
        if (this.f2047l == null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 34) {
                this.f2047l = new c1(this);
            } else if (i5 >= 28) {
                this.f2047l = new b1(this);
            } else if (i5 >= 26) {
                this.f2047l = new k1.j(this, 12);
            }
        }
        return this.f2047l;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f2043g;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f2043g;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2048m;
        if (future != null) {
            try {
                this.f2048m = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                z2.b.k(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        d0 d0Var;
        if (Build.VERSION.SDK_INT >= 28 || (d0Var = this.f2044i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) d0Var.f2042c;
        return textClassifier == null ? t0.a((TextView) d0Var.f2041b) : textClassifier;
    }

    public d0.a getTextMetricsParamsCompat() {
        return z2.b.k(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.h.getClass();
        z0.h(editorInfo, onCreateInputConnection, this);
        y4.b.B(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 || i5 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i6) {
        Future future = this.f2048m;
        if (future != null) {
            try {
                this.f2048m = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                z2.b.k(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i5, i6);
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
        q qVar = this.f2043g;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f2043g;
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().n(i5);
        } else {
            z2.b.w(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i5);
        } else {
            z2.b.x(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i5) {
        z2.b.y(this, i5);
    }

    public void setPrecomputedText(d0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        z2.b.k(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f2043g;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2043g;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        d0 d0Var;
        if (Build.VERSION.SDK_INT >= 28 || (d0Var = this.f2044i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d0Var.f2042c = textClassifier;
        }
    }

    public void setTextFuture(Future<d0.b> future) {
        this.f2048m = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d0.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f1180b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i5 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i5 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i5 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i5 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i5 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i5 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i5 = 7;
            }
        }
        setTextDirection(i5);
        getPaint().set(aVar.f1179a);
        setBreakStrategy(aVar.f1181c);
        setHyphenationFrequency(aVar.f1182d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i5) {
        Typeface typeface2;
        if (this.f2046k) {
            return;
        }
        if (typeface == null || i5 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            b3.g gVar = y.f.f3734a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i5);
        }
        this.f2046k = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i5);
        } finally {
            this.f2046k = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        t2.a(context);
        this.f2046k = false;
        this.f2047l = null;
        s2.a(this, getContext());
        q qVar = new q(this);
        this.f2043g = qVar;
        qVar.d(attributeSet, i5);
        z0 z0Var = new z0(this);
        this.h = z0Var;
        z0Var.f(attributeSet, i5);
        z0Var.b();
        d0 d0Var = new d0();
        d0Var.f2041b = this;
        this.f2044i = d0Var;
        getEmojiTextViewHelper().a(attributeSet, i5);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i5, float f5) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            getSuperCaller().p(i5, f5);
        } else if (i6 >= 34) {
            androidx.activity.a.i(this, i5, f5);
        } else {
            z2.b.y(this, Math.round(TypedValue.applyDimension(i5, f5, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i5 != 0 ? b3.g.t(context, i5) : null, i6 != 0 ? b3.g.t(context, i6) : null, i7 != 0 ? b3.g.t(context, i7) : null, i8 != 0 ? b3.g.t(context, i8) : null);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i5 != 0 ? b3.g.t(context, i5) : null, i6 != 0 ? b3.g.t(context, i6) : null, i7 != 0 ? b3.g.t(context, i7) : null, i8 != 0 ? b3.g.t(context, i8) : null);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }
}
