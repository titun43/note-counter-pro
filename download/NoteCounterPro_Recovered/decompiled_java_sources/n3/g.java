package n3;

/* loaded from: classes.dex */
public final class g implements k3.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2699a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2700b = false;

    /* renamed from: c, reason: collision with root package name */
    public k3.c f2701c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2702d;

    public g(e eVar) {
        this.f2702d = eVar;
    }

    @Override // k3.g
    public final k3.g b(String str) {
        if (this.f2699a) {
            throw new k3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2699a = true;
        this.f2702d.c(this.f2701c, str, this.f2700b);
        return this;
    }

    @Override // k3.g
    public final k3.g c(boolean z4) {
        if (this.f2699a) {
            throw new k3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2699a = true;
        this.f2702d.b(this.f2701c, z4 ? 1 : 0, this.f2700b);
        return this;
    }
}
