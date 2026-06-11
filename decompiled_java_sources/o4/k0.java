package o4;

/* loaded from: classes.dex */
public abstract class k0 extends r {

    /* renamed from: i, reason: collision with root package name */
    public long f2812i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2813j;

    /* renamed from: k, reason: collision with root package name */
    public u3.e f2814k;

    public final void o() {
        long j2 = this.f2812i - 4294967296L;
        this.f2812i = j2;
        if (j2 <= 0 && this.f2813j) {
            shutdown();
        }
    }

    public abstract Thread p();

    public final void q(boolean z4) {
        this.f2812i = (z4 ? 4294967296L : 1L) + this.f2812i;
        if (z4) {
            return;
        }
        this.f2813j = true;
    }

    public final boolean r() {
        u3.e eVar = this.f2814k;
        if (eVar == null) {
            return false;
        }
        d0 d0Var = (d0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (d0Var == null) {
            return false;
        }
        d0Var.run();
        return true;
    }

    public abstract void shutdown();
}
