package h2;

/* loaded from: classes.dex */
public final class a implements s3.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1710i = new Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile b f1711g;
    public volatile Object h;

    public static s3.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.h = f1710i;
        aVar.f1711g = bVar;
        return aVar;
    }

    @Override // s3.a
    public final Object get() {
        Object obj;
        Object obj2 = this.h;
        Object obj3 = f1710i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.h;
                if (obj == obj3) {
                    obj = this.f1711g.get();
                    Object obj4 = this.h;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.h = obj;
                    this.f1711g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
