package v4;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final e f3607j;

    static {
        int i5 = k.f3614c;
        int i6 = k.f3615d;
        long j2 = k.f3616e;
        String str = k.f3612a;
        e eVar = new e();
        eVar.f3609i = new c(i5, i6, str, j2);
        f3607j = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o4.r
    public final String toString() {
        return "Dispatchers.Default";
    }
}
