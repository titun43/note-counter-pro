package p3;

/* loaded from: classes.dex */
public final class i extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3005g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3006i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3005g = obj;
        this.f3006i |= Integer.MIN_VALUE;
        Object i5 = this.h.i(null, null, this);
        return i5 == x3.a.f3712g ? i5 : new t3.e(i5);
    }
}
