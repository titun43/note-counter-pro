package p3;

/* loaded from: classes.dex */
public final class y extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3039g;
    public final /* synthetic */ t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f3040i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t2.i iVar, y3.c cVar) {
        super(cVar);
        this.h = iVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3039g = obj;
        this.f3040i |= Integer.MIN_VALUE;
        Object z4 = this.h.z(null, null, this);
        return z4 == x3.a.f3712g ? z4 : new t3.e(z4);
    }
}
