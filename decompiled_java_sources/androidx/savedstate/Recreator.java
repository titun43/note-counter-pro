package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.k0;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.lifecycle.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import c1.b;
import c1.d;
import c1.f;
import g4.i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import s.c;

/* loaded from: classes.dex */
public final class Recreator implements r {

    /* renamed from: g, reason: collision with root package name */
    public final f f601g;

    public Recreator(f fVar) {
        this.f601g = fVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, m mVar) {
        if (mVar != m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        tVar.getLifecycle().b(this);
        f fVar = this.f601g;
        Bundle a5 = fVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a5 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a5.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i5 = 0;
        while (i5 < size) {
            String str = stringArrayList.get(i5);
            i5++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        i.d(newInstance, "{\n                constr…wInstance()\n            }");
                        if (!(fVar instanceof x0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        w0 viewModelStore = ((x0) fVar).getViewModelStore();
                        d savedStateRegistry = fVar.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f592a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            i.e(str3, "key");
                            r0 r0Var = (r0) linkedHashMap.get(str3);
                            i.b(r0Var);
                            k0.a(r0Var, savedStateRegistry, fVar.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.d();
                        }
                    } catch (Exception e4) {
                        throw new RuntimeException(c.a("Failed to instantiate ", str2), e4);
                    }
                } catch (NoSuchMethodException e5) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(c.b("Class ", str2, " wasn't found"), e6);
            }
        }
    }
}
