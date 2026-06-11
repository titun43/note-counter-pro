package r4;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import o4.r0;
import o4.w;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3268a = new androidx.emoji2.text.r("NONE", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3269b = new androidx.emoji2.text.r("PENDING", 2);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, f4.q qVar, Throwable th, y3.c cVar) {
        f fVar;
        int i5;
        try {
            if (cVar instanceof f) {
                fVar = (f) cVar;
                int i6 = fVar.f3228i;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    fVar.f3228i = i6 - Integer.MIN_VALUE;
                    Object obj = fVar.h;
                    Object obj2 = x3.a.f3712g;
                    i5 = fVar.f3228i;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        fVar.f3227g = th;
                        fVar.f3228i = 1;
                        if (qVar.invoke(vVar, th, fVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = fVar.f3227g;
                        b3.g.x(obj);
                    }
                    return t3.h.f3400a;
                }
            }
            if (i5 != 0) {
            }
            return t3.h.f3400a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                a.a.d(th2, th);
            }
            throw th2;
        }
        fVar = new f(cVar);
        Object obj3 = fVar.h;
        Object obj22 = x3.a.f3712g;
        i5 = fVar.f3228i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(b bVar, c cVar, y3.c cVar2) {
        j jVar;
        int i5;
        g4.n nVar;
        Throwable th;
        r0 r0Var;
        CancellationException g5;
        if (cVar2 instanceof j) {
            jVar = (j) cVar2;
            int i6 = jVar.f3239i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jVar.f3239i = i6 - Integer.MIN_VALUE;
                Object obj = jVar.h;
                x3.a aVar = x3.a.f3712g;
                i5 = jVar.f3239i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    g4.n nVar2 = new g4.n();
                    try {
                        c lVar = new l(cVar, nVar2, 0);
                        jVar.f3238g = nVar2;
                        jVar.f3239i = 1;
                        if (bVar.j(lVar, jVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = nVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = jVar.f3238g;
                    try {
                        b3.g.x(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) nVar.f1704g;
                if ((th == null && th.equals(th)) || ((r0Var = (r0) jVar.getContext().d(o4.s.h)) != null && r0Var.isCancelled() && (g5 = r0Var.g()) != null && g5.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    a.a.d(th, th);
                    throw th;
                }
                a.a.d(th, th);
                throw th;
            }
        }
        jVar = new j(cVar2);
        Object obj2 = jVar.h;
        x3.a aVar2 = x3.a.f3712g;
        i5 = jVar.f3239i;
        if (i5 != 0) {
        }
        th = (Throwable) nVar.f1704g;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.b(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [q4.p] */
    /* JADX WARN: Type inference failed for: r9v6, types: [q4.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, q4.n nVar, boolean z4, y3.c cVar2) {
        d dVar;
        int i5;
        q4.b bVar;
        q4.n nVar2;
        q4.b bVar2;
        c cVar3;
        q4.n nVar3;
        try {
            if (cVar2 instanceof d) {
                dVar = (d) cVar2;
                int i6 = dVar.f3224l;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    dVar.f3224l = i6 - Integer.MIN_VALUE;
                    Object obj = dVar.f3223k;
                    x3.a aVar = x3.a.f3712g;
                    i5 = dVar.f3224l;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        if (cVar instanceof v) {
                            throw ((v) cVar).f3271g;
                        }
                        q4.c cVar4 = nVar.f3139j;
                        cVar4.getClass();
                        bVar = new q4.b(cVar4);
                        nVar3 = nVar;
                        dVar.f3220g = cVar;
                        dVar.h = nVar3;
                        dVar.f3221i = bVar;
                        dVar.f3222j = z4;
                        dVar.f3224l = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                        }
                    } else if (i5 == 1) {
                        z4 = dVar.f3222j;
                        bVar2 = dVar.f3221i;
                        ?? r9 = dVar.h;
                        cVar3 = dVar.f3220g;
                        b3.g.x(obj);
                        nVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = dVar.f3222j;
                        bVar2 = dVar.f3221i;
                        ?? r92 = dVar.h;
                        cVar3 = dVar.f3220g;
                        b3.g.x(obj);
                        q4.n nVar4 = r92;
                        c cVar5 = cVar3;
                        bVar = bVar2;
                        cVar = cVar5;
                        nVar3 = nVar4;
                        dVar.f3220g = cVar;
                        dVar.h = nVar3;
                        dVar.f3221i = bVar;
                        dVar.f3222j = z4;
                        dVar.f3224l = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        q4.b bVar3 = bVar;
                        cVar3 = cVar;
                        bVar2 = bVar3;
                        nVar2 = nVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z4) {
                                nVar2.b(null);
                            }
                            return t3.h.f3400a;
                        }
                        Object obj2 = bVar2.f3101g;
                        androidx.emoji2.text.r rVar = q4.e.f3127p;
                        if (obj2 == rVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f3101g = rVar;
                        if (obj2 == q4.e.f3123l) {
                            Throwable o2 = bVar2.f3102i.o();
                            int i7 = t4.t.f3443a;
                            throw o2;
                        }
                        dVar.f3220g = cVar3;
                        dVar.h = nVar2;
                        dVar.f3221i = bVar2;
                        dVar.f3222j = z4;
                        dVar.f3224l = 2;
                        nVar4 = nVar2;
                    }
                }
            }
            if (i5 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z4) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    nVar.b(cancellationException);
                }
                throw th2;
            }
        }
        dVar = new d(cVar2);
        Object obj3 = dVar.f3223k;
        x3.a aVar2 = x3.a.f3712g;
        i5 = dVar.f3224l;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, y3.c cVar) {
        o oVar;
        int i5;
        g4.n nVar;
        s4.a e4;
        k0.s sVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i6 = oVar.f3254j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                oVar.f3254j = i6 - Integer.MIN_VALUE;
                Object obj = oVar.f3253i;
                Object obj2 = x3.a.f3712g;
                i5 = oVar.f3254j;
                if (i5 != 0) {
                    b3.g.x(obj);
                    g4.n nVar2 = new g4.n();
                    k0.s sVar2 = new k0.s(nVar2, 1);
                    try {
                        oVar.f3252g = nVar2;
                        oVar.h = sVar2;
                        oVar.f3254j = 1;
                        if (bVar.j(sVar2, oVar) == obj2) {
                            return obj2;
                        }
                        nVar = nVar2;
                    } catch (s4.a e5) {
                        nVar = nVar2;
                        e4 = e5;
                        sVar = sVar2;
                        if (e4.f3302g == sVar) {
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = oVar.h;
                    nVar = oVar.f3252g;
                    try {
                        b3.g.x(obj);
                    } catch (s4.a e6) {
                        e4 = e6;
                        if (e4.f3302g == sVar) {
                            throw e4;
                        }
                        w.c(oVar.getContext());
                        return nVar.f1704g;
                    }
                }
                return nVar.f1704g;
            }
        }
        oVar = new o(cVar);
        Object obj3 = oVar.f3253i;
        Object obj22 = x3.a.f3712g;
        i5 = oVar.f3254j;
        if (i5 != 0) {
        }
        return nVar.f1704g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b e(u1.f fVar, w3.h hVar) {
        if (hVar.d(o4.s.h) == null) {
            return hVar.equals(w3.i.f3631g) ? fVar : fVar instanceof s4.f ? ((s4.f) fVar).d(hVar, q4.a.f3098g) : new s4.d(fVar, hVar, -3, q4.a.f3098g);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + hVar).toString());
    }
}
