package e2;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f1289a;

    public j(h hVar) {
        this.f1289a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f1306g;
        if (obj2.equals(obj2)) {
            return this.f1289a.equals(((j) qVar).f1289a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f1306g.hashCode() ^ 1000003) * 1000003) ^ this.f1289a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f1306g + ", androidClientInfo=" + this.f1289a + "}";
    }
}
