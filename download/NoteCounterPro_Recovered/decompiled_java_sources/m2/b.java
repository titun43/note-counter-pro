package m2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2570a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.j f2571b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.i f2572c;

    public b(long j2, f2.j jVar, f2.i iVar) {
        this.f2570a = j2;
        this.f2571b = jVar;
        this.f2572c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2570a == bVar.f2570a && this.f2571b.equals(bVar.f2571b) && this.f2572c.equals(bVar.f2572c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f2570a;
        return ((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ this.f2571b.hashCode()) * 1000003) ^ this.f2572c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2570a + ", transportContext=" + this.f2571b + ", event=" + this.f2572c + "}";
    }
}
