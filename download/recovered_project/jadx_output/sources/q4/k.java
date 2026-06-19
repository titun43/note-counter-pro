package q4;

import java.util.concurrent.atomic.AtomicReferenceArray;
import o4.k1;
import t4.s;

/* loaded from: classes.dex */
public final class k extends s {

    /* renamed from: e, reason: collision with root package name */
    public final c f3136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3137f;

    public k(long j2, k kVar, c cVar, int i5) {
        super(j2, kVar, i5);
        this.f3136e = cVar;
        this.f3137f = new AtomicReferenceArray(e.f3114b * 2);
    }

    @Override // t4.s
    public final int f() {
        return e.f3114b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        g4.i.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // t4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i5, w3.h hVar) {
        int i6 = e.f3114b;
        boolean z4 = i5 >= i6;
        if (z4) {
            i5 -= i6;
        }
        this.f3137f.get(i5 * 2);
        while (true) {
            Object k5 = k(i5);
            boolean z5 = k5 instanceof k1;
            c cVar = this.f3136e;
            if (z5 || (k5 instanceof r)) {
                if (j(i5, k5, z4 ? e.f3121j : e.f3122k)) {
                    m(i5, null);
                    l(i5, !z4);
                    if (z4) {
                        g4.i.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k5 == e.f3121j || k5 == e.f3122k) {
                    break;
                }
                if (k5 != e.f3119g && k5 != e.f3118f) {
                    if (k5 == e.f3120i || k5 == e.f3116d || k5 == e.f3123l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k5).toString());
                }
            }
        }
    }

    public final boolean j(int i5, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i6 = (i5 * 2) + 1;
        do {
            atomicReferenceArray = this.f3137f;
            if (atomicReferenceArray.compareAndSet(i6, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i6) == obj);
        return false;
    }

    public final Object k(int i5) {
        return this.f3137f.get((i5 * 2) + 1);
    }

    public final void l(int i5, boolean z4) {
        if (z4) {
            c cVar = this.f3136e;
            g4.i.b(cVar);
            cVar.C((this.f3442c * e.f3114b) + i5);
        }
        h();
    }

    public final void m(int i5, Object obj) {
        this.f3137f.set(i5 * 2, obj);
    }

    public final void n(int i5, Object obj) {
        this.f3137f.set((i5 * 2) + 1, obj);
    }
}
