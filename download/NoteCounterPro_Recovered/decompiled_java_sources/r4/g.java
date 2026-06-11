package r4;

/* loaded from: classes.dex */
public final class g extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3229g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f3230i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3231j;

    /* renamed from: k, reason: collision with root package name */
    public c f3232k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, y3.c cVar) {
        super(cVar);
        this.f3230i = hVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3229g = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f3230i.j(null, this);
    }
}
