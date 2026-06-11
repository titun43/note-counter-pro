package p3;

/* loaded from: classes.dex */
public final class a extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2983g;
    public final /* synthetic */ k1.j h;

    /* renamed from: i, reason: collision with root package name */
    public int f2984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k1.j jVar, y3.c cVar) {
        super(cVar);
        this.h = jVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2983g = obj;
        this.f2984i |= Integer.MIN_VALUE;
        Object s5 = this.h.s(null, null, this);
        return s5 == x3.a.f3712g ? s5 : new t3.e(s5);
    }
}
