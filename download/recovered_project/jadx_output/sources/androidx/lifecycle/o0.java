package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f564a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f565b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f566c;

    /* renamed from: d, reason: collision with root package name */
    public final o f567d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.d f568e;

    public o0(Application application, c1.f fVar, Bundle bundle) {
        t0 t0Var;
        this.f568e = fVar.getSavedStateRegistry();
        this.f567d = fVar.getLifecycle();
        this.f566c = bundle;
        this.f564a = application;
        if (application != null) {
            if (t0.f579c == null) {
                t0.f579c = new t0(application);
            }
            t0Var = t0.f579c;
            g4.i.b(t0Var);
        } else {
            t0Var = new t0(null);
        }
        this.f565b = t0Var;
    }

    @Override // androidx.lifecycle.u0
    public final r0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.u0
    public final r0 b(Class cls, q0.d dVar) {
        s0 s0Var = s0.f578b;
        LinkedHashMap linkedHashMap = dVar.f3075a;
        String str = (String) linkedHashMap.get(s0Var);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(k0.f549a) == null || linkedHashMap.get(k0.f550b) == null) {
            if (this.f567d != null) {
                return c(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(s0.f577a);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a5 = (!isAssignableFrom || application == null) ? p0.a(cls, p0.f570b) : p0.a(cls, p0.f569a);
        return a5 == null ? this.f565b.b(cls, dVar) : (!isAssignableFrom || application == null) ? p0.b(cls, a5, k0.c(dVar)) : p0.b(cls, a5, application, k0.c(dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r0 c(String str, Class cls) {
        Object obj;
        Application application;
        o oVar = this.f567d;
        if (oVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a5 = (!isAssignableFrom || this.f564a == null) ? p0.a(cls, p0.f570b) : p0.a(cls, p0.f569a);
        if (a5 == null) {
            if (this.f564a != null) {
                return this.f565b.a(cls);
            }
            if (v0.f590a == null) {
                v0.f590a = new v0();
            }
            v0 v0Var = v0.f590a;
            g4.i.b(v0Var);
            return v0Var.a(cls);
        }
        c1.d dVar = this.f568e;
        g4.i.b(dVar);
        Bundle bundle = this.f566c;
        Bundle a6 = dVar.a(str);
        Class[] clsArr = j0.f543f;
        j0 b2 = k0.b(a6, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b2);
        savedStateHandleController.b(oVar, dVar);
        n nVar = ((v) oVar).f585c;
        if (nVar == n.h || nVar.compareTo(n.f560j) >= 0) {
            dVar.d();
        } else {
            oVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(oVar, dVar));
        }
        r0 b5 = (!isAssignableFrom || (application = this.f564a) == null) ? p0.b(cls, a5, b2) : p0.b(cls, a5, application, b2);
        synchronized (b5.f574a) {
            try {
                obj = b5.f574a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    b5.f574a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            savedStateHandleController = obj;
        }
        if (b5.f576c) {
            r0.a(savedStateHandleController);
        }
        return b5;
    }
}
