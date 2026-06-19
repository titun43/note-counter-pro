package androidx.work;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Worker f678g;

    public t(Worker worker) {
        this.f678g = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f678g;
        try {
            worker.mFuture.h(worker.doWork());
        } catch (Throwable th) {
            worker.mFuture.i(th);
        }
    }
}
