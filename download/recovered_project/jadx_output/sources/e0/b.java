package e0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1227b;

    public b(Object obj, Object obj2) {
        this.f1226a = obj;
        this.f1227b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f1226a, this.f1226a) && Objects.equals(bVar.f1227b, this.f1227b);
    }

    public final int hashCode() {
        Object obj = this.f1226a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1227b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f1226a + " " + this.f1227b + "}";
    }
}
