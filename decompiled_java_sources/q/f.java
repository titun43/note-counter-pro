package q;

/* loaded from: classes.dex */
public final class f extends z2.b {
    @Override // z2.b
    public final boolean b(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.h != dVar) {
                    return false;
                }
                hVar.h = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z2.b
    public final boolean c(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f3066g != obj) {
                    return false;
                }
                hVar.f3066g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z2.b
    public final boolean d(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3067i != gVar) {
                    return false;
                }
                hVar.f3067i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z2.b
    public final void u(g gVar, g gVar2) {
        gVar.f3061b = gVar2;
    }

    @Override // z2.b
    public final void v(g gVar, Thread thread) {
        gVar.f3060a = thread;
    }
}
