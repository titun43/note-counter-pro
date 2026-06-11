package l2;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t2.i f2513a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2514b;

    public b(t2.i iVar, HashMap hashMap) {
        this.f2513a = iVar;
        this.f2514b = hashMap;
    }

    public final long a(c2.c cVar, long j2, int i5) {
        long s5 = j2 - this.f2513a.s();
        c cVar2 = (c) this.f2514b.get(cVar);
        long j5 = cVar2.f2515a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i5 - 1) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j5 > 1 ? j5 : 2L) * r12))), s5), cVar2.f2516b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2513a.equals(bVar.f2513a) && this.f2514b.equals(bVar.f2514b);
    }

    public final int hashCode() {
        return ((this.f2513a.hashCode() ^ 1000003) * 1000003) ^ this.f2514b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f2513a + ", values=" + this.f2514b + "}";
    }
}
