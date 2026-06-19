package g;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.lokhnathtechnical.notecounterpro.R;
import f0.w0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.d3;
import k.m1;
import k.y2;

/* loaded from: classes.dex */
public final class s0 extends a implements k.e {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f1626y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f1627z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f1628a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1629b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f1630c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1631d;

    /* renamed from: e, reason: collision with root package name */
    public m1 f1632e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f1633f;

    /* renamed from: g, reason: collision with root package name */
    public final View f1634g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public r0 f1635i;

    /* renamed from: j, reason: collision with root package name */
    public r0 f1636j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.emoji2.text.p f1637k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1638l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1639m;

    /* renamed from: n, reason: collision with root package name */
    public int f1640n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1641o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1642p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1643q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1644r;

    /* renamed from: s, reason: collision with root package name */
    public i.k f1645s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1646t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1647u;

    /* renamed from: v, reason: collision with root package name */
    public final q0 f1648v;
    public final q0 w;

    /* renamed from: x, reason: collision with root package name */
    public final u1.f f1649x;

    public s0(Dialog dialog) {
        new ArrayList();
        this.f1639m = new ArrayList();
        this.f1640n = 0;
        this.f1641o = true;
        this.f1644r = true;
        this.f1648v = new q0(this, 0);
        this.w = new q0(this, 1);
        this.f1649x = new u1.f(this, 7);
        q(dialog.getWindow().getDecorView());
    }

    @Override // g.a
    public final boolean b() {
        y2 y2Var;
        m1 m1Var = this.f1632e;
        if (m1Var == null || (y2Var = ((d3) m1Var).f2050a.S) == null || y2Var.h == null) {
            return false;
        }
        y2 y2Var2 = ((d3) m1Var).f2050a.S;
        j.p pVar = y2Var2 == null ? null : y2Var2.h;
        if (pVar == null) {
            return true;
        }
        pVar.collapseActionView();
        return true;
    }

    @Override // g.a
    public final void c(boolean z4) {
        if (z4 == this.f1638l) {
            return;
        }
        this.f1638l = z4;
        ArrayList arrayList = this.f1639m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.a
    public final int d() {
        return ((d3) this.f1632e).f2051b;
    }

    @Override // g.a
    public final Context e() {
        if (this.f1629b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1628a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                this.f1629b = new ContextThemeWrapper(this.f1628a, i5);
            } else {
                this.f1629b = this.f1628a;
            }
        }
        return this.f1629b;
    }

