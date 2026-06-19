package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.activity.a;
import com.google.android.gms.internal.ads.zzbgj;
import f0.c0;
import f0.d0;
import f0.k0;
import f0.p;
import f0.q;
import f0.r;
import f0.r0;
import f0.s;
import f0.s0;
import f0.y;
import f0.z;
import i0.c;
import i0.e;
import i0.f;
import i0.g;
import i0.h;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k1.j;
import y4.b;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements r, z {
    public static final float I = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final e J = new e();
    public static final int[] K = {R.attr.fillViewport};
    public final int[] A;
    public int B;
    public int C;
    public h D;
    public final s E;
    public final p F;
    public float G;
    public final f0.h H;

    /* renamed from: g, reason: collision with root package name */
    public final float f224g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f225i;

    /* renamed from: j, reason: collision with root package name */
    public final OverScroller f226j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f227k;

    /* renamed from: l, reason: collision with root package name */
    public final EdgeEffect f228l;

    /* renamed from: m, reason: collision with root package name */
    public y f229m;

    /* renamed from: n, reason: collision with root package name */
    public int f230n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f231o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f232p;

    /* renamed from: q, reason: collision with root package name */
    public View f233q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f234r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f235s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237u;

    /* renamed from: v, reason: collision with root package name */
    public final int f238v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final int f239x;

    /* renamed from: y, reason: collision with root package name */
    public int f240y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f241z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lokhnathtechnical.notecounterpro.R.attr.nestedScrollViewStyle);
        this.f225i = new Rect();
        this.f231o = true;
        this.f232p = false;
        this.f233q = null;
        this.f234r = false;
        this.f237u = true;
        this.f240y = -1;
        this.f241z = new int[2];
        this.A = new int[2];
        this.H = new f0.h(getContext(), new j(this, 9));
        int i5 = Build.VERSION.SDK_INT;
        this.f227k = i5 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f228l = i5 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f224g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f226j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f238v = viewConfiguration.getScaledTouchSlop();
        this.w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f239x = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K, com.lokhnathtechnical.notecounterpro.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.E = new s();
        this.F = new p(this);
        setNestedScrollingEnabled(true);
        r0.i(this, J);
    }

    private y getScrollFeedbackProvider() {
        if (this.f229m == null) {
            this.f229m = new y(this);
        }
        return this.f229m;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // f0.r
    public final void a(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        o(iArr, i8, i9);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // f0.q
    public final void b(View view, int i5, int i6, int i7, int i8, int i9) {
        o(null, i8, i9);
    }

    @Override // f0.q
    public final boolean c(View view, View view2, int i5, int i6) {
        return (i5 & 2) != 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i5;
        int i6;
        if (this.f226j.isFinished()) {
            return;
        }
        this.f226j.computeScrollOffset();
        int currY = this.f226j.getCurrY();
        int i7 = currY - this.C;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f227k;
        EdgeEffect edgeEffect2 = this.f228l;
        if (i7 <= 0 || b.u(edgeEffect) == 0.0f) {
            if (i7 < 0 && b.u(edgeEffect2) != 0.0f) {
                float f5 = height;
                round = Math.round(b.C(edgeEffect2, (i7 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
                if (round != i7) {
                    edgeEffect2.finish();
                }
            }
            this.C = currY;
            int[] iArr = this.A;
            iArr[1] = 0;
            i(0, i7, 1, iArr, null);
            i5 = i7 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f226j.getCurrVelocity()));
            }
            if (i5 == 0) {
                int scrollY = getScrollY();
                q(i5, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i8 = i5 - scrollY2;
                iArr[1] = 0;
                i6 = 1;
                this.F.b(0, scrollY2, 0, i8, this.f241z, 1, iArr);
                i5 = i8 - iArr[1];
            } else {
                i6 = 1;
            }
            if (i5 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i6 && scrollRange > 0)) {
                    if (i5 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f226j.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f226j.getCurrVelocity());
                    }
                }
                this.f226j.abortAnimation();
                y(i6);
            }
            if (this.f226j.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                y(i6);
                return;
            }
        }
        round = Math.round(b.C(edgeEffect, ((-i7) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i7) {
            edgeEffect.finish();
        }
        i7 -= round;
        this.C = currY;
        int[] iArr2 = this.A;
        iArr2[1] = 0;
        i(0, i7, 1, iArr2, null);
        i5 = i7 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i5 == 0) {
        }
        if (i5 != 0) {
        }
        if (this.f226j.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // f0.q
    public final void d(View view, View view2, int i5, int i6) {
        s sVar = this.E;
        if (i6 == 1) {
            sVar.f1416b = i5;
        } else {
            sVar.f1415a = i5;
        }
        w(2, i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        ViewParent c5;
        p pVar = this.F;
        if (pVar.f1399d && (c5 = pVar.c(0)) != null) {
            try {
                return c5.onNestedFling(pVar.f1398c, f5, f6, z4);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + c5 + " does not implement interface method onNestedFling", e4);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return this.F.a(f5, f6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return i(i5, i6, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return this.F.b(i5, i6, i7, i8, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i5;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f227k;
        int i6 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i5 = getPaddingLeft();
            } else {
                i5 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i5, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f228l;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i6 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i6 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // f0.q
    public final void e(View view, int i5) {
        s sVar = this.E;
        if (i5 == 1) {
            sVar.f1416b = 0;
        } else {
            sVar.f1415a = 0;
        }
        y(i5);
    }

    @Override // f0.q
    public final void f(int[] iArr, int i5, int i6, int i7) {
        i(i5, i6, i7, iArr, null);
    }

    public final boolean g(int i5) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i5);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i5 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i5 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i5 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f225i;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i5);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.E;
        return sVar.f1416b | sVar.f1415a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.G;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i6 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i5 - verticalFadingEdgeLength : i5;
        int i7 = rect.bottom;
        if (i7 > i6 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i6, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        }
        if (rect.top >= scrollY || i7 >= i6) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i6 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.F.c(0) != null;
    }

    public final boolean i(int i5, int i6, int i7, int[] iArr, int[] iArr2) {
        ViewParent c5;
        int i8;
        int i9;
        p pVar = this.F;
        NestedScrollView nestedScrollView = pVar.f1398c;
        if (!pVar.f1399d || (c5 = pVar.c(i7)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i8 = iArr2[0];
            i9 = iArr2[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr == null) {
            if (pVar.f1400e == null) {
                pVar.f1400e = new int[2];
            }
            iArr = pVar.f1400e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        NestedScrollView nestedScrollView2 = pVar.f1398c;
        if (c5 instanceof q) {
            ((q) c5).f(iArr, i5, i6, i7);
        } else if (i7 == 0) {
            try {
                c5.onNestedPreScroll(nestedScrollView2, i5, i6, iArr);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + c5 + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i8;
            iArr2[1] = iArr2[1] - i9;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.F.f1399d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f225i.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : g(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final void k(int i5) {
        if (getChildCount() > 0) {
            this.f226j.fling(getScrollX(), getScrollY(), 0, i5, 0, 0, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 0);
            w(2, 1);
            this.C = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f226j.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i5) {
        int childCount;
        boolean z4 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f225i;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i5, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i5, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i5, int i6) {
        Rect rect = this.f225i;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i5 >= getScrollY() && rect.top - i5 <= getScrollY() + i6;
    }

    public final void o(int[] iArr, int i5, int i6) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.F.b(0, scrollY2, 0, i5 - scrollY2, null, i6, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f232p = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0122, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d7, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        NestedScrollView nestedScrollView;
        float f6;
        NestedScrollView nestedScrollView2;
        float f7;
        long j2;
        float f8;
        float sqrt;
        int i10;
        NestedScrollView nestedScrollView3;
        float f9;
        if (motionEvent.getAction() != 8 || this.f234r) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i6 = (int) motionEvent.getX();
            i5 = 9;
            f5 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i6 = getWidth() / 2;
            f5 = axisValue2;
            i5 = 26;
        } else {
            f5 = 0.0f;
            i5 = 0;
            i6 = 0;
        }
        if (f5 == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f5)), i5, motionEvent, i6, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i5 != 0) {
            f0.h hVar = this.H;
            NestedScrollView nestedScrollView4 = (NestedScrollView) hVar.f1368b.h;
            int[] iArr = hVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i11 = 1;
            if (hVar.f1372f == source && hVar.f1373g == deviceId && hVar.f1371e == i5) {
                z4 = false;
                i7 = 0;
            } else {
                Context context = hVar.f1367a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i7 = 0;
                int source2 = motionEvent.getSource();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 34) {
                    int i13 = s0.f1417a;
                    i8 = a.f(viewConfiguration, deviceId2, i5, source2);
                } else {
                    int i14 = s0.f1417a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i5, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i5 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i8 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i8 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i8 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                }
                iArr[0] = i8;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i12 >= 34) {
                    i9 = a.e(viewConfiguration, deviceId3, i5, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i5, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i5 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i9 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i9 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i9 = Integer.MIN_VALUE;
                }
                iArr[1] = i9;
                hVar.f1372f = source;
                hVar.f1373g = deviceId;
                hVar.f1371e = i5;
                z4 = true;
            }
            if (iArr[i7] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = hVar.f1369c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                hVar.f1369c = null;
                return true;
            }
            if (hVar.f1369c == null) {
                hVar.f1369c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = hVar.f1369c;
            Map map = c0.f1340a;
            velocityTracker2.addMovement(motionEvent);
            int i15 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = c0.f1340a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new d0());
                }
                d0 d0Var = (d0) map2.get(velocityTracker2);
                long[] jArr = d0Var.f1347b;
                long eventTime = motionEvent.getEventTime();
                if (d0Var.f1349d != 0 && eventTime - jArr[d0Var.f1350e] > 40) {
                    d0Var.f1349d = i7;
                    d0Var.f1348c = 0.0f;
                }
                int i16 = (d0Var.f1350e + 1) % 20;
                d0Var.f1350e = i16;
                int i17 = d0Var.f1349d;
                if (i17 != 20) {
                    d0Var.f1349d = i17 + 1;
                }
                d0Var.f1346a[i16] = motionEvent.getAxisValue(26);
                jArr[d0Var.f1350e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(zzbgj.zzq.zzf, Float.MAX_VALUE);
            d0 d0Var2 = (d0) c0.f1340a.get(velocityTracker2);
            if (d0Var2 != null) {
                float[] fArr = d0Var2.f1346a;
                long[] jArr2 = d0Var2.f1347b;
                int i18 = d0Var2.f1349d;
                if (i18 >= 2) {
                    int i19 = d0Var2.f1350e;
                    int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                    long j5 = jArr2[i19];
                    while (true) {
                        j2 = jArr2[i20];
                        if (j5 - j2 <= 100) {
                            break;
                        }
                        d0Var2.f1349d--;
                        i20 = (i20 + 1) % 20;
                    }
                    int i21 = d0Var2.f1349d;
                    if (i21 >= 2) {
                        if (i21 == 2) {
                            int i22 = (i20 + 1) % 20;
                            if (j2 != jArr2[i22]) {
                                nestedScrollView = nestedScrollView4;
                                f8 = Float.MAX_VALUE;
                                i10 = 1000;
                                sqrt = fArr[i22] / (r12 - j2);
                            }
                        } else {
                            f8 = Float.MAX_VALUE;
                            float f10 = 0.0f;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i23 >= d0Var2.f1349d - 1) {
                                    break;
                                }
                                int i25 = i23 + i20;
                                long j6 = jArr2[i25 % 20];
                                int i26 = (i25 + 1) % i15;
                                if (jArr2[i26] == j6) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i24++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
                                    float f11 = fArr[i26] / (jArr2[i26] - j6);
                                    float abs = (Math.abs(f11) * (f11 - sqrt2)) + f10;
                                    if (i24 == i11) {
                                        abs *= 0.5f;
                                    }
                                    f10 = abs;
                                }
                                i23++;
                                nestedScrollView4 = nestedScrollView3;
                                i15 = 20;
                                i11 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f10) * 2.0f)) * (f10 < 0.0f ? -1.0f : 1.0f);
                            i10 = zzbgj.zzq.zzf;
                        }
                        f9 = sqrt * i10;
                        d0Var2.f1348c = f9;
                        if (f9 >= (-Math.abs(f8))) {
                            d0Var2.f1348c = -Math.abs(f8);
                        } else if (d0Var2.f1348c > Math.abs(f8)) {
                            d0Var2.f1348c = Math.abs(f8);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f8 = Float.MAX_VALUE;
                i10 = 1000;
                sqrt = 0.0f;
                f9 = sqrt * i10;
                d0Var2.f1348c = f9;
                if (f9 >= (-Math.abs(f8))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f6 = a.b(velocityTracker2, i5);
            } else if (i5 == 0) {
                f6 = velocityTracker2.getXVelocity();
            } else if (i5 == 1) {
                f6 = velocityTracker2.getYVelocity();
            } else {
                d0 d0Var3 = (d0) c0.f1340a.get(velocityTracker2);
                f6 = (d0Var3 == null || i5 != 26) ? 0.0f : d0Var3.f1348c;
            }
            float f12 = f6 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f12);
            if (z4 || !(signum == Math.signum(hVar.f1370d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f226j.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f12) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f12, iArr[1]));
                if (max == 0.0f) {
                    f7 = 0.0f;
                } else {
                    nestedScrollView2.f226j.abortAnimation();
                    nestedScrollView2.k((int) max);
                    f7 = max;
                }
                hVar.f1370d = f7;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f234r) {
            return true;
        }
        int i5 = action & 255;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = this.f240y;
                    if (i6 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i6);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i6 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f230n) > this.f238v && (2 & getNestedScrollAxes()) == 0) {
                                this.f234r = true;
                                this.f230n = y2;
                                if (this.f235s == null) {
                                    this.f235s = VelocityTracker.obtain();
                                }
                                this.f235s.addMovement(motionEvent);
                                this.B = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.f234r = false;
            this.f240y = -1;
            VelocityTracker velocityTracker = this.f235s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f235s = null;
            }
            if (this.f226j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y5 = (int) motionEvent.getY();
            int x5 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y5 >= childAt.getTop() - scrollY && y5 < childAt.getBottom() - scrollY && x5 >= childAt.getLeft() && x5 < childAt.getRight()) {
                    this.f230n = y5;
                    this.f240y = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f235s;
                    if (velocityTracker2 == null) {
                        this.f235s = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f235s.addMovement(motionEvent);
                    this.f226j.computeScrollOffset();
                    if (!x(motionEvent) && this.f226j.isFinished()) {
                        z4 = false;
                    }
                    this.f234r = z4;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.f226j.isFinished()) {
                z4 = false;
            }
            this.f234r = z4;
            VelocityTracker velocityTracker3 = this.f235s;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f235s = null;
            }
        }
        return this.f234r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int i9;
        super.onLayout(z4, i5, i6, i7, i8);
        int i10 = 0;
        this.f231o = false;
        View view = this.f233q;
        if (view != null && m(view, this)) {
            View view2 = this.f233q;
            Rect rect = this.f225i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f233q = null;
        if (!this.f232p) {
            if (this.D != null) {
                scrollTo(getScrollX(), this.D.f1815g);
                this.D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i9 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i9 = 0;
            }
            int paddingTop = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i9 && scrollY >= 0) {
                i10 = paddingTop + scrollY > i9 ? i9 - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f232p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f236t && View.MeasureSpec.getMode(i6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f6, true);
        k((int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return this.F.a(f5, f6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        i(i5, i6, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        o(null, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        d(view, view2, i5, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i5, int i6, boolean z4, boolean z5) {
        super.scrollTo(i5, i6);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (i5 == 2) {
            i5 = 130;
        } else if (i5 == 1) {
            i5 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i5) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i5);
        if (findNextFocus != null && n(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i5, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.D = hVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f1815g = getScrollY();
        return hVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i5, int i6, int i7, int i8) {
        super.onScrollChanged(i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i8)) {
            return;
        }
        Rect rect = this.f225i;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f237u) {
                v(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        return c(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float C;
        int round;
        int i5;
        ViewParent parent2;
        if (this.f235s == null) {
            this.f235s = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f5 = 0.0f;
        obtain.offsetLocation(0.0f, this.B);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f227k;
            EdgeEffect edgeEffect2 = this.f228l;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f235s;
                velocityTracker.computeCurrentVelocity(zzbgj.zzq.zzf, this.f239x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f240y);
                if (Math.abs(yVelocity) >= this.w) {
                    if (b.u(edgeEffect) != 0.0f) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (b.u(edgeEffect2) != 0.0f) {
                        int i6 = -yVelocity;
                        if (u(edgeEffect2, i6)) {
                            edgeEffect2.onAbsorb(i6);
                        } else {
                            k(i6);
                        }
                    } else {
                        int i7 = -yVelocity;
                        float f6 = i7;
                        if (!this.F.a(0.0f, f6)) {
                            dispatchNestedFling(0.0f, f6, true);
                            k(i7);
                        }
                    }
                } else if (this.f226j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f240y = -1;
                this.f234r = false;
                VelocityTracker velocityTracker2 = this.f235s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f235s = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f240y);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f240y + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i8 = this.f230n - y2;
                    float x5 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i8 / getHeight();
                    if (b.u(edgeEffect) != 0.0f) {
                        C = -b.C(edgeEffect, -height, x5);
                        if (b.u(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (b.u(edgeEffect2) != 0.0f) {
                            C = b.C(edgeEffect2, height, 1.0f - x5);
                            if (b.u(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f5 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i5 = i8 - round;
                        if (!this.f234r && Math.abs(i5) > this.f238v) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f234r = true;
                            i5 = i5 <= 0 ? i5 - this.f238v : i5 + this.f238v;
                        }
                        if (this.f234r) {
                            int t5 = t(i5, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f230n = y2 - t5;
                            this.B += t5;
                        }
                    }
                    f5 = C;
                    round = Math.round(f5 * getHeight());
                    if (round != 0) {
                    }
                    i5 = i8 - round;
                    if (!this.f234r) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f234r = true;
                        if (i5 <= 0) {
                        }
                    }
                    if (this.f234r) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f234r && getChildCount() > 0) {
                    if (this.f226j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f240y = -1;
                this.f234r = false;
                VelocityTracker velocityTracker3 = this.f235s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f235s = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f230n = (int) motionEvent.getY(actionIndex);
                this.f240y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f230n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f240y));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f234r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f226j.isFinished()) {
                this.f226j.abortAnimation();
                y(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f230n = y5;
            this.f240y = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f235s;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f240y) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f230n = (int) motionEvent.getY(i5);
            this.f240y = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f235s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i5, int i6, int i7, int i8) {
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i11 = i7 + i5;
        if (i6 <= 0 && i6 >= 0) {
            i9 = i6;
            z4 = false;
        } else {
            i9 = 0;
            z4 = true;
        }
        if (i11 > i8) {
            i10 = i8;
        } else {
            if (i11 >= 0) {
                i10 = i11;
                z5 = false;
                if (z5 && this.F.c(1) == null) {
                    this.f226j.springBack(i9, i10, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i9, i10);
                return !z4 || z5;
            }
            i10 = 0;
        }
        z5 = true;
        if (z5) {
            this.f226j.springBack(i9, i10, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i9, i10);
        if (z4) {
        }
    }

    public final void r(int i5) {
        boolean z4 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f225i;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i6 = rect.top;
        int i7 = height + i6;
        rect.bottom = i7;
        s(i5, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f231o) {
            this.f233q = view2;
        } else {
            Rect rect = this.f225i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z5 = h != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, h);
                return z5;
            }
            v(0, h, false);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f235s) != null) {
            velocityTracker.recycle();
            this.f235s = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f231o = true;
        super.requestLayout();
    }

    public final boolean s(int i5, int i6, int i7) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z5 = i5 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z7 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i6 < scrollY || i7 > i8) {
            t(z5 ? i6 - scrollY : i7 - i8, -1, null, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i5);
        }
        return z4;
    }

    @Override // android.view.View
    public final void scrollTo(int i5, int i6) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i5 < 0) {
                i5 = 0;
            } else if (width + i5 > width2) {
                i5 = width2 - width;
            }
            if (height >= height2 || i6 < 0) {
                i6 = 0;
            } else if (height + i6 > height2) {
                i6 = height2 - height;
            }
            if (i5 == getScrollX() && i6 == getScrollY()) {
                return;
            }
            super.scrollTo(i5, i6);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f236t) {
            this.f236t = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        p pVar = this.F;
        if (pVar.f1399d) {
            NestedScrollView nestedScrollView = pVar.f1398c;
            WeakHashMap weakHashMap = r0.f1407a;
            k0.j(nestedScrollView);
        }
        pVar.f1399d = z4;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f237u = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i5) {
        return w(i5, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(int i5, int i6, MotionEvent motionEvent, int i7, int i8, boolean z4) {
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        if (i8 == 1) {
            w(2, i8);
        }
        boolean i11 = i(0, i5, i8, this.A, this.f241z);
        int[] iArr = this.f241z;
        int[] iArr2 = this.A;
        if (i11) {
            i9 = i5 - iArr2[1];
            i10 = iArr[1];
        } else {
            i9 = i5;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z7 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z8 = q(i9, 0, scrollY, scrollRange) && this.F.c(i8) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f1427a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i6, scrollY2);
        }
        iArr2[1] = 0;
        this.F.b(0, scrollY2, 0, i9 - scrollY2, this.f241z, i8, iArr2);
        int i12 = i10 + iArr[1];
        int i13 = i9 - iArr2[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f228l;
        EdgeEffect edgeEffect2 = this.f227k;
        if (i14 < 0) {
            if (z7) {
                b.C(edgeEffect2, (-i13) / getHeight(), i7 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f1427a.d(true, motionEvent.getDeviceId(), motionEvent.getSource(), i6);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z7) {
            b.C(edgeEffect, i13 / getHeight(), 1.0f - (i7 / getWidth()));
            if (motionEvent != null) {
                z5 = false;
                getScrollFeedbackProvider().f1427a.d(false, motionEvent.getDeviceId(), motionEvent.getSource(), i6);
            } else {
                z5 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z6 = z5;
            } else {
                z6 = z8;
            }
            if (z6 && i8 == 0 && (velocityTracker = this.f235s) != null) {
                velocityTracker.clear();
            }
            if (i8 == 1) {
                y(i8);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i12;
        }
        z5 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z6 = z5;
        if (z6) {
            velocityTracker.clear();
        }
        if (i8 == 1) {
        }
        return i12;
    }

    public final boolean u(EdgeEffect edgeEffect, int i5) {
        if (i5 > 0) {
            return true;
        }
        float u4 = b.u(edgeEffect) * getHeight();
        float abs = Math.abs(-i5) * 0.35f;
        float f5 = this.f224g * 0.015f;
        double log = Math.log(abs / f5);
        double d5 = I;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * log) * ((double) f5))) < u4;
    }

    public final void v(int i5, int i6, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.h > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i6 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f226j.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z4) {
                w(2, 1);
            } else {
                y(1);
            }
            this.C = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f226j.isFinished()) {
                this.f226j.abortAnimation();
                y(1);
            }
            scrollBy(i5, i6);
        }
        this.h = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i5, int i6) {
        boolean onStartNestedScroll;
        p pVar = this.F;
        View view = pVar.f1398c;
        if (pVar.c(i6) != null) {
            return true;
        }
        if (pVar.f1399d) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof q;
                if (z4) {
                    onStartNestedScroll = ((q) parent).c(view2, view, i5, i6);
                } else {
                    if (i6 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i5);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i6 == 0) {
                        pVar.f1396a = parent;
                    } else if (i6 == 1) {
                        pVar.f1397b = parent;
                    }
                    if (z4) {
                        ((q) parent).d(view2, view, i5, i6);
                        return true;
                    }
                    if (i6 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i5);
                        return true;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f227k;
        if (b.u(edgeEffect) != 0.0f) {
            b.C(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f228l;
        if (b.u(edgeEffect2) == 0.0f) {
            return z4;
        }
        b.C(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i5) {
        p pVar = this.F;
        ViewParent c5 = pVar.c(i5);
        if (c5 != null) {
            NestedScrollView nestedScrollView = pVar.f1398c;
            if (c5 instanceof q) {
                ((q) c5).e(nestedScrollView, i5);
            } else if (i5 == 0) {
                try {
                    c5.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + c5 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i5 == 0) {
                pVar.f1396a = null;
            } else {
                if (i5 != 1) {
                    return;
                }
                pVar.f1397b = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5) {
        if (getChildCount() <= 0) {
            super.addView(view, i5);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
