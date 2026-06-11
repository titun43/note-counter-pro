package x0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3696b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3697c;

    public c(long j2, long j5, int i5) {
        this.f3695a = j2;
        this.f3696b = j5;
        this.f3697c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3695a == cVar.f3695a && this.f3696b == cVar.f3696b && this.f3697c == cVar.f3697c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3697c) + ((Long.hashCode(this.f3696b) + (Long.hashCode(this.f3695a) * 31)) * 31);
    }

    public final String toString() {
        return s.c.a("Topic { ", "TaxonomyVersion=" + this.f3695a + ", ModelVersion=" + this.f3696b + ", TopicCode=" + this.f3697c + " }");
    }
}
