package p3;

/* loaded from: classes.dex */
public final class x extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3037g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3038i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3037g = obj;
        this.f3038i |= Integer.MIN_VALUE;
        Object y2 = this.h.y(null, null, this);
        return y2 == x3.a.f3712g ? y2 : new t3.e(y2);
    }
}
