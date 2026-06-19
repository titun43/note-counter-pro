package o4;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2801a = new ThreadLocal();

    public static k0 a() {
        ThreadLocal threadLocal = f2801a;
        k0 k0Var = (k0) threadLocal.get();
        if (k0Var != null) {
            return k0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
