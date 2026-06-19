package h3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements l, e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1716a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1717b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1718c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1719d;

    public /* synthetic */ j(Executor executor, b bVar, n nVar, int i5) {
        this.f1716a = i5;
        this.f1717b = executor;
        this.f1719d = bVar;
        this.f1718c = nVar;
    }

    @Override // h3.l
    public final void a(g gVar) {
        switch (this.f1716a) {
            case 0:
                this.f1717b.execute(new c0.a(this, gVar, 5, false));
                return;
            case 1:
                this.f1717b.execute(new c0.a(this, gVar, 6, false));
                return;
            case 2:
                synchronized (this.f1719d) {
                }
                this.f1717b.execute(new c0.a(this, gVar, 7, false));
                return;
            default:
                if (gVar.c() || ((n) gVar).f1730d) {
                    return;
                }
                synchronized (this.f1719d) {
                }
                this.f1717b.execute(new c0.a(this, gVar, 8, false));
                return;
        }
    }

    @Override // h3.e
    public void onFailure(Exception exc) {
        ((n) this.f1718c).d(exc);
    }

    public j(Executor executor, d dVar) {
        this.f1716a = 2;
        this.f1719d = new Object();
        this.f1717b = executor;
        this.f1718c = dVar;
    }

    public j(Executor executor, e eVar) {
        this.f1716a = 3;
        this.f1719d = new Object();
        this.f1717b = executor;
        this.f1718c = eVar;
    }
}
