package p3;

/* loaded from: classes.dex */
public final class n extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3016g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3016g = obj;
        this.f3017i |= Integer.MIN_VALUE;
        Object v5 = this.h.v(null, this);
        return v5 == x3.a.f3712g ? v5 : new t3.e(v5);
    }
}
