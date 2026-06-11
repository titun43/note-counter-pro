package u1;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final t f3533g;
    public final String h;

    public s(t tVar, String str) {
        this.f3533g = tVar;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3533g.f3538d) {
            try {
                if (((s) this.f3533g.f3536b.remove(this.h)) != null) {
                    r rVar = (r) this.f3533g.f3537c.remove(this.h);
                    if (rVar != null) {
                        String str = this.h;
                        androidx.work.n.e().b(n1.e.f2667p, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((n1.e) rVar).d();
                    }
                } else {
                    androidx.work.n.e().b("WrkTimerRunnable", "Timer with " + this.h + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
