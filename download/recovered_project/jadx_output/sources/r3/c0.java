package r3;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3173b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f3174c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3175d;

    public c0(String str, e eVar, b0 b0Var, boolean z4) {
        g4.i.e(eVar, "encoding");
        this.f3172a = str;
        this.f3173b = eVar;
        this.f3174c = b0Var;
        this.f3175d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return g4.i.a(this.f3172a, c0Var.f3172a) && g4.i.a(this.f3173b, c0Var.f3173b) && this.f3174c == c0Var.f3174c && this.f3175d == c0Var.f3175d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3175d) + ((this.f3174c.hashCode() + ((this.f3173b.hashCode() + (this.f3172a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IONFILESaveOptions(data=" + this.f3172a + ", encoding=" + this.f3173b + ", mode=" + this.f3174c + ", createFileRecursive=" + this.f3175d + ")";
    }
}
