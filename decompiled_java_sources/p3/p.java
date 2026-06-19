package p3;

/* loaded from: classes.dex */
public final class p extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3020g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3021i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3020g = obj;
        this.f3021i |= Integer.MIN_VALUE;
        Object w = this.h.w(null, null, this);
        return w == x3.a.f3712g ? w : new t3.e(w);
    }
}
