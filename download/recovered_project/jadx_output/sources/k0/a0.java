package k0;

/* loaded from: classes.dex */
public final class a0 extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public d0 f2312g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2313i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f2314j;

    /* renamed from: k, reason: collision with root package name */
    public int f2315k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2314j = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2313i = obj;
        this.f2315k |= Integer.MIN_VALUE;
        return this.f2314j.g(this);
    }
}
