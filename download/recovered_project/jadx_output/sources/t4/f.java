package t4;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: g, reason: collision with root package name */
    public final transient w3.h f3413g;

    public f(w3.h hVar) {
        this.f3413g = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f3413g);
    }
}
