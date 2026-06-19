package k0;

/* loaded from: classes.dex */
public final class r extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2365g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f2366i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, w3.c cVar) {
        super(cVar);
        this.f2366i = sVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2365g = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f2366i.b(null, this);
    }
}
