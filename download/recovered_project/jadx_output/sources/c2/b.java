package c2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f787a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f787a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f787a.equals(((b) obj).f787a);
    }

    public final int hashCode() {
        return this.f787a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s.c.d(new StringBuilder("Encoding{name=\""), this.f787a, "\"}");
    }
}
