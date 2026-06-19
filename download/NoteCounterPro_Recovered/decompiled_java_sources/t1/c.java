package t1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3330a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3331b;

    public c(String str, long j2) {
        this.f3330a = str;
        this.f3331b = Long.valueOf(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l5 = cVar.f3331b;
        if (!this.f3330a.equals(cVar.f3330a)) {
            return false;
        }
        Long l6 = this.f3331b;
        return l6 != null ? l6.equals(l5) : l5 == null;
    }

    public final int hashCode() {
        int hashCode = this.f3330a.hashCode() * 31;
        Long l5 = this.f3331b;
        return hashCode + (l5 != null ? l5.hashCode() : 0);
    }
}
