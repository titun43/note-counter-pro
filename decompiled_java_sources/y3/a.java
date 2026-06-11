package y3;

import androidx.emoji2.text.t;
import g4.i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements w3.c, d, Serializable {
    private final w3.c completion;

    public a(w3.c cVar) {
        this.completion = cVar;
    }

    public w3.c create(w3.c cVar) {
        i.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        w3.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final w3.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i5;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i5 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i5 = -1;
        }
        int i6 = i5 >= 0 ? eVar.l()[i5] : -1;
        t tVar = f.f3878b;
        t tVar2 = f.f3877a;
        if (tVar == null) {
            try {
                t tVar3 = new t(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 19);
                f.f3878b = tVar3;
                tVar = tVar3;
            } catch (Exception unused2) {
                f.f3878b = tVar2;
                tVar = tVar2;
            }
        }
        if (tVar != tVar2 && (method = (Method) tVar.h) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) tVar.f284i) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) tVar.f285j;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i6);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // w3.c
    public final void resumeWith(Object obj) {
        w3.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            w3.c cVar2 = aVar.completion;
            i.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == x3.a.f3712g) {
                    return;
                }
            } catch (Throwable th) {
                obj = b3.g.g(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public w3.c create(Object obj, w3.c cVar) {
        i.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
