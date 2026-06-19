package o4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2802e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2803f;

    public /* synthetic */ h(Object obj, int i5) {
        this.f2802e = i5;
        this.f2803f = obj;
    }

    @Override // o4.v0
    public final boolean k() {
        switch (this.f2802e) {
        }
        return false;
    }

    @Override // o4.v0
    public final void l(Throwable th) {
        switch (this.f2802e) {
            case 0:
                f fVar = (f) this.f2803f;
                Throwable p5 = fVar.p(j());
                if (fVar.u()) {
                    t4.g gVar = (t4.g) fVar.f2797j;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t4.g.f3414n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        androidx.emoji2.text.r rVar = t4.b.f3404c;
                        if (g4.i.a(obj, rVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, rVar, p5)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != rVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                fVar.l(p5);
                if (!fVar.u()) {
                    fVar.m();
                    break;
                }
                break;
            case 1:
                ((f4.l) this.f2803f).a(th);
                break;
            default:
                w0 w0Var = (w0) this.f2803f;
                Object obj2 = z0.f2855g.get(j());
                if (!(obj2 instanceof n)) {
                    w0Var.resumeWith(w.n(obj2));
                    break;
                } else {
                    w0Var.resumeWith(b3.g.g(((n) obj2).f2822a));
                    break;
                }
        }
    }
}
