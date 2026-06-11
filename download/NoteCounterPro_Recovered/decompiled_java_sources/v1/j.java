package v1;

/* loaded from: classes.dex */
public final class j extends h {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = h.f3575m;
        }
        if (!h.f3574l.d(this, null, obj)) {
            return false;
        }
        h.b(this);
        return true;
    }

    public final boolean i(Throwable th) {
        if (!h.f3574l.d(this, null, new b(th))) {
            return false;
        }
        h.b(this);
        return true;
    }

    public final boolean j(j3.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f3576g;
        if (obj == null) {
            if (aVar.isDone()) {
                if (h.f3574l.d(this, null, h.e(aVar))) {
                    h.b(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, aVar);
            if (h.f3574l.d(this, null, eVar)) {
                try {
                    aVar.addListener(eVar, i.f3578g);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Throwable unused) {
                        bVar = b.f3557b;
                    }
                    h.f3574l.d(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f3576g;
        }
        if (obj instanceof a) {
            aVar.cancel(((a) obj).f3555a);
        }
        return false;
    }
}
