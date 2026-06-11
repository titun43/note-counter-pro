package p3;

import android.net.Uri;
import android.view.InputEvent;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class w extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3033g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3034i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3035j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3036k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, w3.c cVar, int i5) {
        super(2, cVar);
        this.f3033g = i5;
        this.f3035j = obj;
        this.f3036k = obj2;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3033g) {
            case 0:
                w wVar = new w((String) this.f3035j, (r3.z) this.f3036k, cVar, 0);
                wVar.f3034i = obj;
                return wVar;
            case 1:
                w wVar2 = new w((r4.c) this.f3035j, (s4.d) this.f3036k, cVar, 1);
                wVar2.f3034i = obj;
                return wVar2;
            default:
                return new w((u0.a) this.f3034i, (Uri) this.f3035j, (InputEvent) this.f3036k, cVar);
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3033g) {
        }
        return ((w) create((o4.t) obj, (w3.c) obj2)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [o4.a, q4.n] */
    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3033g) {
            case 0:
                ?? r02 = (String) this.f3035j;
                x3.a aVar = x3.a.f3712g;
                int i5 = this.h;
                w3.c cVar = null;
                try {
                    if (i5 == 0) {
                        b3.g.x(obj);
                        r4.c cVar2 = (r4.c) this.f3034i;
                        File file = new File((String) r02);
                        if (!file.exists()) {
                            throw new r3.o(r02, null);
                        }
                        FileInputStream fileInputStream = new FileInputStream(file);
                        r3.z zVar = (r3.z) this.f3036k;
                        g gVar = new g(cVar2, cVar, 1);
                        this.f3034i = fileInputStream;
                        this.h = 1;
                        Object H = y4.b.H(fileInputStream, zVar, 8192, gVar, this);
                        r02 = fileInputStream;
                        if (H == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Closeable closeable = (Closeable) this.f3034i;
                        b3.g.x(obj);
                        r02 = closeable;
                    }
                    a.a.g(r02, null);
                    return t3.h.f3400a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        a.a.g(r02, th);
                        throw th2;
                    }
                }
            case 1:
                x3.a aVar2 = x3.a.f3712g;
                int i6 = this.h;
                t3.h hVar = t3.h.f3400a;
                if (i6 == 0) {
                    b3.g.x(obj);
                    o4.t tVar = (o4.t) this.f3034i;
                    r4.c cVar3 = (r4.c) this.f3035j;
                    s4.d dVar = (s4.d) this.f3036k;
                    w3.h hVar2 = dVar.f3308g;
                    int i7 = dVar.h;
                    if (i7 == -3) {
                        i7 = -2;
                    }
                    q4.a aVar3 = dVar.f3309i;
                    o4.u uVar = o4.u.h;
                    s4.c cVar4 = new s4.c(dVar, null, 0);
                    ?? nVar = new q4.n(o4.w.j(tVar, hVar2), q4.j.a(i7, aVar3, 4));
                    nVar.U(uVar, nVar, cVar4);
                    this.h = 1;
                    Object c5 = r4.t.c(cVar3, nVar, true, this);
                    if (c5 != aVar2) {
                        c5 = hVar;
                    }
                    if (c5 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return hVar;
            default:
                x3.a aVar4 = x3.a.f3712g;
                int i8 = this.h;
                if (i8 == 0) {
                    b3.g.x(obj);
                    w0.b bVar = ((u0.a) this.f3034i).f3493a;
                    Uri uri = (Uri) this.f3035j;
                    InputEvent inputEvent = (InputEvent) this.f3036k;
                    this.h = 1;
                    if (bVar.c(uri, inputEvent, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return t3.h.f3400a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u0.a aVar, Uri uri, InputEvent inputEvent, w3.c cVar) {
        super(2, cVar);
        this.f3033g = 2;
        this.f3034i = aVar;
        this.f3035j = uri;
        this.f3036k = inputEvent;
    }
}
