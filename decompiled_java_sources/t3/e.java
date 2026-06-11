package t3;

import g4.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Object f3396g;

    public static final Throwable a(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).f3395g;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return i.a(this.f3396g, ((e) obj).f3396g);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3396g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3396g;
        if (obj instanceof d) {
            return ((d) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
