package r4;

/* loaded from: classes.dex */
public final class e extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3225g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, w3.c cVar, int i5) {
        super(2, cVar);
        this.f3225g = i5;
        this.f3226i = obj;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3225g) {
            case 0:
                return new e((androidx.emoji2.text.p) this.f3226i, cVar, 0);
            default:
                return new e((u0.a) this.f3226i, cVar, 1);
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        o4.t tVar = (o4.t) obj;
        w3.c cVar = (w3.c) obj2;
        switch (this.f3225g) {
        }
        return ((e) create(tVar, cVar)).invokeSuspend(t3.h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3225g) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                int i5 = this.h;
                t3.h hVar = t3.h.f3400a;
                if (i5 == 0) {
                    b3.g.x(obj);
                    androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.f3226i;
                    this.h = 1;
                    Object j2 = pVar.j(s4.h.f3313g, this);
                    if (j2 != aVar) {
                        j2 = hVar;
                    }
                    if (j2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return hVar;
            default:
                x3.a aVar2 = x3.a.f3712g;
                int i6 = this.h;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return obj;
                }
                b3.g.x(obj);
                w0.b bVar = ((u0.a) this.f3226i).f3493a;
                this.h = 1;
                Object b2 = bVar.b(this);
                return b2 == aVar2 ? aVar2 : b2;
        }
    }
}
