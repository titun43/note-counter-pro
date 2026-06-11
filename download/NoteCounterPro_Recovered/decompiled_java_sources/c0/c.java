package c0;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f738a;

    /* renamed from: b, reason: collision with root package name */
    public String f739b;

    /* renamed from: c, reason: collision with root package name */
    public List f740c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f738a, cVar.f738a) && Objects.equals(this.f739b, cVar.f739b) && Objects.equals(this.f740c, cVar.f740c);
    }

    public final int hashCode() {
        return Objects.hash(this.f738a, this.f739b, this.f740c);
    }
}
