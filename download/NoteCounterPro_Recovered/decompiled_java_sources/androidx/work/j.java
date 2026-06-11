package androidx.work;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final g f669a = g.f635c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f669a.equals(((j) obj).f669a);
    }

    public final int hashCode() {
        return this.f669a.hashCode() + (j.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f669a + '}';
    }
}
