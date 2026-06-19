package k0;

/* loaded from: classes.dex */
public final class t extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f2368g;
    public d0 h;

    /* renamed from: i, reason: collision with root package name */
    public o4.l f2369i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2370j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f2371k;

    /* renamed from: l, reason: collision with root package name */
    public int f2372l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2371k = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2370j = obj;
        this.f2372l |= Integer.MIN_VALUE;
        return d0.a(this.f2371k, null, this);
    }
}
