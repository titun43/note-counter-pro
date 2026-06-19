package r3;

/* loaded from: classes.dex */
public final class w extends a.a {

    /* renamed from: m, reason: collision with root package name */
    public final String f3195m;

    public w(String str) {
        this.f3195m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && g4.i.a(this.f3195m, ((w) obj).f3195m);
    }

    public final int hashCode() {
        return this.f3195m.hashCode();
    }

    public final String toString() {
        return s.c.b("File(mimeType=", this.f3195m, ")");
    }
}
