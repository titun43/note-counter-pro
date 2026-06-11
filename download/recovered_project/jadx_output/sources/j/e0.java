package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.lokhnathtechnical.notecounterpro.R;
import k.l2;
import k.t1;

/* loaded from: classes.dex */
public final class e0 extends v implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final n f1887i;

    /* renamed from: j, reason: collision with root package name */
    public final k f1888j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1889k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1890l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1891m;

    /* renamed from: n, reason: collision with root package name */
    public final l2 f1892n;

    /* renamed from: o, reason: collision with root package name */
    public final d f1893o;

    /* renamed from: p, reason: collision with root package name */
    public final e f1894p;

    /* renamed from: q, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1895q;

    /* renamed from: r, reason: collision with root package name */
    public View f1896r;

    /* renamed from: s, reason: collision with root package name */
    public View f1897s;

    /* renamed from: t, reason: collision with root package name */
    public y f1898t;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f1899u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1900v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public int f1901x;

    /* renamed from: y, reason: collision with root package name */
    public int f1902y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1903z;

    public e0(Context context, n nVar, View view, int i5, boolean z4) {
        int i6 = 1;
        this.f1893o = new d(this, i6);
        this.f1894p = new e(this, i6);
        this.h = context;
        this.f1887i = nVar;
        this.f1889k = z4;
        this.f1888j = new k(nVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f1891m = i5;
        Resources resources = context.getResources();
        this.f1890l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1896r = view;
        this.f1892n = new l2(context, null, i5);
        nVar.b(this, context);
    }

    @Override // j.d0
    public final boolean a() {
        return !this.f1900v && this.f1892n.E.isShowing();
    }

    @Override // j.z
    public final void b(n nVar, boolean z4) {
        if (nVar != this.f1887i) {
            return;
        }
        dismiss();
        y yVar = this.f1898t;
        if (yVar != null) {
            yVar.b(nVar, z4);
        }
    }

    @Override // j.z
    public final boolean d() {
        return false;
    }

    @Override // j.d0
    public final void dismiss() {
        if (a()) {
            this.f1892n.dismiss();
        }
    }

    @Override // j.z
    public final void e(y yVar) {
        this.f1898t = yVar;
    }

    @Override // j.z
    public final boolean f(f0 f0Var) {
        boolean z4;
        if (f0Var.hasVisibleItems()) {
            x xVar = new x(this.h, f0Var, this.f1897s, this.f1889k, this.f1891m, 0);
            y yVar = this.f1898t;
            xVar.h = yVar;
            v vVar = xVar.f2009i;
            if (vVar != null) {
                vVar.e(yVar);
            }
            int size = f0Var.f1948f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = f0Var.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i5++;
            }
            xVar.f2008g = z4;
            v vVar2 = xVar.f2009i;
            if (vVar2 != null) {
                vVar2.o(z4);
            }
            xVar.f2010j = this.f1895q;
            this.f1895q = null;
            this.f1887i.c(false);
            l2 l2Var = this.f1892n;
            int i6 = l2Var.f2075l;
            int o2 = l2Var.o();
            if ((Gravity.getAbsoluteGravity(this.f1902y, this.f1896r.getLayoutDirection()) & 7) == 5) {
                i6 += this.f1896r.getWidth();
            }
            if (!xVar.b()) {
                if (xVar.f2006e != null) {
                    xVar.d(i6, o2, true, true);
                }
            }
            y yVar2 = this.f1898t;
            if (yVar2 != null) {
                yVar2.k(f0Var);
            }
            return true;
        }
        return false;
    }

    @Override // j.d0
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.f1900v || (view = this.f1896r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f1897s = view;
        l2 l2Var = this.f1892n;
        k.c0 c0Var = l2Var.E;
        k.c0 c0Var2 = l2Var.E;
        c0Var.setOnDismissListener(this);
        l2Var.f2085v = this;
        l2Var.D = true;
        c0Var2.setFocusable(true);
        View view2 = this.f1897s;
        boolean z4 = this.f1899u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1899u = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1893o);
        }
        view2.addOnAttachStateChangeListener(this.f1894p);
        l2Var.f2084u = view2;
        l2Var.f2081r = this.f1902y;
        boolean z5 = this.w;
        Context context = this.h;
        k kVar = this.f1888j;
        if (!z5) {
            this.f1901x = v.m(kVar, context, this.f1890l);
            this.w = true;
        }
        l2Var.r(this.f1901x);
        c0Var2.setInputMethodMode(2);
        Rect rect = this.f2000g;
        l2Var.C = rect != null ? new Rect(rect) : null;
        l2Var.g();
        t1 t1Var = l2Var.f2072i;
        t1Var.setOnKeyListener(this);
        if (this.f1903z) {
            n nVar = this.f1887i;
            if (nVar.f1954m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(nVar.f1954m);
                }
                frameLayout.setEnabled(false);
                t1Var.addHeaderView(frameLayout, null, false);
            }
        }
        l2Var.p(kVar);
        l2Var.g();
    }

    @Override // j.z
    public final void h() {
        this.w = false;
        k kVar = this.f1888j;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // j.d0
    public final t1 j() {
        return this.f1892n.f2072i;
    }

    @Override // j.v
    public final void n(View view) {
        this.f1896r = view;
    }

    @Override // j.v
    public final void o(boolean z4) {
        this.f1888j.f1938c = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f1900v = true;
        this.f1887i.c(true);
        ViewTreeObserver viewTreeObserver = this.f1899u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1899u = this.f1897s.getViewTreeObserver();
            }
            this.f1899u.removeGlobalOnLayoutListener(this.f1893o);
            this.f1899u = null;
        }
        this.f1897s.removeOnAttachStateChangeListener(this.f1894p);
        PopupWindow.OnDismissListener onDismissListener = this.f1895q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.v
    public final void p(int i5) {
        this.f1902y = i5;
    }

    @Override // j.v
    public final void q(int i5) {
        this.f1892n.f2075l = i5;
    }

    @Override // j.v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1895q = onDismissListener;
    }

    @Override // j.v
    public final void s(boolean z4) {
        this.f1903z = z4;
    }

    @Override // j.v
    public final void t(int i5) {
        this.f1892n.l(i5);
    }

    @Override // j.v
    public final void l(n nVar) {
    }
}
