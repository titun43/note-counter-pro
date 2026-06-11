package r3;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final e f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3216d;

    public z(e eVar, int i5, int i6, int i7) {
        g4.i.e(eVar, "encoding");
        this.f3213a = eVar;
        this.f3214b = i5;
        this.f3215c = i6;
        this.f3216d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return g4.i.a(this.f3213a, zVar.f3213a) && this.f3214b == zVar.f3214b && this.f3215c == zVar.f3215c && this.f3216d == zVar.f3216d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3216d) + ((Integer.hashCode(this.f3215c) + ((Integer.hashCode(this.f3214b) + (this.f3213a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IONFILEReadInChunksOptions(encoding=" + this.f3213a + ", chunkSize=" + this.f3214b + ", offset=" + this.f3215c + ", length=" + this.f3216d + ")";
    }
}
