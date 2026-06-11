package androidx.work;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    v1.j mFuture;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m doWork();

    @Override // androidx.work.ListenableWorker
    public final j3.a startWork() {
        this.mFuture = new v1.j();
        getBackgroundExecutor().execute(new t(this));
        return this.mFuture;
    }
}
