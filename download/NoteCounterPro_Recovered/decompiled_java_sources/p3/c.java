package p3;

/* loaded from: classes.dex */
public final class c extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2991g;
    public final /* synthetic */ k1.j h;

    /* renamed from: i, reason: collision with root package name */
    public int f2992i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k1.j jVar, y3.c cVar) {
        super(cVar);
        this.h = jVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2991g = obj;
        this.f2992i |= Integer.MIN_VALUE;
        Object u4 = this.h.u(null, this);
        return u4 == x3.a.f3712g ? u4 : new t3.e(u4);
    }
}
