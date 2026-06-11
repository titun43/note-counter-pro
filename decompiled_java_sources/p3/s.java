package p3;

/* loaded from: classes.dex */
public final class s extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3026g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3027i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3026g = obj;
        this.f3027i |= Integer.MIN_VALUE;
        Object o2 = this.h.o(null, this);
        return o2 == x3.a.f3712g ? o2 : new t3.e(o2);
    }
}
