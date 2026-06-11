package o4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class y0 implements o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2850b = AtomicIntegerFieldUpdater.newUpdater(y0.class, "_isCompleting$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2851c = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_rootCause$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2852d = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final a1 f2853a;

    public y0(a1 a1Var, Throwable th) {
        this.f2853a = a1Var;
        this._rootCause$volatile = th;
    }

    @Override // o4.o0
    public final boolean a() {
        return d() == null;
    }

    public final void b(Throwable th) {
        Throwable d5 = d();
        if (d5 == null) {
            f2851c.set(this, th);
            return;
        }
        if (th == d5) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2852d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // o4.o0
    public final a1 c() {
        return this.f2853a;
    }

    public final Throwable d() {
        return (Throwable) f2851c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2852d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable d5 = d();
        if (d5 != null) {
            arrayList.add(0, d5);
        }
        if (th != null && !th.equals(d5)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, w.f2841g);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f2850b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(f2852d.get(this));
        sb.append(", list=");
        sb.append(this.f2853a);
        sb.append(']');
        return sb.toString();
    }
}
