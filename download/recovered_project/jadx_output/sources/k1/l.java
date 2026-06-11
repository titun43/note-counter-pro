package k1;

/* loaded from: classes.dex */
public final class l extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i5, String str, String str2) {
        super(2, str, str2);
        this.f2415e = i5;
    }

    @Override // k1.c
    public final boolean b() {
        switch (this.f2415e) {
            case 0:
                if (!super.b() || !a.a.q("MULTI_PROCESS")) {
                    return false;
                }
                boolean z4 = j1.f.f2020a;
                if (m.f2418c.b()) {
                    return n.f2424a.getStatics().isMultiProcessEnabled();
                }
                throw m.a();
            default:
                if (a.a.q("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
