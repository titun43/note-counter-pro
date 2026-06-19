package o4;

/* loaded from: classes.dex */
public final class h0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2804a;

    public h0(boolean z4) {
        this.f2804a = z4;
    }

    @Override // o4.o0
    public final boolean a() {
        return this.f2804a;
    }

    @Override // o4.o0
    public final a1 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2804a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
