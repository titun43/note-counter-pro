package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.emoji2.text.t;
import androidx.fragment.app.o;
import b3.g;
import com.lokhnathtechnical.notecounterpro.R;
import f.a;
import f0.m;
import f0.r0;
import g.c;
import g.m0;
import i.i;
import j.n;
import j.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.a0;
import k.a3;
import k.b3;
import k.d1;
import k.d3;
import k.l;
import k.l3;
import k.m1;
import k.p2;
import k.w2;
import k.x2;
import k.y2;
import k.z;
import k.z2;
import k1.j;
import u1.f;
import z2.b;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public final int C;
    public CharSequence D;
    public CharSequence E;
    public ColorStateList F;
    public ColorStateList G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final int[] L;
    public final m M;
    public ArrayList N;
    public a3 O;
    public final f P;
    public d3 Q;
    public l R;
    public y2 S;
    public m0 T;
    public f U;
    public boolean V;
    public OnBackInvokedCallback W;

    /* renamed from: a0, reason: collision with root package name */
    public OnBackInvokedDispatcher f160a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f161b0;

    /* renamed from: c0, reason: collision with root package name */
    public final o f162c0;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f163g;
    public d1 h;

    /* renamed from: i, reason: collision with root package name */
    public d1 f164i;

    /* renamed from: j, reason: collision with root package name */
    public z f165j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f166k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f167l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f168m;

    /* renamed from: n, reason: collision with root package name */
    public z f169n;

    /* renamed from: o, reason: collision with root package name */
    public View f170o;

    /* renamed from: p, reason: collision with root package name */
    public Context f171p;

    /* renamed from: q, reason: collision with root package name */
    public int f172q;

    /* renamed from: r, reason: collision with root package name */
    public int f173r;

    /* renamed from: s, reason: collision with root package name */
    public int f174s;

    /* renamed from: t, reason: collision with root package name */
    public final int f175t;

    /* renamed from: u, reason: collision with root package name */
    public final int f176u;

    /* renamed from: v, reason: collision with root package name */
    public int f177v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f178x;

    /* renamed from: y, reason: collision with root package name */
    public int f179y;

    /* renamed from: z, reason: collision with root package name */
    public p2 f180z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.C = 8388627;
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new int[2];
        this.M = new m(new w2(this, 1));
        this.N = new ArrayList();
        this.P = new f(this, 13);
        this.f162c0 = new o(this, 15);
        Context context2 = getContext();
        int[] iArr = a.w;
        t r2 = t.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        r0.h(this, context, iArr, attributeSet, (TypedArray) r2.f284i, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) r2.f284i;
        this.f173r = typedArray.getResourceId(28, 0);
        this.f174s = typedArray.getResourceId(19, 0);
        this.C = typedArray.getInteger(0, 8388627);
        this.f175t = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f179y = dimensionPixelOffset;
        this.f178x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.f177v = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f177v = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.w = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f178x = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f179y = dimensionPixelOffset5;
        }
        this.f176u = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        p2 p2Var = this.f180z;
        p2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p2Var.f2192e = dimensionPixelSize;
            p2Var.f2188a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p2Var.f2193f = dimensionPixelSize2;
            p2Var.f2189b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.B = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f167l = r2.l(4);
        this.f168m = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f171p = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable l5 = r2.l(16);
        if (l5 != null) {
            setNavigationIcon(l5);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable l6 = r2.l(11);
        if (l6 != null) {
            setLogo(l6);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(r2.k(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(r2.k(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        r2.u();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i5 = 0; i5 < menu.size(); i5++) {
            arrayList.add(menu.getItem(i5));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i(getContext());
    }

    public static z2 h() {
        z2 z2Var = new z2(-2, -2);
        z2Var.f2309b = 0;
        z2Var.f2308a = 8388627;
        return z2Var;
    }

    public static z2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof z2;
        if (z4) {
            z2 z2Var = (z2) layoutParams;
            z2 z2Var2 = new z2(z2Var);
            z2Var2.f2309b = 0;
            z2Var2.f2309b = z2Var.f2309b;
            return z2Var2;
        }
        if (z4) {
            z2 z2Var3 = new z2((z2) layoutParams);
            z2Var3.f2309b = 0;
            return z2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            z2 z2Var4 = new z2(layoutParams);
            z2Var4.f2309b = 0;
            return z2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        z2 z2Var5 = new z2(marginLayoutParams);
        z2Var5.f2309b = 0;
        ((ViewGroup.MarginLayoutParams) z2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) z2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) z2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) z2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return z2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i5) {
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                z2 z2Var = (z2) childAt.getLayoutParams();
                if (z2Var.f2309b == 0 && t(childAt)) {
                    int i7 = z2Var.f2308a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            z2 z2Var2 = (z2) childAt2.getLayoutParams();
            if (z2Var2.f2309b == 0 && t(childAt2)) {
                int i9 = z2Var2.f2308a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i9, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z2 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (z2) layoutParams;
        h.f2309b = 1;
        if (!z4 || this.f170o == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.K.add(view);
        }
    }

    public final void c() {
        if (this.f169n == null) {
            z zVar = new z(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f169n = zVar;
            zVar.setImageDrawable(this.f167l);
            this.f169n.setContentDescription(this.f168m);
            z2 h = h();
            h.f2308a = (this.f175t & 112) | 8388611;
            h.f2309b = 2;
            this.f169n.setLayoutParams(h);
            this.f169n.setOnClickListener(new c(this, 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof z2);
    }

    public final void d() {
        if (this.f180z == null) {
            p2 p2Var = new p2();
            p2Var.f2188a = 0;
            p2Var.f2189b = 0;
            p2Var.f2190c = Integer.MIN_VALUE;
            p2Var.f2191d = Integer.MIN_VALUE;
            p2Var.f2192e = 0;
            p2Var.f2193f = 0;
            p2Var.f2194g = false;
            p2Var.h = false;
            this.f180z = p2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f163g;
        if (actionMenuView.f143v == null) {
            n nVar = (n) actionMenuView.getMenu();
            if (this.S == null) {
                this.S = new y2(this);
            }
            this.f163g.setExpandedActionViewsExclusive(true);
            nVar.b(this.S, this.f171p);
            v();
        }
    }

    public final void f() {
        if (this.f163g == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f163g = actionMenuView;
            actionMenuView.setPopupTheme(this.f172q);
            this.f163g.setOnMenuItemClickListener(this.P);
            ActionMenuView actionMenuView2 = this.f163g;
            m0 m0Var = this.T;
            j jVar = new j(this, 13);
            actionMenuView2.A = m0Var;
            actionMenuView2.B = jVar;
            z2 h = h();
            h.f2308a = (this.f175t & 112) | 8388613;
            this.f163g.setLayoutParams(h);
            b(this.f163g, false);
        }
    }

    public final void g() {
        if (this.f165j == null) {
            this.f165j = new z(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            z2 h = h();
            h.f2308a = (this.f175t & 112) | 8388611;
            this.f165j.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        z zVar = this.f169n;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        z zVar = this.f169n;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p2 p2Var = this.f180z;
        if (p2Var != null) {
            return p2Var.f2194g ? p2Var.f2188a : p2Var.f2189b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i5 = this.B;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p2 p2Var = this.f180z;
        if (p2Var != null) {
            return p2Var.f2188a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p2 p2Var = this.f180z;
        if (p2Var != null) {
            return p2Var.f2189b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p2 p2Var = this.f180z;
        if (p2Var != null) {
            return p2Var.f2194g ? p2Var.f2189b : p2Var.f2188a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i5 = this.A;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        n nVar;
        ActionMenuView actionMenuView = this.f163g;
        return (actionMenuView == null || (nVar = actionMenuView.f143v) == null || !nVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.B, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        a0 a0Var = this.f166k;
        if (a0Var != null) {
            return a0Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        a0 a0Var = this.f166k;
        if (a0Var != null) {
            return a0Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f163g.getMenu();
    }

    public View getNavButtonView() {
        return this.f165j;
    }

    public CharSequence getNavigationContentDescription() {
        z zVar = this.f165j;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        z zVar = this.f165j;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public l getOuterActionMenuPresenter() {
        return this.R;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f163g.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f171p;
    }

    public int getPopupTheme() {
        return this.f172q;
    }

    public CharSequence getSubtitle() {
        return this.E;
    }

    public final TextView getSubtitleTextView() {
        return this.f164i;
    }

    public CharSequence getTitle() {
        return this.D;
    }

    public int getTitleMarginBottom() {
        return this.f179y;
    }

    public int getTitleMarginEnd() {
        return this.w;
    }

    public int getTitleMarginStart() {
        return this.f177v;
    }

    public int getTitleMarginTop() {
        return this.f178x;
    }

    public final TextView getTitleTextView() {
        return this.h;
    }

    public m1 getWrapper() {
        if (this.Q == null) {
            this.Q = new d3(this, true);
        }
        return this.Q;
    }

    public final int j(View view, int i5) {
        z2 z2Var = (z2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i5 > 0 ? (measuredHeight - i5) / 2 : 0;
        int i7 = z2Var.f2308a & 112;
        if (i7 != 16 && i7 != 48 && i7 != 80) {
            i7 = this.C & 112;
        }
        if (i7 == 48) {
            return getPaddingTop() - i6;
        }
        if (i7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) z2Var).bottomMargin) - i6;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i8 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) z2Var).topMargin;
        if (i8 < i9) {
            i8 = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - i8) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) z2Var).bottomMargin;
            if (i10 < i11) {
                i8 = Math.max(0, i8 - (i11 - i10));
            }
        }
        return paddingTop + i8;
    }

    public final void m() {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = this.M.f1392b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.m0) ((f0.o) it.next())).f404a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.N = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.K.contains(view);
    }

    public final boolean o() {
        l lVar;
        ActionMenuView actionMenuView = this.f163g;
        return (actionMenuView == null || (lVar = actionMenuView.f146z) == null || !lVar.j()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f162c0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.I = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int max;
        boolean t5;
        boolean t6;
        boolean z5;
        int i11;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16;
        int size;
        int i17;
        int i18;
        int size2;
        int i19;
        int size3;
        int i20;
        int i21;
        int i22;
        int size4;
        boolean z6 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i23 = width - paddingRight;
        int[] iArr = this.L;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = r0.f1407a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i8 - i6) : 0;
        if (!t(this.f165j)) {
            i9 = paddingLeft;
        } else {
            if (z6) {
                i10 = q(this.f165j, i23, min, iArr);
                i9 = paddingLeft;
                if (t(this.f169n)) {
                    if (z6) {
                        i10 = q(this.f169n, i10, min, iArr);
                    } else {
                        i9 = p(this.f169n, i9, min, iArr);
                    }
                }
                if (t(this.f163g)) {
                    if (z6) {
                        i9 = p(this.f163g, i9, min, iArr);
                    } else {
                        i10 = q(this.f163g, i10, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i9);
                iArr[1] = Math.max(0, currentContentInsetRight - (i23 - i10));
                max = Math.max(i9, currentContentInsetLeft);
                int min2 = Math.min(i10, i23 - currentContentInsetRight);
                if (t(this.f170o)) {
                    if (z6) {
                        min2 = q(this.f170o, min2, min, iArr);
                    } else {
                        max = p(this.f170o, max, min, iArr);
                    }
                }
                if (t(this.f166k)) {
                    if (z6) {
                        min2 = q(this.f166k, min2, min, iArr);
                    } else {
                        max = p(this.f166k, max, min, iArr);
                    }
                }
                t5 = t(this.h);
                t6 = t(this.f164i);
                if (t5) {
                    z5 = z6;
                    i11 = 0;
                } else {
                    z2 z2Var = (z2) this.h.getLayoutParams();
                    z5 = z6;
                    i11 = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z2Var).topMargin + ((ViewGroup.MarginLayoutParams) z2Var).bottomMargin;
                }
                if (!t6) {
                    z2 z2Var2 = (z2) this.f164i.getLayoutParams();
                    i11 = this.f164i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z2Var2).topMargin + ((ViewGroup.MarginLayoutParams) z2Var2).bottomMargin + i11;
                }
                if (!t5 || t6) {
                    d1 d1Var = !t5 ? this.h : this.f164i;
                    d1 d1Var2 = !t6 ? this.f164i : this.h;
                    z2 z2Var3 = (z2) d1Var.getLayoutParams();
                    z2 z2Var4 = (z2) d1Var2.getLayoutParams();
                    int i24 = i11;
                    boolean z7 = (!t5 && this.h.getMeasuredWidth() > 0) || (t6 && this.f164i.getMeasuredWidth() > 0);
                    i12 = this.C & 112;
                    int i25 = max;
                    if (i12 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) z2Var3).topMargin + this.f178x;
                    } else if (i12 != 80) {
                        int i26 = (((height - paddingTop2) - paddingBottom) - i24) / 2;
                        int i27 = ((ViewGroup.MarginLayoutParams) z2Var3).topMargin + this.f178x;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i24) - i26) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) z2Var3).bottomMargin;
                            int i30 = this.f179y;
                            if (i28 < i29 + i30) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) z2Var4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i26;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) z2Var4).bottomMargin) - this.f179y) - i24;
                    }
                    if (z5) {
                        int i31 = (z7 ? this.f177v : 0) - iArr[0];
                        max = Math.max(0, i31) + i25;
                        iArr[0] = Math.max(0, -i31);
                        if (t5) {
                            z2 z2Var5 = (z2) this.h.getLayoutParams();
                            int measuredWidth = this.h.getMeasuredWidth() + max;
                            int measuredHeight = this.h.getMeasuredHeight() + paddingTop;
                            this.h.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i13 = measuredWidth + this.w;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) z2Var5).bottomMargin;
                        } else {
                            i13 = max;
                        }
                        if (t6) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((z2) this.f164i.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f164i.getMeasuredWidth() + max;
                            this.f164i.layout(max, i32, measuredWidth2, this.f164i.getMeasuredHeight() + i32);
                            i14 = measuredWidth2 + this.w;
                        } else {
                            i14 = max;
                        }
                        if (z7) {
                            max = Math.max(i13, i14);
                        }
                    } else {
                        int i33 = (z7 ? this.f177v : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (t5) {
                            z2 z2Var6 = (z2) this.h.getLayoutParams();
                            int measuredWidth3 = min2 - this.h.getMeasuredWidth();
                            int measuredHeight2 = this.h.getMeasuredHeight() + paddingTop;
                            this.h.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i15 = measuredWidth3 - this.w;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) z2Var6).bottomMargin;
                        } else {
                            i15 = min2;
                        }
                        if (t6) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((z2) this.f164i.getLayoutParams())).topMargin;
                            this.f164i.layout(min2 - this.f164i.getMeasuredWidth(), i34, min2, this.f164i.getMeasuredHeight() + i34);
                            i16 = min2 - this.w;
                        } else {
                            i16 = min2;
                        }
                        if (z7) {
                            min2 = Math.min(i15, i16);
                        }
                        max = i25;
                    }
                }
                ArrayList arrayList = this.J;
                a(arrayList, 3);
                size = arrayList.size();
                i17 = max;
                for (i18 = 0; i18 < size; i18++) {
                    i17 = p((View) arrayList.get(i18), i17, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i19 = 0; i19 < size2; i19++) {
                    min2 = q((View) arrayList.get(i19), min2, min, iArr);
                }
                a(arrayList, 1);
                int i35 = iArr[0];
                int i36 = iArr[1];
                size3 = arrayList.size();
                int i37 = i35;
                i20 = 0;
                int i38 = 0;
                while (i20 < size3) {
                    View view = (View) arrayList.get(i20);
                    z2 z2Var7 = (z2) view.getLayoutParams();
                    int i39 = i36;
                    int i40 = ((ViewGroup.MarginLayoutParams) z2Var7).leftMargin - i37;
                    int i41 = ((ViewGroup.MarginLayoutParams) z2Var7).rightMargin - i39;
                    int max2 = Math.max(0, i40);
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, -i40);
                    int max5 = Math.max(0, -i41);
                    i38 += view.getMeasuredWidth() + max2 + max3;
                    i20++;
                    i37 = max4;
                    i36 = max5;
                }
                i22 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i38 / 2);
                int i42 = i38 + i22;
                if (i22 >= i17) {
                    i17 = i42 > min2 ? i22 - (i42 - min2) : i22;
                }
                size4 = arrayList.size();
                for (i21 = 0; i21 < size4; i21++) {
                    i17 = p((View) arrayList.get(i21), i17, min, iArr);
                }
                arrayList.clear();
            }
            i9 = p(this.f165j, paddingLeft, min, iArr);
        }
        i10 = i23;
        if (t(this.f169n)) {
        }
        if (t(this.f163g)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i9);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i23 - i10));
        max = Math.max(i9, currentContentInsetLeft2);
        int min22 = Math.min(i10, i23 - currentContentInsetRight2);
        if (t(this.f170o)) {
        }
        if (t(this.f166k)) {
        }
        t5 = t(this.h);
        t6 = t(this.f164i);
        if (t5) {
        }
        if (!t6) {
        }
        if (!t5) {
        }
        if (!t5) {
        }
        if (!t6) {
        }
        z2 z2Var32 = (z2) d1Var.getLayoutParams();
        z2 z2Var42 = (z2) d1Var2.getLayoutParams();
        int i242 = i11;
        if (t5) {
        }
        i12 = this.C & 112;
        int i252 = max;
        if (i12 != 48) {
        }
        if (z5) {
        }
        ArrayList arrayList2 = this.J;
        a(arrayList2, 3);
        size = arrayList2.size();
        i17 = max;
        while (i18 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i19 < size2) {
        }
        a(arrayList2, 1);
        int i352 = iArr[0];
        int i362 = iArr[1];
        size3 = arrayList2.size();
        int i372 = i352;
        i20 = 0;
        int i382 = 0;
        while (i20 < size3) {
        }
        i22 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i382 / 2);
        int i422 = i382 + i22;
        if (i22 >= i17) {
        }
        size4 = arrayList2.size();
        while (i21 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        char c5;
        Object[] objArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4 = l3.f2159a;
        int i14 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c5 = 0;
        } else {
            c5 = 1;
            objArr = false;
        }
        if (t(this.f165j)) {
            s(this.f165j, i5, 0, i6, this.f176u);
            i7 = k(this.f165j) + this.f165j.getMeasuredWidth();
            i8 = Math.max(0, l(this.f165j) + this.f165j.getMeasuredHeight());
            i9 = View.combineMeasuredStates(0, this.f165j.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (t(this.f169n)) {
            s(this.f169n, i5, 0, i6, this.f176u);
            i7 = k(this.f169n) + this.f169n.getMeasuredWidth();
            i8 = Math.max(i8, l(this.f169n) + this.f169n.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f169n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i7);
        int max2 = Math.max(0, currentContentInsetStart - i7);
        Object[] objArr2 = objArr;
        int[] iArr = this.L;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.f163g)) {
            s(this.f163g, i5, max, i6, this.f176u);
            i10 = k(this.f163g) + this.f163g.getMeasuredWidth();
            i8 = Math.max(i8, l(this.f163g) + this.f163g.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f163g.getMeasuredState());
        } else {
            i10 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i10);
        iArr[c5] = Math.max(0, currentContentInsetEnd - i10);
        if (t(this.f170o)) {
            max3 += r(this.f170o, i5, max3, i6, 0, iArr);
            i8 = Math.max(i8, l(this.f170o) + this.f170o.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f170o.getMeasuredState());
        }
        if (t(this.f166k)) {
            max3 += r(this.f166k, i5, max3, i6, 0, iArr);
            i8 = Math.max(i8, l(this.f166k) + this.f166k.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f166k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((z2) childAt.getLayoutParams()).f2309b == 0 && t(childAt)) {
                max3 += r(childAt, i5, max3, i6, 0, iArr);
                int max4 = Math.max(i8, l(childAt) + childAt.getMeasuredHeight());
                i9 = View.combineMeasuredStates(i9, childAt.getMeasuredState());
                i8 = max4;
            } else {
                max3 = max3;
            }
        }
        int i16 = max3;
        int i17 = this.f178x + this.f179y;
        int i18 = this.f177v + this.w;
        if (t(this.h)) {
            r(this.h, i5, i16 + i18, i6, i17, iArr);
            int k5 = k(this.h) + this.h.getMeasuredWidth();
            i11 = l(this.h) + this.h.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i9, this.h.getMeasuredState());
            i13 = k5;
        } else {
            i11 = 0;
            i12 = i9;
            i13 = 0;
        }
        if (t(this.f164i)) {
            i13 = Math.max(i13, r(this.f164i, i5, i16 + i18, i6, i17 + i11, iArr));
            i11 += l(this.f164i) + this.f164i.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, this.f164i.getMeasuredState());
        }
        int max5 = Math.max(i8, i11);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i16 + i13;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i5, (-16777216) & i12);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i6, i12 << 16);
        if (this.V) {
            int childCount2 = getChildCount();
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt2 = getChildAt(i19);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i14);
        }
        i14 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof b3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b3 b3Var = (b3) parcelable;
        super.onRestoreInstanceState(b3Var.f2013g);
        ActionMenuView actionMenuView = this.f163g;
        n nVar = actionMenuView != null ? actionMenuView.f143v : null;
        int i5 = b3Var.f2032i;
        if (i5 != 0 && this.S != null && nVar != null && (findItem = nVar.findItem(i5)) != null) {
            findItem.expandActionView();
        }
        if (b3Var.f2033j) {
            o oVar = this.f162c0;
            removeCallbacks(oVar);
            post(oVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        d();
        p2 p2Var = this.f180z;
        boolean z4 = i5 == 1;
        if (z4 == p2Var.f2194g) {
            return;
        }
        p2Var.f2194g = z4;
        if (!p2Var.h) {
            p2Var.f2188a = p2Var.f2192e;
            p2Var.f2189b = p2Var.f2193f;
            return;
        }
        if (z4) {
            int i6 = p2Var.f2191d;
            if (i6 == Integer.MIN_VALUE) {
                i6 = p2Var.f2192e;
            }
            p2Var.f2188a = i6;
            int i7 = p2Var.f2190c;
            if (i7 == Integer.MIN_VALUE) {
                i7 = p2Var.f2193f;
            }
            p2Var.f2189b = i7;
            return;
        }
        int i8 = p2Var.f2190c;
        if (i8 == Integer.MIN_VALUE) {
            i8 = p2Var.f2192e;
        }
        p2Var.f2188a = i8;
        int i9 = p2Var.f2191d;
        if (i9 == Integer.MIN_VALUE) {
            i9 = p2Var.f2193f;
        }
        p2Var.f2189b = i9;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar;
        b3 b3Var = new b3(super.onSaveInstanceState());
        y2 y2Var = this.S;
        if (y2Var != null && (pVar = y2Var.h) != null) {
            b3Var.f2032i = pVar.f1967a;
        }
        b3Var.f2033j = o();
        return b3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    public final int p(View view, int i5, int i6, int[] iArr) {
        z2 z2Var = (z2) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) z2Var).leftMargin - iArr[0];
        int max = Math.max(0, i7) + i5;
        iArr[0] = Math.max(0, -i7);
        int j2 = j(view, i6);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) z2Var).rightMargin + max;
    }

    public final int q(View view, int i5, int i6, int[] iArr) {
        z2 z2Var = (z2) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) z2Var).rightMargin - iArr[1];
        int max = i5 - Math.max(0, i7);
        iArr[1] = Math.max(0, -i7);
        int j2 = j(view, i6);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) z2Var).leftMargin);
    }

    public final int r(View view, int i5, int i6, int i7, int i8, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i9 = marginLayoutParams.leftMargin - iArr[0];
        int i10 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i10) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        iArr[1] = Math.max(0, -i10);
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + max + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f161b0 != z4) {
            this.f161b0 = z4;
            v();
        }
    }

    public void setCollapseContentDescription(int i5) {
        setCollapseContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setCollapseIcon(int i5) {
        setCollapseIcon(g.t(getContext(), i5));
    }

    public void setCollapsible(boolean z4) {
        this.V = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.B) {
            this.B = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.A) {
            this.A = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i5) {
        setLogo(g.t(getContext(), i5));
    }

    public void setLogoDescription(int i5) {
        setLogoDescription(getContext().getText(i5));
    }

    public void setNavigationContentDescription(int i5) {
        setNavigationContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setNavigationIcon(int i5) {
        setNavigationIcon(g.t(getContext(), i5));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f165j.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(a3 a3Var) {
        this.O = a3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f163g.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i5) {
        if (this.f172q != i5) {
            this.f172q = i5;
            if (i5 == 0) {
                this.f171p = getContext();
            } else {
                this.f171p = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setSubtitle(int i5) {
        setSubtitle(getContext().getText(i5));
    }

    public void setSubtitleTextColor(int i5) {
        setSubtitleTextColor(ColorStateList.valueOf(i5));
    }

    public void setTitle(int i5) {
        setTitle(getContext().getText(i5));
    }

    public void setTitleMarginBottom(int i5) {
        this.f179y = i5;
        requestLayout();
    }

    public void setTitleMarginEnd(int i5) {
        this.w = i5;
        requestLayout();
    }

    public void setTitleMarginStart(int i5) {
        this.f177v = i5;
        requestLayout();
    }

    public void setTitleMarginTop(int i5) {
        this.f178x = i5;
        requestLayout();
    }

    public void setTitleTextColor(int i5) {
        setTitleTextColor(ColorStateList.valueOf(i5));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        l lVar;
        ActionMenuView actionMenuView = this.f163g;
        return (actionMenuView == null || (lVar = actionMenuView.f146z) == null || !lVar.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a5 = x2.a(this);
            y2 y2Var = this.S;
            boolean z4 = (y2Var == null || y2Var.h == null || a5 == null || !isAttachedToWindow() || !this.f161b0) ? false : true;
            if (z4 && this.f160a0 == null) {
                if (this.W == null) {
                    this.W = x2.b(new w2(this, 0));
                }
                x2.c(a5, this.W);
                this.f160a0 = a5;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.f160a0) == null) {
                return;
            }
            x2.d(onBackInvokedDispatcher, this.W);
            this.f160a0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        z2 z2Var = new z2(context, attributeSet);
        z2Var.f2308a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1311b);
        z2Var.f2308a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        z2Var.f2309b = 0;
        return z2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        z zVar = this.f169n;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f169n.setImageDrawable(drawable);
        } else {
            z zVar = this.f169n;
            if (zVar != null) {
                zVar.setImageDrawable(this.f167l);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f166k == null) {
                this.f166k = new a0(getContext(), null, 0);
            }
            if (!n(this.f166k)) {
                b(this.f166k, true);
            }
        } else {
            a0 a0Var = this.f166k;
            if (a0Var != null && n(a0Var)) {
                removeView(this.f166k);
                this.K.remove(this.f166k);
            }
        }
        a0 a0Var2 = this.f166k;
        if (a0Var2 != null) {
            a0Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f166k == null) {
            this.f166k = new a0(getContext(), null, 0);
        }
        a0 a0Var = this.f166k;
        if (a0Var != null) {
            a0Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        z zVar = this.f165j;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
            b.z(this.f165j, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f165j)) {
                b(this.f165j, true);
            }
        } else {
            z zVar = this.f165j;
            if (zVar != null && n(zVar)) {
                removeView(this.f165j);
                this.K.remove(this.f165j);
            }
        }
        z zVar2 = this.f165j;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            d1 d1Var = this.f164i;
            if (d1Var != null && n(d1Var)) {
                removeView(this.f164i);
                this.K.remove(this.f164i);
            }
        } else {
            if (this.f164i == null) {
                Context context = getContext();
                d1 d1Var2 = new d1(context, null);
                this.f164i = d1Var2;
                d1Var2.setSingleLine();
                this.f164i.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f174s;
                if (i5 != 0) {
                    this.f164i.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.f164i.setTextColor(colorStateList);
                }
            }
            if (!n(this.f164i)) {
                b(this.f164i, true);
            }
        }
        d1 d1Var3 = this.f164i;
        if (d1Var3 != null) {
            d1Var3.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        d1 d1Var = this.f164i;
        if (d1Var != null) {
            d1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            d1 d1Var = this.h;
            if (d1Var != null && n(d1Var)) {
                removeView(this.h);
                this.K.remove(this.h);
            }
        } else {
            if (this.h == null) {
                Context context = getContext();
                d1 d1Var2 = new d1(context, null);
                this.h = d1Var2;
                d1Var2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f173r;
                if (i5 != 0) {
                    this.h.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!n(this.h)) {
                b(this.h, true);
            }
        }
        d1 d1Var3 = this.h;
        if (d1Var3 != null) {
            d1Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        d1 d1Var = this.h;
        if (d1Var != null) {
            d1Var.setTextColor(colorStateList);
        }
    }
}
