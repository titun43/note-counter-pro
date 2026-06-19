package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o.l f411b = new o.l(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f412a;

    public n0(u0 u0Var) {
        this.f412a = u0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        o.l lVar = f411b;
        o.l lVar2 = (o.l) lVar.get(classLoader);
        if (lVar2 == null) {
            lVar2 = new o.l(0);
            lVar.put(classLoader, lVar2);
        }
        Class cls = (Class) lVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        lVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e4) {
            throw new x(s.c.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e5) {
            throw new x(s.c.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e5);
        }
    }

    public final z a(String str) {
        try {
            return (z) c(this.f412a.w.f368n.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new x(s.c.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e5) {
            throw new x(s.c.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (NoSuchMethodException e6) {
            throw new x(s.c.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e6);
        } catch (InvocationTargetException e7) {
            throw new x(s.c.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e7);
        }
    }
}
