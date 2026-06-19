package o4;

/* loaded from: classes.dex */
public final class w0 extends f {

    /* renamed from: o, reason: collision with root package name */
    public final l f2843o;

    public w0(w3.c cVar, l lVar) {
        super(1, cVar);
        this.f2843o = lVar;
    }

    @Override // o4.f
    public final Throwable p(z0 z0Var) {
        Throwable d5;
        l lVar = this.f2843o;
        lVar.getClass();
        Object obj = z0.f2855g.get(lVar);
        return (!(obj instanceof y0) || (d5 = ((y0) obj).d()) == null) ? obj instanceof n ? ((n) obj).f2822a : z0Var.g() : d5;
    }

    @Override // o4.f
    public final String w() {
        return "AwaitContinuation";
    }
}
