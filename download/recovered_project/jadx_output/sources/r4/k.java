package r4;

/* loaded from: classes.dex */
public final class k extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public l f3240g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f3241i;

    /* renamed from: j, reason: collision with root package name */
    public int f3242j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, w3.c cVar) {
        super(cVar);
        this.f3241i = lVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f3242j |= Integer.MIN_VALUE;
        return this.f3241i.b(null, this);
    }
}
