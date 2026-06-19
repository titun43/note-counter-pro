package v1;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final j f3568g;
    public final j3.a h;

    public e(j jVar, j3.a aVar) {
        this.f3568g = jVar;
        this.h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3568g.f3576g != this) {
            return;
        }
        if (h.f3574l.d(this.f3568g, this, h.e(this.h))) {
            h.b(this.f3568g);
        }
    }
}
