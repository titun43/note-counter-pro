package androidx.work;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f632a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f632a.equals(((e) obj).f632a);
    }

    public final int hashCode() {
        return this.f632a.hashCode();
    }
}
