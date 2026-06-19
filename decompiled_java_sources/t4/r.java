package t4;

/* loaded from: classes.dex */
public class r extends o4.a implements y3.d {

    /* renamed from: j, reason: collision with root package name */
    public final y3.c f3440j;

    public r(w3.h hVar, y3.c cVar) {
        super(hVar, true);
        this.f3440j = cVar;
    }

    @Override // o4.z0
    public final boolean F() {
        return true;
    }

    @Override // y3.d
    public final y3.d getCallerFrame() {
        y3.c cVar = this.f3440j;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // o4.z0
    public void p(Object obj) {
        b.h(o4.w.k(obj), a.a.o(this.f3440j));
    }

    @Override // o4.z0
    public void q(Object obj) {
        this.f3440j.resumeWith(o4.w.k(obj));
    }

    public void V() {
    }
}
