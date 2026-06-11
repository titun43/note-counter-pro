package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g2 implements j.d0 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final c0 E;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2071g;
    public ListAdapter h;

    /* renamed from: i, reason: collision with root package name */
    public t1 f2072i;

    /* renamed from: l, reason: collision with root package name */
    public int f2075l;

    /* renamed from: m, reason: collision with root package name */
    public int f2076m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2078o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2079p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2080q;

    /* renamed from: t, reason: collision with root package name */
    public d2 f2083t;

    /* renamed from: u, reason: collision with root package name */
    public View f2084u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2085v;

    /* renamed from: j, reason: collision with root package name */
    public final int f2073j = -2;

    /* renamed from: k, reason: collision with root package name */
    public int f2074k = -2;

    /* renamed from: n, reason: collision with root package name */
    public final int f2077n = 1002;

    /* renamed from: r, reason: collision with root package name */
    public int f2081r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int f2082s = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public final c2 w = new c2(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final f2 f2086x = new f2(this);

    /* renamed from: y, reason: collision with root package name */
    public final e2 f2087y = new e2(this);

    /* renamed from: z, reason: collision with root package name */
    public final c2 f2088z = new c2(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public g2(Context context, AttributeSet attributeSet, int i5) {
        int resourceId;
        this.f2071g = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1323o, i5, 0);
        this.f2075l = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2076m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2078o = true;
        }
        obtainStyledAttributes.recycle();
        c0 c0Var = new c0(context, attributeSet, i5, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1327s, i5, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c0Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c0Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : b3.g.t(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = c0Var;
        c0Var.setInputMethodMode(1);
    }

    @Override // j.d0
    public final boolean a() {
        return this.E.isShowing();
    }

    public final int b() {
        return this.f2075l;
    }

    public final void c(int i5) {
        this.f2075l = i5;
    }

    @Override // j.d0
    public final void dismiss() {
        c0 c0Var = this.E;
        c0Var.dismiss();
        c0Var.setContentView(null);
        this.f2072i = null;
        this.A.removeCallbacks(this.w);
    }

    public final Drawable f() {
        return this.E.getBackground();
    }

    @Override // j.d0
    public final void g() {
        int i5;
        int paddingBottom;
        t1 t1Var;
        t1 t1Var2 = this.f2072i;
        Context context = this.f2071g;
        c0 c0Var = this.E;
        if (t1Var2 == null) {
            t1 q5 = q(context, !this.D);
            this.f2072i = q5;
            q5.setAdapter(this.h);
            this.f2072i.setOnItemClickListener(this.f2085v);
            this.f2072i.setFocusable(true);
            this.f2072i.setFocusableInTouchMode(true);
            this.f2072i.setOnItemSelectedListener(new z1(this));
            this.f2072i.setOnScrollListener(this.f2087y);
            c0Var.setContentView(this.f2072i);
        }
        Drawable background = c0Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i6 = rect.top;
            i5 = rect.bottom + i6;
            if (!this.f2078o) {
                this.f2076m = -i6;
            }
        } else {
            rect.setEmpty();
            i5 = 0;
        }
        int a5 = a2.a(c0Var, this.f2084u, this.f2076m, c0Var.getInputMethodMode() == 2);
        int i7 = this.f2073j;
        if (i7 == -1) {
            paddingBottom = a5 + i5;
        } else {
            int i8 = this.f2074k;
            int a6 = this.f2072i.a(i8 != -2 ? i8 != -1 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a5);
            paddingBottom = a6 + (a6 > 0 ? this.f2072i.getPaddingBottom() + this.f2072i.getPaddingTop() + i5 : 0);
        }
        boolean z4 = c0Var.getInputMethodMode() == 2;
        c0Var.setWindowLayoutType(this.f2077n);
        if (c0Var.isShowing()) {
            if (this.f2084u.isAttachedToWindow()) {
                int i9 = this.f2074k;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.f2084u.getWidth();
                }
                if (i7 == -1) {
                    i7 = z4 ? paddingBottom : -1;
                    if (z4) {
                        c0Var.setWidth(this.f2074k == -1 ? -1 : 0);
                        c0Var.setHeight(0);
                    } else {
                        c0Var.setWidth(this.f2074k == -1 ? -1 : 0);
                        c0Var.setHeight(-1);
                    }
                } else if (i7 == -2) {
                    i7 = paddingBottom;
                }
                c0Var.setOutsideTouchable(true);
                int i10 = i9;
                View view = this.f2084u;
                int i11 = this.f2075l;
                int i12 = this.f2076m;
                int i13 = i10 < 0 ? -1 : i10;
                if (i7 < 0) {
                    i7 = -1;
                }
                c0Var.update(view, i11, i12, i13, i7);
                return;
            }
            return;
        }
        int i14 = this.f2074k;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f2084u.getWidth();
        }
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = paddingBottom;
        }
        c0Var.setWidth(i14);
        c0Var.setHeight(i7);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(c0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b2.b(c0Var, true);
        }
        c0Var.setOutsideTouchable(true);
        c0Var.setTouchInterceptor(this.f2086x);
        if (this.f2080q) {
            c0Var.setOverlapAnchor(this.f2079p);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(c0Var, this.C);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            b2.a(c0Var, this.C);
        }
        c0Var.showAsDropDown(this.f2084u, this.f2075l, this.f2076m, this.f2081r);
        this.f2072i.setSelection(-1);
        if ((!this.D || this.f2072i.isInTouchMode()) && (t1Var = this.f2072i) != null) {
            t1Var.setListSelectionHidden(true);
            t1Var.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.f2088z);
    }

    @Override // j.d0
    public final t1 j() {
        return this.f2072i;
    }

    public final void k(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void l(int i5) {
        this.f2076m = i5;
        this.f2078o = true;
    }

    public final int o() {
        if (this.f2078o) {
            return this.f2076m;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d2 d2Var = this.f2083t;
        if (d2Var == null) {
            this.f2083t = new d2(this);
        } else {
            ListAdapter listAdapter2 = this.h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d2Var);
            }
        }
        this.h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2083t);
        }
        t1 t1Var = this.f2072i;
        if (t1Var != null) {
            t1Var.setAdapter(this.h);
        }
    }

    public t1 q(Context context, boolean z4) {
        return new t1(context, z4);
    }

    public final void r(int i5) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.f2074k = i5;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.f2074k = rect.left + rect.right + i5;
    }
}
