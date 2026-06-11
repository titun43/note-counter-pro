package r4;

/* loaded from: classes.dex */
public final class a extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public s4.j f3217g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u1.f f3218i;

    /* renamed from: j, reason: collision with root package name */
    public int f3219j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u1.f fVar, y3.c cVar) {
        super(cVar);
        this.f3218i = fVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f3219j |= Integer.MIN_VALUE;
        return this.f3218i.j(null, this);
    }
}
