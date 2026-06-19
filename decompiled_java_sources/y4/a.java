package y4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k1.j;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final j f3879a;

    public a(j jVar) {
        this.f3879a = jVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, j.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f3879a, objArr);
        } catch (InvocationTargetException e4) {
            throw e4.getTargetException();
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Reflection failed for method " + method, e5);
        }
    }
}
