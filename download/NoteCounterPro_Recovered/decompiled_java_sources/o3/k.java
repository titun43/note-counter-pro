package o3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.x;
import r3.a0;
import r3.c0;
import r3.d0;
import r3.e0;
import r3.f0;
import r3.g0;
import r3.h0;
import r3.p;
import r3.q;
import r3.r;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final r1.h f2781a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.i f2782b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.i f2783c;

    /* renamed from: d, reason: collision with root package name */
    public final k1.j f2784d;

    public k(Context context) {
        r1.h hVar = new r1.h();
        hVar.f3161g = context.getCacheDir();
        hVar.h = context.getFilesDir();
        hVar.f3162i = context.getExternalCacheDir();
        hVar.f3163j = context.getExternalFilesDir(null);
        t2.i iVar = new t2.i(26);
        t2.i iVar2 = new t2.i(25);
        ContentResolver contentResolver = context.getContentResolver();
        g4.i.d(contentResolver, "getContentResolver(...)");
        k1.j jVar = new k1.j(contentResolver, 19);
        this.f2781a = hVar;
        this.f2782b = iVar;
        this.f2783c = iVar2;
        this.f2784d = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0131, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b3.g gVar, b3.g gVar2, y3.c cVar) {
        a aVar;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        b3.g gVar3;
        k kVar2;
        Object r5;
        f0 f0Var2;
        Throwable a5;
        f0 f0Var3;
        f0 f0Var4;
        boolean z4;
        Object s5;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i6 = aVar.f2747k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f2747k = i6 - Integer.MIN_VALUE;
                Object obj = aVar.f2745i;
                x3.a aVar2 = x3.a.f3712g;
                i5 = aVar.f2747k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        aVar.f2744g = this;
                        aVar.h = gVar2;
                        aVar.f2747k = 1;
                        r2 = this.f2781a.r((g0) gVar, aVar);
                        if (r2 != aVar2) {
                            kVar = this;
                        }
                        return aVar2;
                    }
                    f0Var = (f0) gVar;
                    gVar3 = gVar2;
                    kVar2 = this;
                    r1.h hVar = kVar2.f2781a;
                    if (!(gVar3 instanceof f0)) {
                        f0Var2 = (f0) gVar3;
                        k kVar3 = kVar2;
                        f0Var3 = f0Var;
                        f0Var4 = f0Var2;
                        z4 = f0Var3 instanceof e0;
                        if (!z4) {
                        }
                        if (!(f0Var3 instanceof d0)) {
                        }
                        if (z4) {
                        }
                    } else {
                        if (!(gVar3 instanceof g0)) {
                            throw new x();
                        }
                        aVar.f2744g = kVar2;
                        aVar.h = f0Var;
                        aVar.f2747k = 2;
                        r5 = hVar.r((g0) gVar3, aVar);
                    }
                } else if (i5 == 1) {
                    gVar2 = aVar.h;
                    kVar = (k) aVar.f2744g;
                    b3.g.x(obj);
                    r2 = ((t3.e) obj).f3396g;
                } else {
                    if (i5 != 2) {
                        if (i5 != 3 && i5 != 4 && i5 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f0Var4 = (f0) aVar.f2744g;
                        b3.g.x(obj);
                        s5 = ((t3.e) obj).f3396g;
                        if (!(s5 instanceof t3.d)) {
                            return s5;
                        }
                        return f0Var4.C();
                    }
                    f0Var = (f0) aVar.h;
                    kVar2 = (k) aVar.f2744g;
                    b3.g.x(obj);
                    r5 = ((t3.e) obj).f3396g;
                    Throwable a6 = t3.e.a(r5);
                    if (a6 != null) {
                        return b3.g.g(a6);
                    }
                    f0Var2 = (f0) r5;
                    k kVar32 = kVar2;
                    f0Var3 = f0Var;
                    f0Var4 = f0Var2;
                    z4 = f0Var3 instanceof e0;
                    if (!z4 && (f0Var4 instanceof d0)) {
                        s5 = b3.g.g(new r3.g("Copy is not allowed from local file to content:// file", null));
                    } else if (!(f0Var3 instanceof d0) && (f0Var4 instanceof d0)) {
                        s5 = b3.g.g(new r3.j("Copy is not allowed from content:// to content://", null));
                    } else if (z4) {
                        Uri C = f0Var3.C();
                        g4.i.c(f0Var4, "null cannot be cast to non-null type io.ionic.libs.ionfilesystemlib.model.IONFILEUri.Resolved.Local");
                        String str = ((e0) f0Var4).f3179d;
                        k1.j jVar = kVar32.f2784d;
                        aVar.f2744g = f0Var4;
                        aVar.h = null;
                        aVar.f2747k = 5;
                        s5 = jVar.s(C, str, aVar);
                    } else {
                        e0 e0Var = (e0) f0Var3;
                        String str2 = e0Var.f3179d;
                        g4.i.c(f0Var4, "null cannot be cast to non-null type io.ionic.libs.ionfilesystemlib.model.IONFILEUri.Resolved.Local");
                        String str3 = ((e0) f0Var4).f3179d;
                        if (e0Var.f3181f == h0.h) {
                            t2.i iVar = kVar32.f2783c;
                            aVar.f2744g = f0Var4;
                            aVar.h = null;
                            aVar.f2747k = 3;
                            s5 = iVar.i(str2, str3, aVar);
                        } else {
                            t2.i iVar2 = kVar32.f2782b;
                            aVar.f2744g = f0Var4;
                            aVar.h = null;
                            aVar.f2747k = 4;
                            s5 = iVar2.j(str2, str3, aVar);
                        }
                    }
                    if (!(s5 instanceof t3.d)) {
                    }
                }
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                b3.g gVar4 = gVar2;
                kVar2 = kVar;
                f0Var = (f0) r2;
                gVar3 = gVar4;
                r1.h hVar2 = kVar2.f2781a;
                if (!(gVar3 instanceof f0)) {
                }
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f2745i;
        x3.a aVar22 = x3.a.f3712g;
        i5 = aVar.f2747k;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(b3.g gVar, r3.a aVar, y3.c cVar) {
        b bVar;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        r3.a aVar2;
        k kVar2;
        e0 e0Var;
        Object l5;
        Throwable a5;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i6 = bVar.f2751k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f2751k = i6 - Integer.MIN_VALUE;
                Object obj = bVar.f2749i;
                x3.a aVar3 = x3.a.f3712g;
                i5 = bVar.f2751k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        bVar.f2748g = this;
                        bVar.h = aVar;
                        bVar.f2751k = 1;
                        r2 = this.f2781a.r((g0) gVar, bVar);
                        if (r2 != aVar3) {
                            kVar = this;
                        }
                        return aVar3;
                    }
                    f0Var = (f0) gVar;
                    aVar2 = aVar;
                    kVar2 = this;
                    if (f0Var instanceof e0) {
                        return b3.g.g(new p());
                    }
                    e0Var = (e0) f0Var;
                    if (e0Var.f3181f == h0.f3187g) {
                        return b3.g.g(new r());
                    }
                    t2.i iVar = kVar2.f2783c;
                    String str = e0Var.f3179d;
                    bVar.f2748g = e0Var;
                    bVar.h = null;
                    bVar.f2751k = 2;
                    l5 = iVar.l(str, aVar2, bVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e0Var = (e0) bVar.f2748g;
                        b3.g.x(obj);
                        l5 = ((t3.e) obj).f3396g;
                        if (l5 instanceof t3.d) {
                            return l5;
                        }
                        return e0Var.f3180e;
                    }
                    aVar = bVar.h;
                    kVar = (k) bVar.f2748g;
                    b3.g.x(obj);
                    r2 = ((t3.e) obj).f3396g;
                }
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                r3.a aVar4 = aVar;
                kVar2 = kVar;
                f0Var = (f0) r2;
                aVar2 = aVar4;
                if (f0Var instanceof e0) {
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f2749i;
        x3.a aVar32 = x3.a.f3712g;
        i5 = bVar.f2751k;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(b3.g gVar, r3.b bVar, y3.c cVar) {
        c cVar2;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        r3.b bVar2;
        k kVar2;
        Throwable a5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i6 = cVar2.f2755k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar2.f2755k = i6 - Integer.MIN_VALUE;
                Object obj = cVar2.f2753i;
                x3.a aVar = x3.a.f3712g;
                i5 = cVar2.f2755k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        cVar2.f2752g = this;
                        cVar2.h = bVar;
                        cVar2.f2755k = 1;
                        r2 = this.f2781a.r((g0) gVar, cVar2);
                        if (r2 != aVar) {
                            kVar = this;
                        }
                        return aVar;
                    }
                    f0Var = (f0) gVar;
                    bVar2 = bVar;
                    kVar2 = this;
                    if (f0Var instanceof e0) {
                        k1.j jVar = kVar2.f2784d;
                        Uri C = f0Var.C();
                        cVar2.f2752g = null;
                        cVar2.h = null;
                        cVar2.f2755k = 4;
                        Object u4 = jVar.u(C, cVar2);
                        if (u4 != aVar) {
                            return u4;
                        }
                    } else {
                        e0 e0Var = (e0) f0Var;
                        String str = e0Var.f3179d;
                        if (e0Var.f3181f == h0.h) {
                            t2.i iVar = kVar2.f2783c;
                            cVar2.f2752g = null;
                            cVar2.h = null;
                            cVar2.f2755k = 2;
                            Object n5 = iVar.n(str, bVar2, cVar2);
                            if (n5 != aVar) {
                                return n5;
                            }
                        } else {
                            t2.i iVar2 = kVar2.f2782b;
                            cVar2.f2752g = null;
                            cVar2.h = null;
                            cVar2.f2755k = 3;
                            Object o2 = iVar2.o(str, cVar2);
                            if (o2 != aVar) {
                                return o2;
                            }
                        }
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2 && i5 != 3 && i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return ((t3.e) obj).f3396g;
                }
                bVar = cVar2.h;
                kVar = cVar2.f2752g;
                b3.g.x(obj);
                r2 = ((t3.e) obj).f3396g;
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                r3.b bVar3 = bVar;
                kVar2 = kVar;
                f0Var = (f0) r2;
                bVar2 = bVar3;
                if (f0Var instanceof e0) {
                }
                return aVar;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f2753i;
        x3.a aVar2 = x3.a.f3712g;
        i5 = cVar2.f2755k;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(g0 g0Var, y3.c cVar) {
        d dVar;
        int i5;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i6 = dVar.f2757i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f2757i = i6 - Integer.MIN_VALUE;
                Object obj = dVar.f2756g;
                x3.a aVar = x3.a.f3712g;
                i5 = dVar.f2757i;
                if (i5 == 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return ((t3.e) obj).f3396g;
                }
                b3.g.x(obj);
                dVar.f2757i = 1;
                Object r2 = this.f2781a.r(g0Var, dVar);
                return r2 == aVar ? aVar : r2;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f2756g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = dVar.f2757i;
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(b3.g gVar, y3.c cVar) {
        e eVar;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        k kVar2;
        Throwable a5;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i6 = eVar.f2760j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar.f2760j = i6 - Integer.MIN_VALUE;
                Object obj = eVar.h;
                x3.a aVar = x3.a.f3712g;
                i5 = eVar.f2760j;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        eVar.f2758g = this;
                        eVar.f2760j = 1;
                        r2 = this.f2781a.r((g0) gVar, eVar);
                        if (r2 != aVar) {
                            kVar = this;
                        }
                        return aVar;
                    }
                    f0Var = (f0) gVar;
                    kVar2 = this;
                    if (f0Var instanceof e0) {
                        k1.j jVar = kVar2.f2784d;
                        Uri C = f0Var.C();
                        eVar.f2758g = null;
                        eVar.f2760j = 3;
                        Object x5 = jVar.x(C, eVar);
                        if (x5 != aVar) {
                            return x5;
                        }
                    } else {
                        t2.i iVar = kVar2.f2782b;
                        String str = ((e0) f0Var).f3179d;
                        eVar.f2758g = null;
                        eVar.f2760j = 2;
                        Object q5 = iVar.q(str, eVar);
                        if (q5 != aVar) {
                            return q5;
                        }
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2 && i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return ((t3.e) obj).f3396g;
                }
                kVar = eVar.f2758g;
                b3.g.x(obj);
                r2 = ((t3.e) obj).f3396g;
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                f0 f0Var2 = (f0) r2;
                kVar2 = kVar;
                f0Var = f0Var2;
                if (f0Var instanceof e0) {
                }
                return aVar;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.h;
        x3.a aVar2 = x3.a.f3712g;
        i5 = eVar.f2760j;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(b3.g gVar, y3.c cVar) {
        f fVar;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        k kVar2;
        Throwable a5;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i6 = fVar.f2763j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f2763j = i6 - Integer.MIN_VALUE;
                Object obj = fVar.h;
                x3.a aVar = x3.a.f3712g;
                i5 = fVar.f2763j;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        fVar.f2761g = this;
                        fVar.f2763j = 1;
                        r2 = this.f2781a.r((g0) gVar, fVar);
                        if (r2 != aVar) {
                            kVar = this;
                        }
                    }
                    f0Var = (f0) gVar;
                    kVar2 = this;
                    if (f0Var instanceof e0) {
                        return b3.g.g(new p());
                    }
                    e0 e0Var = (e0) f0Var;
                    if (e0Var.f3181f == h0.f3187g) {
                        return b3.g.g(new r());
                    }
                    t2.i iVar = kVar2.f2783c;
                    String str = e0Var.f3179d;
                    fVar.f2761g = null;
                    fVar.f2763j = 2;
                    Object v5 = iVar.v(str, fVar);
                    return v5 == aVar ? aVar : v5;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return ((t3.e) obj).f3396g;
                }
                kVar = fVar.f2761g;
                b3.g.x(obj);
                r2 = ((t3.e) obj).f3396g;
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                f0 f0Var2 = (f0) r2;
                kVar2 = kVar;
                f0Var = f0Var2;
                if (f0Var instanceof e0) {
                }
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.h;
        x3.a aVar2 = x3.a.f3712g;
        i5 = fVar.f2763j;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r11 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(b3.g gVar, b3.g gVar2, y3.c cVar) {
        g gVar3;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        b3.g gVar4;
        k kVar2;
        e0 e0Var;
        Object r5;
        f0 f0Var2;
        Throwable a5;
        Object y2;
        e0 e0Var2;
        if (cVar instanceof g) {
            gVar3 = (g) cVar;
            int i6 = gVar3.f2767k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar3.f2767k = i6 - Integer.MIN_VALUE;
                Object obj = gVar3.f2765i;
                x3.a aVar = x3.a.f3712g;
                i5 = gVar3.f2767k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        gVar3.f2764g = this;
                        gVar3.h = gVar2;
                        gVar3.f2767k = 1;
                        r2 = this.f2781a.r((g0) gVar, gVar3);
                        if (r2 != aVar) {
                            kVar = this;
                        }
                        return aVar;
                    }
                    f0Var = (f0) gVar;
                    gVar4 = gVar2;
                    kVar2 = this;
                    if (f0Var instanceof e0) {
                        return b3.g.g(new p());
                    }
                    e0Var = (e0) f0Var;
                    r1.h hVar = kVar2.f2781a;
                    if (gVar4 instanceof f0) {
                        f0Var2 = (f0) gVar4;
                        if (f0Var2 instanceof e0) {
                        }
                    } else {
                        if (!(gVar4 instanceof g0)) {
                            throw new x();
                        }
                        gVar3.f2764g = kVar2;
                        gVar3.h = e0Var;
                        gVar3.f2767k = 2;
                        r5 = hVar.r((g0) gVar4, gVar3);
                    }
                } else if (i5 == 1) {
                    gVar2 = gVar3.h;
                    kVar = (k) gVar3.f2764g;
                    b3.g.x(obj);
                    r2 = ((t3.e) obj).f3396g;
                } else {
                    if (i5 != 2) {
                        if (i5 != 3 && i5 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e0Var2 = (e0) gVar3.f2764g;
                        b3.g.x(obj);
                        y2 = ((t3.e) obj).f3396g;
                        if (!(y2 instanceof t3.d)) {
                            return y2;
                        }
                        return e0Var2.f3180e;
                    }
                    e0Var = (e0) gVar3.h;
                    kVar2 = (k) gVar3.f2764g;
                    b3.g.x(obj);
                    r5 = ((t3.e) obj).f3396g;
                    Throwable a6 = t3.e.a(r5);
                    if (a6 != null) {
                        return b3.g.g(a6);
                    }
                    f0Var2 = (f0) r5;
                    if (f0Var2 instanceof e0) {
                        return b3.g.g(new p());
                    }
                    e0 e0Var3 = (e0) f0Var2;
                    String str = e0Var.f3179d;
                    String str2 = e0Var3.f3179d;
                    if (e0Var.f3181f == h0.h) {
                        t2.i iVar = kVar2.f2783c;
                        gVar3.f2764g = e0Var3;
                        gVar3.h = null;
                        gVar3.f2767k = 3;
                        Object w = iVar.w(str, str2, gVar3);
                        if (w != aVar) {
                            y2 = w;
                            e0Var2 = e0Var3;
                        }
                        return aVar;
                    }
                    t2.i iVar2 = kVar2.f2782b;
                    gVar3.f2764g = e0Var3;
                    gVar3.h = null;
                    gVar3.f2767k = 4;
                    y2 = iVar2.y(str, str2, gVar3);
                    if (!(y2 instanceof t3.d)) {
                    }
                }
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                b3.g gVar5 = gVar2;
                kVar2 = kVar;
                f0Var = (f0) r2;
                gVar4 = gVar5;
                if (f0Var instanceof e0) {
                }
            }
        }
        gVar3 = new g(this, cVar);
        Object obj2 = gVar3.f2765i;
        x3.a aVar2 = x3.a.f3712g;
        i5 = gVar3.f2767k;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(b3.g gVar, a0 a0Var, y3.c cVar) {
        h hVar;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        a0 a0Var2;
        k kVar2;
        boolean z4;
        Object g5;
        Throwable a5;
        Throwable a6;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i6 = hVar.f2771k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                hVar.f2771k = i6 - Integer.MIN_VALUE;
                Object obj = hVar.f2769i;
                x3.a aVar = x3.a.f3712g;
                i5 = hVar.f2771k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        hVar.f2768g = this;
                        hVar.h = a0Var;
                        hVar.f2771k = 1;
                        r2 = this.f2781a.r((g0) gVar, hVar);
                        if (r2 != aVar) {
                            kVar = this;
                        }
                        return aVar;
                    }
                    f0Var = (f0) gVar;
                    a0Var2 = a0Var;
                    kVar2 = this;
                    z4 = f0Var instanceof e0;
                    if (!z4 && ((e0) f0Var).f3181f == h0.h) {
                        return b3.g.g(new q());
                    }
                    try {
                        b3.g.z(a0Var2.f3166b, a0Var2.f3167c);
                        g5 = t3.h.f3400a;
                    } catch (Throwable th) {
                        g5 = b3.g.g(th);
                    }
                    a5 = t3.e.a(g5);
                    if (a5 == null) {
                        return b3.g.g(a5);
                    }
                    if (z4) {
                        t2.i iVar = kVar2.f2782b;
                        String str = ((e0) f0Var).f3179d;
                        hVar.f2768g = null;
                        hVar.h = null;
                        hVar.f2771k = 2;
                        Object x5 = iVar.x(str, a0Var2, hVar);
                        if (x5 != aVar) {
                            return x5;
                        }
                    } else {
                        k1.j jVar = kVar2.f2784d;
                        Uri C = f0Var.C();
                        hVar.f2768g = null;
                        hVar.h = null;
                        hVar.f2771k = 3;
                        Object B = jVar.B(C, a0Var2, hVar);
                        if (B != aVar) {
                            return B;
                        }
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2 && i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return ((t3.e) obj).f3396g;
                }
                a0Var = hVar.h;
                kVar = hVar.f2768g;
                b3.g.x(obj);
                r2 = ((t3.e) obj).f3396g;
                a6 = t3.e.a(r2);
                if (a6 == null) {
                    return b3.g.g(a6);
                }
                a0 a0Var3 = a0Var;
                kVar2 = kVar;
                f0Var = (f0) r2;
                a0Var2 = a0Var3;
                z4 = f0Var instanceof e0;
                if (!z4) {
                }
                b3.g.z(a0Var2.f3166b, a0Var2.f3167c);
                g5 = t3.h.f3400a;
                a5 = t3.e.a(g5);
                if (a5 == null) {
                }
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f2769i;
        x3.a aVar2 = x3.a.f3712g;
        i5 = hVar.f2771k;
        if (i5 != 0) {
        }
        a6 = t3.e.a(r2);
        if (a6 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(b3.g gVar, c0 c0Var, y3.c cVar) {
        j jVar;
        int i5;
        Object r2;
        k kVar;
        f0 f0Var;
        c0 c0Var2;
        k kVar2;
        e0 e0Var;
        Object z4;
        Throwable a5;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i6 = jVar.f2780k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jVar.f2780k = i6 - Integer.MIN_VALUE;
                Object obj = jVar.f2778i;
                x3.a aVar = x3.a.f3712g;
                i5 = jVar.f2780k;
                if (i5 != 0) {
                    b3.g.x(obj);
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        jVar.f2777g = this;
                        jVar.h = c0Var;
                        jVar.f2780k = 1;
                        r2 = this.f2781a.r((g0) gVar, jVar);
                        if (r2 != aVar) {
                            kVar = this;
                        }
                        return aVar;
                    }
                    f0Var = (f0) gVar;
                    c0Var2 = c0Var;
                    kVar2 = this;
                    if (f0Var instanceof e0) {
                        return b3.g.g(new p());
                    }
                    e0Var = (e0) f0Var;
                    if (e0Var.f3181f == h0.h) {
                        return b3.g.g(new q());
                    }
                    t2.i iVar = kVar2.f2782b;
                    String str = e0Var.f3179d;
                    jVar.f2777g = e0Var;
                    jVar.h = null;
                    jVar.f2780k = 2;
                    z4 = iVar.z(str, c0Var2, jVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e0Var = (e0) jVar.f2777g;
                        b3.g.x(obj);
                        z4 = ((t3.e) obj).f3396g;
                        if (z4 instanceof t3.d) {
                            return z4;
                        }
                        return e0Var.f3180e;
                    }
                    c0Var = jVar.h;
                    kVar = (k) jVar.f2777g;
                    b3.g.x(obj);
                    r2 = ((t3.e) obj).f3396g;
                }
                a5 = t3.e.a(r2);
                if (a5 == null) {
                    return b3.g.g(a5);
                }
                c0 c0Var3 = c0Var;
                kVar2 = kVar;
                f0Var = (f0) r2;
                c0Var2 = c0Var3;
                if (f0Var instanceof e0) {
                }
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f2778i;
        x3.a aVar2 = x3.a.f3712g;
        i5 = jVar.f2780k;
        if (i5 != 0) {
        }
        a5 = t3.e.a(r2);
        if (a5 == null) {
        }
    }
}
