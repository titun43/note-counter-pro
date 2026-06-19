package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f609f;
    }

    public j3.a getForegroundInfoAsync() {
        v1.j jVar = new v1.j();
        jVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f604a;
    }

    public final g getInputData() {
        return this.mWorkerParams.f605b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f607d.f285j;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f608e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f606c;
    }

    public w1.a getTaskExecutor() {
        return this.mWorkerParams.f610g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f607d.h;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f607d.f284i;
    }

    public v getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final j3.a setForegroundAsync(h hVar) {
        this.mRunInForeground = true;
        u1.o oVar = this.mWorkerParams.f612j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        oVar.getClass();
        v1.j jVar = new v1.j();
        ((androidx.emoji2.text.t) oVar.f3526a).i(new u1.n(oVar, jVar, id, hVar, applicationContext));
        return jVar;
    }

    public j3.a setProgressAsync(g gVar) {
        u1.p pVar = this.mWorkerParams.f611i;
        getApplicationContext();
        UUID id = getId();
        pVar.getClass();
        v1.j jVar = new v1.j();
        ((androidx.emoji2.text.t) pVar.f3531b).i(new j.f(pVar, id, gVar, jVar, 1));
        return jVar;
    }

    public void setRunInForeground(boolean z4) {
        this.mRunInForeground = z4;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract j3.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
