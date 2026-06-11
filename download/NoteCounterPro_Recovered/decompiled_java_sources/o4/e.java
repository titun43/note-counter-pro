package o4;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f4.q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2792g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object obj, int i5) {
        this.f2792g = i5;
        this.h = obj;
    }

    @Override // f4.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2792g) {
            case 0:
                ((m4.g) this.h).a((Throwable) obj);
                break;
            case 1:
                w4.c cVar = (w4.c) this.h;
                w4.c.f3633g.set(cVar, null);
                cVar.d(null);
                break;
            default:
                ((w4.g) this.h).b();
                break;
        }
        return t3.h.f3400a;
    }

    public /* synthetic */ e(w4.c cVar, w4.b bVar) {
        this.f2792g = 1;
        this.h = cVar;
    }
}
