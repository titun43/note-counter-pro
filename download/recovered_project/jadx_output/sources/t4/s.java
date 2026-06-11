package t4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o4.d1;

/* loaded from: classes.dex */
public abstract class s extends c implements d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3441d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f3442c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j2, s sVar, int i5) {
        super(sVar);
        this.f3442c = j2;
        this.cleanedAndPointers$volatile = i5 << 16;
    }

    @Override // t4.c
    public final boolean c() {
        return f3441d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3441d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i5, w3.h hVar);

    public final void h() {
        if (f3441d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f3441d;
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 65536 + i5));
        return true;
    }
}
