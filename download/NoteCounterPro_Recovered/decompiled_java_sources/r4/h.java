package r4;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.p f3233g;
    public final /* synthetic */ f4.q h;

    public h(androidx.emoji2.text.p pVar, f4.q qVar) {
        this.f3233g = pVar;
        this.h = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // r4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(c cVar, w3.c cVar2) {
        g gVar;
        x3.a aVar;
        int i5;
        h hVar;
        v vVar;
        f4.q qVar;
        s4.j jVar;
        Throwable th;
        s4.j jVar2;
        f4.q qVar2;
        try {
            if (cVar2 instanceof g) {
                gVar = (g) cVar2;
                int i6 = gVar.h;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    gVar.h = i6 - Integer.MIN_VALUE;
                    Object obj = gVar.f3229g;
                    aVar = x3.a.f3712g;
                    i5 = gVar.h;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        try {
                            androidx.emoji2.text.p pVar = this.f3233g;
                            gVar.f3231j = this;
                            gVar.f3232k = cVar;
                            gVar.h = 1;
                            if (pVar.j(cVar, gVar) != aVar) {
                                hVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            hVar = this;
                            vVar = new v(th);
                            qVar = hVar.h;
                            gVar.f3231j = th;
                            gVar.f3232k = null;
                            gVar.h = 2;
                            if (t.a(vVar, qVar, th, gVar) != aVar) {
                            }
                        }
                        return aVar;
                    }
                    if (i5 != 1) {
                        if (i5 == 2) {
                            Throwable th3 = (Throwable) gVar.f3231j;
                            b3.g.x(obj);
                            throw th3;
                        }
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar2 = (s4.j) gVar.f3231j;
                        try {
                            b3.g.x(obj);
                            jVar2.releaseIntercepted();
                            return t3.h.f3400a;
                        } catch (Throwable th4) {
                            th = th4;
                            jVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    cVar = gVar.f3232k;
                    hVar = (h) gVar.f3231j;
                    try {
                        b3.g.x(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        vVar = new v(th);
                        qVar = hVar.h;
                        gVar.f3231j = th;
                        gVar.f3232k = null;
                        gVar.h = 2;
                        if (t.a(vVar, qVar, th, gVar) != aVar) {
                            return aVar;
                        }
                        throw th;
                    }
                    jVar = new s4.j(cVar, gVar.getContext());
                    qVar2 = hVar.h;
                    gVar.f3231j = jVar;
                    gVar.f3232k = null;
                    gVar.h = 3;
                    if (qVar2.invoke(jVar, null, gVar) != aVar) {
                        jVar2 = jVar;
                        jVar2.releaseIntercepted();
                        return t3.h.f3400a;
                    }
                    return aVar;
                }
            }
            qVar2 = hVar.h;
            gVar.f3231j = jVar;
            gVar.f3232k = null;
            gVar.h = 3;
            if (qVar2.invoke(jVar, null, gVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            jVar2 = jVar;
            jVar2.releaseIntercepted();
            throw th;
        }
        gVar = new g(this, (y3.c) cVar2);
        Object obj2 = gVar.f3229g;
        aVar = x3.a.f3712g;
        i5 = gVar.h;
        if (i5 != 0) {
        }
        jVar = new s4.j(cVar, gVar.getContext());
    }
}
