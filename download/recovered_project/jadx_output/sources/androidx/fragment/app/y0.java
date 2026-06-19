package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y0 extends androidx.lifecycle.r0 {

    /* renamed from: j, reason: collision with root package name */
    public static final x0 f485j = new x0(0);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f489g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f486d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f487e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f488f = new HashMap();
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f490i = false;

    public y0(boolean z4) {
        this.f489g = z4;
    }

    @Override // androidx.lifecycle.r0
    public final void b() {
        if (u0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(z zVar, boolean z4) {
        if (u0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + zVar);
        }
        e(zVar.f494k, z4);
    }

    public final void d(String str, boolean z4) {
        if (u0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z4);
    }

    public final void e(String str, boolean z4) {
        HashMap hashMap = this.f487e;
        y0 y0Var = (y0) hashMap.get(str);
        if (y0Var != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(y0Var.f487e.keySet());
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    y0Var.d((String) obj, true);
                }
            }
            y0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f488f;
        androidx.lifecycle.w0 w0Var = (androidx.lifecycle.w0) hashMap2.get(str);
        if (w0Var != null) {
            w0Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f486d.equals(y0Var.f486d) && this.f487e.equals(y0Var.f487e) && this.f488f.equals(y0Var.f488f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(z zVar) {
        if (this.f490i) {
            if (u0.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f486d.remove(zVar.f494k) == null || !u0.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + zVar);
        }
    }

    public final int hashCode() {
        return this.f488f.hashCode() + ((this.f487e.hashCode() + (this.f486d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f486d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f487e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f488f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
