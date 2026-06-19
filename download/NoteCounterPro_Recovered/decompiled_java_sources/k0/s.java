package k0;

/* loaded from: classes.dex */
public final class s implements r4.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2367g;
    public final /* synthetic */ Object h;

    public /* synthetic */ s(Object obj, int i5) {
        this.f2367g = i5;
        this.h = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // r4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, w3.c cVar) {
        r rVar;
        int i5;
        switch (this.f2367g) {
            case 0:
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i6 = rVar.h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        rVar.h = i6 - Integer.MIN_VALUE;
                        Object obj2 = rVar.f2365g;
                        x3.a aVar = x3.a.f3712g;
                        i5 = rVar.h;
                        if (i5 != 0) {
                            b3.g.x(obj2);
                            r4.c cVar2 = (r4.c) this.h;
                            e0 e0Var = (e0) obj;
                            if (e0Var instanceof h) {
                                throw ((h) e0Var).f2351a;
                            }
                            if (e0Var instanceof g) {
                                throw ((g) e0Var).f2350a;
                            }
                            if (!(e0Var instanceof a)) {
                                if (e0Var instanceof f0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new androidx.fragment.app.x();
                            }
                            Object obj3 = ((a) e0Var).f2310a;
                            rVar.h = 1;
                            if (cVar2.b(obj3, rVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b3.g.x(obj2);
                        }
                        return t3.h.f3400a;
                    }
                }
                rVar = new r(this, cVar);
                Object obj22 = rVar.f2365g;
                x3.a aVar2 = x3.a.f3712g;
                i5 = rVar.h;
                if (i5 != 0) {
                }
                return t3.h.f3400a;
            default:
                ((g4.n) this.h).f1704g = obj;
                throw new s4.a(this);
        }
    }
}
