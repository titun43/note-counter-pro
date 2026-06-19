package t3;

import g4.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f3395g;

    public d(Throwable th) {
        i.e(th, "exception");
        this.f3395g = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f3395g, ((d) obj).f3395g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3395g.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3395g + ')';
    }
}
