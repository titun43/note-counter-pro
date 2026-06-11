package t1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3333b;

    public d(String str, int i5) {
        this.f3332a = str;
        this.f3333b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3333b != dVar.f3333b) {
            return false;
        }
        return this.f3332a.equals(dVar.f3332a);
    }

    public final int hashCode() {
        return (this.f3332a.hashCode() * 31) + this.f3333b;
    }
}
