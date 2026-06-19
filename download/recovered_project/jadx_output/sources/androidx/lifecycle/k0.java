package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f549a = new s0();

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f550b = new s0();

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f551c = new s0();

    public static final void a(r0 r0Var, c1.d dVar, o oVar) {
        Object obj;
        g4.i.e(dVar, "registry");
        g4.i.e(oVar, "lifecycle");
        HashMap hashMap = r0Var.f574a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = r0Var.f574a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f515i) {
            return;
        }
        savedStateHandleController.b(oVar, dVar);
        n nVar = ((v) oVar).f585c;
        if (nVar == n.h || nVar.compareTo(n.f560j) >= 0) {
            dVar.d();
        } else {
            oVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(oVar, dVar));
        }
    }

    public static j0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new j0();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                g4.i.d(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new j0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = parcelableArrayList.get(i5);
            g4.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i5));
        }
        return new j0(linkedHashMap);
    }

    public static final j0 c(q0.d dVar) {
        LinkedHashMap linkedHashMap = dVar.f3075a;
        c1.f fVar = (c1.f) linkedHashMap.get(f549a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        x0 x0Var = (x0) linkedHashMap.get(f550b);
        if (x0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f551c);
        String str = (String) linkedHashMap.get(s0.f578b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        c1.c b2 = fVar.getSavedStateRegistry().b();
        m0 m0Var = b2 instanceof m0 ? (m0) b2 : null;
        if (m0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(x0Var).f563d;
        j0 j0Var = (j0) linkedHashMap2.get(str);
        if (j0Var != null) {
            return j0Var;
        }
        Class[] clsArr = j0.f543f;
        m0Var.b();
        Bundle bundle2 = m0Var.f556c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m0Var.f556c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m0Var.f556c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m0Var.f556c = null;
        }
        j0 b5 = b(bundle3, bundle);
        linkedHashMap2.put(str, b5);
        return b5;
    }

    public static final void d(c1.f fVar) {
        n nVar = ((v) fVar.getLifecycle()).f585c;
        if (nVar != n.h && nVar != n.f559i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            m0 m0Var = new m0(fVar.getSavedStateRegistry(), (x0) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m0Var);
            fVar.getLifecycle().a(new SavedStateHandleAttacher(m0Var));
        }
    }

    public static final n0 e(x0 x0Var) {
        ArrayList arrayList = new ArrayList();
        g4.o.f1705a.getClass();
        Class a5 = new g4.e(n0.class).a();
        g4.i.c(a5, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new q0.e(a5));
        q0.e[] eVarArr = (q0.e[]) arrayList.toArray(new q0.e[0]);
        return (n0) new androidx.emoji2.text.t(x0Var.getViewModelStore(), new q0.c((q0.e[]) Arrays.copyOf(eVarArr, eVarArr.length)), x0Var instanceof i ? ((i) x0Var).getDefaultViewModelCreationExtras() : q0.a.f3074b).j("androidx.lifecycle.internal.SavedStateHandlesVM", n0.class);
    }
}
