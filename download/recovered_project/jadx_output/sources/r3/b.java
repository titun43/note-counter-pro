package r3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3168a;

    public b(boolean z4) {
        this.f3168a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f3168a == ((b) obj).f3168a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3168a);
    }

    public final String toString() {
        return "IONFILEDeleteOptions(recursive=" + this.f3168a + ")";
    }
}
