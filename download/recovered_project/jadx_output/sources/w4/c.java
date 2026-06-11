package w4;

import androidx.emoji2.text.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o4.w;

/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3633g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f3634a;

    public final Object c(y3.c cVar) {
        int i5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f3641f;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 > 1) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1));
            } else {
                t3.h hVar = t3.h.f3400a;
                if (i6 <= 0) {
                    o4.f f5 = w.f(a.a.o(cVar));
                    try {
                        a(new b(this, f5));
                        Object q5 = f5.q();
                        x3.a aVar = x3.a.f3712g;
                        if (q5 != aVar) {
                            q5 = hVar;
                        }
                        return q5 == aVar ? q5 : hVar;
                    } catch (Throwable th) {
                        f5.x();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i6, i6 - 1)) {
                    f3633g.set(this, null);
                    return hVar;
                }
            }
        }
    }

    public final void d(Object obj) {
        while (Math.max(g.f3641f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3633g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            r rVar = d.f3634a;
            if (obj2 != rVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(w.e(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f3641f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f3633g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
