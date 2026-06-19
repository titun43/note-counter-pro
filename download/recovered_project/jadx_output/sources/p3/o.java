package p3;

import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3018g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f3019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, w3.c cVar, int i5) {
        super(2, cVar);
        this.f3018g = i5;
        this.f3019i = str;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f3018g) {
            case 0:
                o oVar = new o(this.f3019i, cVar, 0);
                oVar.h = obj;
                return oVar;
            default:
                o oVar2 = new o(this.f3019i, cVar, 1);
                oVar2.h = obj;
                return oVar2;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        o4.t tVar = (o4.t) obj;
        w3.c cVar = (w3.c) obj2;
        switch (this.f3018g) {
        }
        return ((o) create(tVar, cVar)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [t3.d] */
    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        Object g5;
        File file;
        Object g6;
        File file2;
        int i5 = this.f3018g;
        String str = this.f3019i;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                b3.g.x(obj);
                try {
                    file = new File(str);
                } catch (Throwable th) {
                    g5 = b3.g.g(th);
                }
                if (!file.exists() || !file.isDirectory()) {
                    throw new r3.o(str, null);
                }
                File[] listFiles = file.listFiles();
                Iterable E = listFiles != null ? u3.f.E(listFiles) : u3.o.f3547g;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : E) {
                    if (obj2 != null) {
                        arrayList.add(obj2);
                    }
                }
                g5 = new ArrayList(u3.i.T(arrayList));
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj3 = arrayList.get(i6);
                    i6++;
                    g5.add(b3.g.u((File) obj3));
                }
                return new t3.e(g5);
            default:
                x3.a aVar2 = x3.a.f3712g;
                b3.g.x(obj);
                try {
                    file2 = new File(str);
                } catch (Throwable th2) {
                    g6 = b3.g.g(th2);
                }
                if (!file2.exists()) {
                    throw new r3.o(str, null);
                }
                g6 = b3.g.u(file2);
                return new t3.e(g6);
        }
    }
}
