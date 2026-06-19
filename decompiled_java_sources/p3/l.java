package p3;

/* loaded from: classes.dex */
public final class l extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3012g;
    public final /* synthetic */ String h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r3.a f3013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, r3.a aVar, w3.c cVar, int i5) {
        super(2, cVar);
        this.f3012g = i5;
        this.h = str;
        this.f3013i = aVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3012g) {
            case 0:
                return new l(this.h, this.f3013i, cVar, 0);
            default:
                return new l(this.h, this.f3013i, cVar, 1);
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        o4.t tVar = (o4.t) obj;
        w3.c cVar = (w3.c) obj2;
        switch (this.f3012g) {
        }
        return ((l) create(tVar, cVar)).invokeSuspend(t3.h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3012g;
        r3.a aVar = this.f3013i;
        String str = this.h;
        switch (i5) {
            case 0:
                x3.a aVar2 = x3.a.f3712g;
                b3.g.x(obj);
                return new t3.e(b3.g.f(str, aVar, true));
            default:
                x3.a aVar3 = x3.a.f3712g;
                b3.g.x(obj);
                return new t3.e(b3.g.f(str, aVar, false));
        }
    }
}
