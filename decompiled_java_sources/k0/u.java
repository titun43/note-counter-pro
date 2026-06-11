package k0;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public d0 f2373g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f2374i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2375j;

    /* renamed from: k, reason: collision with root package name */
    public w f2376k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f2377l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2378m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0 f2379n;

    /* renamed from: o, reason: collision with root package name */
    public int f2380o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2379n = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2378m = obj;
        this.f2380o |= Integer.MIN_VALUE;
        return this.f2379n.c(this);
    }
}
