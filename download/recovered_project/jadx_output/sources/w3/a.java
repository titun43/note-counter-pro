package w3;

import f4.p;
import o4.o;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: g, reason: collision with root package name */
    public final g f3628g;

    public a(g gVar) {
        this.f3628g = gVar;
    }

    @Override // w3.h
    public f d(g gVar) {
        g4.i.e(gVar, "key");
        if (g4.i.a(getKey(), gVar)) {
            return this;
        }
        return null;
    }

    @Override // w3.f
    public final g getKey() {
        return this.f3628g;
    }

    @Override // w3.h
    public /* bridge */ h i(g gVar) {
        return z2.b.r(this, gVar);
    }

    @Override // w3.h
    public final Object j(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // w3.h
    public final h l(h hVar) {
        g4.i.e(hVar, "context");
        return hVar == i.f3631g ? this : (h) hVar.j(this, new o(8));
    }
}
