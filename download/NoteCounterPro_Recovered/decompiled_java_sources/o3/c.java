package o3;

/* loaded from: classes.dex */
public final class c extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public k f2752g;
    public r3.b h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2754j;

    /* renamed from: k, reason: collision with root package name */
    public int f2755k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, y3.c cVar) {
        super(cVar);
        this.f2754j = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2753i = obj;
        this.f2755k |= Integer.MIN_VALUE;
        Object c5 = this.f2754j.c(null, null, this);
        return c5 == x3.a.f3712g ? c5 : new t3.e(c5);
    }
}
