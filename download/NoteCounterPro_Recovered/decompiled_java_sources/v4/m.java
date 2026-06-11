package v4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3619b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3620c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3621d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3622e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f3623a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3621d;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 - f3620c.get(this) == 0) {
                return null;
            }
            int i6 = i5 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 + 1) && (iVar = (i) this.f3623a.getAndSet(i6, null)) != null) {
                if (iVar.h) {
                    f3622e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i5, boolean z4) {
        int i6 = i5 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f3623a;
        i iVar = (i) atomicReferenceArray.get(i6);
        if (iVar != null && iVar.h == z4) {
            while (!atomicReferenceArray.compareAndSet(i6, iVar, null)) {
                if (atomicReferenceArray.get(i6) != iVar) {
                }
            }
            if (z4) {
                f3622e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
