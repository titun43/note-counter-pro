package s4;

/* loaded from: classes.dex */
public final class n implements w3.c, y3.d {

    /* renamed from: g, reason: collision with root package name */
    public final w3.c f3322g;
    public final w3.h h;

    public n(w3.c cVar, w3.h hVar) {
        this.f3322g = cVar;
        this.h = hVar;
    }

    @Override // y3.d
    public final y3.d getCallerFrame() {
        w3.c cVar = this.f3322g;
        if (cVar instanceof y3.d) {
            return (y3.d) cVar;
        }
        return null;
    }

    @Override // w3.c
    public final w3.h getContext() {
        return this.h;
    }

    @Override // w3.c
    public final void resumeWith(Object obj) {
        this.f3322g.resumeWith(obj);
    }
}
