package r4;

/* loaded from: classes.dex */
public final class n implements c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3249g = 0;
    public final Object h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3250i;

    /* renamed from: j, reason: collision with root package name */
    public final y3.g f3251j;

    public n(g4.l lVar, c cVar, k0.q qVar) {
        this.h = lVar;
        this.f3250i = cVar;
        this.f3251j = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // r4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, w3.c cVar) {
        m mVar;
        int i5;
        n nVar;
        switch (this.f3249g) {
            case 0:
                if (cVar instanceof m) {
                    mVar = (m) cVar;
                    int i6 = mVar.f3248k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        mVar.f3248k = i6 - Integer.MIN_VALUE;
                        Object obj2 = mVar.f3246i;
                        x3.a aVar = x3.a.f3712g;
                        i5 = mVar.f3248k;
                        t3.h hVar = t3.h.f3400a;
                        if (i5 != 0) {
                            b3.g.x(obj2);
                            if (((g4.l) this.h).f1702g) {
                                c cVar2 = (c) this.f3250i;
                                mVar.f3248k = 1;
                                if (cVar2.b(obj, mVar) == aVar) {
                                    return aVar;
                                }
                                return hVar;
                            }
                            k0.q qVar = (k0.q) this.f3251j;
                            mVar.f3245g = this;
                            mVar.h = obj;
                            mVar.f3248k = 2;
                            obj2 = qVar.invoke(obj, mVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            nVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return hVar;
                        }
                        if (i5 != 1) {
                            if (i5 == 2) {
                                obj = mVar.h;
                                nVar = mVar.f3245g;
                                b3.g.x(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((g4.l) nVar.h).f1702g = true;
                                    c cVar3 = (c) nVar.f3250i;
                                    mVar.f3245g = null;
                                    mVar.h = null;
                                    mVar.f3248k = 3;
                                    if (cVar3.b(obj, mVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return hVar;
                            }
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        b3.g.x(obj2);
                        return hVar;
                    }
                }
                mVar = new m(this, cVar);
                Object obj22 = mVar.f3246i;
                x3.a aVar2 = x3.a.f3712g;
                i5 = mVar.f3248k;
                t3.h hVar2 = t3.h.f3400a;
                if (i5 != 0) {
                }
            default:
                Object a5 = s4.i.a((w3.h) this.h, obj, this.f3250i, (p3.g) this.f3251j, cVar);
                return a5 == x3.a.f3712g ? a5 : t3.h.f3400a;
        }
    }

    public n(c cVar, w3.h hVar) {
        this.h = hVar;
        this.f3250i = t4.b.l(hVar);
        this.f3251j = new p3.g(cVar, null, 2);
    }
}
