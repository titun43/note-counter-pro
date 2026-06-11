package s4;

import f4.p;
import q4.o;

/* loaded from: classes.dex */
public final class c extends y3.g implements p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3305g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3306i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f3307j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, w3.c cVar, int i5) {
        super(2, cVar);
        this.f3305g = i5;
        this.f3307j = dVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3305g) {
            case 0:
                c cVar2 = new c(this.f3307j, cVar, 0);
                cVar2.f3306i = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.f3307j, cVar, 1);
                cVar3.f3306i = obj;
                return cVar3;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3305g) {
            case 0:
                return ((c) create((o) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
            default:
                return ((c) create((r4.c) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
        }
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3305g) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                int i5 = this.h;
                t3.h hVar = t3.h.f3400a;
                if (i5 == 0) {
                    b3.g.x(obj);
                    o oVar = (o) this.f3306i;
                    this.h = 1;
                    Object j2 = this.f3307j.f3310j.j(new m(oVar), this);
                    if (j2 != aVar) {
                        j2 = hVar;
                    }
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
                t3.h hVar2 = t3.h.f3400a;
                if (i6 == 0) {
                    b3.g.x(obj);
                    r4.c cVar = (r4.c) this.f3306i;
                    this.h = 1;
                    Object j5 = this.f3307j.f3310j.j(cVar, this);
                    if (j5 != aVar2) {
                        j5 = hVar2;
                    }
                    if (j5 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return hVar2;
        }
    }
}
