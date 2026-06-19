package k0;

import androidx.lifecycle.l0;
import com.google.android.gms.internal.ads.zzfzb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o4.g0;
import o4.o0;
import o4.r0;
import o4.w0;
import o4.z0;

/* loaded from: classes.dex */
public final class d0 implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final LinkedHashSet f2334i = new LinkedHashSet();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2335j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final f4.a f2336a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2337b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.f f2338c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2339d;

    /* renamed from: e, reason: collision with root package name */
    public final t3.f f2340e;

    /* renamed from: f, reason: collision with root package name */
    public final r4.s f2341f;

    /* renamed from: g, reason: collision with root package name */
    public List f2342g;
    public final r1.h h;

    public d0(f4.a aVar, zzfzb zzfzbVar, List list, t2.i iVar, o4.t tVar) {
        g4.i.e(zzfzbVar, "serializer");
        this.f2336a = aVar;
        this.f2337b = zzfzbVar;
        w3.c cVar = null;
        this.f2338c = new u1.f(new p(this, cVar, 1));
        this.f2339d = ".tmp";
        this.f2340e = new t3.f(new l0(this, 1));
        this.f2341f = new r4.s(f0.f2349a);
        this.f2342g = u3.g.a0(list);
        o oVar = new o(this);
        p pVar = new p(this, cVar, 0);
        r1.h hVar = new r1.h();
        hVar.f3161g = tVar;
        hVar.h = pVar;
        hVar.f3162i = q4.j.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null, 6);
        hVar.f3163j = new AtomicInteger(0);
        r0 r0Var = (r0) tVar.k().d(o4.s.h);
        if (r0Var != null) {
            r0Var.h(new j(0, oVar, hVar));
        }
        this.h = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [f4.p, y3.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [f4.p, y3.g] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d0 d0Var, l lVar, y3.c cVar) {
        t tVar;
        int i5;
        o4.l lVar2;
        d0 d0Var2;
        Object h;
        o4.k kVar;
        Throwable a5;
        e0 e0Var;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i6 = tVar.f2372l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tVar.f2372l = i6 - Integer.MIN_VALUE;
                Object obj = tVar.f2370j;
                x3.a aVar = x3.a.f3712g;
                i5 = tVar.f2372l;
                boolean z4 = true;
                if (i5 == 0) {
                    try {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                o4.l lVar3 = tVar.f2369i;
                                d0 d0Var3 = tVar.h;
                                l lVar4 = (l) tVar.f2368g;
                                b3.g.x(obj);
                                lVar2 = lVar3;
                                d0Var2 = d0Var3;
                                lVar = lVar4;
                            } else if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        o4.k kVar2 = (o4.k) tVar.f2368g;
                        b3.g.x(obj);
                        kVar = kVar2;
                    } catch (Throwable th) {
                        th = th;
                        obj = b3.g.g(th);
                        kVar = d0Var;
                        a5 = t3.e.a(obj);
                        o4.l lVar5 = (o4.l) kVar;
                        if (a5 != null) {
                        }
                        return t3.h.f3400a;
                    }
                    a5 = t3.e.a(obj);
                    o4.l lVar52 = (o4.l) kVar;
                    if (a5 != null) {
                        lVar52.G(obj);
                    } else {
                        lVar52.getClass();
                        lVar52.G(new o4.n(false, a5));
                    }
                    return t3.h.f3400a;
                }
                b3.g.x(obj);
                lVar2 = lVar.f2356b;
                try {
                    e0Var = (e0) d0Var.f2341f.a();
                } catch (Throwable th2) {
                    th = th2;
                    d0Var = lVar2;
                    obj = b3.g.g(th);
                    kVar = d0Var;
                    a5 = t3.e.a(obj);
                    o4.l lVar522 = (o4.l) kVar;
                    if (a5 != null) {
                    }
                    return t3.h.f3400a;
                }
                if (e0Var instanceof a) {
                    ?? r2 = lVar.f2355a;
                    w3.h hVar = lVar.f2358d;
                    tVar.f2368g = lVar2;
                    tVar.f2372l = 1;
                    h = d0Var.h(r2, hVar, tVar);
                    if (h == aVar) {
                    }
                    o4.l lVar6 = lVar2;
                    obj = h;
                    kVar = lVar6;
                    a5 = t3.e.a(obj);
                    o4.l lVar5222 = (o4.l) kVar;
                    if (a5 != null) {
                    }
                    return t3.h.f3400a;
                }
                if (!(e0Var instanceof h)) {
                    z4 = e0Var instanceof f0;
                }
                if (!z4) {
                    if (e0Var instanceof g) {
                        throw ((g) e0Var).f2350a;
                    }
                    throw new androidx.fragment.app.x();
                }
                if (e0Var != lVar.f2357c) {
                    throw ((h) e0Var).f2351a;
                }
                tVar.f2368g = lVar;
                tVar.h = d0Var;
                tVar.f2369i = lVar2;
                tVar.f2372l = 2;
                Object d5 = d0Var.d(tVar);
                d0Var2 = d0Var;
                if (d5 == aVar) {
                }
                return aVar;
                ?? r22 = lVar.f2355a;
                w3.h hVar2 = lVar.f2358d;
                tVar.f2368g = lVar2;
                tVar.h = null;
                tVar.f2369i = null;
                tVar.f2372l = 3;
                h = d0Var2.h(r22, hVar2, tVar);
            }
        }
        tVar = new t(d0Var, cVar);
        Object obj2 = tVar.f2370j;
        x3.a aVar2 = x3.a.f3712g;
        i5 = tVar.f2372l;
        boolean z42 = true;
        if (i5 == 0) {
        }
        ?? r222 = lVar.f2355a;
        w3.h hVar22 = lVar.f2358d;
        tVar.f2368g = lVar2;
        tVar.h = null;
        tVar.f2369i = null;
        tVar.f2372l = 3;
        h = d0Var2.h(r222, hVar22, tVar);
    }

    public final File b() {
        return (File) this.f2340e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y3.c cVar) {
        u uVar;
        int i5;
        w4.a cVar2;
        g4.n nVar;
        d0 d0Var;
        g4.n nVar2;
        List list;
        d0 d0Var2;
        g4.n nVar3;
        w wVar;
        Iterator it;
        w4.a aVar;
        g4.l lVar;
        g4.l lVar2;
        u uVar2;
        d0 d0Var3;
        w4.c cVar3;
        w4.a aVar2;
        g4.n nVar4;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i6 = uVar.f2380o;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                uVar.f2380o = i6 - Integer.MIN_VALUE;
                Object obj = uVar.f2378m;
                x3.a aVar3 = x3.a.f3712g;
                i5 = uVar.f2380o;
                if (i5 != 0) {
                    b3.g.x(obj);
                    r4.s sVar = this.f2341f;
                    if (!g4.i.a(sVar.a(), f0.f2349a) && !(sVar.a() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    cVar2 = new w4.c();
                    nVar = new g4.n();
                    uVar.f2373g = this;
                    uVar.h = cVar2;
                    uVar.f2374i = nVar;
                    uVar.f2375j = nVar;
                    uVar.f2380o = 1;
                    obj = g(uVar);
                    if (obj != aVar3) {
                        d0Var = this;
                        nVar2 = nVar;
                    }
                    return aVar3;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (w4.a) uVar.f2375j;
                        lVar2 = (g4.l) uVar.f2374i;
                        nVar4 = (g4.n) uVar.h;
                        d0Var3 = uVar.f2373g;
                        b3.g.x(obj);
                        try {
                            lVar2.f1702g = true;
                            ((w4.c) aVar2).d(null);
                            r4.s sVar2 = d0Var3.f2341f;
                            Object obj2 = nVar4.f1704g;
                            sVar2.c(new a(obj2, obj2 == null ? obj2.hashCode() : 0));
                            return t3.h.f3400a;
                        } catch (Throwable th) {
                            ((w4.c) aVar2).d(null);
                            throw th;
                        }
                    }
                    it = uVar.f2377l;
                    wVar = uVar.f2376k;
                    lVar = (g4.l) uVar.f2375j;
                    nVar3 = (g4.n) uVar.f2374i;
                    aVar = (w4.a) uVar.h;
                    d0Var2 = uVar.f2373g;
                    b3.g.x(obj);
                    while (it.hasNext()) {
                        f4.p pVar = (f4.p) it.next();
                        uVar.f2373g = d0Var2;
                        uVar.h = aVar;
                        uVar.f2374i = nVar3;
                        uVar.f2375j = lVar;
                        uVar.f2376k = wVar;
                        uVar.f2377l = it;
                        uVar.f2380o = 2;
                        if (pVar.invoke(wVar, uVar) == aVar3) {
                            break;
                        }
                    }
                    uVar2 = uVar;
                    lVar2 = lVar;
                    nVar2 = nVar3;
                    cVar2 = aVar;
                    d0Var3 = d0Var2;
                    d0Var3.f2342g = null;
                    uVar2.f2373g = d0Var3;
                    uVar2.h = nVar2;
                    uVar2.f2374i = lVar2;
                    uVar2.f2375j = cVar2;
                    uVar2.f2376k = null;
                    uVar2.f2377l = null;
                    uVar2.f2380o = 3;
                    cVar3 = (w4.c) cVar2;
                    if (cVar3.c(uVar2) != aVar3) {
                        aVar2 = cVar3;
                        nVar4 = nVar2;
                        lVar2.f1702g = true;
                        ((w4.c) aVar2).d(null);
                        r4.s sVar22 = d0Var3.f2341f;
                        Object obj22 = nVar4.f1704g;
                        sVar22.c(new a(obj22, obj22 == null ? obj22.hashCode() : 0));
                        return t3.h.f3400a;
                    }
                    return aVar3;
                }
                nVar = (g4.n) uVar.f2375j;
                nVar2 = (g4.n) uVar.f2374i;
                cVar2 = (w4.a) uVar.h;
                d0Var = uVar.f2373g;
                b3.g.x(obj);
                nVar.f1704g = obj;
                g4.l lVar3 = new g4.l();
                w wVar2 = new w(cVar2, lVar3, nVar2, d0Var);
                list = d0Var.f2342g;
                if (list != null) {
                    lVar2 = lVar3;
                    uVar2 = uVar;
                    d0Var3 = d0Var;
                    d0Var3.f2342g = null;
                    uVar2.f2373g = d0Var3;
                    uVar2.h = nVar2;
                    uVar2.f2374i = lVar2;
                    uVar2.f2375j = cVar2;
                    uVar2.f2376k = null;
                    uVar2.f2377l = null;
                    uVar2.f2380o = 3;
                    cVar3 = (w4.c) cVar2;
                    if (cVar3.c(uVar2) != aVar3) {
                    }
                    return aVar3;
                }
                d0Var2 = d0Var;
                nVar3 = nVar2;
                wVar = wVar2;
                it = list.iterator();
                aVar = cVar2;
                lVar = lVar3;
                while (it.hasNext()) {
                }
                uVar2 = uVar;
                lVar2 = lVar;
                nVar2 = nVar3;
                cVar2 = aVar;
                d0Var3 = d0Var2;
                d0Var3.f2342g = null;
                uVar2.f2373g = d0Var3;
                uVar2.h = nVar2;
                uVar2.f2374i = lVar2;
                uVar2.f2375j = cVar2;
                uVar2.f2376k = null;
                uVar2.f2377l = null;
                uVar2.f2380o = 3;
                cVar3 = (w4.c) cVar2;
                if (cVar3.c(uVar2) != aVar3) {
                }
                return aVar3;
            }
        }
        uVar = new u(this, cVar);
        Object obj3 = uVar.f2378m;
        x3.a aVar32 = x3.a.f3712g;
        i5 = uVar.f2380o;
        if (i5 != 0) {
        }
        nVar.f1704g = obj3;
        g4.l lVar32 = new g4.l();
        w wVar22 = new w(cVar2, lVar32, nVar2, d0Var);
        list = d0Var.f2342g;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(y3.c cVar) {
        x xVar;
        int i5;
        d0 d0Var;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i6 = xVar.f2394j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xVar.f2394j = i6 - Integer.MIN_VALUE;
                Object obj = xVar.h;
                x3.a aVar = x3.a.f3712g;
                i5 = xVar.f2394j;
                if (i5 != 0) {
                    b3.g.x(obj);
                    try {
                        xVar.f2392g = this;
                        xVar.f2394j = 1;
                        if (c(xVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d0Var = this;
                        d0Var.f2341f.c(new h(th));
                        throw th;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = xVar.f2392g;
                    try {
                        b3.g.x(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d0Var.f2341f.c(new h(th));
                        throw th;
                    }
                }
                return t3.h.f3400a;
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.h;
        x3.a aVar2 = x3.a.f3712g;
        i5 = xVar.f2394j;
        if (i5 != 0) {
        }
        return t3.h.f3400a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(y3.c cVar) {
        y yVar;
        int i5;
        d0 d0Var;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i6 = yVar.f2397j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                yVar.f2397j = i6 - Integer.MIN_VALUE;
                Object obj = yVar.h;
                x3.a aVar = x3.a.f3712g;
                i5 = yVar.f2397j;
                if (i5 != 0) {
                    b3.g.x(obj);
                    try {
                        yVar.f2395g = this;
                        yVar.f2397j = 1;
                        if (c(yVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d0Var = this;
                        d0Var.f2341f.c(new h(th));
                        return t3.h.f3400a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = yVar.f2395g;
                    try {
                        b3.g.x(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d0Var.f2341f.c(new h(th));
                        return t3.h.f3400a;
                    }
                }
                return t3.h.f3400a;
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.h;
        x3.a aVar2 = x3.a.f3712g;
        i5 = yVar.f2397j;
        if (i5 != 0) {
        }
        return t3.h.f3400a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [k0.d0] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k0.z, w3.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [k0.d0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [k0.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(y3.c cVar) {
        ?? r02;
        int i5;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            if (cVar instanceof z) {
                z zVar = (z) cVar;
                int i6 = zVar.f2401k;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zVar.f2401k = i6 - Integer.MIN_VALUE;
                    r02 = zVar;
                    Object obj = r02.f2399i;
                    x3.a aVar = x3.a.f3712g;
                    i5 = r02.f2401k;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(b());
                            try {
                                ?? r2 = this.f2337b;
                                r02.f2398g = this;
                                r02.h = fileInputStream2;
                                r02.f2401k = 1;
                                Object readFrom = r2.readFrom(fileInputStream2, r02);
                                if (readFrom == aVar) {
                                    return aVar;
                                }
                                fileInputStream = fileInputStream2;
                                obj = readFrom;
                            } catch (Throwable th2) {
                                fileInputStream = fileInputStream2;
                                th = th2;
                                r02 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e4) {
                            e = e4;
                            r02 = this;
                            if (r02.b().exists()) {
                                throw e;
                            }
                            return r02.f2337b.getDefaultValue();
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.h;
                        r02 = r02.f2398g;
                        try {
                            b3.g.x(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                a.a.g(fileInputStream, th);
                                throw th4;
                            }
                        }
                    }
                    a.a.g(fileInputStream, null);
                    return obj;
                }
            }
            if (i5 != 0) {
            }
            a.a.g(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e5) {
            e = e5;
        }
        r02 = new z(this, cVar);
        Object obj2 = r02.f2399i;
        x3.a aVar2 = x3.a.f3712g;
        i5 = r02.f2401k;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(y3.c cVar) {
        a0 a0Var;
        int i5;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i6 = a0Var.f2315k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                a0Var.f2315k = i6 - Integer.MIN_VALUE;
                Object obj = a0Var.f2313i;
                Object obj2 = x3.a.f3712g;
                i5 = a0Var.f2315k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    a0Var.f2312g = this;
                    a0Var.f2315k = 1;
                    Object f5 = f(a0Var);
                    if (f5 != obj2) {
                        return f5;
                    }
                } else {
                    if (i5 == 1) {
                        b3.g.x(obj);
                        return obj;
                    }
                    try {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj3 = a0Var.h;
                            if (a0Var.f2312g != null) {
                                throw new ClassCastException();
                            }
                            b3.g.x(obj);
                            return obj3;
                        }
                        if (a0Var.h != null) {
                            throw new ClassCastException();
                        }
                        d0 d0Var = a0Var.f2312g;
                        b3.g.x(obj);
                        a0Var.f2312g = null;
                        a0Var.h = obj;
                        a0Var.f2315k = 3;
                        if (d0Var.j(obj, a0Var) != obj2) {
                            return obj;
                        }
                    } catch (IOException e4) {
                        a.a.d(null, e4);
                        throw null;
                    }
                }
                return obj2;
            }
        }
        a0Var = new a0(this, cVar);
        Object obj4 = a0Var.f2313i;
        Object obj22 = x3.a.f3712g;
        i5 = a0Var.f2315k;
        if (i5 != 0) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(f4.p pVar, w3.h hVar, y3.c cVar) {
        b0 b0Var;
        int i5;
        a aVar;
        Object obj;
        d0 d0Var;
        Object obj2;
        Object obj3;
        d0 d0Var2;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i6 = b0Var.f2323l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                b0Var.f2323l = i6 - Integer.MIN_VALUE;
                Object obj4 = b0Var.f2321j;
                x3.a aVar2 = x3.a.f3712g;
                i5 = b0Var.f2323l;
                if (i5 != 0) {
                    b3.g.x(obj4);
                    a aVar3 = (a) this.f2341f.a();
                    Object obj5 = aVar3.f2310a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != aVar3.f2311b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = aVar3.f2310a;
                    b bVar = new b(pVar, obj6, (w3.c) null);
                    b0Var.f2319g = this;
                    b0Var.h = aVar3;
                    b0Var.f2320i = obj6;
                    b0Var.f2323l = 1;
                    Object p5 = o4.w.p(bVar, hVar, b0Var);
                    if (p5 != aVar2) {
                        aVar = aVar3;
                        obj4 = p5;
                        obj = obj6;
                        d0Var = this;
                    }
                    return aVar2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = b0Var.h;
                    d0Var2 = b0Var.f2319g;
                    b3.g.x(obj4);
                    d0Var2.f2341f.c(new a(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj = b0Var.f2320i;
                aVar = (a) b0Var.h;
                d0Var = b0Var.f2319g;
                b3.g.x(obj4);
                obj2 = aVar.f2310a;
                if ((obj2 == null ? obj2.hashCode() : 0) == aVar.f2311b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (g4.i.a(obj, obj4)) {
                    return obj;
                }
                b0Var.f2319g = d0Var;
                b0Var.h = obj4;
                b0Var.f2320i = null;
                b0Var.f2323l = 2;
                if (d0Var.j(obj4, b0Var) != aVar2) {
                    obj3 = obj4;
                    d0Var2 = d0Var;
                    d0Var2.f2341f.c(new a(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                return aVar2;
            }
        }
        b0Var = new b0(this, cVar);
        Object obj42 = b0Var.f2321j;
        x3.a aVar22 = x3.a.f3712g;
        i5 = b0Var.f2323l;
        if (i5 != 0) {
        }
        obj2 = aVar.f2310a;
        if ((obj2 == null ? obj2.hashCode() : 0) == aVar.f2311b) {
        }
    }

    public final Object i(f4.p pVar, y3.c cVar) {
        Object n5;
        o4.l lVar = new o4.l(true);
        lVar.D(null);
        this.h.q(new l(pVar, lVar, (e0) this.f2341f.a(), cVar.getContext()));
        while (true) {
            Object obj = z0.f2855g.get(lVar);
            if (obj instanceof o0) {
                if (lVar.O(obj) >= 0) {
                    w0 w0Var = new w0(a.a.o(cVar), lVar);
                    w0Var.r();
                    w0Var.t(new g0(o4.w.h(lVar, true, new o4.h(w0Var, 2))));
                    n5 = w0Var.q();
                    x3.a aVar = x3.a.f3712g;
                    break;
                }
            } else {
                if (obj instanceof o4.n) {
                    throw ((o4.n) obj).f2822a;
                }
                n5 = o4.w.n(obj);
            }
        }
        x3.a aVar2 = x3.a.f3712g;
        return n5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[Catch: IOException -> 0x00c4, TRY_ENTER, TryCatch #2 {IOException -> 0x00c4, blocks: (B:14:0x009d, B:19:0x00ad, B:20:0x00c3, B:27:0x00ca, B:28:0x00cd, B:44:0x0075, B:24:0x00c8), top: B:43:0x0075, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, y3.c cVar) {
        c0 c0Var;
        int i5;
        File file;
        FileOutputStream fileOutputStream;
        d0 d0Var;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i6 = c0Var.f2332m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0Var.f2332m = i6 - Integer.MIN_VALUE;
                Object obj2 = c0Var.f2330k;
                x3.a aVar = x3.a.f3712g;
                i5 = c0Var.f2332m;
                if (i5 != 0) {
                    b3.g.x(obj2);
                    File b2 = b();
                    File parentFile = b2.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException("Unable to create parent directories of " + b2);
                        }
                    }
                    file = new File(b().getAbsolutePath() + ((Object) this.f2339d));
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            i iVar = this.f2337b;
                            n nVar = new n(fileOutputStream3);
                            c0Var.f2327g = this;
                            c0Var.h = file;
                            c0Var.f2328i = fileOutputStream3;
                            c0Var.f2329j = fileOutputStream3;
                            c0Var.f2332m = 1;
                            if (iVar.writeTo(obj, nVar, c0Var) == aVar) {
                                return aVar;
                            }
                            d0Var = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (IOException e4) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = c0Var.f2329j;
                    fileOutputStream = c0Var.f2328i;
                    file = c0Var.h;
                    d0Var = c0Var.f2327g;
                    try {
                        b3.g.x(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            a.a.g(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                a.a.g(fileOutputStream, null);
                if (!file.renameTo(d0Var.b())) {
                    return t3.h.f3400a;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        c0Var = new c0(this, cVar);
        Object obj22 = c0Var.f2330k;
        x3.a aVar2 = x3.a.f3712g;
        i5 = c0Var.f2332m;
        if (i5 != 0) {
        }
        fileOutputStream2.getFD().sync();
        a.a.g(fileOutputStream, null);
        if (!file.renameTo(d0Var.b())) {
        }
    }
}
