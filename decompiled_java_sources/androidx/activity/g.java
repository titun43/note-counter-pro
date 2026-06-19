package androidx.activity;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f48g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f49i;

    public /* synthetic */ g(int i5, Object obj, Object obj2) {
        this.f48g = i5;
        this.h = obj;
        this.f49i = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        switch (this.f48g) {
            case 0:
                f0 f0Var = (f0) this.h;
                s sVar = (s) this.f49i;
                if (mVar == androidx.lifecycle.m.ON_CREATE) {
                    f0Var.f45e = k.a(sVar);
                    f0Var.d(f0Var.f47g);
                    break;
                }
                break;
            default:
                f0.m mVar2 = (f0.m) this.h;
                f0.o oVar = (f0.o) this.f49i;
                if (mVar != androidx.lifecycle.m.ON_DESTROY) {
                    mVar2.getClass();
                    break;
                } else {
                    mVar2.b(oVar);
                    break;
                }
        }
    }
}
