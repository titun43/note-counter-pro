package androidx.lifecycle;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final v f572g;
    public final m h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f573i;

    public q0(v vVar, m mVar) {
        g4.i.e(vVar, "registry");
        g4.i.e(mVar, "event");
        this.f572g = vVar;
        this.h = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f573i) {
            return;
        }
        this.f572g.e(this.h);
        this.f573i = true;
    }
}
