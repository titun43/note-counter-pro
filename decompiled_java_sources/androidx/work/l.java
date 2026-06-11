package androidx.work;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final g f670a;

    public l(g gVar) {
        this.f670a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f670a.equals(((l) obj).f670a);
    }

    public final int hashCode() {
        return this.f670a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f670a + '}';
    }
}
