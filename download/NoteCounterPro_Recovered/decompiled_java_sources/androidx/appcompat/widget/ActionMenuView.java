package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import g.m0;
import j.b0;
import j.l;
import j.m;
import j.n;
import j.p;
import j.y;
import k.h;
import k.k;
import k.l3;
import k.o;
import k.x1;
import k.y1;
import t2.i;
import u1.f;

/* loaded from: classes.dex */
public class ActionMenuView extends y1 implements m, b0 {
    public m0 A;
    public l B;
    public boolean C;
    public int D;
    public final int E;
    public final int F;
    public o G;

    /* renamed from: v, reason: collision with root package name */
    public n f143v;
    public Context w;

    /* renamed from: x, reason: collision with root package name */
    public int f144x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f145y;

    /* renamed from: z, reason: collision with root package name */
    public k.l f146z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.E = (int) (56.0f * f5);
        this.F = (int) (f5 * 4.0f);
        this.w = context;
        this.f144x = 0;
    }

    public static k.n i() {
        k.n nVar = new k.n(-2, -2);
        nVar.f2164a = false;
        ((LinearLayout.LayoutParams) nVar).gravity = 16;
        return nVar;
    }

    public static k.n j(ViewGroup.LayoutParams layoutParams) {
        k.n nVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof k.n) {
            k.n nVar2 = (k.n) layoutParams;
            nVar = new k.n(nVar2);
            nVar.f2164a = nVar2.f2164a;
        } else {
            nVar = new k.n(layoutParams);
        }
        if (((LinearLayout.LayoutParams) nVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) nVar).gravity = 16;
        }
        return nVar;
    }

    @Override // j.m
    public final boolean a(p pVar) {
        return this.f143v.q(pVar, null, 0);
    }

    @Override // j.b0
    public final void b(n nVar) {
        this.f143v = nVar;
    }

    @Override // k.y1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k.n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.y1
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ x1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // k.y1
    /* renamed from: f */
    public final x1 generateLayoutParams(AttributeSet attributeSet) {
        return new k.n(getContext(), attributeSet);
    }

    @Override // k.y1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // k.y1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // k.y1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f143v == null) {
            Context context = getContext();
            n nVar = new n(context);
            this.f143v = nVar;
            nVar.f1947e = new f(this, 12);
            k.l lVar = new k.l(context);
            this.f146z = lVar;
            lVar.f2148r = true;
            lVar.f2149s = true;
            y yVar = this.A;
            if (yVar == null) {
                yVar = new i(16);
            }
            lVar.f2141k = yVar;
            this.f143v.b(lVar, this.w);
            k.l lVar2 = this.f146z;
            lVar2.f2144n = this;
            this.f143v = lVar2.f2139i;
        }
        return this.f143v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k.l lVar = this.f146z;
        k kVar = lVar.f2145o;
        if (kVar != null) {
            return kVar.getDrawable();
        }
        if (lVar.f2147q) {
            return lVar.f2146p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f144x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i5) {
        boolean z4 = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof k.m)) {
            z4 = ((k.m) childAt).a();
        }
        return (i5 <= 0 || !(childAt2 instanceof k.m)) ? z4 : ((k.m) childAt2).b() | z4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.l lVar = this.f146z;
        if (lVar != null) {
            lVar.h();
            if (this.f146z.j()) {
                this.f146z.g();
                this.f146z.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.l lVar = this.f146z;
        if (lVar != null) {
            lVar.g();
            h hVar = lVar.f2155z;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f2009i.dismiss();
        }
    }

    @Override // k.y1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int width;
        int i9;
        if (!this.C) {
            super.onLayout(z4, i5, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i8 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i7 - i5;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean z5 = l3.f2159a;
        boolean z6 = getLayoutDirection() == 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                k.n nVar = (k.n) childAt.getLayoutParams();
                if (nVar.f2164a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z6) {
                        i9 = getPaddingLeft() + ((LinearLayout.LayoutParams) nVar).leftMargin;
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) nVar).rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) nVar).leftMargin) + ((LinearLayout.LayoutParams) nVar).rightMargin;
                    k(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (z6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                k.n nVar2 = (k.n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !nVar2.f2164a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) nVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) nVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            k.n nVar3 = (k.n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !nVar3.f2164a) {
                int i23 = paddingLeft + ((LinearLayout.LayoutParams) nVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) nVar3).rightMargin + max + i23;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // k.y1, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        ?? r11;
        int i9;
        int i10;
        n nVar;
        boolean z4 = this.C;
        boolean z5 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.C = z5;
        if (z4 != z5) {
            this.D = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.C && (nVar = this.f143v) != null && size != this.D) {
            this.D = size;
            nVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.C || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                k.n nVar2 = (k.n) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) nVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) nVar2).leftMargin = 0;
            }
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i5);
        int size3 = View.MeasureSpec.getSize(i6);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.E;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z6 = false;
        int i21 = 0;
        long j2 = 0;
        while (true) {
            i7 = this.F;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i9 = i16;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z7) {
                    childAt.setPadding(i7, 0, i7, 0);
                }
                k.n nVar3 = (k.n) childAt.getLayoutParams();
                nVar3.f2169f = false;
                nVar3.f2166c = 0;
                nVar3.f2165b = 0;
                nVar3.f2167d = false;
                ((LinearLayout.LayoutParams) nVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) nVar3).rightMargin = 0;
                nVar3.f2168e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i24 = nVar3.f2164a ? 1 : i14;
                k.n nVar4 = (k.n) childAt.getLayoutParams();
                int i25 = i14;
                i9 = i16;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i23, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z9 = z8;
                if (i24 <= 0 || (z8 && i24 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i24, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i9;
                    if (measuredWidth % i9 != 0) {
                        i10++;
                    }
                    if (z9 && i10 < 2) {
                        i10 = 2;
                    }
                }
                nVar4.f2167d = !nVar4.f2164a && z9;
                nVar4.f2165b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i9, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (nVar3.f2167d) {
                    i21++;
                }
                if (nVar3.f2164a) {
                    z6 = true;
                }
                i14 = i25 - i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= 1 << i20;
                }
            }
            i20++;
            size3 = i22;
            paddingBottom = i23;
            i16 = i9;
        }
        int i26 = size3;
        int i27 = i14;
        int i28 = i16;
        boolean z10 = z6 && i18 == 2;
        int i29 = i27;
        boolean z11 = false;
        while (i21 > 0 && i29 > 0) {
            int i30 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            long j5 = 0;
            int i31 = 0;
            int i32 = 0;
            while (i32 < childCount2) {
                int i33 = i17;
                k.n nVar5 = (k.n) getChildAt(i32).getLayoutParams();
                boolean z12 = z10;
                if (nVar5.f2167d) {
                    int i34 = nVar5.f2165b;
                    if (i34 < i30) {
                        j5 = 1 << i32;
                        i30 = i34;
                        i31 = 1;
                    } else if (i34 == i30) {
                        j5 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                z10 = z12;
                i17 = i33;
            }
            i8 = i17;
            boolean z13 = z10;
            j2 |= j5;
            if (i31 > i29) {
                break;
            }
            int i35 = i30 + 1;
            int i36 = 0;
            while (i36 < childCount2) {
                View childAt2 = getChildAt(i36);
                k.n nVar6 = (k.n) childAt2.getLayoutParams();
                boolean z14 = z6;
                long j6 = 1 << i36;
                if ((j5 & j6) != 0) {
                    if (z13 && nVar6.f2168e) {
                        r11 = 1;
                        r11 = 1;
                        if (i29 == 1) {
                            childAt2.setPadding(i7 + i28, 0, i7, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    nVar6.f2165b += r11;
                    nVar6.f2169f = r11;
                    i29--;
                } else if (nVar6.f2165b == i35) {
                    j2 |= j6;
                }
                i36++;
                z6 = z14;
            }
            z10 = z13;
            i17 = i8;
            z11 = true;
        }
        i8 = i17;
        boolean z15 = !z6 && i18 == 1;
        if (i29 > 0 && j2 != 0 && (i29 < i18 - 1 || z15 || i19 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z15) {
                if ((j2 & 1) != 0 && !((k.n) getChildAt(0).getLayoutParams()).f2168e) {
                    bitCount -= 0.5f;
                }
                int i37 = childCount2 - 1;
                if ((j2 & (1 << i37)) != 0 && !((k.n) getChildAt(i37).getLayoutParams()).f2168e) {
                    bitCount -= 0.5f;
                }
            }
            int i38 = bitCount > 0.0f ? (int) ((i29 * i28) / bitCount) : 0;
            boolean z16 = z11;
            for (int i39 = 0; i39 < childCount2; i39++) {
                if ((j2 & (1 << i39)) != 0) {
                    View childAt3 = getChildAt(i39);
                    k.n nVar7 = (k.n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        nVar7.f2166c = i38;
                        nVar7.f2169f = true;
                        if (i39 == 0 && !nVar7.f2168e) {
                            ((LinearLayout.LayoutParams) nVar7).leftMargin = (-i38) / 2;
                        }
                        z16 = true;
                    } else if (nVar7.f2164a) {
                        nVar7.f2166c = i38;
                        nVar7.f2169f = true;
                        ((LinearLayout.LayoutParams) nVar7).rightMargin = (-i38) / 2;
                        z16 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) nVar7).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) nVar7).rightMargin = i38 / 2;
                        }
                    }
                }
            }
            z11 = z16;
        }
        if (z11) {
            for (int i40 = 0; i40 < childCount2; i40++) {
                View childAt4 = getChildAt(i40);
                k.n nVar8 = (k.n) childAt4.getLayoutParams();
                if (nVar8.f2169f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((nVar8.f2165b * i28) + nVar8.f2166c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode != 1073741824 ? i8 : i26);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f146z.w = z4;
    }

    public void setOnMenuItemClickListener(o oVar) {
        this.G = oVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k.l lVar = this.f146z;
        k kVar = lVar.f2145o;
        if (kVar != null) {
            kVar.setImageDrawable(drawable);
        } else {
            lVar.f2147q = true;
            lVar.f2146p = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f145y = z4;
    }

    public void setPopupTheme(int i5) {
        if (this.f144x != i5) {
            this.f144x = i5;
            if (i5 == 0) {
                this.w = getContext();
            } else {
                this.w = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setPresenter(k.l lVar) {
        this.f146z = lVar;
        lVar.f2144n = this;
        this.f143v = lVar.f2139i;
    }

    @Override // k.y1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k.n(getContext(), attributeSet);
    }
}
