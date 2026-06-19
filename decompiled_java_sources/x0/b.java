package x0;

import g4.i;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3694a;

    public b(List list) {
        i.e(list, "topics");
        this.f3694a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f3694a;
        int size = list.size();
        List list2 = ((b) obj).f3694a;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.f3694a);
    }

    public final String toString() {
        return "Topics=" + this.f3694a;
    }
}
