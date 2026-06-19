package p3;

/* loaded from: classes.dex */
public final class u extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3029g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3029g = obj;
        this.f3030i |= Integer.MIN_VALUE;
        Object q5 = this.h.q(null, this);
        return q5 == x3.a.f3712g ? q5 : new t3.e(q5);
    }
}
