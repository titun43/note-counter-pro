package q4;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3134a;

    public h(Throwable th) {
        this.f3134a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return g4.i.a(this.f3134a, ((h) obj).f3134a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f3134a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // q4.i
    public final String toString() {
        return "Closed(" + this.f3134a + ')';
    }
}
