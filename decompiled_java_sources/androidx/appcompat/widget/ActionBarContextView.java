package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b3.g;
import com.lokhnathtechnical.notecounterpro.R;
import f0.r0;
import f0.w0;
import g.c;
import i.b;
import j.b0;
import j.n;
import k.a;
import k.h;
import k.l;
import k.l3;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: g, reason: collision with root package name */
    public final a f107g;
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public ActionMenuView f108i;

    /* renamed from: j, reason: collision with root package name */
    public l f109j;

    /* renamed from: k, reason: collision with root package name */
    public int f110k;

    /* renamed from: l, reason: collision with root package name */
    public w0 f111l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f112m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f113n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f114o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f115p;

    /* renamed from: q, reason: collision with root package name */
    public View f116q;

    /* renamed from: r, reason: collision with root package name */
    public View f117r;

    /* renamed from: s, reason: collision with root package name */
    public View f118s;

    /* renamed from: t, reason: collision with root package name */
    public LinearLayout f119t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f120u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f121v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final int f122x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f123y;

    /* renamed from: z, reason: collision with root package name */
    public final int f124z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f107g = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.h = context;
        } else {
            this.h = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1313d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : g.t(context, resourceId));
        this.w = obtainStyledAttributes.getResourceId(5, 0);
        this.f122x = obtainStyledAttributes.getResourceId(4, 0);
        this.f110k = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f124z = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i6);
        return Math.max(0, i5 - view.getMeasuredWidth());
    }

    public static int g(View view, int i5, int i6, int i7, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = ((i7 - measuredHeight) / 2) + i6;
        if (z4) {
            view.layout(i5 - measuredWidth, i8, i5, measuredHeight + i8);
        } else {
            view.layout(i5, i8, i5 + measuredWidth, measuredHeight + i8);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(b bVar) {
        View view = this.f116q;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f124z, (ViewGroup) this, false);
            this.f116q = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f116q);
        }
        View findViewById = this.f116q.findViewById(R.id.action_mode_close_button);
        this.f117r = findViewById;
        findViewById.setOnClickListener(new c(bVar, 1));
        n c5 = bVar.c();
        l lVar = this.f109j;
        if (lVar != null) {
            lVar.g();
            h hVar = lVar.f2155z;
            if (hVar != null && hVar.b()) {
                hVar.f2009i.dismiss();
            }
        }
        l lVar2 = new l(getContext());
        this.f109j = lVar2;
        lVar2.f2148r = true;
        lVar2.f2149s = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c5.b(this.f109j, this.h);
        l lVar3 = this.f109j;
        b0 b0Var = lVar3.f2144n;
        if (b0Var == null) {
            b0 b0Var2 = (b0) lVar3.f2140j.inflate(lVar3.f2142l, (ViewGroup) this, false);
            lVar3.f2144n = b0Var2;
            b0Var2.b(lVar3.f2139i);
            lVar3.h();
        }
        b0 b0Var3 = lVar3.f2144n;
        if (b0Var != b0Var3) {
            ((ActionMenuView) b0Var3).setPresenter(lVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) b0Var3;
        this.f108i = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f108i, layoutParams);
    }

    public final void d() {
        if (this.f119t == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f119t = linearLayout;
            this.f120u = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f121v = (TextView) this.f119t.findViewById(R.id.action_bar_subtitle);
            int i5 = this.w;
            if (i5 != 0) {
                this.f120u.setTextAppearance(getContext(), i5);
            }
            int i6 = this.f122x;
            if (i6 != 0) {
                this.f121v.setTextAppearance(getContext(), i6);
            }
        }
        this.f120u.setText(this.f114o);
        this.f121v.setText(this.f115p);
        boolean isEmpty = TextUtils.isEmpty(this.f114o);
        boolean isEmpty2 = TextUtils.isEmpty(this.f115p);
        this.f121v.setVisibility(!isEmpty2 ? 0 : 8);
        this.f119t.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f119t.getParent() == null) {
            addView(this.f119t);
        }
    }

    public final void e() {
        removeAllViews();
        this.f118s = null;
        this.f108i = null;
        this.f109j = null;
        View view = this.f117r;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f111l != null ? this.f107g.f2023b : getVisibility();
    }

    public int getContentHeight() {
        return this.f110k;
    }

    public CharSequence getSubtitle() {
        return this.f115p;
    }

    public CharSequence getTitle() {
        return this.f114o;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i5) {
        if (i5 != getVisibility()) {
            w0 w0Var = this.f111l;
            if (w0Var != null) {
                w0Var.b();
            }
            super.setVisibility(i5);
        }
    }

    public final w0 i(int i5, long j2) {
        w0 w0Var = this.f111l;
        if (w0Var != null) {
            w0Var.b();
        }
        a aVar = this.f107g;
        if (i5 != 0) {
            w0 a5 = r0.a(this);
            a5.a(0.0f);
            a5.c(j2);
            aVar.f2024c.f111l = a5;
            aVar.f2023b = i5;
            a5.d(aVar);
            return a5;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        w0 a6 = r0.a(this);
        a6.a(1.0f);
        a6.c(j2);
        aVar.f2024c.f111l = a6;
        aVar.f2023b = i5;
        a6.d(aVar);
        return a6;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.f1310a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        l lVar = this.f109j;
        if (lVar != null) {
            Configuration configuration2 = lVar.h.getResources().getConfiguration();
            int i5 = configuration2.screenWidthDp;
            int i6 = configuration2.screenHeightDp;
            lVar.f2152v = (configuration2.smallestScreenWidthDp > 600 || i5 > 600 || (i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960)) ? 5 : (i5 >= 500 || (i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640)) ? 4 : i5 >= 360 ? 3 : 2;
            n nVar = lVar.f2139i;
            if (nVar != null) {
                nVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l lVar = this.f109j;
        if (lVar != null) {
            lVar.g();
            h hVar = this.f109j.f2155z;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f2009i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f113n = false;
        }
        if (!this.f113n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f113n = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f113n = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        boolean z5 = l3.f2159a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingRight = z6 ? (i7 - i5) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
        View view = this.f116q;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f116q.getLayoutParams();
            int i9 = z6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i10 = z6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i11 = z6 ? paddingRight - i9 : paddingRight + i9;
            int g5 = g(this.f116q, i11, paddingTop, paddingTop2, z6) + i11;
            paddingRight = z6 ? g5 - i10 : g5 + i10;
        }
        LinearLayout linearLayout = this.f119t;
        if (linearLayout != null && this.f118s == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f119t, paddingRight, paddingTop, paddingTop2, z6);
        }
        View view2 = this.f118s;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z6);
        }
        int paddingLeft = z6 ? getPaddingLeft() : (i7 - i5) - getPaddingRight();
        ActionMenuView actionMenuView = this.f108i;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i6) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i5);
        int i7 = this.f110k;
        if (i7 <= 0) {
            i7 = View.MeasureSpec.getSize(i6);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i8 = i7 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        View view = this.f116q;
        if (view != null) {
            int f5 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f116q.getLayoutParams();
            paddingLeft = f5 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f108i;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f108i, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f119t;
        if (linearLayout != null && this.f118s == null) {
            if (this.f123y) {
                this.f119t.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f119t.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f119t.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f118s;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                i8 = Math.min(i11, i8);
            }
            this.f118s.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(i8, i12));
        }
        if (this.f110k > 0) {
            setMeasuredDimension(size, i7);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f112m = false;
        }
        if (!this.f112m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f112m = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f112m = false;
        return true;
    }

    public void setContentHeight(int i5) {
        this.f110k = i5;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f118s;
        if (view2 != null) {
            removeView(view2);
        }
        this.f118s = view;
        if (view != null && (linearLayout = this.f119t) != null) {
            removeView(linearLayout);
            this.f119t = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f115p = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f114o = charSequence;
        d();
        r0.j(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f123y) {
            requestLayout();
        }
        this.f123y = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
