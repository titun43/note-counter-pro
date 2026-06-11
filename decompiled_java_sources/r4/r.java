package r4;

import o4.r0;

/* loaded from: classes.dex */
public final class r extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public s f3259g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public u f3260i;

    /* renamed from: j, reason: collision with root package name */
    public r0 f3261j;

    /* renamed from: k, reason: collision with root package name */
    public Object f3262k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f3264m;

    /* renamed from: n, reason: collision with root package name */
    public int f3265n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, w3.c cVar) {
        super(cVar);
        this.f3264m = sVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3263l = obj;
        this.f3265n |= Integer.MIN_VALUE;
        this.f3264m.j(null, this);
        return x3.a.f3712g;
    }
}
