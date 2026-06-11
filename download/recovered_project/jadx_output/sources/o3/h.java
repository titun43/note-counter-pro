package o3;

import r3.a0;

/* loaded from: classes.dex */
public final class h extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public k f2768g;
    public a0 h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2769i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2770j;

    /* renamed from: k, reason: collision with root package name */
    public int f2771k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, y3.c cVar) {
        super(cVar);
        this.f2770j = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2769i = obj;
        this.f2771k |= Integer.MIN_VALUE;
        Object h = this.f2770j.h(null, null, this);
        return h == x3.a.f3712g ? h : new t3.e(h);
    }
}
