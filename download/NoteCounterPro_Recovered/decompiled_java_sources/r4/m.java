package r4;

/* loaded from: classes.dex */
public final class m extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public n f3245g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3246i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f3247j;

    /* renamed from: k, reason: collision with root package name */
    public int f3248k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, w3.c cVar) {
        super(cVar);
        this.f3247j = nVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3246i = obj;
        this.f3248k |= Integer.MIN_VALUE;
        return this.f3247j.b(null, this);
    }
}
