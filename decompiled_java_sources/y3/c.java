package y3;

import g4.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.r;
import w3.h;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final h _context;
    private transient w3.c intercepted;

    public c(w3.c cVar, h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // w3.c
    public h getContext() {
        h hVar = this._context;
        i.b(hVar);
        return hVar;
    }

    public final w3.c intercepted() {
        w3.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        w3.e eVar = (w3.e) getContext().d(w3.d.f3630g);
        w3.c gVar = eVar != null ? new t4.g((r) eVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // y3.a
    public void releaseIntercepted() {
        w3.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            w3.f d5 = getContext().d(w3.d.f3630g);
            i.b(d5);
            t4.g gVar = (t4.g) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t4.g.f3414n;
            while (atomicReferenceFieldUpdater.get(gVar) == t4.b.f3404c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            o4.f fVar = obj instanceof o4.f ? (o4.f) obj : null;
            if (fVar != null) {
                fVar.m();
            }
        }
        this.intercepted = b.f3876g;
    }

    public c(w3.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
