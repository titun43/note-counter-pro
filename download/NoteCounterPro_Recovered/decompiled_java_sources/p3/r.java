package p3;

/* loaded from: classes.dex */
public final class r extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3024g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3025i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3024g = obj;
        this.f3025i |= Integer.MIN_VALUE;
        Object m5 = this.h.m(null, null, this);
        return m5 == x3.a.f3712g ? m5 : new t3.e(m5);
    }
}
