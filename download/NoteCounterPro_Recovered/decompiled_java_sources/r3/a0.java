package r3;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f3165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3167c;

    public a0(e eVar, int i5, int i6) {
        g4.i.e(eVar, "encoding");
        this.f3165a = eVar;
        this.f3166b = i5;
        this.f3167c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return g4.i.a(this.f3165a, a0Var.f3165a) && this.f3166b == a0Var.f3166b && this.f3167c == a0Var.f3167c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3167c) + ((Integer.hashCode(this.f3166b) + (this.f3165a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IONFILEReadOptions(encoding=" + this.f3165a + ", offset=" + this.f3166b + ", length=" + this.f3167c + ")";
    }
}
