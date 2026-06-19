package r3;

import android.net.Uri;

/* loaded from: classes.dex */
public final class e0 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f3179d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f3180e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f3181f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, Uri uri, h0 h0Var, boolean z4) {
        super(z4);
        g4.i.e(str, "fullPath");
        this.f3179d = str;
        this.f3180e = uri;
        this.f3181f = h0Var;
        this.f3182g = z4;
    }

    @Override // r3.f0
    public final boolean B() {
        return this.f3182g;
    }

    @Override // r3.f0
    public final Uri C() {
        return this.f3180e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return g4.i.a(this.f3179d, e0Var.f3179d) && g4.i.a(this.f3180e, e0Var.f3180e) && this.f3181f == e0Var.f3181f && this.f3182g == e0Var.f3182g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3182g) + ((this.f3181f.hashCode() + ((this.f3180e.hashCode() + (this.f3179d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Local(fullPath=" + this.f3179d + ", uri=" + this.f3180e + ", type=" + this.f3181f + ", inExternalStorage=" + this.f3182g + ")";
    }
}
