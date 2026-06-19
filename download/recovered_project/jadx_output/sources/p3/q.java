package p3;

/* loaded from: classes.dex */
public final class q extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3022g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3023i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3022g = obj;
        this.f3023i |= Integer.MIN_VALUE;
        Object j2 = this.h.j(null, null, this);
        return j2 == x3.a.f3712g ? j2 : new t3.e(j2);
    }
}
