package o3;

/* loaded from: classes.dex */
public final class d extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2756g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f2757i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, y3.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2756g = obj;
        this.f2757i |= Integer.MIN_VALUE;
        Object d5 = this.h.d(null, this);
        return d5 == x3.a.f3712g ? d5 : new t3.e(d5);
    }
}
