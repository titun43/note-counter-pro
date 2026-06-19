package r4;

/* loaded from: classes.dex */
public final class p extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3255g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f3256i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3257j;

    /* renamed from: k, reason: collision with root package name */
    public c f3258k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l lVar, w3.c cVar) {
        super(cVar);
        this.f3256i = lVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3255g = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f3256i.b(null, this);
    }
}
