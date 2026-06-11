package o3;

/* loaded from: classes.dex */
public final class f extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public k f2761g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f2762i;

    /* renamed from: j, reason: collision with root package name */
    public int f2763j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, y3.c cVar) {
        super(cVar);
        this.f2762i = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f2763j |= Integer.MIN_VALUE;
        Object f5 = this.f2762i.f(null, this);
        return f5 == x3.a.f3712g ? f5 : new t3.e(f5);
    }
}
