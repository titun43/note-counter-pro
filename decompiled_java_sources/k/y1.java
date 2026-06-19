package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class y1 extends ViewGroup {

    /* renamed from: g, reason: collision with root package name */
    public boolean f2277g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2278i;

    /* renamed from: j, reason: collision with root package name */
    public int f2279j;

    /* renamed from: k, reason: collision with root package name */
    public int f2280k;

    /* renamed from: l, reason: collision with root package name */
    public int f2281l;

    /* renamed from: m, reason: collision with root package name */
    public float f2282m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2283n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2284o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f2285p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f2286q;

    /* renamed from: r, reason: collision with root package name */
    public int f2287r;

    /* renamed from: s, reason: collision with root package name */
    public int f2288s;

    /* renamed from: t, reason: collision with root package name */
    public int f2289t;

    /* renamed from: u, reason: collision with root package name */
    public int f2290u;

    public y1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2277g = true;
        this.h = -1;
        this.f2278i = 0;
        this.f2280k = 8388659;
        int[] iArr = f.a.f1322n;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context, attributeSet, iArr, 0);
        f0.r0.h(this, context, iArr, attributeSet, (TypedArray) r2.f284i, 0, 0);
        TypedArray typedArray = (TypedArray) r2.f284i;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f2282m = typedArray.getFloat(4, -1.0f);
        this.h = typedArray.getInt(3, -1);
        this.f2283n = typedArray.getBoolean(7, false);
        setDividerDrawable(r2.l(5));
        this.f2289t = typedArray.getInt(8, 0);
        this.f2290u = typedArray.getDimensionPixelSize(6, 0);
        r2.u();
    }

    public final void c(Canvas canvas, int i5) {
        this.f2286q.setBounds(getPaddingLeft() + this.f2290u, i5, (getWidth() - getPaddingRight()) - this.f2290u, this.f2288s + i5);
        this.f2286q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x1;
    }

    public final void d(Canvas canvas, int i5) {
        this.f2286q.setBounds(i5, getPaddingTop() + this.f2290u, this.f2287r + i5, (getHeight() - getPaddingBottom()) - this.f2290u);
        this.f2286q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public x1 generateDefaultLayoutParams() {
        int i5 = this.f2279j;
        if (i5 == 0) {
            return new x1(-2, -2);
        }
        if (i5 == 1) {
            return new x1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x1 generateLayoutParams(AttributeSet attributeSet) {
        return new x1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x1 ? new x1((x1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new x1((ViewGroup.MarginLayoutParams) layoutParams) : new x1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i5;
        if (this.h < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i6 = this.h;
        if (childCount <= i6) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i6);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.h == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i7 = this.f2278i;
        if (this.f2279j == 1 && (i5 = this.f2280k & 112) != 48) {
            if (i5 == 16) {
                i7 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2281l) / 2;
            } else if (i5 == 80) {
                i7 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2281l;
            }
        }
        return i7 + ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.h;
    }

    public Drawable getDividerDrawable() {
        return this.f2286q;
    }

    public int getDividerPadding() {
        return this.f2290u;
    }

    public int getDividerWidth() {
        return this.f2287r;
    }

    public int getGravity() {
        return this.f2280k;
    }

    public int getOrientation() {
        return this.f2279j;
    }

    public int getShowDividers() {
        return this.f2289t;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2282m;
    }

    public final boolean h(int i5) {
        if (i5 == 0) {
            return (this.f2289t & 1) != 0;
        }
        if (i5 == getChildCount()) {
            return (this.f2289t & 4) != 0;
        }
        if ((this.f2289t & 2) != 0) {
            for (int i6 = i5 - 1; i6 >= 0; i6--) {
                if (getChildAt(i6).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i5;
        if (this.f2286q == null) {
            return;
        }
        int i6 = 0;
        if (this.f2279j == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i6 < virtualChildCount) {
                View childAt = getChildAt(i6);
                if (childAt != null && childAt.getVisibility() != 8 && h(i6)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin) - this.f2288s);
                }
                i6++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2288s : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((x1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z4 = l3.f2159a;
        boolean z5 = getLayoutDirection() == 1;
        while (i6 < virtualChildCount2) {
            View childAt3 = getChildAt(i6);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i6)) {
                x1 x1Var = (x1) childAt3.getLayoutParams();
                d(canvas, z5 ? childAt3.getRight() + ((LinearLayout.LayoutParams) x1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) x1Var).leftMargin) - this.f2287r);
            }
            i6++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                x1 x1Var2 = (x1) childAt4.getLayoutParams();
                if (z5) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                    i5 = this.f2287r;
                    right = left - i5;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) x1Var2).rightMargin;
                }
            } else if (z5) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i5 = this.f2287r;
                right = left - i5;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c5;
        int i18;
        int i19;
        int i20;
        int i21 = 8;
        char c6 = 2;
        if (this.f2279j == 1) {
            int paddingLeft = getPaddingLeft();
            int i22 = i7 - i5;
            int paddingRight = i22 - getPaddingRight();
            int paddingRight2 = (i22 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i23 = this.f2280k;
            int i24 = i23 & 112;
            int i25 = 8388615 & i23;
            int paddingTop = i24 != 16 ? i24 != 80 ? getPaddingTop() : ((getPaddingTop() + i8) - i6) - this.f2281l : getPaddingTop() + (((i8 - i6) - this.f2281l) / 2);
            int i26 = 0;
            while (i26 < virtualChildCount) {
                View childAt = getChildAt(i26);
                if (childAt == null || childAt.getVisibility() == i21) {
                    c5 = c6;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    x1 x1Var = (x1) childAt.getLayoutParams();
                    c5 = c6;
                    int i27 = ((LinearLayout.LayoutParams) x1Var).gravity;
                    if (i27 < 0) {
                        i27 = i25;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i18 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) x1Var).leftMargin;
                        i19 = ((LinearLayout.LayoutParams) x1Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i20 = ((LinearLayout.LayoutParams) x1Var).leftMargin + paddingLeft;
                        if (h(i26)) {
                            paddingTop += this.f2288s;
                        }
                        int i28 = paddingTop + ((LinearLayout.LayoutParams) x1Var).topMargin;
                        childAt.layout(i20, i28, measuredWidth + i20, i28 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) x1Var).bottomMargin + i28;
                    } else {
                        i18 = paddingRight - measuredWidth;
                        i19 = ((LinearLayout.LayoutParams) x1Var).rightMargin;
                    }
                    i20 = i18 - i19;
                    if (h(i26)) {
                    }
                    int i282 = paddingTop + ((LinearLayout.LayoutParams) x1Var).topMargin;
                    childAt.layout(i20, i282, measuredWidth + i20, i282 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) x1Var).bottomMargin + i282;
                }
                i26++;
                c6 = c5;
                i21 = 8;
            }
            return;
        }
        boolean z5 = l3.f2159a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i29 = i8 - i6;
        int paddingBottom = i29 - getPaddingBottom();
        int paddingBottom2 = (i29 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i30 = this.f2280k;
        int i31 = 8388615 & i30;
        int i32 = i30 & 112;
        boolean z7 = this.f2277g;
        int[] iArr = this.f2284o;
        int[] iArr2 = this.f2285p;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i31, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i7) - i5) - this.f2281l : getPaddingLeft() + (((i7 - i5) - this.f2281l) / 2);
        if (z6) {
            i10 = virtualChildCount2 - 1;
            i9 = -1;
        } else {
            i9 = 1;
            i10 = 0;
        }
        int i33 = 0;
        while (i33 < virtualChildCount2) {
            int i34 = (i9 * i33) + i10;
            View childAt2 = getChildAt(i34);
            if (childAt2 == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    x1 x1Var2 = (x1) childAt2.getLayoutParams();
                    int i35 = paddingLeft2;
                    if (z7) {
                        i12 = paddingTop2;
                        if (((LinearLayout.LayoutParams) x1Var2).height != -1) {
                            i13 = childAt2.getBaseline();
                            i14 = ((LinearLayout.LayoutParams) x1Var2).gravity;
                            if (i14 < 0) {
                                i14 = i32;
                            }
                            i15 = i14 & 112;
                            if (i15 == 16) {
                                if (i15 == 48) {
                                    i16 = i12 + ((LinearLayout.LayoutParams) x1Var2).topMargin;
                                    if (i13 != -1) {
                                        i16 = (iArr[1] - i13) + i16;
                                    }
                                } else if (i15 != 80) {
                                    i16 = i12;
                                } else {
                                    i16 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) x1Var2).bottomMargin;
                                    if (i13 != -1) {
                                        i17 = iArr2[2] - (childAt2.getMeasuredHeight() - i13);
                                    }
                                }
                                int i36 = (h(i34) ? i35 + this.f2287r : i35) + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                                childAt2.layout(i36, i16, i36 + measuredWidth2, i16 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i36;
                                i33++;
                                i10 = i11;
                                paddingTop2 = i12;
                            } else {
                                i16 = ((paddingBottom2 - measuredHeight2) / 2) + i12 + ((LinearLayout.LayoutParams) x1Var2).topMargin;
                                i17 = ((LinearLayout.LayoutParams) x1Var2).bottomMargin;
                            }
                            i16 -= i17;
                            int i362 = (h(i34) ? i35 + this.f2287r : i35) + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                            childAt2.layout(i362, i16, i362 + measuredWidth2, i16 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i362;
                            i33++;
                            i10 = i11;
                            paddingTop2 = i12;
                        }
                    } else {
                        i12 = paddingTop2;
                    }
                    i13 = -1;
                    i14 = ((LinearLayout.LayoutParams) x1Var2).gravity;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    if (i15 == 16) {
                    }
                    i16 -= i17;
                    int i3622 = (h(i34) ? i35 + this.f2287r : i35) + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                    childAt2.layout(i3622, i16, i3622 + measuredWidth2, i16 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i3622;
                    i33++;
                    i10 = i11;
                    paddingTop2 = i12;
                }
            }
            i12 = paddingTop2;
            i33++;
            i10 = i11;
            paddingTop2 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int baseline;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        boolean z5;
        boolean z6;
        x1 x1Var;
        int i17;
        int[] iArr2;
        int i18;
        View view;
        int i19;
        boolean z7;
        boolean z8;
        int max;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z9;
        int i28;
        int i29;
        int i30;
        View view2;
        boolean z10;
        boolean z11;
        y1 y1Var = this;
        int i31 = -2;
        int i32 = 0;
        int i33 = 1073741824;
        int i34 = 8;
        if (y1Var.f2279j == 1) {
            y1Var.f2281l = 0;
            int virtualChildCount = y1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            int i35 = y1Var.h;
            boolean z12 = y1Var.f2283n;
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            boolean z13 = false;
            int i39 = 0;
            boolean z14 = false;
            boolean z15 = true;
            float f5 = 0.0f;
            int i40 = 0;
            while (i36 < virtualChildCount) {
                int i41 = mode;
                View childAt = y1Var.getChildAt(i36);
                if (childAt == null) {
                    y1Var.f2281l = y1Var.f2281l;
                } else if (childAt.getVisibility() != i34) {
                    if (y1Var.h(i36)) {
                        y1Var.f2281l += y1Var.f2288s;
                    }
                    x1 x1Var2 = (x1) childAt.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) x1Var2).weight;
                    f5 += f6;
                    if (mode2 == i33 && ((LinearLayout.LayoutParams) x1Var2).height == 0 && f6 > 0.0f) {
                        int i42 = y1Var.f2281l;
                        y1Var.f2281l = Math.max(i42, ((LinearLayout.LayoutParams) x1Var2).topMargin + i42 + ((LinearLayout.LayoutParams) x1Var2).bottomMargin);
                        view2 = childAt;
                        i27 = mode2;
                        i28 = i35;
                        z9 = z12;
                        i29 = i36;
                        z13 = true;
                        i30 = i41;
                    } else {
                        if (((LinearLayout.LayoutParams) x1Var2).height != 0 || f6 <= 0.0f) {
                            i24 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) x1Var2).height = i31;
                            i24 = 0;
                        }
                        if (f5 == 0.0f) {
                            i25 = i36;
                            i26 = y1Var.f2281l;
                        } else {
                            i25 = i36;
                            i26 = 0;
                        }
                        i27 = mode2;
                        z9 = z12;
                        i28 = i35;
                        i29 = i25;
                        i30 = i41;
                        y1Var.measureChildWithMargins(childAt, i5, 0, i6, i26);
                        if (i24 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) x1Var2).height = i24;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i43 = y1Var.f2281l;
                        view2 = childAt;
                        y1Var.f2281l = Math.max(i43, i43 + measuredHeight + ((LinearLayout.LayoutParams) x1Var2).topMargin + ((LinearLayout.LayoutParams) x1Var2).bottomMargin);
                        if (z9) {
                            i40 = Math.max(measuredHeight, i40);
                        }
                    }
                    if (i28 >= 0 && i28 == i29 + 1) {
                        y1Var.f2278i = y1Var.f2281l;
                    }
                    if (i29 < i28 && ((LinearLayout.LayoutParams) x1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i30 == 1073741824 || ((LinearLayout.LayoutParams) x1Var2).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z14 = true;
                    }
                    int i44 = ((LinearLayout.LayoutParams) x1Var2).leftMargin + ((LinearLayout.LayoutParams) x1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i44;
                    i32 = Math.max(i32, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z16 = z10;
                    int combineMeasuredStates = View.combineMeasuredStates(i39, measuredState);
                    if (z15) {
                        i39 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) x1Var2).width == -1) {
                            z11 = true;
                            if (((LinearLayout.LayoutParams) x1Var2).weight <= 0.0f) {
                                if (!z16) {
                                    i44 = measuredWidth;
                                }
                                i38 = Math.max(i38, i44);
                            } else {
                                if (!z16) {
                                    i44 = measuredWidth;
                                }
                                i37 = Math.max(i37, i44);
                            }
                            z15 = z11;
                            i36 = i29 + 1;
                            i35 = i28;
                            mode = i30;
                            z12 = z9;
                            mode2 = i27;
                            i31 = -2;
                            i33 = 1073741824;
                            i34 = 8;
                        }
                    } else {
                        i39 = combineMeasuredStates;
                    }
                    z11 = false;
                    if (((LinearLayout.LayoutParams) x1Var2).weight <= 0.0f) {
                    }
                    z15 = z11;
                    i36 = i29 + 1;
                    i35 = i28;
                    mode = i30;
                    z12 = z9;
                    mode2 = i27;
                    i31 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i27 = mode2;
                i28 = i35;
                z9 = z12;
                i29 = i36;
                i30 = i41;
                i36 = i29 + 1;
                i35 = i28;
                mode = i30;
                z12 = z9;
                mode2 = i27;
                i31 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i45 = mode;
            int i46 = mode2;
            boolean z17 = z12;
            int i47 = i39;
            int i48 = i6;
            if (y1Var.f2281l > 0 && y1Var.h(virtualChildCount)) {
                y1Var.f2281l += y1Var.f2288s;
            }
            if (z17 && (i46 == Integer.MIN_VALUE || i46 == 0)) {
                y1Var.f2281l = 0;
                for (int i49 = 0; i49 < virtualChildCount; i49++) {
                    View childAt2 = y1Var.getChildAt(i49);
                    if (childAt2 == null) {
                        y1Var.f2281l = y1Var.f2281l;
                    } else if (childAt2.getVisibility() != 8) {
                        x1 x1Var3 = (x1) childAt2.getLayoutParams();
                        int i50 = y1Var.f2281l;
                        y1Var.f2281l = Math.max(i50, i50 + i40 + ((LinearLayout.LayoutParams) x1Var3).topMargin + ((LinearLayout.LayoutParams) x1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = y1Var.getPaddingBottom() + y1Var.getPaddingTop() + y1Var.f2281l;
            y1Var.f2281l = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, y1Var.getSuggestedMinimumHeight()), i48, 0);
            int i51 = (resolveSizeAndState & 16777215) - y1Var.f2281l;
            if (z13 || (i51 != 0 && f5 > 0.0f)) {
                float f7 = y1Var.f2282m;
                if (f7 > 0.0f) {
                    f5 = f7;
                }
                y1Var.f2281l = 0;
                int i52 = i47;
                int i53 = 0;
                while (i53 < virtualChildCount) {
                    View childAt3 = y1Var.getChildAt(i53);
                    if (childAt3.getVisibility() == 8) {
                        i21 = i53;
                    } else {
                        x1 x1Var4 = (x1) childAt3.getLayoutParams();
                        float f8 = ((LinearLayout.LayoutParams) x1Var4).weight;
                        if (f8 > 0.0f) {
                            int i54 = (int) ((i51 * f8) / f5);
                            f5 -= f8;
                            i51 -= i54;
                            i21 = i53;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, y1Var.getPaddingRight() + y1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) x1Var4).leftMargin + ((LinearLayout.LayoutParams) x1Var4).rightMargin, ((LinearLayout.LayoutParams) x1Var4).width);
                            if (((LinearLayout.LayoutParams) x1Var4).height == 0) {
                                i23 = 1073741824;
                                if (i46 == 1073741824) {
                                    if (i54 <= 0) {
                                        i54 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i54, 1073741824));
                                    i52 = View.combineMeasuredStates(i52, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i23 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i54;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i23));
                            i52 = View.combineMeasuredStates(i52, childAt3.getMeasuredState() & (-256));
                        } else {
                            i21 = i53;
                        }
                        int i55 = ((LinearLayout.LayoutParams) x1Var4).leftMargin + ((LinearLayout.LayoutParams) x1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i55;
                        i32 = Math.max(i32, measuredWidth2);
                        if (i45 != 1073741824) {
                            i22 = -1;
                            if (((LinearLayout.LayoutParams) x1Var4).width == -1) {
                                measuredWidth2 = i55;
                            }
                        } else {
                            i22 = -1;
                        }
                        i37 = Math.max(i37, measuredWidth2);
                        boolean z18 = z15 && ((LinearLayout.LayoutParams) x1Var4).width == i22;
                        int i56 = y1Var.f2281l;
                        y1Var.f2281l = Math.max(i56, childAt3.getMeasuredHeight() + i56 + ((LinearLayout.LayoutParams) x1Var4).topMargin + ((LinearLayout.LayoutParams) x1Var4).bottomMargin);
                        z15 = z18;
                    }
                    i53 = i21 + 1;
                }
                y1Var.f2281l = y1Var.getPaddingBottom() + y1Var.getPaddingTop() + y1Var.f2281l;
                i47 = i52;
            } else {
                i37 = Math.max(i37, i38);
                if (z17 && i46 != 1073741824) {
                    for (int i57 = 0; i57 < virtualChildCount; i57++) {
                        View childAt4 = y1Var.getChildAt(i57);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((x1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i40, 1073741824));
                        }
                    }
                }
            }
            if (z15 || i45 == 1073741824) {
                i37 = i32;
            }
            y1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(y1Var.getPaddingRight() + y1Var.getPaddingLeft() + i37, y1Var.getSuggestedMinimumWidth()), i5, i47), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(y1Var.getMeasuredWidth(), 1073741824);
                int i58 = 0;
                while (i58 < virtualChildCount) {
                    View childAt5 = y1Var.getChildAt(i58);
                    if (childAt5.getVisibility() != 8) {
                        x1 x1Var5 = (x1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) x1Var5).width == -1) {
                            int i59 = ((LinearLayout.LayoutParams) x1Var5).height;
                            ((LinearLayout.LayoutParams) x1Var5).height = childAt5.getMeasuredHeight();
                            y1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i48, 0);
                            ((LinearLayout.LayoutParams) x1Var5).height = i59;
                        }
                    }
                    i58++;
                    i48 = i6;
                }
                return;
            }
            return;
        }
        int i60 = i5;
        y1Var.f2281l = 0;
        int virtualChildCount2 = y1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i60);
        int mode4 = View.MeasureSpec.getMode(i6);
        if (y1Var.f2284o == null || y1Var.f2285p == null) {
            y1Var.f2284o = new int[4];
            y1Var.f2285p = new int[4];
        }
        int[] iArr3 = y1Var.f2284o;
        int[] iArr4 = y1Var.f2285p;
        iArr3[3] = -1;
        char c5 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z19 = y1Var.f2277g;
        boolean z20 = y1Var.f2283n;
        boolean z21 = mode3 == 1073741824;
        float f9 = 0.0f;
        boolean z22 = true;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        boolean z23 = false;
        boolean z24 = false;
        while (i61 < virtualChildCount2) {
            char c6 = c5;
            View childAt6 = y1Var.getChildAt(i61);
            if (childAt6 == null) {
                y1Var.f2281l = y1Var.f2281l;
                i16 = i61;
                i20 = i63;
                iArr2 = iArr3;
                iArr = iArr4;
                z5 = z19;
                z6 = z20;
            } else {
                int i67 = i62;
                if (childAt6.getVisibility() == 8) {
                    i60 = i5;
                    i16 = i61;
                    i20 = i63;
                    iArr = iArr4;
                    z5 = z19;
                    z6 = z20;
                    i62 = i67;
                    iArr2 = iArr3;
                } else {
                    if (y1Var.h(i61)) {
                        y1Var.f2281l += y1Var.f2287r;
                    }
                    x1 x1Var6 = (x1) childAt6.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) x1Var6).weight;
                    f9 += f10;
                    int i68 = i61;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) x1Var6).width == 0 && f10 > 0.0f) {
                        if (z21) {
                            y1Var.f2281l = ((LinearLayout.LayoutParams) x1Var6).leftMargin + ((LinearLayout.LayoutParams) x1Var6).rightMargin + y1Var.f2281l;
                        } else {
                            int i69 = y1Var.f2281l;
                            y1Var.f2281l = Math.max(i69, ((LinearLayout.LayoutParams) x1Var6).leftMargin + i69 + ((LinearLayout.LayoutParams) x1Var6).rightMargin);
                        }
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z5 = z19;
                            z6 = z20;
                            i17 = i67;
                            i16 = i68;
                            x1Var = x1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i60 = i5;
                            i18 = i63;
                            i15 = i64;
                        } else {
                            view = childAt6;
                            z5 = z19;
                            z6 = z20;
                            z24 = true;
                            i17 = i67;
                            i16 = i68;
                            i19 = 1073741824;
                            x1Var = x1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i60 = i5;
                            i18 = i63;
                            i15 = i64;
                            if (mode4 == i19 && ((LinearLayout.LayoutParams) x1Var).height == -1) {
                                z7 = true;
                                z23 = true;
                            } else {
                                z7 = false;
                            }
                            int i70 = ((LinearLayout.LayoutParams) x1Var).topMargin + ((LinearLayout.LayoutParams) x1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i70;
                            i66 = View.combineMeasuredStates(i66, view.getMeasuredState());
                            if (z5) {
                                z8 = z7;
                            } else {
                                int baseline2 = view.getBaseline();
                                z8 = z7;
                                if (baseline2 != -1) {
                                    int i71 = ((LinearLayout.LayoutParams) x1Var).gravity;
                                    if (i71 < 0) {
                                        i71 = y1Var.f2280k;
                                    }
                                    int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i72] = Math.max(iArr2[i72], baseline2);
                                    iArr[i72] = Math.max(iArr[i72], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i17, measuredHeight3);
                            boolean z25 = !z22 && ((LinearLayout.LayoutParams) x1Var).height == -1;
                            if (((LinearLayout.LayoutParams) x1Var).weight <= 0.0f) {
                                if (!z8) {
                                    i70 = measuredHeight3;
                                }
                                i64 = Math.max(i15, i70);
                                max = i18;
                            } else {
                                if (!z8) {
                                    i70 = measuredHeight3;
                                }
                                max = Math.max(i18, i70);
                                i64 = i15;
                            }
                            int i73 = max;
                            i62 = max2;
                            i20 = i73;
                            z22 = z25;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) x1Var6).width != 0 || f10 <= 0.0f) {
                            i14 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) x1Var6).width = -2;
                            i14 = 0;
                        }
                        iArr = iArr4;
                        i15 = i64;
                        i16 = i68;
                        z5 = z19;
                        z6 = z20;
                        int i74 = i14;
                        x1Var = x1Var6;
                        i17 = i67;
                        i60 = i5;
                        iArr2 = iArr3;
                        i18 = i63;
                        y1Var.measureChildWithMargins(childAt6, i60, f9 == 0.0f ? y1Var.f2281l : 0, i6, 0);
                        if (i74 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) x1Var).width = i74;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z21) {
                            view = childAt6;
                            y1Var.f2281l = ((LinearLayout.LayoutParams) x1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) x1Var).rightMargin + y1Var.f2281l;
                        } else {
                            view = childAt6;
                            int i75 = y1Var.f2281l;
                            y1Var.f2281l = Math.max(i75, i75 + measuredWidth3 + ((LinearLayout.LayoutParams) x1Var).leftMargin + ((LinearLayout.LayoutParams) x1Var).rightMargin);
                        }
                        if (z6) {
                            i65 = Math.max(measuredWidth3, i65);
                        }
                    }
                    i19 = 1073741824;
                    if (mode4 == i19) {
                    }
                    z7 = false;
                    int i702 = ((LinearLayout.LayoutParams) x1Var).topMargin + ((LinearLayout.LayoutParams) x1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i702;
                    i66 = View.combineMeasuredStates(i66, view.getMeasuredState());
                    if (z5) {
                    }
                    int max22 = Math.max(i17, measuredHeight32);
                    if (z22) {
                    }
                    if (((LinearLayout.LayoutParams) x1Var).weight <= 0.0f) {
                    }
                    int i732 = max;
                    i62 = max22;
                    i20 = i732;
                    z22 = z25;
                }
            }
            i63 = i20;
            i61 = i16 + 1;
            c5 = c6;
            iArr3 = iArr2;
            iArr4 = iArr;
            z19 = z5;
            z20 = z6;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c7 = c5;
        boolean z26 = z19;
        boolean z27 = z20;
        int i76 = i62;
        int i77 = i63;
        int i78 = i64;
        if (y1Var.f2281l > 0 && y1Var.h(virtualChildCount2)) {
            y1Var.f2281l += y1Var.f2287r;
        }
        int i79 = iArr5[1];
        int max3 = (i79 == -1 && iArr5[0] == -1 && iArr5[c7] == -1 && iArr5[3] == -1) ? i76 : Math.max(i76, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c7]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i79, iArr5[c7]))));
        if (z27 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            y1Var.f2281l = 0;
            for (int i80 = 0; i80 < virtualChildCount2; i80++) {
                View childAt7 = y1Var.getChildAt(i80);
                if (childAt7 == null) {
                    y1Var.f2281l = y1Var.f2281l;
                } else if (childAt7.getVisibility() != 8) {
                    x1 x1Var7 = (x1) childAt7.getLayoutParams();
                    if (z21) {
                        y1Var.f2281l = ((LinearLayout.LayoutParams) x1Var7).leftMargin + i65 + ((LinearLayout.LayoutParams) x1Var7).rightMargin + y1Var.f2281l;
                    } else {
                        int i81 = y1Var.f2281l;
                        y1Var.f2281l = Math.max(i81, i81 + i65 + ((LinearLayout.LayoutParams) x1Var7).leftMargin + ((LinearLayout.LayoutParams) x1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = y1Var.getPaddingRight() + y1Var.getPaddingLeft() + y1Var.f2281l;
        y1Var.f2281l = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, y1Var.getSuggestedMinimumWidth()), i60, 0);
        int i82 = (resolveSizeAndState2 & 16777215) - y1Var.f2281l;
        if (z24 || (i82 != 0 && f9 > 0.0f)) {
            float f11 = y1Var.f2282m;
            if (f11 > 0.0f) {
                f9 = f11;
            }
            iArr5[3] = -1;
            iArr5[c7] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c7] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            y1Var.f2281l = 0;
            max3 = -1;
            int i83 = 0;
            while (i83 < virtualChildCount2) {
                View childAt8 = y1Var.getChildAt(i83);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i11 = resolveSizeAndState2;
                } else {
                    x1 x1Var8 = (x1) childAt8.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) x1Var8).weight;
                    if (f12 > 0.0f) {
                        int i84 = (int) ((i82 * f12) / f9);
                        f9 -= f12;
                        i82 -= i84;
                        i11 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, y1Var.getPaddingBottom() + y1Var.getPaddingTop() + ((LinearLayout.LayoutParams) x1Var8).topMargin + ((LinearLayout.LayoutParams) x1Var8).bottomMargin, ((LinearLayout.LayoutParams) x1Var8).height);
                        if (((LinearLayout.LayoutParams) x1Var8).width == 0) {
                            i13 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i84 <= 0) {
                                    i84 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i84, 1073741824), childMeasureSpec2);
                                i66 = View.combineMeasuredStates(i66, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i84;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i13), childMeasureSpec2);
                        i66 = View.combineMeasuredStates(i66, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i11 = resolveSizeAndState2;
                    }
                    if (z21) {
                        y1Var.f2281l = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) x1Var8).leftMargin + ((LinearLayout.LayoutParams) x1Var8).rightMargin + y1Var.f2281l;
                    } else {
                        int i85 = y1Var.f2281l;
                        y1Var.f2281l = Math.max(i85, childAt8.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) x1Var8).leftMargin + ((LinearLayout.LayoutParams) x1Var8).rightMargin);
                    }
                    boolean z28 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) x1Var8).height == -1;
                    int i86 = ((LinearLayout.LayoutParams) x1Var8).topMargin + ((LinearLayout.LayoutParams) x1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i86;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z28) {
                        i86 = measuredHeight4;
                    }
                    int max4 = Math.max(i77, i86);
                    if (z22) {
                        i12 = -1;
                        if (((LinearLayout.LayoutParams) x1Var8).height == -1) {
                            z4 = true;
                            if (!z26 && (baseline = childAt8.getBaseline()) != i12) {
                                int i87 = ((LinearLayout.LayoutParams) x1Var8).gravity;
                                if (i87 < 0) {
                                    i87 = y1Var.f2280k;
                                }
                                int i88 = (((i87 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i88] = Math.max(iArr5[i88], baseline);
                                iArr6[i88] = Math.max(iArr6[i88], measuredHeight4 - baseline);
                            }
                            z22 = z4;
                            i77 = max4;
                        }
                    } else {
                        i12 = -1;
                    }
                    z4 = false;
                    if (!z26) {
                    }
                    z22 = z4;
                    i77 = max4;
                }
                i83++;
                resolveSizeAndState2 = i11;
            }
            i7 = resolveSizeAndState2;
            i8 = -16777216;
            y1Var.f2281l = y1Var.getPaddingRight() + y1Var.getPaddingLeft() + y1Var.f2281l;
            int i89 = iArr5[1];
            if (i89 == -1 && iArr5[0] == -1 && iArr5[c7] == -1 && iArr5[3] == -1) {
                i9 = 0;
            } else {
                i9 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c7]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i89, iArr5[c7]))));
            }
            i10 = i77;
        } else {
            i10 = Math.max(i77, i78);
            if (z27 && mode3 != 1073741824) {
                for (int i90 = 0; i90 < virtualChildCount2; i90++) {
                    View childAt9 = y1Var.getChildAt(i90);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((x1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i65, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i7 = resolveSizeAndState2;
            i8 = -16777216;
            i9 = 0;
        }
        if (!z22 && mode4 != 1073741824) {
            max3 = i10;
        }
        y1Var.setMeasuredDimension(i7 | (i66 & i8), View.resolveSizeAndState(Math.max(y1Var.getPaddingBottom() + y1Var.getPaddingTop() + max3, y1Var.getSuggestedMinimumHeight()), i6, i66 << 16));
        if (z23) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(y1Var.getMeasuredHeight(), 1073741824);
            int i91 = i9;
            while (i91 < virtualChildCount2) {
                View childAt10 = y1Var.getChildAt(i91);
                if (childAt10.getVisibility() != 8) {
                    x1 x1Var9 = (x1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) x1Var9).height == -1) {
                        int i92 = ((LinearLayout.LayoutParams) x1Var9).width;
                        ((LinearLayout.LayoutParams) x1Var9).width = childAt10.getMeasuredWidth();
                        y1Var.measureChildWithMargins(childAt10, i60, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) x1Var9).width = i92;
                    }
                }
                i91++;
                y1Var = this;
                i60 = i5;
            }
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f2277g = z4;
    }

    public void setBaselineAlignedChildIndex(int i5) {
        if (i5 >= 0 && i5 < getChildCount()) {
            this.h = i5;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2286q) {
            return;
        }
        this.f2286q = drawable;
        if (drawable != null) {
            this.f2287r = drawable.getIntrinsicWidth();
            this.f2288s = drawable.getIntrinsicHeight();
        } else {
            this.f2287r = 0;
            this.f2288s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i5) {
        this.f2290u = i5;
    }

    public void setGravity(int i5) {
        if (this.f2280k != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f2280k = i5;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i5) {
        int i6 = i5 & 8388615;
        int i7 = this.f2280k;
        if ((8388615 & i7) != i6) {
            this.f2280k = i6 | ((-8388616) & i7);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f2283n = z4;
    }

    public void setOrientation(int i5) {
        if (this.f2279j != i5) {
            this.f2279j = i5;
            requestLayout();
        }
    }

    public void setShowDividers(int i5) {
        if (i5 != this.f2289t) {
            requestLayout();
        }
        this.f2289t = i5;
    }

    public void setVerticalGravity(int i5) {
        int i6 = i5 & 112;
        int i7 = this.f2280k;
        if ((i7 & 112) != i6) {
            this.f2280k = i6 | (i7 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.f2282m = Math.max(0.0f, f5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
