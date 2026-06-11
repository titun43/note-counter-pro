package r3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3164a;

    public a(boolean z4) {
        this.f3164a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3164a == ((a) obj).f3164a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3164a);
    }

    public final String toString() {
        return "IONFILECreateOptions(recursive=" + this.f3164a + ")";
    }
}
