package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1.f f463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.a f465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.b f466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f467e;

    public v(z zVar, u1.f fVar, AtomicReference atomicReference, e.a aVar, d.b bVar) {
        this.f467e = zVar;
        this.f463a = fVar;
        this.f464b = atomicReference;
        this.f465c = aVar;
        this.f466d = bVar;
    }

    @Override // androidx.fragment.app.y
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        z zVar = this.f467e;
        sb.append(zVar.f494k);
        sb.append("_rq#");
        sb.append(zVar.W.getAndIncrement());
        String sb2 = sb.toString();
        z zVar2 = (z) this.f463a.h;
        d0 d0Var = zVar2.A;
        this.f464b.set((d0Var != null ? d0Var.f371q.getActivityResultRegistry() : zVar2.u().getActivityResultRegistry()).c(sb2, zVar, this.f465c, this.f466d));
    }
}
