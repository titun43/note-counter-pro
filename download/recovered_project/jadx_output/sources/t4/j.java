package t4;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends g4.c implements f4.a, l4.a {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3425m;

    public j(k kVar) {
        super(kVar, o4.w.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f3425m = false;
    }

    public final l4.a c() {
        if (this.f3425m) {
            return this;
        }
        l4.a aVar = this.f1691g;
        if (aVar != null) {
            return aVar;
        }
        g4.o.f1705a.getClass();
        this.f1691g = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return b().equals(jVar.b()) && this.f1693j.equals(jVar.f1693j) && this.f1694k.equals(jVar.f1694k) && g4.i.a(this.h, jVar.h);
        }
        if (obj instanceof j) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1694k.hashCode() + ((this.f1693j.hashCode() + (b().hashCode() * 31)) * 31);
    }

    @Override // f4.a
    public final Object invoke() {
        return this.h.getClass().getSimpleName();
    }

    public final String toString() {
        l4.a c5 = c();
        return c5 != this ? c5.toString() : s.c.d(new StringBuilder("property "), this.f1693j, " (Kotlin reflection is not available)");
    }
}
