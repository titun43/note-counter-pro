package k0;

/* loaded from: classes.dex */
public final class q extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2363g = 1;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2364i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, r3.b bVar, w3.c cVar) {
        super(2, cVar);
        this.h = str;
        this.f2364i = bVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2363g) {
            case 0:
                q qVar = new q((e0) this.f2364i, cVar);
                qVar.h = obj;
                return qVar;
            default:
                return new q((String) this.h, (r3.b) this.f2364i, cVar);
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2363g) {
            case 0:
                return ((q) create((e0) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
            default:
                return ((q) create((o4.t) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
        }
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f2363g;
        Object obj2 = this.f2364i;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                b3.g.x(obj);
                e0 e0Var = (e0) this.h;
                e0 e0Var2 = (e0) obj2;
                boolean z4 = false;
                if (!(e0Var2 instanceof a) && !(e0Var2 instanceof g) && e0Var == e0Var2) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            default:
                x3.a aVar2 = x3.a.f3712g;
                b3.g.x(obj);
                return new t3.e(b3.g.o((String) this.h, (r3.b) obj2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 e0Var, w3.c cVar) {
        super(2, cVar);
        this.f2364i = e0Var;
    }
}
