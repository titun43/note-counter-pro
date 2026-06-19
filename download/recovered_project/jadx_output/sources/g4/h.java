package g4;

/* loaded from: classes.dex */
public abstract class h extends c implements g, l4.a, t3.a {

    /* renamed from: m, reason: collision with root package name */
    public final int f1697m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1698n;

    public h(int i5, Class cls, String str, String str2, int i6) {
        this(i5, b.f1690g, cls, str, str2, i6, 0);
    }

    public final l4.a c() {
        o.f1705a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f1693j.equals(hVar.f1693j) && this.f1694k.equals(hVar.f1694k) && this.f1698n == hVar.f1698n && this.f1697m == hVar.f1697m && i.a(this.h, hVar.h) && b().equals(hVar.b());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        l4.a aVar = this.f1691g;
        if (aVar == null) {
            c();
            this.f1691g = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // g4.g
    public final int getArity() {
        return this.f1697m;
    }

    public final int hashCode() {
        b();
        return this.f1694k.hashCode() + ((this.f1693j.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        l4.a aVar = this.f1691g;
        if (aVar == null) {
            c();
            this.f1691g = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f1693j;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : s.c.b("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i5, Object obj, Class cls, String str, String str2, int i6, int i7) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f1697m = i5;
        this.f1698n = 0;
    }
}
