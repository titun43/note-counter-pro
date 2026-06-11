package g4;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1701a;

    public k(Class cls) {
        this.f1701a = cls;
    }

    @Override // g4.d
    public final Class a() {
        return this.f1701a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i.a(this.f1701a, ((k) obj).f1701a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1701a.hashCode();
    }

    public final String toString() {
        return this.f1701a.toString() + " (Kotlin reflection is not available)";
    }
}
