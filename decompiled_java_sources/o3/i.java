package o3;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.fragment.app.x;
import f4.p;
import java.io.Closeable;
import java.io.InputStream;
import p3.w;
import r3.e0;
import r3.f0;
import r3.g0;
import r3.h0;
import r3.q;
import r3.s;
import r3.z;
import r4.t;
import r4.v;

/* loaded from: classes.dex */
public final class i extends y3.g implements p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2772g = 1;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2773i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f2774j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2775k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2776l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k1.j jVar, Uri uri, z zVar, w3.c cVar) {
        super(2, cVar);
        this.f2775k = jVar;
        this.f2776l = uri;
        this.f2774j = zVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2772g) {
            case 0:
                i iVar = new i(this.f2774j, (k) this.f2775k, (b3.g) this.f2776l, cVar);
                iVar.f2773i = obj;
                return iVar;
            default:
                i iVar2 = new i((k1.j) this.f2775k, (Uri) this.f2776l, this.f2774j, cVar);
                iVar2.f2773i = obj;
                return iVar2;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        r4.c cVar = (r4.c) obj;
        w3.c cVar2 = (w3.c) obj2;
        switch (this.f2772g) {
        }
        return ((i) create(cVar, cVar2)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r4.c cVar;
        r4.c cVar2;
        Object obj2;
        Object obj3;
        Throwable a5;
        r4.b pVar;
        Closeable closeable;
        t3.h hVar;
        int i5 = this.f2772g;
        z zVar = this.f2774j;
        Object obj4 = this.f2776l;
        Object obj5 = this.f2775k;
        t3.h hVar2 = t3.h.f3400a;
        switch (i5) {
            case 0:
                k kVar = (k) obj5;
                x3.a aVar = x3.a.f3712g;
                int i6 = this.h;
                if (i6 == 0) {
                    b3.g.x(obj);
                    cVar = (r4.c) this.f2773i;
                    b3.g.z(zVar.f3215c, zVar.f3216d);
                    r1.h hVar3 = kVar.f2781a;
                    b3.g gVar = (b3.g) obj4;
                    if (!(gVar instanceof f0)) {
                        if (!(gVar instanceof g0)) {
                            throw new x();
                        }
                        this.f2773i = cVar;
                        this.h = 1;
                        Object r2 = hVar3.r((g0) gVar, this);
                        if (r2 != aVar) {
                            cVar2 = cVar;
                            obj2 = r2;
                        }
                        return aVar;
                    }
                    obj3 = (f0) gVar;
                    if ((obj3 instanceof e0) && ((e0) obj3).f3181f == h0.h) {
                        obj3 = b3.g.g(new q());
                    }
                    a5 = t3.e.a(obj3);
                    if (a5 != null) {
                        throw a5;
                    }
                    f0 f0Var = (f0) obj3;
                    if (f0Var instanceof e0) {
                        t2.i iVar = kVar.f2782b;
                        String str = ((e0) f0Var).f3179d;
                        iVar.getClass();
                        g4.i.e(str, "fullPath");
                        u1.f fVar = new u1.f(new w(str, zVar, (w3.c) null, 0));
                        v4.e eVar = o4.e0.f2793a;
                        pVar = t.e(fVar, v4.d.f3605i);
                    } else {
                        k1.j jVar = kVar.f2784d;
                        Uri C = f0Var.C();
                        jVar.getClass();
                        g4.i.e(C, "uri");
                        u1.f fVar2 = new u1.f(new i(jVar, C, zVar, (w3.c) null));
                        v4.e eVar2 = o4.e0.f2793a;
                        pVar = new androidx.emoji2.text.p(t.e(fVar2, v4.d.f3605i), new p3.h(jVar, C, null));
                    }
                    this.f2773i = null;
                    this.h = 2;
                    if (cVar instanceof v) {
                        throw ((v) cVar).f3271g;
                    }
                    Object j2 = pVar.j(cVar, this);
                    if (j2 != aVar) {
                        j2 = hVar2;
                    }
                    if (j2 != aVar) {
                        return hVar2;
                    }
                    return aVar;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                    return hVar2;
                }
                cVar2 = (r4.c) this.f2773i;
                b3.g.x(obj);
                obj2 = ((t3.e) obj).f3396g;
                Throwable a6 = t3.e.a(obj2);
                if (a6 == null) {
                    r4.c cVar3 = cVar2;
                    obj3 = (f0) obj2;
                    cVar = cVar3;
                    if (obj3 instanceof e0) {
                        obj3 = b3.g.g(new q());
                    }
                    a5 = t3.e.a(obj3);
                    if (a5 != null) {
                    }
                } else {
                    r4.c cVar4 = cVar2;
                    obj3 = b3.g.g(a6);
                    cVar = cVar4;
                    a5 = t3.e.a(obj3);
                    if (a5 != null) {
                    }
                }
            default:
                x3.a aVar2 = x3.a.f3712g;
                int i7 = this.h;
                if (i7 == 0) {
                    b3.g.x(obj);
                    r4.c cVar5 = (r4.c) this.f2773i;
                    InputStream openInputStream = ((ContentResolver) ((k1.j) obj5).h).openInputStream((Uri) obj4);
                    if (openInputStream == null) {
                        hVar = null;
                        if (hVar == null) {
                            return hVar2;
                        }
                        throw new s(null);
                    }
                    try {
                        p3.g gVar2 = new p3.g(cVar5, null, 0);
                        this.f2773i = openInputStream;
                        this.h = 1;
                        if (y4.b.H(openInputStream, zVar, 8192, gVar2, this) == aVar2) {
                            return aVar2;
                        }
                        closeable = openInputStream;
                    } catch (Throwable th) {
                        th = th;
                        closeable = openInputStream;
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) this.f2773i;
                    try {
                        b3.g.x(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            a.a.g(closeable, th);
                            throw th3;
                        }
                    }
                }
                a.a.g(closeable, null);
                hVar = hVar2;
                if (hVar == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, k kVar, b3.g gVar, w3.c cVar) {
        super(2, cVar);
        this.f2774j = zVar;
        this.f2775k = kVar;
        this.f2776l = gVar;
    }
}
