package r3;

/* loaded from: classes.dex */
public final class g0 extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public final x f3185c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3186d;

    public g0(x xVar, String str) {
        g4.i.e(str, "uriPath");
        this.f3185c = xVar;
        this.f3186d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f3185c == g0Var.f3185c && g4.i.a(this.f3186d, g0Var.f3186d);
    }

    public final int hashCode() {
        x xVar = this.f3185c;
        return this.f3186d.hashCode() + ((xVar == null ? 0 : xVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Unresolved(parentFolder=" + this.f3185c + ", uriPath=" + this.f3186d + ")";
    }
}
