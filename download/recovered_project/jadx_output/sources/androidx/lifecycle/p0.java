package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f569a = u3.h.S(Application.class, j0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f570b = y4.b.y(j0.class);

    public static final Constructor a(Class cls, List list) {
        g4.i.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        g4.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            g4.i.d(parameterTypes, "constructor.parameterTypes");
            List E = u3.f.E(parameterTypes);
            if (list.equals(E)) {
                return constructor;
            }
            if (list.size() == E.size() && E.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final r0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (r0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e6.getCause());
        }
    }
}
