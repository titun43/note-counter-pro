package h3;

import androidx.fragment.app.o;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1722c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1723d;

    public k(Executor executor, j jVar, int i5) {
        this.f1720a = i5;
        switch (i5) {
            case 1:
                this.f1722c = new Object();
                this.f1721b = executor;
                this.f1723d = jVar;
                break;
            default:
                this.f1722c = new Object();
                this.f1721b = executor;
                this.f1723d = jVar;
                break;
        }
    }

    @Override // h3.l
    public final void a(g gVar) {
        switch (this.f1720a) {
            case 0:
                if (((n) gVar).f1730d) {
                    synchronized (this.f1722c) {
                    }
                    this.f1721b.execute(new o(this, 11));
                    return;
                }
                return;
            default:
                if (gVar.c()) {
                    synchronized (this.f1722c) {
                    }
                    this.f1721b.execute(new c0.a(this, gVar, 9, false));
                    return;
                }
                return;
        }
    }
}
