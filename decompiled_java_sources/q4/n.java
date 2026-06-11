package q4;

import java.util.concurrent.CancellationException;
import o4.s0;
import o4.w;

/* loaded from: classes.dex */
public final class n extends o4.a implements o, g {

    /* renamed from: j, reason: collision with root package name */
    public final c f3139j;

    public n(w3.h hVar, c cVar) {
        super(hVar, true);
        this.f3139j = cVar;
    }

    @Override // o4.a
    public final void S(boolean z4, Throwable th) {
        if (this.f3139j.g(false, th) || z4) {
            return;
        }
        w.g(th, this.f2785i);
    }

    @Override // o4.a
    public final void T(Object obj) {
        this.f3139j.g(false, null);
    }

    @Override // o4.z0, o4.r0
    public final void b(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new s0(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // q4.q
    public final Object c(Object obj, w3.c cVar) {
        return this.f3139j.c(obj, cVar);
    }

    @Override // q4.q
    public final Object m(Object obj) {
        throw null;
    }

    @Override // o4.z0
    public final void s(CancellationException cancellationException) {
        this.f3139j.g(true, cancellationException);
        r(cancellationException);
    }
}
