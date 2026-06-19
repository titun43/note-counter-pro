package g;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.d3;
import k.y2;

/* loaded from: classes.dex */
public final class n0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final d3 f1593a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f1594b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f1595c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1596d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1597e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1598f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1599g = new ArrayList();
    public final androidx.fragment.app.o h = new androidx.fragment.app.o(this, 10);

    public n0(Toolbar toolbar, CharSequence charSequence, z zVar) {
        l0 l0Var = new l0(this);
        d3 d3Var = new d3(toolbar, false);
        this.f1593a = d3Var;
        zVar.getClass();
        this.f1594b = zVar;
        d3Var.f2059k = zVar;
        toolbar.setOnMenuItemClickListener(l0Var);
        if (!d3Var.f2056g) {
            d3Var.h = charSequence;
            if ((d3Var.f2051b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (d3Var.f2056g) {
                    f0.r0.j(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f1595c = new l0(this);
    }

    @Override // g.a
    public final boolean a() {
        k.l lVar;
        ActionMenuView actionMenuView = this.f1593a.f2050a.f163g;
        return (actionMenuView == null || (lVar = actionMenuView.f146z) == null || !lVar.g()) ? false : true;
    }

    @Override // g.a
    public final boolean b() {
        j.p pVar;
        y2 y2Var = this.f1593a.f2050a.S;
        if (y2Var == null || (pVar = y2Var.h) == null) {
            return false;
        }
        if (y2Var == null) {
            pVar = null;
        }
        if (pVar == null) {
            return true;
        }
        pVar.collapseActionView();
        return true;
    }

    @Override // g.a
    public final void c(boolean z4) {
        if (z4 == this.f1598f) {
            return;
        }
        this.f1598f = z4;
        ArrayList arrayList = this.f1599g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.a
    public final int d() {
        return this.f1593a.f2051b;
    }

    @Override // g.a
    public final Context e() {
        return this.f1593a.f2050a.getContext();
    }

    @Override // g.a
    public final boolean f() {
        d3 d3Var = this.f1593a;
        Toolbar toolbar = d3Var.f2050a;
        androidx.fragment.app.o oVar = this.h;
        toolbar.removeCallbacks(oVar);
        Toolbar toolbar2 = d3Var.f2050a;
        WeakHashMap weakHashMap = f0.r0.f1407a;
        toolbar2.postOnAnimation(oVar);
        return true;
    }

    @Override // g.a
    public final void h() {
        this.f1593a.f2050a.removeCallbacks(this.h);
    }

    @Override // g.a
    public final boolean i(int i5, KeyEvent keyEvent) {
        Menu p5 = p();
        if (p5 == null) {
            return false;
        }
        p5.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return p5.performShortcut(i5, keyEvent, 0);
    }

    @Override // g.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // g.a
    public final boolean k() {
        return this.f1593a.f2050a.u();
    }

    @Override // g.a
    public final void n(CharSequence charSequence) {
        d3 d3Var = this.f1593a;
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

    public final Menu p() {
        boolean z4 = this.f1597e;
        d3 d3Var = this.f1593a;
        if (!z4) {
            m0 m0Var = new m0();
            m0Var.h = this;
            u1.f fVar = new u1.f(this, 6);
            Toolbar toolbar = d3Var.f2050a;
            toolbar.T = m0Var;
            toolbar.U = fVar;
            ActionMenuView actionMenuView = toolbar.f163g;
            if (actionMenuView != null) {
                actionMenuView.A = m0Var;
                actionMenuView.B = fVar;
            }
            this.f1597e = true;
        }
        return d3Var.f2050a.getMenu();
    }

    @Override // g.a
    public final void g() {
    }

    @Override // g.a
    public final void l(boolean z4) {
    }

    @Override // g.a
    public final void m(boolean z4) {
    }
}
