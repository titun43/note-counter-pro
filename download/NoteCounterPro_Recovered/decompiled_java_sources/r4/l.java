package r4;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3243g;
    public final /* synthetic */ c h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3244i;

    public /* synthetic */ l(c cVar, Object obj, int i5) {
        this.f3243g = i5;
        this.h = cVar;
        this.f3244i = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    @Override // r4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, w3.c cVar) {
        k kVar;
        int i5;
        l lVar;
        p pVar;
        x3.a aVar;
        int i6;
        Object obj2;
        c cVar2;
        switch (this.f3243g) {
            case 0:
                if (cVar instanceof k) {
                    kVar = (k) cVar;
                    int i7 = kVar.f3242j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kVar.f3242j = i7 - Integer.MIN_VALUE;
                        Object obj3 = kVar.h;
                        x3.a aVar2 = x3.a.f3712g;
                        i5 = kVar.f3242j;
                        if (i5 != 0) {
                            b3.g.x(obj3);
                            try {
                                c cVar3 = this.h;
                                kVar.f3240g = this;
                                kVar.f3242j = 1;
                                if (cVar3.b(obj, kVar) == aVar2) {
                                    return aVar2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                lVar = this;
                                ((g4.n) lVar.f3244i).f1704g = th;
                                throw th;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar = kVar.f3240g;
                            try {
                                b3.g.x(obj3);
                            } catch (Throwable th2) {
                                th = th2;
                                ((g4.n) lVar.f3244i).f1704g = th;
                                throw th;
                            }
                        }
                        return t3.h.f3400a;
                    }
                }
                kVar = new k(this, cVar);
                Object obj32 = kVar.h;
                x3.a aVar22 = x3.a.f3712g;
                i5 = kVar.f3242j;
                if (i5 != 0) {
                }
                return t3.h.f3400a;
            default:
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i8 = pVar.h;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        pVar.h = i8 - Integer.MIN_VALUE;
                        Object obj4 = pVar.f3255g;
                        aVar = x3.a.f3712g;
                        i6 = pVar.h;
                        if (i6 != 0) {
                            b3.g.x(obj4);
                            f4.p pVar2 = (f4.p) this.f3244i;
                            pVar.f3257j = obj;
                            c cVar4 = this.h;
                            pVar.f3258k = cVar4;
                            pVar.h = 1;
                            if (pVar2.invoke(obj, pVar) == aVar) {
                                return aVar;
                            }
                            obj2 = obj;
                            cVar2 = cVar4;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b3.g.x(obj4);
                                return t3.h.f3400a;
                            }
                            cVar2 = pVar.f3258k;
                            obj2 = pVar.f3257j;
                            b3.g.x(obj4);
                        }
                        pVar.f3257j = null;
                        pVar.f3258k = null;
                        pVar.h = 2;
                        if (cVar2.b(obj2, pVar) == aVar) {
                            return aVar;
                        }
                        return t3.h.f3400a;
                    }
                }
                pVar = new p(this, cVar);
                Object obj42 = pVar.f3255g;
                aVar = x3.a.f3712g;
                i6 = pVar.h;
                if (i6 != 0) {
                }
                pVar.f3257j = null;
                pVar.f3258k = null;
                pVar.h = 2;
                if (cVar2.b(obj2, pVar) == aVar) {
                }
                return t3.h.f3400a;
        }
    }
}
