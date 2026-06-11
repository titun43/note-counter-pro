package p3;

/* loaded from: classes.dex */
public final class k extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3010g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3011i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3010g = obj;
        this.f3011i |= Integer.MIN_VALUE;
        Object l5 = this.h.l(null, null, this);
        return l5 == x3.a.f3712g ? l5 : new t3.e(l5);
    }
}
