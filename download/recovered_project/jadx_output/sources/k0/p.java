package k0;

/* loaded from: classes.dex */
public final class p extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2360g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2361i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f2362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(d0 d0Var, w3.c cVar, int i5) {
        super(2, cVar);
        this.f2360g = i5;
        this.f2362j = d0Var;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2360g) {
            case 0:
                p pVar = new p(this.f2362j, cVar, 0);
                pVar.f2361i = obj;
                return pVar;
            default:
                p pVar2 = new p(this.f2362j, cVar, 1);
                pVar2.f2361i = obj;
                return pVar2;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2360g) {
            case 0:
                return ((p) create((m) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
            default:
                return ((p) create((r4.c) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if (r7 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r7 == r0) goto L47;
     */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.f2360g) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                int i5 = this.h;
                t3.h hVar = t3.h.f3400a;
                if (i5 == 0) {
                    b3.g.x(obj);
                    m mVar = (m) this.f2361i;
                    boolean z4 = mVar instanceof k;
                    d0 d0Var = this.f2362j;
                    if (z4) {
                        k kVar = (k) mVar;
                        this.h = 1;
                        e0 e0Var = (e0) d0Var.f2341f.a();
                        if (!(e0Var instanceof a)) {
                            if (e0Var instanceof h) {
                                if (e0Var == kVar.f2354a) {
                                    obj2 = d0Var.e(this);
                                    break;
                                }
                            } else if (g4.i.a(e0Var, f0.f2349a)) {
                                obj2 = d0Var.e(this);
                                break;
                            } else if (e0Var instanceof g) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                        }
                        obj2 = hVar;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else if (mVar instanceof l) {
                        this.h = 2;
                        if (d0.a(d0Var, (l) mVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return hVar;
            default:
                d0 d0Var2 = this.f2362j;
                r4.s sVar = d0Var2.f2341f;
                x3.a aVar2 = x3.a.f3712g;
                int i6 = this.h;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return t3.h.f3400a;
                }
                b3.g.x(obj);
                r4.c cVar = (r4.c) this.f2361i;
                e0 e0Var2 = (e0) sVar.a();
                if (!(e0Var2 instanceof a)) {
                    d0Var2.h.q(new k(e0Var2));
                }
                q qVar = new q(e0Var2, null);
                this.h = 1;
                if (cVar instanceof r4.v) {
                    throw ((r4.v) cVar).f3271g;
                }
                sVar.j(new r4.n(new g4.l(), new s(cVar, 0), qVar), this);
                return aVar2;
        }
    }
}
