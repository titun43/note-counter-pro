package g;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f1499a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1500b;

    public c0(Context context) {
        this.f1499a = context;
    }

    public void c() {
        b0 b0Var = (b0) this.f1499a;
        if (b0Var != null) {
            try {
                ((f0) this.f1500b).f1544q.unregisterReceiver(b0Var);
            } catch (IllegalArgumentException unused) {
            }
            this.f1499a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof a0.a)) {
            return menuItem;
        }
        a0.a aVar = (a0.a) menuItem;
        if (((o.l) this.f1500b) == null) {
            this.f1500b = new o.l(0);
        }
        MenuItem menuItem2 = (MenuItem) ((o.l) this.f1500b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j.u uVar = new j.u((Context) this.f1499a, aVar);
        ((o.l) this.f1500b).put(aVar, uVar);
        return uVar;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d5 = d();
        if (d5.countActions() == 0) {
            return;
        }
        if (((b0) this.f1499a) == null) {
            this.f1499a = new b0(this, 0);
        }
        ((f0) this.f1500b).f1544q.registerReceiver((b0) this.f1499a, d5);
    }

    public c0(f0 f0Var) {
        this.f1500b = f0Var;
    }
}
