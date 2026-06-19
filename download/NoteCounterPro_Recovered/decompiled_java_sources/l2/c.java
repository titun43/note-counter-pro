package l2;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2515a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2516b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2517c;

    public c(long j2, long j5, Set set) {
        this.f2515a = j2;
        this.f2516b = j5;
        this.f2517c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f2515a == cVar.f2515a && this.f2516b == cVar.f2516b && this.f2517c.equals(cVar.f2517c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f2515a;
        int i5 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f2516b;
        return ((i5 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f2517c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f2515a + ", maxAllowedDelay=" + this.f2516b + ", flags=" + this.f2517c + "}";
    }
}
