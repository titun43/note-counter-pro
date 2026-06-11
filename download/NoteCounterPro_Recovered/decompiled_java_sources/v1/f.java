package v1;

/* loaded from: classes.dex */
public final class f extends y4.b {
    @Override // y4.b
    public final void E(g gVar, g gVar2) {
        gVar.f3571b = gVar2;
    }

    @Override // y4.b
    public final void F(g gVar, Thread thread) {
        gVar.f3570a = thread;
    }

    @Override // y4.b
    public final boolean c(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.h != cVar) {
                    return false;
                }
                hVar.h = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y4.b
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f3576g != obj) {
                    return false;
                }
                hVar.f3576g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y4.b
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3577i != gVar) {
                    return false;
                }
                hVar.f3577i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
