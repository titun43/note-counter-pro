package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f530c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f531a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f532b = new HashMap();

    public static void b(HashMap hashMap, c cVar, m mVar, Class cls) {
        m mVar2 = (m) hashMap.get(cVar);
        if (mVar2 == null || mVar == mVar2) {
            if (mVar2 == null) {
                hashMap.put(cVar, mVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f529b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i5;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f531a;
        if (superclass != null) {
            b bVar = (b) hashMap2.get(superclass);
            if (bVar == null) {
                bVar = a(superclass, null);
            }
            hashMap.putAll(bVar.f527b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVar2 = (b) hashMap2.get(cls2);
            if (bVar2 == null) {
                bVar2 = a(cls2, null);
            }
            for (Map.Entry entry : bVar2.f527b.entrySet()) {
                b(hashMap, (c) entry.getKey(), (m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            b0 b0Var = (b0) method.getAnnotation(b0.class);
            if (b0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                m value = b0Var.value();
                if (parameterTypes.length > 1) {
                    if (!m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new c(i5, method), value, cls);
                z4 = true;
            }
        }
        b bVar3 = new b(hashMap);
        hashMap2.put(cls, bVar3);
        this.f532b.put(cls, Boolean.valueOf(z4));
        return bVar3;
    }
}
