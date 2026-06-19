package e2;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f1304a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1305b;

    public n(u uVar, t tVar) {
        this.f1304a = uVar;
        this.f1305b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f1304a;
            if (uVar != null ? uVar.equals(((n) vVar).f1304a) : ((n) vVar).f1304a == null) {
                t tVar = this.f1305b;
                if (tVar != null ? tVar.equals(((n) vVar).f1305b) : ((n) vVar).f1305b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f1304a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f1305b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1304a + ", mobileSubtype=" + this.f1305b + "}";
    }
}
