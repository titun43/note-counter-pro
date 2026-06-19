package m4;

import androidx.activity.w;
import f4.l;
import g4.i;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2607g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g(Object obj, int i5) {
        this.f2607g = i5;
        this.h = obj;
    }

    @Override // f4.l
    public final Object a(Object obj) {
        switch (this.f2607g) {
            case 0:
                w wVar = (w) this.h;
                i.e(obj, "it");
                return wVar.invoke();
            case 1:
                return obj == ((u3.c) this.h) ? "(this Collection)" : String.valueOf(obj);
            default:
                ((w4.c) this.h).d(null);
                return t3.h.f3400a;
        }
    }

    public /* synthetic */ g(w4.c cVar, w4.b bVar) {
        this.f2607g = 2;
        this.h = cVar;
    }
}
