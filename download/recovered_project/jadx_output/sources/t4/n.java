package t4;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3431e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3432f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.emoji2.text.r f3433g = new androidx.emoji2.text.r("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f3434a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3437d;

    public n(int i5, boolean z4) {
        this.f3434a = i5;
        this.f3435b = z4;
        int i6 = i5 - 1;
        this.f3436c = i6;
        this.f3437d = new AtomicReferenceArray(i5);
        if (i6 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i5 & i6) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3432f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i5 = (int) (1073741823 & j2);
            int i6 = (int) ((1152921503533105152L & j2) >> 30);
            int i7 = this.f3436c;
            if (((i6 + 2) & i7) == (i5 & i7)) {
                return 1;
            }
            boolean z4 = this.f3435b;
            AtomicReferenceArray atomicReferenceArray = this.f3437d;
            if (z4 || atomicReferenceArray.get(i6 & i7) == null) {
                if (f3432f.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i6 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i6 & i7, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f3437d;
                        int i8 = nVar.f3436c & i6;
                        Object obj2 = atomicReferenceArray2.get(i8);
                        if ((obj2 instanceof m) && ((m) obj2).f3430a == i6) {
                            atomicReferenceArray2.set(i8, obj);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i9 = this.f3434a;
                if (i9 < 1024 || ((i6 - i5) & 1073741823) > (i9 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f3432f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f3432f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j5 = 1152921504606846976L | j2;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j2, j5)) {
                j2 = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3431e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f3434a * 2, nVar.f3435b);
            int i5 = (int) (1073741823 & j2);
            int i6 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i7 = nVar.f3436c;
                int i8 = i5 & i7;
                if (i8 == (i7 & i6)) {
                    break;
                }
                Object obj = nVar.f3437d.get(i8);
                if (obj == null) {
                    obj = new m(i5);
                }
                nVar3.f3437d.set(nVar3.f3436c & i5, obj);
                i5++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3432f;
            long j2 = atomicLongFieldUpdater.get(nVar);
            if ((j2 & 1152921504606846976L) != 0) {
                return f3433g;
            }
            int i5 = (int) (j2 & 1073741823);
            int i6 = nVar.f3436c;
            int i7 = i5 & i6;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i6) == i7) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f3437d;
            Object obj = atomicReferenceArray.get(i7);
            boolean z4 = nVar.f3435b;
            if (obj == null) {
                if (z4) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j5 = (i5 + 1) & 1073741823;
                if (f3432f.compareAndSet(nVar, j2, (j2 & (-1073741824)) | j5)) {
                    atomicReferenceArray.set(i7, null);
                    return obj;
                }
                nVar = this;
                if (z4) {
                    while (true) {
                        long j6 = atomicLongFieldUpdater.get(nVar);
                        int i8 = (int) (j6 & 1073741823);
                        if ((j6 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f3432f.compareAndSet(nVar2, j6, (j6 & (-1073741824)) | j5)) {
                                nVar2.f3437d.set(i8 & nVar2.f3436c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
