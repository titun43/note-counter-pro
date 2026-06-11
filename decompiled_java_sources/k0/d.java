package k0;

/* loaded from: classes.dex */
public final class d extends y3.g implements f4.l {

    /* renamed from: g, reason: collision with root package name */
    public int f2333g;

    @Override // f4.l
    public final Object a(Object obj) {
        d dVar = (d) create((w3.c) obj);
        t3.h hVar = t3.h.f3400a;
        dVar.invokeSuspend(hVar);
        return hVar;
    }

    @Override // y3.a
    public final w3.c create(w3.c cVar) {
        return new d(1, cVar);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        int i5 = this.f2333g;
        if (i5 == 0) {
            b3.g.x(obj);
            this.f2333g = 1;
            throw null;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b3.g.x(obj);
        return t3.h.f3400a;
    }
}
