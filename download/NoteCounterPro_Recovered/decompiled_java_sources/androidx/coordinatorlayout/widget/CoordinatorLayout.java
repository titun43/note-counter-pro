package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c3.c0;
import com.lokhnathtechnical.notecounterpro.R;
import e0.c;
import f0.i0;
import f0.k0;
import f0.q;
import f0.q1;
import f0.r;
import f0.r0;
import f0.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k1.j;
import o.l;
import r.a;
import r1.h;
import s.b;
import s.d;
import s.e;
import s.f;
import s.g;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    public static final c0 A;
    public static final c B;

    /* renamed from: x, reason: collision with root package name */
    public static final String f185x;

    /* renamed from: y, reason: collision with root package name */
    public static final Class[] f186y;

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f187z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f188g;
    public final h h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f189i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f190j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f191k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f192l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f193m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f194n;

    /* renamed from: o, reason: collision with root package name */
    public View f195o;

    /* renamed from: p, reason: collision with root package name */
    public e f196p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197q;

    /* renamed from: r, reason: collision with root package name */
    public q1 f198r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f200t;

    /* renamed from: u, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f201u;

    /* renamed from: v, reason: collision with root package name */
    public j f202v;
    public final s w;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f185x = r02 != null ? r02.getName() : null;
        A = new c0(1);
        f186y = new Class[]{Context.class, AttributeSet.class};
        f187z = new ThreadLocal();
        B = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f188g = new ArrayList();
        this.h = new h(9);
        this.f189i = new ArrayList();
        this.f190j = new int[2];
        this.f191k = new int[2];
        this.w = new s();
        int[] iArr = a.f3141a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        r0.h(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f194n = intArray;
            float f5 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f194n[i5] = (int) (r1[i5] * f5);
            }
        }
        this.f200t = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        u();
        super.setOnHierarchyChangeListener(new b(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) B.a();
        return rect == null ? new Rect() : rect;
    }

    private int getFullContentHeight() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            d dVar = (d) childAt.getLayoutParams();
            i5 += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
        }
        return i5;
    }

    public static void k(int i5, Rect rect, Rect rect2, d dVar, int i6, int i7) {
        int i8 = dVar.f3274b;
        if (i8 == 0) {
            i8 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i5);
        int i9 = dVar.f3275c;
        if ((i9 & 7) == 0) {
            i9 |= 8388611;
        }
        if ((i9 & 112) == 0) {
            i9 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, i5);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int i12 = absoluteGravity2 & 7;
        int i13 = absoluteGravity2 & 112;
        int width = i12 != 1 ? i12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i13 != 16 ? i13 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i10 == 1) {
            width -= i6 / 2;
        } else if (i10 != 5) {
            width -= i6;
        }
        if (i11 == 16) {
            height -= i7 / 2;
        } else if (i11 != 80) {
            height -= i7;
        }
        rect2.set(width, height, i6 + width, i7 + height);
    }

    public static d m(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f3273a) {
            s.a aVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                aVar = (s.a) cls.getAnnotation(s.a.class);
                if (aVar != null) {
                    break;
                }
            }
            if (aVar != null) {
                try {
                    if (aVar.value().getDeclaredConstructor(null).newInstance(null) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + aVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            dVar.f3273a = true;
        }
        return dVar;
    }

    public static void s(View view, int i5) {
        d dVar = (d) view.getLayoutParams();
        int i6 = dVar.h;
        if (i6 != i5) {
            WeakHashMap weakHashMap = r0.f1407a;
            view.offsetLeftAndRight(i5 - i6);
            dVar.h = i5;
        }
    }

    public static void t(View view, int i5) {
        d dVar = (d) view.getLayoutParams();
        int i6 = dVar.f3280i;
        if (i6 != i5) {
            WeakHashMap weakHashMap = r0.f1407a;
            view.offsetTopAndBottom(i5 - i6);
            dVar.f3280i = i5;
        }
    }

    @Override // f0.r
    public final void a(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ((d) childAt.getLayoutParams()).getClass();
            }
        }
        iArr[0] = iArr[0];
        iArr[1] = iArr[1];
    }

    @Override // f0.q
    public final void b(View view, int i5, int i6, int i7, int i8, int i9) {
        a(view, i5, i6, i7, i8, 0, this.f190j);
    }

    @Override // f0.q
    public final boolean c(View view, View view2, int i5, int i6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ((d) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // f0.q
    public final void d(View view, View view2, int i5, int i6) {
        s sVar = this.w;
        if (i6 == 1) {
            sVar.f1416b = i5;
        } else {
            sVar.f1415a = i5;
        }
        this.f195o = view2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((d) getChildAt(i7).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? n(-getHeight()) : n(-((int) (getHeight() * 0.2f)));
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? n(getHeight()) : n((int) (getHeight() * 0.2f));
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? n(-getFullContentHeight()) : n(getFullContentHeight() - getHeight());
            }
            if (keyCode == 92) {
                return n(-getHeight());
            }
            if (keyCode == 93) {
                return n(getHeight());
            }
            if (keyCode == 122) {
                return n(-getFullContentHeight());
            }
            if (keyCode == 123) {
                return n(getFullContentHeight() - getHeight());
            }
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ((d) view.getLayoutParams()).getClass();
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f200t;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // f0.q
    public final void e(View view, int i5) {
        s sVar = this.w;
        if (i5 == 1) {
            sVar.f1416b = 0;
        } else {
            sVar.f1415a = 0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((d) getChildAt(i6).getLayoutParams()).getClass();
        }
        this.f195o = null;
    }

    @Override // f0.q
    public final void f(int[] iArr, int i5, int i6, int i7) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ((d) childAt.getLayoutParams()).getClass();
            }
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        q();
        return Collections.unmodifiableList(this.f188g);
    }

    public final q1 getLastWindowInsets() {
        return this.f198r;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.w;
        return sVar.f1416b | sVar.f1415a;
    }

    public Drawable getStatusBarBackground() {
        return this.f200t;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i5, int i6) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i5) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i6) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i5 + max, i6 + max2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            j(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void j(View view, Rect rect) {
        ThreadLocal threadLocal = g.f3286a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f3286a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f3287b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int l(int i5) {
        int[] iArr = this.f194n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i5);
            return 0;
        }
        if (i5 >= 0 && i5 < iArr.length) {
            return iArr[i5];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i5 + " out of range for " + this);
        return 0;
    }

    public final boolean n(int i5) {
        View view;
        View view2 = this;
        while (true) {
            if (view2 == null) {
                view = null;
                break;
            }
            if (view2.isFocused()) {
                view = view2;
                break;
            }
            view2 = view2 instanceof ViewGroup ? ((ViewGroup) view2).getFocusedChild() : null;
        }
        c(this, view, 2, 1);
        int[] iArr = this.f191k;
        f(iArr, 0, i5, 1);
        int i6 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        a(view, 0, i6, 0, i5, 1, iArr);
        e(view, 1);
        return iArr[1] > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0255 A[LOOP:2: B:92:0x0251->B:94:0x0255, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i5) {
        int i6;
        Rect rect;
        int i7;
        int i8;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        boolean z6;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList2;
        int i16;
        Rect rect2;
        int i17;
        View view;
        d dVar;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f188g;
        int size = arrayList3.size();
        Rect g5 = g();
        Rect g6 = g();
        Rect g7 = g();
        int i18 = 0;
        while (true) {
            c cVar = B;
            if (i18 >= size) {
                Rect rect3 = g7;
                g5.setEmpty();
                cVar.d(g5);
                g6.setEmpty();
                cVar.d(g6);
                rect3.setEmpty();
                cVar.d(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i18);
            d dVar2 = (d) view2.getLayoutParams();
            if (i5 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i8 = size;
                rect = g7;
                i6 = i18;
            } else {
                int i19 = 0;
                while (i19 < i18) {
                    if (dVar2.f3282k == ((View) arrayList3.get(i19))) {
                        d dVar3 = (d) view2.getLayoutParams();
                        if (dVar3.f3281j != null) {
                            Rect g8 = g();
                            Rect g9 = g();
                            d dVar4 = dVar2;
                            Rect g10 = g();
                            j(dVar3.f3281j, g8);
                            i(view2, g9, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            i15 = i19;
                            layoutDirection = layoutDirection;
                            arrayList2 = arrayList3;
                            dVar = dVar4;
                            i17 = i18;
                            view = view3;
                            k(layoutDirection, g8, g10, dVar3, measuredWidth, measuredHeight);
                            i16 = size;
                            rect2 = g7;
                            if (g10.left == g9.left) {
                                int i20 = g10.top;
                                int i21 = g9.top;
                            }
                            h(dVar3, g10, measuredWidth, measuredHeight);
                            int i22 = g10.left - g9.left;
                            int i23 = g10.top - g9.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap = r0.f1407a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap2 = r0.f1407a;
                                view.offsetTopAndBottom(i23);
                            }
                            g8.setEmpty();
                            cVar.d(g8);
                            g9.setEmpty();
                            cVar.d(g9);
                            g10.setEmpty();
                            cVar.d(g10);
                            i19 = i15 + 1;
                            dVar2 = dVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i16;
                            i18 = i17;
                            g7 = rect2;
                        }
                    }
                    i15 = i19;
                    arrayList2 = arrayList3;
                    i16 = size;
                    rect2 = g7;
                    i17 = i18;
                    view = view2;
                    dVar = dVar2;
                    i19 = i15 + 1;
                    dVar2 = dVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i16;
                    i18 = i17;
                    g7 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                int i24 = size;
                Rect rect4 = g7;
                i6 = i18;
                View view4 = view2;
                d dVar5 = dVar2;
                i(view4, g6, true);
                if (dVar5.f3278f != 0 && !g6.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar5.f3278f, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        g5.top = Math.max(g5.top, g6.bottom);
                    } else if (i25 == 80) {
                        g5.bottom = Math.max(g5.bottom, getHeight() - g6.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        g5.left = Math.max(g5.left, g6.right);
                    } else if (i26 == 5) {
                        g5.right = Math.max(g5.right, getWidth() - g6.left);
                    }
                }
                if (dVar5.f3279g != 0 && view4.getVisibility() == 0 && view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                    d dVar6 = (d) view4.getLayoutParams();
                    dVar6.getClass();
                    Rect g11 = g();
                    Rect g12 = g();
                    g12.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                    g11.set(g12);
                    g12.setEmpty();
                    cVar.d(g12);
                    if (g11.isEmpty()) {
                        g11.setEmpty();
                        cVar.d(g11);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.f3279g, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i13 = (g11.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.f3280i) >= (i14 = g5.top)) {
                            z4 = false;
                        } else {
                            t(view4, i14 - i13);
                            z4 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g11.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.f3280i) < (i12 = g5.bottom)) {
                            t(view4, height - i12);
                            z4 = true;
                        }
                        if (!z4) {
                            t(view4, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i10 = (g11.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.h) >= (i11 = g5.left)) {
                            z5 = false;
                        } else {
                            s(view4, i11 - i10);
                            z5 = true;
                        }
                        if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - g11.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.h) >= (i9 = g5.right)) {
                            z6 = z5;
                        } else {
                            s(view4, width - i9);
                            z6 = true;
                        }
                        if (!z6) {
                            s(view4, 0);
                        }
                        g11.setEmpty();
                        cVar.d(g11);
                        if (i5 == 2) {
                            rect = rect4;
                            rect.set(((d) view4.getLayoutParams()).f3283l);
                            if (rect.equals(g6)) {
                                arrayList = arrayList4;
                                i8 = i24;
                            } else {
                                ((d) view4.getLayoutParams()).f3283l.set(g6);
                            }
                        } else {
                            rect = rect4;
                        }
                        i7 = i6 + 1;
                        i8 = i24;
                        while (true) {
                            arrayList = arrayList4;
                            if (i7 >= i8) {
                                ((d) ((View) arrayList.get(i7)).getLayoutParams()).getClass();
                                i7++;
                            }
                        }
                    }
                }
                if (i5 == 2) {
                }
                i7 = i6 + 1;
                i8 = i24;
                while (true) {
                    arrayList = arrayList4;
                    if (i7 >= i8) {
                        break;
                    }
                    ((d) ((View) arrayList.get(i7)).getLayoutParams()).getClass();
                    i7++;
                }
            }
            i18 = i6 + 1;
            size = i8;
            g7 = rect;
            arrayList3 = arrayList;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
        if (this.f197q) {
            if (this.f196p == null) {
                this.f196p = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f196p);
        }
        if (this.f198r == null) {
            WeakHashMap weakHashMap = r0.f1407a;
            if (getFitsSystemWindows()) {
                i0.c(this);
            }
        }
        this.f193m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
        if (this.f197q && this.f196p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f196p);
        }
        View view = this.f195o;
        if (view != null) {
            e(view, 0);
        }
        this.f193m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f199s || this.f200t == null) {
            return;
        }
        q1 q1Var = this.f198r;
        int d5 = q1Var != null ? q1Var.d() : 0;
        if (d5 > 0) {
            this.f200t.setBounds(0, 0, getWidth(), d5);
            this.f200t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r();
        }
        p(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        r();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        Rect g5;
        Rect g6;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f188g;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            if (view.getVisibility() != 8) {
                ((d) view.getLayoutParams()).getClass();
                d dVar = (d) view.getLayoutParams();
                View view2 = dVar.f3281j;
                if (view2 == null && dVar.f3277e != -1) {
                    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
                }
                c cVar = B;
                if (view2 != null) {
                    g5 = g();
                    g6 = g();
                    try {
                        j(view2, g5);
                        d dVar2 = (d) view.getLayoutParams();
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        k(layoutDirection, g5, g6, dVar2, measuredWidth, measuredHeight);
                        h(dVar2, g6, measuredWidth, measuredHeight);
                        view.layout(g6.left, g6.top, g6.right, g6.bottom);
                    } finally {
                        g5.setEmpty();
                        cVar.d(g5);
                        g6.setEmpty();
                        cVar.d(g6);
                    }
                } else {
                    int i10 = dVar.f3276d;
                    if (i10 >= 0) {
                        d dVar3 = (d) view.getLayoutParams();
                        int i11 = dVar3.f3274b;
                        if (i11 == 0) {
                            i11 = 8388661;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i11, layoutDirection);
                        int i12 = absoluteGravity & 7;
                        int i13 = absoluteGravity & 112;
                        int width = getWidth();
                        int height = getHeight();
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (layoutDirection == 1) {
                            i10 = width - i10;
                        }
                        int l5 = l(i10) - measuredWidth2;
                        if (i12 == 1) {
                            l5 += measuredWidth2 / 2;
                        } else if (i12 == 5) {
                            l5 += measuredWidth2;
                        }
                        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
                        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, Math.min(l5, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin));
                        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin));
                        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    } else {
                        d dVar4 = (d) view.getLayoutParams();
                        g5 = g();
                        g5.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin);
                        if (this.f198r != null) {
                            WeakHashMap weakHashMap = r0.f1407a;
                            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                                g5.left = this.f198r.b() + g5.left;
                                g5.top = this.f198r.d() + g5.top;
                                g5.right -= this.f198r.c();
                                g5.bottom -= this.f198r.a();
                            }
                        }
                        g6 = g();
                        int i15 = dVar4.f3274b;
                        if ((i15 & 7) == 0) {
                            i15 |= 8388611;
                        }
                        if ((i15 & 112) == 0) {
                            i15 |= 48;
                        }
                        int i16 = layoutDirection;
                        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), g5, g6, i16);
                        layoutDirection = i16;
                        view.layout(g6.left, g6.top, g6.right, g6.bottom);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i6) {
        boolean z4;
        boolean z5;
        int size;
        int i7;
        int i8;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z6;
        int max;
        q();
        int childCount = getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = getChildAt(i16);
            l lVar = (l) this.h.h;
            int i17 = lVar.f2733i;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList3 = (ArrayList) lVar.i(i18);
                if (arrayList3 != null && arrayList3.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z4 != this.f197q) {
            if (z4) {
                if (this.f193m) {
                    if (this.f196p == null) {
                        this.f196p = new e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f196p);
                }
                this.f197q = true;
            } else {
                if (this.f193m && this.f196p != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f196p);
                }
                this.f197q = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int layoutDirection = getLayoutDirection();
        boolean z7 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size3 = View.MeasureSpec.getSize(i6);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f198r != null) {
            WeakHashMap weakHashMap = r0.f1407a;
            if (getFitsSystemWindows()) {
                z5 = true;
                ArrayList arrayList4 = this.f188g;
                size = arrayList4.size();
                i7 = 0;
                int i21 = 0;
                while (i7 < size) {
                    View view = (View) arrayList4.get(i7);
                    int i22 = suggestedMinimumWidth;
                    if (view.getVisibility() == 8) {
                        arrayList2 = arrayList4;
                        i13 = size;
                        i12 = i7;
                        i14 = paddingLeft;
                        suggestedMinimumWidth = i22;
                        z6 = false;
                        i15 = paddingRight;
                    } else {
                        d dVar = (d) view.getLayoutParams();
                        int i23 = dVar.f3276d;
                        if (i23 < 0 || mode == 0) {
                            i8 = suggestedMinimumHeight;
                        } else {
                            int l5 = l(i23);
                            int i24 = dVar.f3274b;
                            if (i24 == 0) {
                                i24 = 8388661;
                            }
                            int absoluteGravity = Gravity.getAbsoluteGravity(i24, layoutDirection) & 7;
                            i8 = suggestedMinimumHeight;
                            if ((absoluteGravity == 3 && !z7) || (absoluteGravity == 5 && z7)) {
                                max = Math.max(0, (size2 - paddingRight) - l5);
                            } else if ((absoluteGravity == 5 && !z7) || (absoluteGravity == 3 && z7)) {
                                max = Math.max(0, l5 - paddingLeft);
                            }
                            ArrayList arrayList5 = arrayList4;
                            i9 = max;
                            arrayList = arrayList5;
                            if (z5) {
                                WeakHashMap weakHashMap2 = r0.f1407a;
                                if (!view.getFitsSystemWindows()) {
                                    arrayList2 = arrayList;
                                    int c5 = this.f198r.c() + this.f198r.b();
                                    int a5 = this.f198r.a() + this.f198r.d();
                                    i10 = View.MeasureSpec.makeMeasureSpec(size2 - c5, mode);
                                    i11 = View.MeasureSpec.makeMeasureSpec(size3 - a5, mode2);
                                    i12 = i7;
                                    i13 = size;
                                    i14 = paddingLeft;
                                    i15 = paddingRight;
                                    int i25 = i8;
                                    z6 = false;
                                    measureChildWithMargins(view, i10, i9, i11, 0);
                                    int max2 = Math.max(i22, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                                    int max3 = Math.max(i25, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                                    i21 = View.combineMeasuredStates(i21, view.getMeasuredState());
                                    suggestedMinimumWidth = max2;
                                    suggestedMinimumHeight = max3;
                                }
                            }
                            arrayList2 = arrayList;
                            i10 = i5;
                            i11 = i6;
                            i12 = i7;
                            i13 = size;
                            i14 = paddingLeft;
                            i15 = paddingRight;
                            int i252 = i8;
                            z6 = false;
                            measureChildWithMargins(view, i10, i9, i11, 0);
                            int max22 = Math.max(i22, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int max32 = Math.max(i252, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            i21 = View.combineMeasuredStates(i21, view.getMeasuredState());
                            suggestedMinimumWidth = max22;
                            suggestedMinimumHeight = max32;
                        }
                        arrayList = arrayList4;
                        i9 = 0;
                        if (z5) {
                        }
                        arrayList2 = arrayList;
                        i10 = i5;
                        i11 = i6;
                        i12 = i7;
                        i13 = size;
                        i14 = paddingLeft;
                        i15 = paddingRight;
                        int i2522 = i8;
                        z6 = false;
                        measureChildWithMargins(view, i10, i9, i11, 0);
                        int max222 = Math.max(i22, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int max322 = Math.max(i2522, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        i21 = View.combineMeasuredStates(i21, view.getMeasuredState());
                        suggestedMinimumWidth = max222;
                        suggestedMinimumHeight = max322;
                    }
                    i7 = i12 + 1;
                    size = i13;
                    paddingLeft = i14;
                    paddingRight = i15;
                    arrayList4 = arrayList2;
                }
                int i26 = i21;
                setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i5, (-16777216) & i26), View.resolveSizeAndState(suggestedMinimumHeight, i6, i26 << 16));
            }
        }
        z5 = false;
        ArrayList arrayList42 = this.f188g;
        size = arrayList42.size();
        i7 = 0;
        int i212 = 0;
        while (i7 < size) {
        }
        int i262 = i212;
        setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i5, (-16777216) & i262), View.resolveSizeAndState(suggestedMinimumHeight, i6, i262 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ((d) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ((d) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        f(iArr, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        b(view, i5, i6, i7, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        d(view, view2, i5, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((f) parcelable).f2013g);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.getId();
            m(childAt);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.getId();
            ((d) childAt.getLayoutParams()).getClass();
        }
        fVar.f3285i = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        c(view, view2, i5, 0);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        r();
        return onTouchEvent;
    }

    public final void p(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        ArrayList arrayList = this.f189i;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        c0 c0Var = A;
        if (c0Var != null) {
            Collections.sort(arrayList, c0Var);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((d) ((View) arrayList.get(i6)).getLayoutParams()).getClass();
        }
        arrayList.clear();
    }

    public final void q() {
        View childAt;
        int layoutDirection;
        int absoluteGravity;
        ArrayList arrayList = this.f188g;
        arrayList.clear();
        h hVar = this.h;
        l lVar = (l) hVar.h;
        c0.j jVar = (c0.j) hVar.f3161g;
        l lVar2 = (l) hVar.h;
        int i5 = lVar.f2733i;
        for (int i6 = 0; i6 < i5; i6++) {
            ArrayList arrayList2 = (ArrayList) lVar.i(i6);
            if (arrayList2 != null) {
                arrayList2.clear();
                jVar.d(arrayList2);
            }
        }
        lVar.clear();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            d m5 = m(childAt2);
            int i8 = m5.f3277e;
            if (i8 == -1) {
                m5.f3282k = null;
                m5.f3281j = null;
            } else {
                View view = m5.f3281j;
                if (view != null && view.getId() == i8) {
                    View view2 = m5.f3281j;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            m5.f3282k = null;
                            m5.f3281j = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    m5.f3282k = view2;
                }
                View findViewById = findViewById(i8);
                m5.f3281j = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i8) + " to anchor view " + childAt2);
                    }
                    m5.f3282k = null;
                    m5.f3281j = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt2) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            m5.f3282k = null;
                            m5.f3281j = null;
                        }
                    }
                    m5.f3282k = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    m5.f3282k = null;
                    m5.f3281j = null;
                }
            }
            if (!lVar2.containsKey(childAt2)) {
                lVar2.put(childAt2, null);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                if (i9 != i7 && ((childAt = getChildAt(i9)) == m5.f3282k || ((absoluteGravity = Gravity.getAbsoluteGravity(((d) childAt.getLayoutParams()).f3278f, (layoutDirection = getLayoutDirection()))) != 0 && (Gravity.getAbsoluteGravity(m5.f3279g, layoutDirection) & absoluteGravity) == absoluteGravity))) {
                    if (!lVar2.containsKey(childAt) && !lVar2.containsKey(childAt)) {
                        lVar2.put(childAt, null);
                    }
                    if (!lVar2.containsKey(childAt) || !lVar2.containsKey(childAt2)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) lVar2.get(childAt);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) jVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        lVar2.put(childAt, arrayList3);
                    }
                    arrayList3.add(childAt2);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) hVar.f3162i;
        arrayList4.clear();
        HashSet hashSet = (HashSet) hVar.f3163j;
        hashSet.clear();
        int i10 = lVar2.f2733i;
        for (int i11 = 0; i11 < i10; i11++) {
            hVar.d(lVar2.f(i11), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    public final void r() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((d) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f192l = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        ((d) view.getLayoutParams()).getClass();
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f192l) {
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((d) getChildAt(i5).getLayoutParams()).getClass();
        }
        r();
        this.f192l = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        u();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f201u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f200t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f200t = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f200t.setState(getDrawableState());
                }
                this.f200t.setLayoutDirection(getLayoutDirection());
                this.f200t.setVisible(getVisibility() == 0, false);
                this.f200t.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i5) {
        setStatusBarBackground(new ColorDrawable(i5));
    }

    public void setStatusBarBackgroundResource(int i5) {
        setStatusBarBackground(i5 != 0 ? v.a.getDrawable(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z4 = i5 == 0;
        Drawable drawable = this.f200t;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f200t.setVisible(z4, false);
    }

    public final void u() {
        WeakHashMap weakHashMap = r0.f1407a;
        if (!getFitsSystemWindows()) {
            k0.i(this, null);
            return;
        }
        if (this.f202v == null) {
            this.f202v = new j(this, 20);
        }
        k0.i(this, this.f202v);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f200t;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }
}
