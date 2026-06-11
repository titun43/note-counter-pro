package o3;

/* loaded from: classes.dex */
public final class g extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f2764g;
    public b3.g h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2765i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2766j;

    /* renamed from: k, reason: collision with root package name */
    public int f2767k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, y3.c cVar) {
        super(cVar);
        this.f2766j = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2765i = obj;
        this.f2767k |= Integer.MIN_VALUE;
        Object g5 = this.f2766j.g(null, null, this);
        return g5 == x3.a.f3712g ? g5 : new t3.e(g5);
    }
}
