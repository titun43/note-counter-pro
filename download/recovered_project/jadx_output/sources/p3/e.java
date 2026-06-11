package p3;

/* loaded from: classes.dex */
public final class e extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2996g;
    public final /* synthetic */ k1.j h;

    /* renamed from: i, reason: collision with root package name */
    public int f2997i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k1.j jVar, y3.c cVar) {
        super(cVar);
        this.h = jVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2996g = obj;
        this.f2997i |= Integer.MIN_VALUE;
        Object x5 = this.h.x(null, this);
        return x5 == x3.a.f3712g ? x5 : new t3.e(x5);
    }
}
