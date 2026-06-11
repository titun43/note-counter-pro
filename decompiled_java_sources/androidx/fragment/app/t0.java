package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class t0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f437a;

    public t0(u0 u0Var) {
        this.f437a = u0Var;
    }

    @Override // androidx.fragment.app.r0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean R;
        u0 u0Var = this.f437a;
        ArrayList arrayList3 = u0Var.f451n;
        if (u0.J(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + u0Var.f439a);
        }
        int i5 = 0;
        if (u0Var.f442d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            R = false;
        } else {
            ArrayList arrayList4 = u0Var.f442d;
            a aVar = (a) arrayList4.get(arrayList4.size() - 1);
            u0Var.h = aVar;
            ArrayList arrayList5 = aVar.f302a;
            int size = arrayList5.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList5.get(i6);
                i6++;
                z zVar = ((c1) obj).f359b;
                if (zVar != null) {
                    zVar.f502s = true;
                }
            }
            R = u0Var.R(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                linkedHashSet.addAll(u0.E((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return R;
    }
}
