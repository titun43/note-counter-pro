package o4;

/* loaded from: classes.dex */
public final class b0 extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f2787g;

    public b0(Throwable th, r rVar, w3.h hVar) {
        super("Coroutine dispatcher " + rVar + " threw an exception, context = " + hVar, th);
        this.f2787g = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2787g;
    }
}
