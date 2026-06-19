package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class z implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.x0, androidx.lifecycle.i, c1.f {
    public static final Object Z = new Object();
    public d0 A;
    public z C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean K;
    public ViewGroup L;
    public boolean M;
    public w O;
    public boolean P;
    public boolean Q;
    public String R;
    public androidx.lifecycle.n S;
    public androidx.lifecycle.v T;
    public final androidx.lifecycle.a0 U;
    public c1.e V;
    public final AtomicInteger W;
    public final ArrayList X;
    public final u Y;
    public Bundle h;

    /* renamed from: i, reason: collision with root package name */
    public SparseArray f492i;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f493j;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f495l;

    /* renamed from: m, reason: collision with root package name */
    public z f496m;

    /* renamed from: o, reason: collision with root package name */
    public int f498o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f500q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f501r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f502s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f503t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f504u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f505v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f506x;

    /* renamed from: y, reason: collision with root package name */
    public int f507y;

    /* renamed from: z, reason: collision with root package name */
    public u0 f508z;

    /* renamed from: g, reason: collision with root package name */
    public int f491g = -1;

    /* renamed from: k, reason: collision with root package name */
    public String f494k = UUID.randomUUID().toString();

    /* renamed from: n, reason: collision with root package name */
    public String f497n = null;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f499p = null;
    public v0 B = new v0();
    public final boolean J = true;
    public boolean N = true;

    public z() {
        new o(this, 1);
        this.S = androidx.lifecycle.n.f561k;
        this.U = new androidx.lifecycle.a0();
        this.W = new AtomicInteger();
        this.X = new ArrayList();
        this.Y = new u(this);
        f();
    }

    public abstract a.a a();

    public final w b() {
        if (this.O == null) {
            w wVar = new w();
            Object obj = Z;
            wVar.f474g = obj;
            wVar.h = obj;
            wVar.f475i = obj;
            wVar.f476j = null;
            this.O = wVar;
        }
        return this.O;
    }

    public final u0 c() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int d() {
        androidx.lifecycle.n nVar = this.S;
        return (nVar == androidx.lifecycle.n.h || this.C == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.C.d());
    }

    public final u0 e() {
        u0 u0Var = this.f508z;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void f() {
        this.T = new androidx.lifecycle.v(this);
        this.V = new c1.e(this);
        ArrayList arrayList = this.X;
        u uVar = this.Y;
        if (arrayList.contains(uVar)) {
            return;
        }
        if (this.f491g >= 0) {
            uVar.a();
        } else {
            arrayList.add(uVar);
        }
    }

    public final void g() {
        f();
        this.R = this.f494k;
        this.f494k = UUID.randomUUID().toString();
        this.f500q = false;
        this.f501r = false;
        this.f503t = false;
        this.f504u = false;
        this.w = false;
        this.f507y = 0;
        this.f508z = null;
        this.B = new v0();
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.H = false;
    }

    @Override // androidx.lifecycle.i
    public final q0.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = v().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && u0.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + v().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        q0.d dVar = new q0.d(0);
        LinkedHashMap linkedHashMap = dVar.f3075a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.s0.f577a, application);
        }
        linkedHashMap.put(androidx.lifecycle.k0.f549a, this);
        linkedHashMap.put(androidx.lifecycle.k0.f550b, this);
        Bundle bundle = this.f495l;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.k0.f551c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return this.T;
    }

    @Override // c1.f
    public final c1.d getSavedStateRegistry() {
        return this.V.f784b;
    }

    @Override // androidx.lifecycle.x0
    public final androidx.lifecycle.w0 getViewModelStore() {
        if (this.f508z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (d() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f508z.O.f488f;
        androidx.lifecycle.w0 w0Var = (androidx.lifecycle.w0) hashMap.get(this.f494k);
        if (w0Var != null) {
            return w0Var;
        }
        androidx.lifecycle.w0 w0Var2 = new androidx.lifecycle.w0();
        hashMap.put(this.f494k, w0Var2);
        return w0Var2;
    }

    public final boolean h() {
        if (this.G) {
            return true;
        }
        u0 u0Var = this.f508z;
        if (u0Var != null) {
            z zVar = this.C;
            u0Var.getClass();
            if (zVar == null ? false : zVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return this.f507y > 0;
    }

    public abstract void j();

    public void k(int i5, int i6, Intent intent) {
        if (u0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i5 + " resultCode: " + i6 + " data: " + intent);
        }
    }

    public void l(Context context) {
        this.K = true;
        d0 d0Var = this.A;
        if ((d0Var == null ? null : d0Var.f367m) != null) {
            this.K = true;
        }
    }

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        u().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.K = true;
    }

    public LayoutInflater p(Bundle bundle) {
        d0 d0Var = this.A;
        if (d0Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        g.k kVar = d0Var.f371q;
        LayoutInflater cloneInContext = kVar.getLayoutInflater().cloneInContext(kVar);
        cloneInContext.setFactory2(this.B.f444f);
        return cloneInContext;
    }

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public void t(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.P();
        this.f506x = true;
        getViewModelStore();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f494k);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    public final e0 u() {
        d0 d0Var = this.A;
        g.k kVar = d0Var == null ? null : d0Var.f367m;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context v() {
        d0 d0Var = this.A;
        g.k kVar = d0Var == null ? null : d0Var.f368n;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void w(int i5, int i6, int i7, int i8) {
        if (this.O == null && i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            return;
        }
        b().f469b = i5;
        b().f470c = i6;
        b().f471d = i7;
        b().f472e = i8;
    }
}
