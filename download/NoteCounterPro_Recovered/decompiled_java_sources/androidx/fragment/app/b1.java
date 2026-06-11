package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.p f339a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.h f340b;

    /* renamed from: c, reason: collision with root package name */
    public final z f341c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f342d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f343e = -1;

    public b1(androidx.emoji2.text.p pVar, r1.h hVar, z zVar) {
        this.f339a = pVar;
        this.f340b = hVar;
        this.f341c = zVar;
    }

    public final void a() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + zVar);
        }
        Bundle bundle = zVar.h;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        zVar.B.P();
        zVar.f491g = 3;
        zVar.K = false;
        zVar.j();
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onActivityCreated()");
        }
        if (u0.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + zVar);
        }
        zVar.h = null;
        v0 v0Var = zVar.B;
        v0Var.H = false;
        v0Var.I = false;
        v0Var.O.f490i = false;
        v0Var.u(4);
        this.f339a.k(zVar, false);
    }

    public final void b() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "moveto ATTACHED: " + zVar);
        }
        z zVar2 = zVar.f496m;
        b1 b1Var = null;
        r1.h hVar = this.f340b;
        if (zVar2 != null) {
            b1 b1Var2 = (b1) ((HashMap) hVar.h).get(zVar2.f494k);
            if (b1Var2 == null) {
                throw new IllegalStateException("Fragment " + zVar + " declared target fragment " + zVar.f496m + " that does not belong to this FragmentManager!");
            }
            zVar.f497n = zVar.f496m.f494k;
            zVar.f496m = null;
            b1Var = b1Var2;
        } else {
            String str = zVar.f497n;
            if (str != null && (b1Var = (b1) ((HashMap) hVar.h).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(zVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(s.c.d(sb, zVar.f497n, " that does not belong to this FragmentManager!"));
            }
        }
        if (b1Var != null) {
            b1Var.j();
        }
        u0 u0Var = zVar.f508z;
        zVar.A = u0Var.w;
        zVar.C = u0Var.f461y;
        androidx.emoji2.text.p pVar = this.f339a;
        pVar.q(zVar, false);
        ArrayList arrayList = zVar.X;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((y) obj).a();
        }
        arrayList.clear();
        zVar.B.b(zVar.A, zVar.a(), zVar);
        zVar.f491g = 0;
        zVar.K = false;
        zVar.l(zVar.A.f368n);
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onAttach()");
        }
        Iterator it = zVar.f508z.f453p.iterator();
        while (it.hasNext()) {
            ((z0) it.next()).a(zVar);
        }
        v0 v0Var = zVar.B;
        v0Var.H = false;
        v0Var.I = false;
        v0Var.O.f490i = false;
        v0Var.u(0);
        pVar.l(zVar, false);
    }

    public final int c() {
        n nVar;
        Object obj;
        Object obj2;
        z zVar = this.f341c;
        if (zVar.f508z == null) {
            return zVar.f491g;
        }
        int i5 = this.f343e;
        int ordinal = zVar.S.ordinal();
        if (ordinal == 1) {
            i5 = Math.min(i5, 0);
        } else if (ordinal == 2) {
            i5 = Math.min(i5, 1);
        } else if (ordinal == 3) {
            i5 = Math.min(i5, 5);
        } else if (ordinal != 4) {
            i5 = Math.min(i5, -1);
        }
        if (zVar.f503t) {
            i5 = zVar.f504u ? Math.max(this.f343e, 2) : this.f343e < 4 ? Math.min(i5, zVar.f491g) : Math.min(i5, 1);
        }
        if (zVar.f505v && zVar.L == null) {
            i5 = Math.min(i5, 4);
        }
        if (!zVar.f500q) {
            i5 = Math.min(i5, 1);
        }
        ViewGroup viewGroup = zVar.L;
        if (viewGroup != null) {
            g4.i.d(zVar.e().H(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof n) {
                nVar = (n) tag;
            } else {
                nVar = new n(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, nVar);
            }
            ArrayList arrayList = nVar.f406b;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                obj = null;
                if (i6 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i6);
                i6++;
                ((g1) obj2).getClass();
                if (g4.i.a(null, zVar)) {
                    break;
                }
            }
            ArrayList arrayList2 = nVar.f407c;
            int size2 = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i7);
                i7++;
                ((g1) obj3).getClass();
                if (g4.i.a(null, zVar)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (zVar.f501r) {
            i5 = zVar.i() ? Math.min(i5, 1) : Math.min(i5, -1);
        }
        if (zVar.M && zVar.f491g < 5) {
            i5 = Math.min(i5, 4);
        }
        if (zVar.f502s) {
            i5 = Math.max(i5, 3);
        }
        if (u0.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i5 + " for " + zVar);
        }
        return i5;
    }

    public final void d() {
        Bundle bundle;
        boolean J = u0.J(3);
        final z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "moveto CREATED: " + zVar);
        }
        Bundle bundle2 = zVar.h;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (zVar.Q) {
            zVar.f491g = 1;
            Bundle bundle4 = zVar.h;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            zVar.B.U(bundle);
            v0 v0Var = zVar.B;
            v0Var.H = false;
            v0Var.I = false;
            v0Var.O.f490i = false;
            v0Var.u(1);
            return;
        }
        androidx.emoji2.text.p pVar = this.f339a;
        pVar.r(zVar, false);
        zVar.B.P();
        zVar.f491g = 1;
        zVar.K = false;
        zVar.T.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.r
            public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    z.this.getClass();
                }
            }
        });
        zVar.m(bundle3);
        zVar.Q = true;
        if (zVar.K) {
            zVar.T.e(androidx.lifecycle.m.ON_CREATE);
            pVar.m(zVar, false);
        } else {
            throw new j1("Fragment " + zVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        z zVar = this.f341c;
        if (zVar.f503t) {
            return;
        }
        if (u0.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + zVar);
        }
        Bundle bundle = zVar.h;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater p5 = zVar.p(bundle2);
        ViewGroup viewGroup2 = zVar.L;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i5 = zVar.E;
            if (i5 != 0) {
                if (i5 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + zVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) zVar.f508z.f460x.r(i5);
                if (viewGroup == null) {
                    if (!zVar.w && !zVar.f505v) {
                        try {
                            str = zVar.v().getResources().getResourceName(zVar.E);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(zVar.E) + " (" + str + ") for fragment " + zVar);
                    }
                } else if (!(viewGroup instanceof g0)) {
                    p0.b bVar = p0.c.f2971a;
                    p0.c.b(new p0.d(zVar, viewGroup, 1));
                    p0.c.a(zVar).getClass();
                }
            }
        }
        zVar.L = viewGroup;
        zVar.t(p5, viewGroup, bundle2);
        zVar.f491g = 2;
    }

    public final void f() {
        z e4;
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "movefrom CREATED: " + zVar);
        }
        boolean z4 = true;
        int i5 = 0;
        boolean z5 = zVar.f501r && !zVar.i();
        r1.h hVar = this.f340b;
        if (z5) {
            hVar.s(null, zVar.f494k);
        }
        if (!z5) {
            y0 y0Var = (y0) hVar.f3163j;
            if (!((y0Var.f486d.containsKey(zVar.f494k) && y0Var.f489g) ? y0Var.h : true)) {
                String str = zVar.f497n;
                if (str != null && (e4 = hVar.e(str)) != null && e4.I) {
                    zVar.f496m = e4;
                }
                zVar.f491g = 0;
                return;
            }
        }
        d0 d0Var = zVar.A;
        if (d0Var != null) {
            z4 = ((y0) hVar.f3163j).h;
        } else {
            g.k kVar = d0Var.f368n;
            if (kVar != null) {
                z4 = true ^ kVar.isChangingConfigurations();
            }
        }
        if (z5 || z4) {
            ((y0) hVar.f3163j).c(zVar, false);
        }
        zVar.B.l();
        zVar.T.e(androidx.lifecycle.m.ON_DESTROY);
        zVar.f491g = 0;
        zVar.K = false;
        zVar.Q = false;
        zVar.K = true;
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onDestroy()");
        }
        this.f339a.n(zVar, false);
        ArrayList j2 = hVar.j();
        int size = j2.size();
        while (i5 < size) {
            Object obj = j2.get(i5);
            i5++;
            b1 b1Var = (b1) obj;
            if (b1Var != null) {
                z zVar2 = b1Var.f341c;
                if (zVar.f494k.equals(zVar2.f497n)) {
                    zVar2.f496m = zVar;
                    zVar2.f497n = null;
                }
            }
        }
        String str2 = zVar.f497n;
        if (str2 != null) {
            zVar.f496m = hVar.e(str2);
        }
        hVar.p(this);
    }

    public final void g() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + zVar);
        }
        ViewGroup viewGroup = zVar.L;
        zVar.B.u(1);
        zVar.f491g = 1;
        zVar.K = false;
        zVar.n();
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onDestroyView()");
        }
        o.m mVar = r0.a.a(zVar).f3146b.f3144d;
        if (mVar.f2735i > 0) {
            mVar.h[0].getClass();
            throw new ClassCastException();
        }
        zVar.f506x = false;
        this.f339a.w(zVar, false);
        zVar.L = null;
        zVar.U.e(null);
        zVar.f504u = false;
    }

    public final void h() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + zVar);
        }
        zVar.f491g = -1;
        zVar.K = false;
        zVar.o();
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onDetach()");
        }
        v0 v0Var = zVar.B;
        if (!v0Var.J) {
            v0Var.l();
            zVar.B = new v0();
        }
        this.f339a.o(zVar, false);
        zVar.f491g = -1;
        zVar.A = null;
        zVar.C = null;
        zVar.f508z = null;
        if (!zVar.f501r || zVar.i()) {
            y0 y0Var = (y0) this.f340b.f3163j;
            if (!((y0Var.f486d.containsKey(zVar.f494k) && y0Var.f489g) ? y0Var.h : true)) {
                return;
            }
        }
        if (u0.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + zVar);
        }
        zVar.g();
    }

    public final void i() {
        z zVar = this.f341c;
        if (zVar.f503t && zVar.f504u && !zVar.f506x) {
            if (u0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + zVar);
            }
            Bundle bundle = zVar.h;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            zVar.t(zVar.p(bundle2), null, bundle2);
        }
    }

    public final void j() {
        r1.h hVar = this.f340b;
        boolean z4 = this.f342d;
        z zVar = this.f341c;
        if (z4) {
            if (u0.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + zVar);
                return;
            }
            return;
        }
        try {
            this.f342d = true;
            boolean z5 = false;
            while (true) {
                int c5 = c();
                int i5 = zVar.f491g;
                if (c5 == i5) {
                    if (!z5 && i5 == -1 && zVar.f501r && !zVar.i()) {
                        if (u0.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + zVar);
                        }
                        ((y0) hVar.f3163j).c(zVar, true);
                        hVar.p(this);
                        if (u0.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + zVar);
                        }
                        zVar.g();
                    }
                    if (zVar.P) {
                        u0 u0Var = zVar.f508z;
                        if (u0Var != null && zVar.f500q && u0.K(zVar)) {
                            u0Var.G = true;
                        }
                        zVar.P = false;
                        zVar.B.o();
                    }
                    this.f342d = false;
                    return;
                }
                if (c5 <= i5) {
                    switch (i5 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            zVar.f491g = 1;
                            break;
                        case 2:
                            zVar.f504u = false;
                            zVar.f491g = 2;
                            break;
                        case 3:
                            if (u0.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + zVar);
                            }
                            zVar.f491g = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            zVar.f491g = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i5 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            zVar.f491g = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            zVar.f491g = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z5 = true;
            }
        } catch (Throwable th) {
            this.f342d = false;
            throw th;
        }
    }

    public final void k() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "movefrom RESUMED: " + zVar);
        }
        zVar.B.u(5);
        zVar.T.e(androidx.lifecycle.m.ON_PAUSE);
        zVar.f491g = 6;
        zVar.K = true;
        this.f339a.p(zVar, false);
    }

    public final void l(ClassLoader classLoader) {
        z zVar = this.f341c;
        Bundle bundle = zVar.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (zVar.h.getBundle("savedInstanceState") == null) {
            zVar.h.putBundle("savedInstanceState", new Bundle());
        }
        try {
            zVar.f492i = zVar.h.getSparseParcelableArray("viewState");
            zVar.f493j = zVar.h.getBundle("viewRegistryState");
            a1 a1Var = (a1) zVar.h.getParcelable("state");
            if (a1Var != null) {
                zVar.f497n = a1Var.f333s;
                zVar.f498o = a1Var.f334t;
                zVar.N = a1Var.f335u;
            }
            if (zVar.N) {
                return;
            }
            zVar.M = true;
        } catch (BadParcelableException e4) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + zVar, e4);
        }
    }

    public final void m() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "moveto RESUMED: " + zVar);
        }
        w wVar = zVar.O;
        View view = wVar == null ? null : wVar.f476j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        zVar.b().f476j = null;
        zVar.B.P();
        zVar.B.A(true);
        zVar.f491g = 7;
        zVar.K = false;
        zVar.K = true;
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onResume()");
        }
        zVar.T.e(androidx.lifecycle.m.ON_RESUME);
        v0 v0Var = zVar.B;
        v0Var.H = false;
        v0Var.I = false;
        v0Var.O.f490i = false;
        v0Var.u(7);
        this.f339a.s(zVar, false);
        this.f340b.s(null, zVar.f494k);
        zVar.h = null;
        zVar.f492i = null;
        zVar.f493j = null;
    }

    public final void n() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "moveto STARTED: " + zVar);
        }
        zVar.B.P();
        zVar.B.A(true);
        zVar.f491g = 5;
        zVar.K = false;
        zVar.r();
        if (!zVar.K) {
            throw new j1("Fragment " + zVar + " did not call through to super.onStart()");
        }
        zVar.T.e(androidx.lifecycle.m.ON_START);
        v0 v0Var = zVar.B;
        v0Var.H = false;
        v0Var.I = false;
        v0Var.O.f490i = false;
        v0Var.u(5);
        this.f339a.u(zVar, false);
    }

    public final void o() {
        boolean J = u0.J(3);
        z zVar = this.f341c;
        if (J) {
            Log.d("FragmentManager", "movefrom STARTED: " + zVar);
        }
        v0 v0Var = zVar.B;
        v0Var.I = true;
        v0Var.O.f490i = true;
        v0Var.u(4);
        zVar.T.e(androidx.lifecycle.m.ON_STOP);
        zVar.f491g = 4;
        zVar.K = false;
        zVar.s();
        if (zVar.K) {
            this.f339a.v(zVar, false);
            return;
        }
        throw new j1("Fragment " + zVar + " did not call through to super.onStop()");
    }

    public b1(androidx.emoji2.text.p pVar, r1.h hVar, ClassLoader classLoader, n0 n0Var, Bundle bundle) {
        this.f339a = pVar;
        this.f340b = hVar;
        a1 a1Var = (a1) bundle.getParcelable("state");
        z a5 = n0Var.a(a1Var.f322g);
        a5.f494k = a1Var.h;
        a5.f503t = a1Var.f323i;
        a5.f505v = a1Var.f324j;
        a5.w = true;
        a5.D = a1Var.f325k;
        a5.E = a1Var.f326l;
        a5.F = a1Var.f327m;
        a5.I = a1Var.f328n;
        a5.f501r = a1Var.f329o;
        a5.H = a1Var.f330p;
        a5.G = a1Var.f331q;
        a5.S = androidx.lifecycle.n.values()[a1Var.f332r];
        a5.f497n = a1Var.f333s;
        a5.f498o = a1Var.f334t;
        a5.N = a1Var.f335u;
        this.f341c = a5;
        a5.h = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        u0 u0Var = a5.f508z;
        if (u0Var != null && (u0Var.H || u0Var.I)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        a5.f495l = bundle2;
        if (u0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a5);
        }
    }

    public b1(androidx.emoji2.text.p pVar, r1.h hVar, z zVar, Bundle bundle) {
        this.f339a = pVar;
        this.f340b = hVar;
        this.f341c = zVar;
        zVar.f492i = null;
        zVar.f493j = null;
        zVar.f507y = 0;
        zVar.f504u = false;
        zVar.f500q = false;
        z zVar2 = zVar.f496m;
        zVar.f497n = zVar2 != null ? zVar2.f494k : null;
        zVar.f496m = null;
        zVar.h = bundle;
        zVar.f495l = bundle.getBundle("arguments");
    }
}
