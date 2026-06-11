package p3;

/* loaded from: classes.dex */
public final class v extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3031g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3032i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3031g = obj;
        this.f3032i |= Integer.MIN_VALUE;
        Object x5 = this.h.x(null, null, this);
        return x5 == x3.a.f3712g ? x5 : new t3.e(x5);
    }
}
