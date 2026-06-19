package t4;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3443a = 0;

    static {
        Object g5;
        Object g6;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            g5 = y3.a.class.getCanonicalName();
        } catch (Throwable th) {
            g5 = b3.g.g(th);
        }
        if (t3.e.a(g5) != null) {
            g5 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            g6 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            g6 = b3.g.g(th2);
        }
        if (t3.e.a(g6) != null) {
            g6 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
