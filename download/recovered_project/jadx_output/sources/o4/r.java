package o4;

/* loaded from: classes.dex */
public abstract class r extends w3.a implements w3.e {
    public static final q h = new q(w3.d.f3630g, new p());

    public r() {
        super(w3.d.f3630g);
    }

    @Override // w3.a, w3.h
    public final w3.f d(w3.g gVar) {
        w3.f fVar;
        g4.i.e(gVar, "key");
        if (gVar instanceof q) {
            q qVar = (q) gVar;
            w3.g gVar2 = this.f3628g;
            if ((gVar2 == qVar || qVar.h == gVar2) && (fVar = (w3.f) qVar.f2826g.a(this)) != null) {
                return fVar;
            }
        } else if (w3.d.f3630g == gVar) {
            return this;
        }
        return null;
    }

    public abstract void f(w3.h hVar, Runnable runnable);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((w3.f) r3.f2826g.a(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return w3.i.f3631g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (w3.d.f3630g == r3) goto L15;
     */
    @Override // w3.a, w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w3.h i(w3.g gVar) {
        g4.i.e(gVar, "key");
        if (gVar instanceof q) {
            q qVar = (q) gVar;
            w3.g gVar2 = this.f3628g;
            if (gVar2 != qVar && qVar.h != gVar2) {
                return this;
            }
        }
    }

    public boolean k(w3.h hVar) {
        return !(this instanceof h1);
    }

    public r m(int i5) {
        t4.b.a(i5);
        return new t4.h(this, i5);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + w.e(this);
    }
}
