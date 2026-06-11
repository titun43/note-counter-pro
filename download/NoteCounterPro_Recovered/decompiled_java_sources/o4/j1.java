package o4;

/* loaded from: classes.dex */
public final class j1 implements w3.f, w3.g {

    /* renamed from: g, reason: collision with root package name */
    public static final j1 f2811g = new j1();

    @Override // w3.h
    public final w3.f d(w3.g gVar) {
        g4.i.e(gVar, "key");
        if (g4.i.a(this, gVar)) {
            return this;
        }
        return null;
    }

    @Override // w3.h
    public final w3.h i(w3.g gVar) {
        return z2.b.r(this, gVar);
    }

    @Override // w3.h
    public final Object j(Object obj, f4.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // w3.h
    public final w3.h l(w3.h hVar) {
        g4.i.e(hVar, "context");
        return hVar == w3.i.f3631g ? this : (w3.h) hVar.j(this, new o(8));
    }

    @Override // w3.f
    public final w3.g getKey() {
        return this;
    }
}
