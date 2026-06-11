package t1;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f3338a;

    /* renamed from: b, reason: collision with root package name */
    public int f3339b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3339b != hVar.f3339b) {
            return false;
        }
        return this.f3338a.equals(hVar.f3338a);
    }

    public final int hashCode() {
        return h1.c(this.f3339b) + (this.f3338a.hashCode() * 31);
    }
}
