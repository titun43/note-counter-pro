package o3;

/* loaded from: classes.dex */
public final class b extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f2748g;
    public r3.a h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2749i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2750j;

    /* renamed from: k, reason: collision with root package name */
    public int f2751k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, y3.c cVar) {
        super(cVar);
        this.f2750j = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2749i = obj;
        this.f2751k |= Integer.MIN_VALUE;
        Object b2 = this.f2750j.b(null, null, this);
        return b2 == x3.a.f3712g ? b2 : new t3.e(b2);
    }
}
