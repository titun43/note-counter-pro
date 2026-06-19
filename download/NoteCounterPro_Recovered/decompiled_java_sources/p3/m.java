package p3;

/* loaded from: classes.dex */
public final class m extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3014g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3015i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3014g = obj;
        this.f3015i |= Integer.MIN_VALUE;
        Object n5 = this.h.n(null, null, this);
        return n5 == x3.a.f3712g ? n5 : new t3.e(n5);
    }
}
