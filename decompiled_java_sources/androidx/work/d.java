package androidx.work;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f630a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f631b;

    public d(Uri uri, boolean z4) {
        this.f630a = uri;
        this.f631b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f631b == dVar.f631b && this.f630a.equals(dVar.f630a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f630a.hashCode() * 31) + (this.f631b ? 1 : 0);
    }
}
