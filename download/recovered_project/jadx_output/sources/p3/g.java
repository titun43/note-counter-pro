package p3;

/* loaded from: classes.dex */
public final class g extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3000g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r4.c f3002j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(r4.c cVar, w3.c cVar2, int i5) {
        super(2, cVar2);
        this.f3000g = i5;
        this.f3002j = cVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3000g) {
            case 0:
                g gVar = new g(this.f3002j, cVar, 0);
                gVar.f3001i = obj;
                return gVar;
            case 1:
                g gVar2 = new g(this.f3002j, cVar, 1);
                gVar2.f3001i = obj;
                return gVar2;
            default:
                g gVar3 = new g(this.f3002j, cVar, 2);
                gVar3.f3001i = obj;
                return gVar3;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3000g) {
            case 0:
                return ((g) create((String) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
            case 1:
                return ((g) create((String) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
            default:
                return ((g) create(obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
        }
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3000g) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                int i5 = this.h;
                if (i5 == 0) {
                    b3.g.x(obj);
                    String str = (String) this.f3001i;
                    this.h = 1;
                    if (this.f3002j.b(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return t3.h.f3400a;
            case 1:
                x3.a aVar2 = x3.a.f3712g;
                int i6 = this.h;
                if (i6 == 0) {
                    b3.g.x(obj);
                    String str2 = (String) this.f3001i;
                    this.h = 1;
                    if (this.f3002j.b(str2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return t3.h.f3400a;
            default:
                x3.a aVar3 = x3.a.f3712g;
                int i7 = this.h;
                if (i7 == 0) {
                    b3.g.x(obj);
                    Object obj2 = this.f3001i;
                    this.h = 1;
                    if (this.f3002j.b(obj2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return t3.h.f3400a;
        }
    }
}