    @Override // g.a
    public final void g() {
        r(this.f1628a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.a
    public final boolean i(int i5, KeyEvent keyEvent) {
        j.n nVar;
        r0 r0Var = this.f1635i;
        if (r0Var == null || (nVar = r0Var.f1621j) == null) {
            return false;
        }
        nVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return nVar.performShortcut(i5, keyEvent, 0);
    }

    @Override // g.a
    public final void l(boolean z4) {
        if (this.h) {
            return;
        }
        int i5 = z4 ? 4 : 0;
        d3 d3Var = (d3) this.f1632e;
        int i6 = d3Var.f2051b;
        this.h = true;
        d3Var.a((i5 & 4) | (i6 & (-5)));
    }

    @Override // g.a
    public final void m(boolean z4) {
        i.k kVar;
        this.f1646t = z4;
        if (z4 || (kVar = this.f1645s) == null) {
            return;
        }
        kVar.a();
    }

    @Override // g.a
    public final void n(CharSequence charSequence) {
        d3 d3Var = (d3) this.f1632e;
        if (d3Var.f2056g) {
            return;
        }
        Toolbar toolbar = d3Var.f2050a;
        d3Var.h = charSequence;
        if ((d3Var.f2051b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (d3Var.f2056g) {
                f0.r0.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // g.a
    public final i.b o(androidx.emoji2.text.p pVar) {
        r0 r0Var = this.f1635i;
        if (r0Var != null) {
            r0Var.a();
        }
        this.f1630c.setHideOnContentScrollEnabled(false);
        this.f1633f.e();
        r0 r0Var2 = new r0(this, this.f1633f.getContext(), pVar);
        j.n nVar = r0Var2.f1621j;
        nVar.w();
        try {
            if (!((i.a) r0Var2.f1622k.h).g(r0Var2, nVar)) {
                return null;
            }
            this.f1635i = r0Var2;
            r0Var2.i();
            this.f1633f.c(r0Var2);
            p(true);
            return r0Var2;
        } finally {
            nVar.v();
        }
    }

    public final void p(boolean z4) {
        w0 i5;
        w0 w0Var;
        if (z4) {
            if (!this.f1643q) {
                this.f1643q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1630c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f1643q) {
            this.f1643q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1630c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        if (!this.f1631d.isLaidOut()) {
            if (z4) {
                ((d3) this.f1632e).f2050a.setVisibility(4);
                this.f1633f.setVisibility(0);
                return;
            } else {
                ((d3) this.f1632e).f2050a.setVisibility(0);
                this.f1633f.setVisibility(8);
                return;
            }
        }
        if (z4) {
            d3 d3Var = (d3) this.f1632e;
            i5 = f0.r0.a(d3Var.f2050a);
            i5.a(0.0f);
            i5.c(100L);
            i5.d(new i.j(d3Var, 4));
            w0Var = this.f1633f.i(0, 200L);
        } else {
            d3 d3Var2 = (d3) this.f1632e;
            w0 a5 = f0.r0.a(d3Var2.f2050a);
            a5.a(1.0f);
            a5.c(200L);
            a5.d(new i.j(d3Var2, 0));
            i5 = this.f1633f.i(8, 100L);
            w0Var = a5;
        }
        i.k kVar = new i.k();
        ArrayList arrayList = kVar.f1785a;
        arrayList.add(i5);
        View view = (View) i5.f1426a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) w0Var.f1426a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(w0Var);
        kVar.b();
    }

    public final void q(View view) {
        m1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f1630c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof m1) {
            wrapper = (m1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f1632e = wrapper;
        this.f1633f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1631d = actionBarContainer;
        m1 m1Var = this.f1632e;
        if (m1Var == null || this.f1633f == null || actionBarContainer == null) {
            throw new IllegalStateException(s0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d3) m1Var).f2050a.getContext();
        this.f1628a = context;
        if ((((d3) this.f1632e).f2051b & 4) != 0) {
            this.h = true;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        this.f1632e.getClass();
        r(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1628a.obtainStyledAttributes(null, f.a.f1310a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1630c;
            if (!actionBarOverlayLayout2.f130m) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1647u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1631d;
            WeakHashMap weakHashMap = f0.r0.f1407a;
            f0.k0.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z4) {
        if (z4) {
            this.f1631d.setTabContainer(null);
            ((d3) this.f1632e).getClass();
        } else {
            ((d3) this.f1632e).getClass();
            this.f1631d.setTabContainer(null);
        }
        this.f1632e.getClass();
        ((d3) this.f1632e).f2050a.setCollapsible(false);
        this.f1630c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z4) {
        boolean z5 = this.f1642p;
        boolean z6 = this.f1643q;
        final u1.f fVar = this.f1649x;
        View view = this.f1634g;
        if (!z6 && z5) {
            if (this.f1644r) {
                this.f1644r = false;
                i.k kVar = this.f1645s;
                if (kVar != null) {
                    kVar.a();
                }
                int i5 = this.f1640n;
                q0 q0Var = this.f1648v;
                if (i5 != 0 || (!this.f1646t && !z4)) {
                    q0Var.c();
                    return;
                }
                this.f1631d.setAlpha(1.0f);
                this.f1631d.setTransitioning(true);
                i.k kVar2 = new i.k();
                float f5 = -this.f1631d.getHeight();
                if (z4) {
                    this.f1631d.getLocationInWindow(new int[]{0, 0});
                    f5 -= r12[1];
                }
                w0 a5 = f0.r0.a(this.f1631d);
                a5.e(f5);
                final View view2 = (View) a5.f1426a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(fVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: f0.u0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((g.s0) u1.f.this.h).f1631d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z7 = kVar2.f1789e;
                ArrayList arrayList = kVar2.f1785a;
                if (!z7) {
                    arrayList.add(a5);
                }
                if (this.f1641o && view != null) {
                    w0 a6 = f0.r0.a(view);
                    a6.e(f5);
                    if (!kVar2.f1789e) {
                        arrayList.add(a6);
                    }
                }
                boolean z8 = kVar2.f1789e;
                if (!z8) {
                    kVar2.f1787c = f1626y;
                }
                if (!z8) {
                    kVar2.f1786b = 250L;
                }
                if (!z8) {
                    kVar2.f1788d = q0Var;
                }
                this.f1645s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f1644r) {
            return;
        }
        this.f1644r = true;
        i.k kVar3 = this.f1645s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f1631d.setVisibility(0);
        int i6 = this.f1640n;
        q0 q0Var2 = this.w;
        if (i6 == 0 && (this.f1646t || z4)) {
            this.f1631d.setTranslationY(0.0f);
            float f6 = -this.f1631d.getHeight();
            if (z4) {
                this.f1631d.getLocationInWindow(new int[]{0, 0});
                f6 -= r12[1];
            }
            this.f1631d.setTranslationY(f6);
            i.k kVar4 = new i.k();
            w0 a7 = f0.r0.a(this.f1631d);
            a7.e(0.0f);
            final View view3 = (View) a7.f1426a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(fVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: f0.u0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((g.s0) u1.f.this.h).f1631d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z9 = kVar4.f1789e;
            ArrayList arrayList2 = kVar4.f1785a;
            if (!z9) {
                arrayList2.add(a7);
            }
            if (this.f1641o && view != null) {
                view.setTranslationY(f6);
                w0 a8 = f0.r0.a(view);
                a8.e(0.0f);
                if (!kVar4.f1789e) {
                    arrayList2.add(a8);
                }
            }
            boolean z10 = kVar4.f1789e;
            if (!z10) {
                kVar4.f1787c = f1627z;
            }
            if (!z10) {
                kVar4.f1786b = 250L;
            }
            if (!z10) {
                kVar4.f1788d = q0Var2;
            }
            this.f1645s = kVar4;
            kVar4.b();
        } else {
            this.f1631d.setAlpha(1.0f);
            this.f1631d.setTranslationY(0.0f);
            if (this.f1641o && view != null) {
                view.setTranslationY(0.0f);
            }
            q0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1630c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = f0.r0.f1407a;
            f0.i0.c(actionBarOverlayLayout);
        }
    }

    public s0(boolean z4, Activity activity) {
        new ArrayList();
        this.f1639m = new ArrayList();
        this.f1640n = 0;
        this.f1641o = true;
        this.f1644r = true;
        this.f1648v = new q0(this, 0);
        this.w = new q0(this, 1);
        this.f1649x = new u1.f(this, 7);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z4) {
            return;
        }
        this.f1634g = decorView.findViewById(android.R.id.content);
    }
}
