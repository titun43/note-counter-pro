package o3;

import r3.c0;

/* loaded from: classes.dex */
public final class j extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f2777g;
    public c0 h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2778i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f2779j;

    /* renamed from: k, reason: collision with root package name */
    public int f2780k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, y3.c cVar) {
        super(cVar);
        this.f2779j = kVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2778i = obj;
        this.f2780k |= Integer.MIN_VALUE;
        Object i5 = this.f2779j.i(null, null, this);
        return i5 == x3.a.f3712g ? i5 : new t3.e(i5);
    }
}
