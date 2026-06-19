package k0;

/* loaded from: classes.dex */
public final class x extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public d0 f2392g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f2393i;

    /* renamed from: j, reason: collision with root package name */
    public int f2394j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2393i = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f2394j |= Integer.MIN_VALUE;
        return this.f2393i.d(this);
    }
}
