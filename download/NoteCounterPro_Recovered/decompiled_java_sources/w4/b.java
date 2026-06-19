package w4;

import androidx.emoji2.text.r;
import f4.q;
import o4.k1;
import t4.s;

/* loaded from: classes.dex */
public final class b implements o4.d, k1 {

    /* renamed from: g, reason: collision with root package name */
    public final o4.f f3632g;
    public final /* synthetic */ c h;

    public b(c cVar, o4.f fVar) {
        this.h = cVar;
        this.f3632g = fVar;
    }

    @Override // o4.k1
    public final void a(s sVar, int i5) {
        this.f3632g.a(sVar, i5);
    }

    @Override // o4.d
    public final r f(Object obj, q qVar) {
        c cVar = this.h;
        o4.e eVar = new o4.e(cVar, this);
        r f5 = this.f3632g.f((t3.h) obj, eVar);
        if (f5 != null) {
            c.f3633g.set(cVar, null);
        }
        return f5;
    }

    @Override // w3.c
    public final w3.h getContext() {
        return this.f3632g.f2798k;
    }

    @Override // o4.d
    public final void o(Object obj) {
        this.f3632g.o(obj);
    }

    @Override // w3.c
    public final void resumeWith(Object obj) {
        this.f3632g.resumeWith(obj);
    }
}
