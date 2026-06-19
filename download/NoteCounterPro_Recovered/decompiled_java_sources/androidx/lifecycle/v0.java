package androidx.lifecycle;

/* loaded from: classes.dex */
public class v0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static v0 f590a;

    @Override // androidx.lifecycle.u0
    public r0 a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            g4.i.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (r0) newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        }
    }
}
