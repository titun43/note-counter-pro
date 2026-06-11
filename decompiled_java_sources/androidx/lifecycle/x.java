package androidx.lifecycle;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f593a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f594b = new HashMap();

    public static void a(Constructor constructor, s sVar) {
        try {
            g4.i.d(constructor.newInstance(sVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int U = n4.i.U(str, ".", 0, false);
        if (U >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i5 = 0;
            do {
                sb2.append((CharSequence) str, i5, U);
                sb2.append("_");
                i5 = U + 1;
                if (U >= str.length()) {
                    break;
                }
                U = n4.i.U(str, ".", i5, false);
            } while (U > 0);
            sb2.append((CharSequence) str, i5, str.length());
            str = sb2.toString();
            g4.i.d(str, "toString(...)");
        }
        return s.c.d(sb, str, "_LifecycleAdapter");
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z4;
        HashMap hashMap = f593a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i5 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                g4.i.d(name, "fullPackage");
                if (name.length() != 0) {
                    g4.i.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    g4.i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                g4.i.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b2 = b(canonicalName);
                if (name.length() != 0) {
                    b2 = name + '.' + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
            HashMap hashMap2 = f594b;
            if (constructor != null) {
                hashMap2.put(cls, y4.b.y(constructor));
            } else {
                d dVar = d.f530c;
                HashMap hashMap3 = dVar.f532b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z4 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z4 = false;
                                break;
                            }
                            if (((b0) declaredMethods[i6].getAnnotation(b0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                z4 = true;
                                break;
                            }
                            i6++;
                        }
                    } catch (NoClassDefFoundError e5) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
                    }
                }
                if (!z4) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && s.class.isAssignableFrom(superclass)) {
                        g4.i.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            g4.i.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    g4.i.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length2) {
                            Class<?> cls2 = interfaces[i7];
                            if (cls2 != null && s.class.isAssignableFrom(cls2)) {
                                g4.i.d(cls2, "intrface");
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                g4.i.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i7++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i5 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i5));
        return i5;
    }
}
