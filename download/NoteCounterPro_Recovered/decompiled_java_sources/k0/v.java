package k0;

/* loaded from: classes.dex */
public final class v extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f2381g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2382i;

    /* renamed from: j, reason: collision with root package name */
    public g4.n f2383j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f2384k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f2386m;

    /* renamed from: n, reason: collision with root package name */
    public int f2387n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, y3.c cVar) {
        super(cVar);
        this.f2386m = wVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2385l = obj;
        this.f2387n |= Integer.MIN_VALUE;
        return this.f2386m.a(null, this);
    }
}
