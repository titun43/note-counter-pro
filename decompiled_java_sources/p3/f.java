package p3;

/* loaded from: classes.dex */
public final class f extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2998g;
    public final /* synthetic */ k1.j h;

    /* renamed from: i, reason: collision with root package name */
    public int f2999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k1.j jVar, y3.c cVar) {
        super(cVar);
        this.h = jVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2998g = obj;
        this.f2999i |= Integer.MIN_VALUE;
        Object B = this.h.B(null, null, this);
        return B == x3.a.f3712g ? B : new t3.e(B);
    }
}
