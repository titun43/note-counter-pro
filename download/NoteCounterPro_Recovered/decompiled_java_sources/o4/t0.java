package o4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class t0 extends z0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2831i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0() {
        super(true);
        boolean z4 = true;
        D(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.h;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        j jVar = iVar instanceof j ? (j) iVar : null;
        if (jVar != null) {
            z0 j2 = jVar.j();
            while (!j2.y()) {
                i iVar2 = (i) atomicReferenceFieldUpdater.get(j2);
                j jVar2 = iVar2 instanceof j ? (j) iVar2 : null;
                if (jVar2 != null) {
                    j2 = jVar2.j();
                }
            }
            this.f2831i = z4;
        }
        z4 = false;
        this.f2831i = z4;
    }

    @Override // o4.z0
    public final boolean y() {
        return this.f2831i;
    }

    @Override // o4.z0
    public final boolean z() {
        return true;
    }
}
