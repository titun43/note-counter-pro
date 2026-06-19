package p3;

/* loaded from: classes.dex */
public final class a0 extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2985g;
    public final /* synthetic */ r1.h h;

    /* renamed from: i, reason: collision with root package name */
    public int f2986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r1.h hVar, y3.c cVar) {
        super(cVar);
        this.h = hVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2985g = obj;
        this.f2986i |= Integer.MIN_VALUE;
        Object r2 = this.h.r(null, this);
        return r2 == x3.a.f3712g ? r2 : new t3.e(r2);
    }
}
