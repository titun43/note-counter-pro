package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.lokhnathtechnical.notecounterpro.R;
import f0.a1;
import f0.b1;
import f0.c1;
import f0.d1;
import f0.i0;
import f0.k0;
import f0.q;
import f0.q1;
import f0.r;
import f0.r0;
import f0.s;
import f0.y0;
import f0.z0;
import g.s0;
import i.k;
import j.n;
import j.y;
import java.util.WeakHashMap;
import k.c;
import k.d;
import k.d3;
import k.e;
import k.f;
import k.g;
import k.l;
import k.l1;
import k.m1;
import k.y2;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements l1, q, r {
    public static final int[] I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final q1 J;
    public static final Rect K;
    public e A;
    public OverScroller B;
    public ViewPropertyAnimator C;
    public final c D;
    public final d E;
    public final d F;
    public final s G;
    public final g H;

    /* renamed from: g, reason: collision with root package name */
    public int f125g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public ContentFrameLayout f126i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContainer f127j;

    /* renamed from: k, reason: collision with root package name */
    public m1 f128k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f129l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f130m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f131n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f132o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f133p;

    /* renamed from: q, reason: collision with root package name */
    public int f134q;

    /* renamed from: r, reason: collision with root package name */
    public int f135r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f136s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f137t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f138u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f139v;
    public q1 w;

    /* renamed from: x, reason: collision with root package name */
    public q1 f140x;

    /* renamed from: y, reason: collision with root package name */
    public q1 f141y;

    /* renamed from: z, reason: collision with root package name */
    public q1 f142z;

    static {
        int i5 = Build.VERSION.SDK_INT;
        d1 c1Var = i5 >= 34 ? new c1() : i5 >= 31 ? new b1() : i5 >= 30 ? new a1() : i5 >= 29 ? new z0() : new y0();
        c1Var.g(y.c.b(0, 1, 0, 1));
        J = c1Var.b();
        K = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        this.f136s = new Rect();
        this.f137t = new Rect();
        this.f138u = new Rect();
        this.f139v = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        q1 q1Var = q1.f1405b;
        this.w = q1Var;
        this.f140x = q1Var;
        this.f141y = q1Var;
        this.f142z = q1Var;
        this.D = new c(this);
        this.E = new d(this, 0);
        this.F = new d(this, 1);
        i(context);
        this.G = new s();
        g gVar = new g(context);
        gVar.setWillNotDraw(true);
        this.H = gVar;
        addView(gVar);
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        f fVar = (f) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int i6 = rect.left;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) fVar).leftMargin = i6;
            z5 = true;
        } else {
            z5 = false;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) fVar).topMargin = i8;
            z5 = true;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) fVar).rightMargin = i10;
            z5 = true;
        }
        if (z4) {
            int i11 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
            int i12 = rect.bottom;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = i12;
                return true;
            }
        }
        return z5;
    }

    @Override // f0.r
    public final void a(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        b(view, i5, i6, i7, i8, i9);
    }

    @Override // f0.q
    public final void b(View view, int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            onNestedScroll(view, i5, i6, i7, i8);
        }
    }

    @Override // f0.q
    public final boolean c(View view, View view2, int i5, int i6) {
        return i6 == 0 && onStartNestedScroll(view, view2, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // f0.q
    public final void d(View view, View view2, int i5, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i5;
        super.draw(canvas);
        if (this.f129l != null) {
            if (this.f127j.getVisibility() == 0) {
                i5 = (int) (this.f127j.getTranslationY() + this.f127j.getBottom() + 0.5f);
            } else {
                i5 = 0;
            }
            this.f129l.setBounds(0, i5, getWidth(), this.f129l.getIntrinsicHeight() + i5);
            this.f129l.draw(canvas);
        }
    }

    @Override // f0.q
    public final void e(View view, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f127j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.G;
        return sVar.f1416b | sVar.f1415a;
    }

    public CharSequence getTitle() {
        k();
        return ((d3) this.f128k).f2050a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        this.f125g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f129l = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.B = new OverScroller(context);
    }

    public final void j(int i5) {
        k();
        if (i5 == 2) {
            ((d3) this.f128k).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i5 == 5) {
            ((d3) this.f128k).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i5 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        m1 wrapper;
        if (this.f126i == null) {
            this.f126i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f127j = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof m1) {
                wrapper = (m1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f128k = wrapper;
        }
    }

    public final void l(Menu menu, y yVar) {
        k();
        d3 d3Var = (d3) this.f128k;
        Toolbar toolbar = d3Var.f2050a;
        if (d3Var.f2061m == null) {
            d3Var.f2061m = new l(toolbar.getContext());
        }
        l lVar = d3Var.f2061m;
        lVar.f2141k = yVar;
        n nVar = (n) menu;
        if (nVar == null && toolbar.f163g == null) {
            return;
        }
        toolbar.f();
        n nVar2 = toolbar.f163g.f143v;
        if (nVar2 == nVar) {
            return;
        }
        if (nVar2 != null) {
            nVar2.r(toolbar.R);
            nVar2.r(toolbar.S);
        }
        if (toolbar.S == null) {
            toolbar.S = new y2(toolbar);
        }
        lVar.w = true;
        if (nVar != null) {
            nVar.b(lVar, toolbar.f171p);
            nVar.b(toolbar.S, toolbar.f171p);
        } else {
            lVar.i(toolbar.f171p, null);
            toolbar.S.i(toolbar.f171p, null);
            lVar.h();
            toolbar.S.h();
        }
        toolbar.f163g.setPopupTheme(toolbar.f172q);
        toolbar.f163g.setPresenter(lVar);
        toolbar.R = lVar;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        q1 g5 = q1.g(windowInsets, this);
        boolean g6 = g(this.f127j, new Rect(g5.b(), g5.d(), g5.c(), g5.a()), false);
        WeakHashMap weakHashMap = r0.f1407a;
        Rect rect = this.f136s;
        k0.b(this, g5, rect);
        int i5 = rect.left;
        int i6 = rect.top;
        int i7 = rect.right;
        int i8 = rect.bottom;
        f0.m1 m1Var = g5.f1406a;
        q1 l5 = m1Var.l(i5, i6, i7, i8);
        this.w = l5;
        boolean z4 = true;
        if (!this.f140x.equals(l5)) {
            this.f140x = this.w;
            g6 = true;
        }
        Rect rect2 = this.f137t;
        if (rect2.equals(rect)) {
            z4 = g6;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return m1Var.a().f1406a.c().f1406a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = r0.f1407a;
        i0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin + paddingLeft;
                int i11 = ((ViewGroup.MarginLayoutParams) fVar).topMargin + paddingTop;
                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i6) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f127j, i5, 0, i6, 0);
        f fVar = (f) this.f127j.getLayoutParams();
        int max = Math.max(0, this.f127j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
        int max2 = Math.max(0, this.f127j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f127j.getMeasuredState());
        WeakHashMap weakHashMap = r0.f1407a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f125g;
            if (this.f131n && this.f127j.getTabContainer() != null) {
                measuredHeight += this.f125g;
            }
        } else {
            measuredHeight = this.f127j.getVisibility() != 8 ? this.f127j.getMeasuredHeight() : 0;
        }
        Rect rect = this.f136s;
        Rect rect2 = this.f138u;
        rect2.set(rect);
        this.f141y = this.w;
        if (!this.f130m && !z4) {
            g gVar = this.H;
            q1 q1Var = J;
            Rect rect3 = this.f139v;
            k0.b(gVar, q1Var, rect3);
            if (!rect3.equals(K)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f141y = this.f141y.f1406a.l(0, measuredHeight, 0, 0);
                g(this.f126i, rect2, true);
                if (!this.f142z.equals(this.f141y)) {
                    q1 q1Var2 = this.f141y;
                    this.f142z = q1Var2;
                    r0.b(this.f126i, q1Var2);
                }
                measureChildWithMargins(this.f126i, i5, 0, i6, 0);
                f fVar2 = (f) this.f126i.getLayoutParams();
                int max3 = Math.max(max, this.f126i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fVar2).rightMargin);
                int max4 = Math.max(max2, this.f126i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar2).topMargin + ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f126i.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i5, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i6, combineMeasuredStates2 << 16));
            }
        }
        y.c b2 = y.c.b(this.f141y.b(), this.f141y.d() + measuredHeight, this.f141y.c(), this.f141y.a());
        q1 q1Var3 = this.f141y;
        int i7 = Build.VERSION.SDK_INT;
        d1 c1Var = i7 >= 34 ? new c1(q1Var3) : i7 >= 31 ? new b1(q1Var3) : i7 >= 30 ? new a1(q1Var3) : i7 >= 29 ? new z0(q1Var3) : new y0(q1Var3);
        c1Var.g(b2);
        this.f141y = c1Var.b();
        g(this.f126i, rect2, true);
        if (!this.f142z.equals(this.f141y)) {
        }
        measureChildWithMargins(this.f126i, i5, 0, i6, 0);
        f fVar22 = (f) this.f126i.getLayoutParams();
        int max32 = Math.max(max, this.f126i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar22).leftMargin + ((ViewGroup.MarginLayoutParams) fVar22).rightMargin);
        int max42 = Math.max(max2, this.f126i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar22).topMargin + ((ViewGroup.MarginLayoutParams) fVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f126i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i5, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i6, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        if (!this.f132o || !z4) {
            return false;
        }
        this.B.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (this.B.getFinalY() > this.f127j.getHeight()) {
            h();
            this.F.run();
        } else {
            h();
            this.E.run();
        }
        this.f133p = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        int i9 = this.f134q + i6;
        this.f134q = i9;
        setActionBarHideOffset(i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        s0 s0Var;
        k kVar;
        this.G.f1415a = i5;
        this.f134q = getActionBarHideOffset();
        h();
        e eVar = this.A;
        if (eVar == null || (kVar = (s0Var = (s0) eVar).f1645s) == null) {
            return;
        }
        kVar.a();
        s0Var.f1645s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        if ((i5 & 2) == 0 || this.f127j.getVisibility() != 0) {
            return false;
        }
        return this.f132o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f132o || this.f133p) {
            return;
        }
        if (this.f134q <= this.f127j.getHeight()) {
            h();
            postDelayed(this.E, 600L);
        } else {
            h();
            postDelayed(this.F, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i5) {
        super.onWindowSystemUiVisibilityChanged(i5);
        k();
        int i6 = this.f135r ^ i5;
        this.f135r = i5;
        boolean z4 = (i5 & 4) == 0;
        boolean z5 = (i5 & 256) != 0;
        e eVar = this.A;
        if (eVar != null) {
            s0 s0Var = (s0) eVar;
            s0Var.f1641o = !z5;
            if (z4 || !z5) {
                if (s0Var.f1642p) {
                    s0Var.f1642p = false;
                    s0Var.s(true);
                }
            } else if (!s0Var.f1642p) {
                s0Var.f1642p = true;
                s0Var.s(true);
            }
        }
        if ((i6 & 256) == 0 || this.A == null) {
            return;
        }
        WeakHashMap weakHashMap = r0.f1407a;
        i0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        this.h = i5;
        e eVar = this.A;
        if (eVar != null) {
            ((s0) eVar).f1640n = i5;
        }
    }

    public void setActionBarHideOffset(int i5) {
        h();
        this.f127j.setTranslationY(-Math.max(0, Math.min(i5, this.f127j.getHeight())));
    }

    public void setActionBarVisibilityCallback(e eVar) {
        this.A = eVar;
        if (getWindowToken() != null) {
            ((s0) this.A).f1640n = this.h;
            int i5 = this.f135r;
            if (i5 != 0) {
                onWindowSystemUiVisibilityChanged(i5);
                WeakHashMap weakHashMap = r0.f1407a;
                i0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f131n = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f132o) {
            this.f132o = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i5) {
        k();
        d3 d3Var = (d3) this.f128k;
        d3Var.f2053d = i5 != 0 ? b3.g.t(d3Var.f2050a.getContext(), i5) : null;
        d3Var.c();
    }

    public void setLogo(int i5) {
        k();
        d3 d3Var = (d3) this.f128k;
        d3Var.f2054e = i5 != 0 ? b3.g.t(d3Var.f2050a.getContext(), i5) : null;
        d3Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f130m = z4;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i5) {
    }

    @Override // k.l1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d3) this.f128k).f2059k = callback;
    }

    @Override // k.l1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d3 d3Var = (d3) this.f128k;
        if (d3Var.f2056g) {
            return;
        }
        Toolbar toolbar = d3Var.f2050a;
        d3Var.h = charSequence;
        if ((d3Var.f2051b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (d3Var.f2056g) {
                r0.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d3 d3Var = (d3) this.f128k;
        d3Var.f2053d = drawable;
        d3Var.c();
    }

    @Override // f0.q
    public final void f(int[] iArr, int i5, int i6, int i7) {
    }
}
