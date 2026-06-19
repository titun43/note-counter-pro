package b1;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f707a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f708b;

    /* renamed from: c, reason: collision with root package name */
    public final List f709c;

    public d(List list, String str, boolean z4) {
        this.f707a = str;
        this.f708b = z4;
        this.f709c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f707a;
        if (this.f708b != dVar.f708b || !this.f709c.equals(dVar.f709c)) {
            return false;
        }
        String str2 = this.f707a;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f707a;
        return this.f709c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f708b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f707a + "', unique=" + this.f708b + ", columns=" + this.f709c + '}';
    }
}
