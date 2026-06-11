package k0;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class z extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public d0 f2398g;
    public FileInputStream h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2399i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f2400j;

    /* renamed from: k, reason: collision with root package name */
    public int f2401k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2400j = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2399i = obj;
        this.f2401k |= Integer.MIN_VALUE;
        return this.f2400j.f(this);
    }
}
