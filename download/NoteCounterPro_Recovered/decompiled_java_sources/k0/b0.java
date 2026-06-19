package k0;

/* loaded from: classes.dex */
public final class b0 extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public d0 f2319g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2320i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2321j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f2322k;

    /* renamed from: l, reason: collision with root package name */
    public int f2323l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2322k = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2321j = obj;
        this.f2323l |= Integer.MIN_VALUE;
        return this.f2322k.h(null, null, this);
    }
}
