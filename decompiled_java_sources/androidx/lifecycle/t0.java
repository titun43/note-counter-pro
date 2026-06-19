package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class t0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public static t0 f579c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f580b;

    public t0(Application application) {
        this.f580b = application;
    }

    @Override // androidx.lifecycle.v0, androidx.lifecycle.u0
    public final r0 a(Class cls) {
        Application application = this.f580b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.u0
    public final r0 b(Class cls, q0.d dVar) {
        if (this.f580b != null) {
            return a(cls);
        }
        Application application = (Application) dVar.f3075a.get(s0.f577a);
        if (application != null) {
            return c(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final r0 c(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            r0 r0Var = (r0) cls.getConstructor(Application.class).newInstance(application);
            g4.i.d(r0Var, "{\n                try {\n…          }\n            }");
            return r0Var;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }
}
