package o3;

/* loaded from: classes.dex */
public final class e extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public k f2758g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f2759i;

    /* renamed from: j, reason: collision with root package name */
    public int f2760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, y3.c cVar) {
        super(cVar);
        this.f2759i = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f2760j |= Integer.MIN_VALUE;
        Object e4 = this.f2759i.e(null, this);
        return e4 == x3.a.f3712g ? e4 : new t3.e(e4);
    }
}
