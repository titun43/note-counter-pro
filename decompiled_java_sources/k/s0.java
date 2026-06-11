package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public final class s0 extends Spinner {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f2208o = {R.attr.spinnerMode};

    /* renamed from: g, reason: collision with root package name */
    public final q f2209g;
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f2210i;

    /* renamed from: j, reason: collision with root package name */
    public SpinnerAdapter f2211j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2212k;

    /* renamed from: l, reason: collision with root package name */
    public final r0 f2213l;

    /* renamed from: m, reason: collision with root package name */
    public int f2214m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2215n;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f2215n = new Rect();
        s2.a(this, getContext());
        int[] iArr = f.a.f1329u;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context, attributeSet, iArr, com.lokhnathtechnical.notecounterpro.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) r2.f284i;
        this.f2209g = new q(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.h = new i.d(context, resourceId);
        } else {
            this.h = context;
        }
        int i5 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f2208o, com.lokhnathtechnical.notecounterpro.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i5 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e4) {
                    e = e4;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i5 == 0) {
            l0 l0Var = new l0(this);
            this.f2213l = l0Var;
            l0Var.f2157i = typedArray2.getString(2);
        } else if (i5 == 1) {
            p0 p0Var = new p0(this, this.h, attributeSet);
            androidx.emoji2.text.t r5 = androidx.emoji2.text.t.r(this.h, attributeSet, iArr, com.lokhnathtechnical.notecounterpro.R.attr.spinnerStyle);
            this.f2214m = ((TypedArray) r5.f284i).getLayoutDimension(3, -2);
            p0Var.k(r5.l(1));
            p0Var.H = typedArray2.getString(2);
            r5.u();
            this.f2213l = p0Var;
            this.f2210i = new j0(this, this, p0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.lokhnathtechnical.notecounterpro.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.u();
        this.f2212k = true;
        SpinnerAdapter spinnerAdapter = this.f2211j;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f2211j = null;
        }
        this.f2209g.d(attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i5 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i6 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i6;
        }
        Rect rect = this.f2215n;
        drawable.getPadding(rect);
        return rect.left + rect.right + i6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f2209g;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        r0 r0Var = this.f2213l;
        return r0Var != null ? r0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        r0 r0Var = this.f2213l;
        return r0Var != null ? r0Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2213l != null ? this.f2214m : super.getDropDownWidth();
    }

    public final r0 getInternalPopup() {
        return this.f2213l;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        r0 r0Var = this.f2213l;
        return r0Var != null ? r0Var.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.h;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        r0 r0Var = this.f2213l;
        return r0Var != null ? r0Var.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f2209g;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f2209g;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r0 r0Var = this.f2213l;
        if (r0Var == null || !r0Var.a()) {
            return;
        }
        r0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f2213l == null || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        q0 q0Var = (q0) parcelable;
        super.onRestoreInstanceState(q0Var.getSuperState());
        if (!q0Var.f2201g || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new j.d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        q0 q0Var = new q0(super.onSaveInstanceState());
        r0 r0Var = this.f2213l;
        q0Var.f2201g = r0Var != null && r0Var.a();
        return q0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j0 j0Var = this.f2210i;
        if (j0Var == null || !j0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        r0 r0Var = this.f2213l;
        if (r0Var == null) {
            return super.performClick();
        }
        if (r0Var.a()) {
            return true;
        }
        r0Var.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f2209g;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f2209g;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i5) {
        r0 r0Var = this.f2213l;
        if (r0Var == null) {
            super.setDropDownHorizontalOffset(i5);
        } else {
            r0Var.m(i5);
            r0Var.c(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i5) {
        r0 r0Var = this.f2213l;
        if (r0Var != null) {
            r0Var.l(i5);
        } else {
            super.setDropDownVerticalOffset(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i5) {
        if (this.f2213l != null) {
            this.f2214m = i5;
        } else {
            super.setDropDownWidth(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        r0 r0Var = this.f2213l;
        if (r0Var != null) {
            r0Var.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i5) {
        setPopupBackgroundDrawable(b3.g.t(getPopupContext(), i5));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        r0 r0Var = this.f2213l;
        if (r0Var != null) {
            r0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f2209g;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2209g;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2212k) {
            this.f2211j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        r0 r0Var = this.f2213l;
        if (r0Var != null) {
            Context context = this.h;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            m0 m0Var = new m0();
            m0Var.f2162a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                m0Var.f2163b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                k0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            r0Var.p(m0Var);
        }
    }
}
