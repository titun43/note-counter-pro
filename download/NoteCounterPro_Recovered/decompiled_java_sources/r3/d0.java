package r3;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d0 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public final Uri f3177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Uri uri) {
        super(false);
        g4.i.e(uri, "uri");
        this.f3177d = uri;
    }

    @Override // r3.f0
    public final Uri C() {
        return this.f3177d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && g4.i.a(this.f3177d, ((d0) obj).f3177d);
    }

    public final int hashCode() {
        return this.f3177d.hashCode();
    }

    public final String toString() {
        return "Content(uri=" + this.f3177d + ")";
    }
}
