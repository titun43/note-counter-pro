package k3;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2439a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2440b;

    public c(String str, Map map) {
        this.f2439a = str;
        this.f2440b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2439a.equals(cVar.f2439a) && this.f2440b.equals(cVar.f2440b);
    }

    public final int hashCode() {
        return this.f2440b.hashCode() + (this.f2439a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2439a + ", properties=" + this.f2440b.values() + "}";
    }
}
