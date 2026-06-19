package k;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2188a;

    /* renamed from: b, reason: collision with root package name */
    public int f2189b;

    /* renamed from: c, reason: collision with root package name */
    public int f2190c;

    /* renamed from: d, reason: collision with root package name */
    public int f2191d;

    /* renamed from: e, reason: collision with root package name */
    public int f2192e;

    /* renamed from: f, reason: collision with root package name */
    public int f2193f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2194g;
    public boolean h;

    public final void a(int i5, int i6) {
        this.f2190c = i5;
        this.f2191d = i6;
        this.h = true;
        if (this.f2194g) {
            if (i6 != Integer.MIN_VALUE) {
                this.f2188a = i6;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.f2189b = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f2188a = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f2189b = i6;
        }
    }
}
