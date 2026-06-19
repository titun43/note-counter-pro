package k0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w4.a f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g4.l f2389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4.n f2390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f2391d;

    public w(w4.a aVar, g4.l lVar, g4.n nVar, d0 d0Var) {
        this.f2388a = aVar;
        this.f2389b = lVar;
        this.f2390c = nVar;
        this.f2391d = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [w4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, y3.c cVar) {
        v vVar;
        int i5;
        d0 d0Var;
        w4.c cVar2;
        g4.l lVar;
        g4.n nVar;
        f4.p pVar;
        w4.a aVar;
        w4.a aVar2;
        d0 d0Var2;
        Object obj;
        g4.n nVar2;
        try {
            if (cVar instanceof v) {
                vVar = (v) cVar;
                int i6 = vVar.f2387n;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    vVar.f2387n = i6 - Integer.MIN_VALUE;
                    Object obj2 = vVar.f2385l;
                    x3.a aVar3 = x3.a.f3712g;
                    i5 = vVar.f2387n;
                    if (i5 != 0) {
                        b3.g.x(obj2);
                        vVar.f2381g = eVar;
                        w4.a aVar4 = this.f2388a;
                        vVar.h = aVar4;
                        g4.l lVar2 = this.f2389b;
                        vVar.f2382i = lVar2;
                        g4.n nVar3 = this.f2390c;
                        vVar.f2383j = nVar3;
                        d0Var = this.f2391d;
                        vVar.f2384k = d0Var;
                        vVar.f2387n = 1;
                        cVar2 = (w4.c) aVar4;
                        if (cVar2.c(vVar) != aVar3) {
                            lVar = lVar2;
                            nVar = nVar3;
                            pVar = eVar;
                        }
                        return aVar3;
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = vVar.f2382i;
                            nVar2 = (g4.n) vVar.h;
                            aVar = (w4.a) vVar.f2381g;
                            try {
                                b3.g.x(obj2);
                                nVar2.f1704g = obj;
                                nVar = nVar2;
                                Object obj3 = nVar.f1704g;
                                ((w4.c) aVar).d(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((w4.c) aVar).d(null);
                                throw th;
                            }
                        }
                        d0Var2 = (d0) vVar.f2382i;
                        nVar = (g4.n) vVar.h;
                        aVar2 = (w4.a) vVar.f2381g;
                        try {
                            b3.g.x(obj2);
                            if (!g4.i.a(obj2, nVar.f1704g)) {
                                aVar = aVar2;
                                Object obj32 = nVar.f1704g;
                                ((w4.c) aVar).d(null);
                                return obj32;
                            }
                            vVar.f2381g = aVar2;
                            vVar.h = nVar;
                            vVar.f2382i = obj2;
                            vVar.f2387n = 3;
                            if (d0Var2.j(obj2, vVar) != aVar3) {
                                obj = obj2;
                                nVar2 = nVar;
                                aVar = aVar2;
                                nVar2.f1704g = obj;
                                nVar = nVar2;
                                Object obj322 = nVar.f1704g;
                                ((w4.c) aVar).d(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((w4.c) aVar).d(null);
                            throw th;
                        }
                    }
                    d0 d0Var3 = vVar.f2384k;
                    nVar = vVar.f2383j;
                    lVar = (g4.l) vVar.f2382i;
                    ?? r7 = (w4.a) vVar.h;
                    f4.p pVar2 = (f4.p) vVar.f2381g;
                    b3.g.x(obj2);
                    d0Var = d0Var3;
                    pVar = pVar2;
                    cVar2 = r7;
                    if (!lVar.f1702g) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = nVar.f1704g;
                    vVar.f2381g = cVar2;
                    vVar.h = nVar;
                    vVar.f2382i = d0Var;
                    vVar.f2383j = null;
                    vVar.f2384k = null;
                    vVar.f2387n = 2;
                    Object invoke = pVar.invoke(obj4, vVar);
                    if (invoke != aVar3) {
                        aVar2 = cVar2;
                        obj2 = invoke;
                        d0Var2 = d0Var;
                        if (!g4.i.a(obj2, nVar.f1704g)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!lVar.f1702g) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((w4.c) aVar).d(null);
            throw th;
        }
        vVar = new v(this, cVar);
        Object obj22 = vVar.f2385l;
        x3.a aVar32 = x3.a.f3712g;
        i5 = vVar.f2387n;
        if (i5 != 0) {
        }
    }
}
