package p3;

import java.io.File;

/* loaded from: classes.dex */
public final class j extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3007g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f3008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3009j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, w3.c cVar, int i5) {
        super(2, cVar);
        this.f3007g = i5;
        this.f3008i = str;
        this.f3009j = str2;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3007g) {
            case 0:
                j jVar = new j(this.f3008i, this.f3009j, cVar, 0);
                jVar.h = obj;
                return jVar;
            default:
                j jVar2 = new j(this.f3008i, this.f3009j, cVar, 1);
                jVar2.h = obj;
                return jVar2;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        o4.t tVar = (o4.t) obj;
        w3.c cVar = (w3.c) obj2;
        switch (this.f3007g) {
        }
        return ((j) create(tVar, cVar)).invokeSuspend(t3.h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3007g;
        Object obj2 = t3.h.f3400a;
        String str = this.f3009j;
        String str2 = this.f3008i;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                b3.g.x(obj);
                try {
                    File file = new File(str2);
                    File file2 = new File(str);
                    if (!file.equals(file2)) {
                        if (!file.exists()) {
                            throw new r3.o(str2, null);
                        }
                        if (file.isFile() || file2.isFile()) {
                            throw new r3.h();
                        }
                        File parentFile = file2.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            throw new r3.i();
                        }
                        if (file2.isDirectory()) {
                            throw new r3.f(str);
                        }
                        if (!d4.l.B(file, file2)) {
                            throw new r3.s(null);
                        }
                    }
                } catch (Throwable th) {
                    obj2 = b3.g.g(th);
                }
                return new t3.e(obj2);
            default:
                x3.a aVar2 = x3.a.f3712g;
                b3.g.x(obj);
                try {
                    File file3 = new File(str2);
                    File file4 = new File(str);
                    if (!file3.equals(file4)) {
                        if (!file3.exists()) {
                            throw new r3.o(str2, null);
                        }
                        if (file3.isDirectory() || file4.isDirectory()) {
                            throw new r3.h();
                        }
                        File parentFile2 = file4.getParentFile();
                        if (parentFile2 != null && !parentFile2.exists()) {
                            throw new r3.i();
                        }
                        d4.l.C(file3, file4, true);
                        if (!file4.exists()) {
                            throw new r3.s(null);
                        }
                    }
                } catch (Throwable th2) {
                    obj2 = b3.g.g(th2);
                }
                return new t3.e(obj2);
        }
    }
}
