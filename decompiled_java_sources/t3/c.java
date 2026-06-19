package t3;

import g4.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Object f3394g;
    public final Object h;

    public c(Object obj, Object obj2) {
        this.f3394g = obj;
        this.h = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f3394g, cVar.f3394g) && i.a(this.h, cVar.h);
    }

    public final int hashCode() {
        Object obj = this.f3394g;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.h;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3394g + ", " + this.h + ')';
    }
}
