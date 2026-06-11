package w4;

import java.util.concurrent.atomic.AtomicReferenceArray;
import t4.s;

/* loaded from: classes.dex */
public final class i extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3649e;

    public i(long j2, i iVar, int i5) {
        super(j2, iVar, i5);
        this.f3649e = new AtomicReferenceArray(h.f3648f);
    }

    @Override // t4.s
    public final int f() {
        return h.f3648f;
    }

    @Override // t4.s
    public final void g(int i5, w3.h hVar) {
        this.f3649e.set(i5, h.f3647e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3442c + ", hashCode=" + hashCode() + ']';
    }
}
