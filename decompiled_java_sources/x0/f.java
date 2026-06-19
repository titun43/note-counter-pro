package x0;

/* loaded from: classes.dex */
public final class f extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public g f3699g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f3700i;

    /* renamed from: j, reason: collision with root package name */
    public int f3701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, w3.c cVar) {
        super(cVar);
        this.f3700i = gVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f3701j |= Integer.MIN_VALUE;
        return g.c(this.f3700i, null, this);
    }
}
