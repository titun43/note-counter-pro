package i0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1791a;

    /* renamed from: b, reason: collision with root package name */
    public int f1792b;

    /* renamed from: c, reason: collision with root package name */
    public float f1793c;

    /* renamed from: d, reason: collision with root package name */
    public float f1794d;

    /* renamed from: e, reason: collision with root package name */
    public long f1795e;

    /* renamed from: f, reason: collision with root package name */
    public long f1796f;

    /* renamed from: g, reason: collision with root package name */
    public long f1797g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f1798i;

    public final float a(long j2) {
        if (j2 < this.f1795e) {
            return 0.0f;
        }
        long j5 = this.f1797g;
        if (j5 < 0 || j2 < j5) {
            return d.b((j2 - r0) / this.f1791a, 0.0f, 1.0f) * 0.5f;
        }
        float f5 = this.h;
        return (d.b((j2 - j5) / this.f1798i, 0.0f, 1.0f) * f5) + (1.0f - f5);
    }
}
