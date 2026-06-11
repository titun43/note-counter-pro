package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends androidx.activity.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f403a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(u0 u0Var) {
        super(false);
        this.f403a = u0Var;
    }

    @Override // androidx.activity.y
    public final void handleOnBackCancelled() {
        boolean J = u0.J(3);
        u0 u0Var = this.f403a;
        if (J) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + u0Var);
        }
        if (u0.J(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + u0Var.h);
        }
        a aVar = u0Var.h;
        if (aVar != null) {
            aVar.f318r = false;
            aVar.d();
            a aVar2 = u0Var.h;
            e eVar = new e(u0Var);
            if (aVar2.f316p == null) {
                aVar2.f316p = new ArrayList();
            }
            aVar2.f316p.add(eVar);
            u0Var.h.e(false, true);
            u0Var.f446i = true;
            u0Var.A(true);
            u0Var.D();
            u0Var.f446i = false;
            u0Var.h = null;
        }
    }

    @Override // androidx.activity.y
    public final void handleOnBackPressed() {
        boolean J = u0.J(3);
        u0 u0Var = this.f403a;
        if (J) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + u0Var);
        }
        l0 l0Var = u0Var.f447j;
        ArrayList arrayList = u0Var.f451n;
        u0Var.f446i = true;
        u0Var.A(true);
        int i5 = 0;
        u0Var.f446i = false;
        if (u0Var.h == null) {
            if (l0Var.isEnabled()) {
                if (u0.J(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                u0Var.Q();
                return;
            } else {
                if (u0.J(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                u0Var.f445g.c();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(u0.E(u0Var.h));
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = u0Var.h.f302a;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            z zVar = ((c1) obj2).f359b;
            if (zVar != null) {
                zVar.f502s = false;
            }
        }
        Iterator it2 = u0Var.f(new ArrayList(Collections.singletonList(u0Var.h)), 0, 1).iterator();
        while (it2.hasNext()) {
            n nVar = (n) it2.next();
            ArrayList arrayList3 = nVar.f407c;
            if (u0.J(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            nVar.e(arrayList3);
            nVar.getClass();
            g4.i.e(arrayList3, "operations");
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((g1) it3.next()).getClass();
                u3.m.U(arrayList4, null);
            }
            List a02 = u3.g.a0(u3.g.c0(arrayList4));
            int size3 = a02.size();
            for (int i8 = 0; i8 < size3; i8++) {
                ((f1) a02.get(i8)).a(nVar.f405a);
            }
            int size4 = arrayList3.size();
            for (int i9 = 0; i9 < size4; i9++) {
                nVar.a((g1) arrayList3.get(i9));
            }
            List a03 = u3.g.a0(arrayList3);
            if (a03.size() > 0) {
                ((g1) a03.get(0)).getClass();
                throw null;
            }
        }
        ArrayList arrayList5 = u0Var.h.f302a;
        int size5 = arrayList5.size();
        while (i5 < size5) {
            Object obj3 = arrayList5.get(i5);
            i5++;
            z zVar2 = ((c1) obj3).f359b;
            if (zVar2 != null && zVar2.L == null) {
                u0Var.g(zVar2).j();
            }
        }
        u0Var.h = null;
        u0Var.e0();
        if (u0.J(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + l0Var.isEnabled() + " for  FragmentManager " + u0Var);
        }
    }

    @Override // androidx.activity.y
    public final void handleOnBackProgressed(androidx.activity.c cVar) {
        boolean J = u0.J(2);
        u0 u0Var = this.f403a;
        if (J) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + u0Var);
        }
        if (u0Var.h != null) {
            Iterator it = u0Var.f(new ArrayList(Collections.singletonList(u0Var.h)), 0, 1).iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                nVar.getClass();
                g4.i.e(cVar, "backEvent");
                if (u0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + cVar.f30c);
                }
                ArrayList arrayList = nVar.f407c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((g1) obj).getClass();
                    u3.m.U(arrayList2, null);
                }
                List a02 = u3.g.a0(u3.g.c0(arrayList2));
                int size2 = a02.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((f1) a02.get(i6)).b(cVar, nVar.f405a);
                }
            }
            Iterator it2 = u0Var.f451n.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // androidx.activity.y
    public final void handleOnBackStarted(androidx.activity.c cVar) {
        boolean J = u0.J(3);
        u0 u0Var = this.f403a;
        if (J) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + u0Var);
        }
        u0Var.x();
        u0Var.y(new t0(u0Var), false);
    }
}
