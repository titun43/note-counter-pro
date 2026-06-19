package p1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2973a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2974b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2976d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2973a == aVar.f2973a && this.f2974b == aVar.f2974b && this.f2975c == aVar.f2975c && this.f2976d == aVar.f2976d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f2973a;
        int i5 = r02;
        if (this.f2974b) {
            i5 = r02 + 16;
        }
        int i6 = i5;
        if (this.f2975c) {
            i6 = i5 + 256;
        }
        return this.f2976d ? i6 + 4096 : i6;
    }

    public final String toString() {
        return "[ Connected=" + this.f2973a + " Validated=" + this.f2974b + " Metered=" + this.f2975c + " NotRoaming=" + this.f2976d + " ]";
    }
}
