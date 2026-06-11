package androidx.work;

/* loaded from: classes.dex */
public final class p extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f675c;

    public p(Throwable th) {
        this.f675c = th;
    }

    public final String toString() {
        return s.c.b("FAILURE (", this.f675c.getMessage(), ")");
    }
}
