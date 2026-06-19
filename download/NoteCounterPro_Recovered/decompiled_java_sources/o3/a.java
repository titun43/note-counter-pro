package o3;

/* loaded from: classes.dex */
public final class a extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f2744g;
    public b3.g h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2746j;

    /* renamed from: k, reason: collision with root package name */
    public int f2747k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, y3.c cVar) {
        super(cVar);
        this.f2746j = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2745i = obj;
        this.f2747k |= Integer.MIN_VALUE;
        Object a5 = this.f2746j.a(null, null, this);
        return a5 == x3.a.f3712g ? a5 : new t3.e(a5);
    }
}
