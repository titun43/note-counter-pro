package b1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f699a;

    /* renamed from: b, reason: collision with root package name */
    public final String f700b;

    /* renamed from: c, reason: collision with root package name */
    public final String f701c;

    /* renamed from: d, reason: collision with root package name */
    public final List f702d;

    /* renamed from: e, reason: collision with root package name */
    public final List f703e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f699a = str;
        this.f700b = str2;
        this.f701c = str3;
        this.f702d = Collections.unmodifiableList(list);
        this.f703e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f699a.equals(bVar.f699a) && this.f700b.equals(bVar.f700b) && this.f701c.equals(bVar.f701c) && this.f702d.equals(bVar.f702d)) {
            return this.f703e.equals(bVar.f703e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f703e.hashCode() + ((this.f702d.hashCode() + ((this.f701c.hashCode() + ((this.f700b.hashCode() + (this.f699a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f699a + "', onDelete='" + this.f700b + "', onUpdate='" + this.f701c + "', columnNames=" + this.f702d + ", referenceColumnNames=" + this.f703e + '}';
    }
}
