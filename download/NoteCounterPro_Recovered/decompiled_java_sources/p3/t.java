package p3;

/* loaded from: classes.dex */
public final class t extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f3028g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, w3.c cVar) {
        super(2, cVar);
        this.f3028g = str;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        return new t(this.f3028g, cVar);
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((o4.t) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        b3.g.x(obj);
        return new t3.e(b3.g.o(this.f3028g, new r3.b(false)));
    }
}
