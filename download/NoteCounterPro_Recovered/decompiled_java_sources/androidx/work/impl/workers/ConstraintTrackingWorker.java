package androidx.work.impl.workers;

import android.content.Context;
import androidx.fragment.app.o;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.n;
import java.util.ArrayList;
import java.util.List;
import l1.k;
import p1.b;
import v1.j;
import w1.a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final String f663l = n.g("ConstraintTrkngWrkr");

    /* renamed from: g, reason: collision with root package name */
    public final WorkerParameters f664g;
    public final Object h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f665i;

    /* renamed from: j, reason: collision with root package name */
    public final j f666j;

    /* renamed from: k, reason: collision with root package name */
    public ListenableWorker f667k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f664g = workerParameters;
        this.h = new Object();
        this.f665i = false;
        this.f666j = new j();
    }

    @Override // p1.b
    public final void e(ArrayList arrayList) {
        n.e().b(f663l, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.h) {
            this.f665i = true;
        }
    }

    @Override // p1.b
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return k.Q(getApplicationContext()).f2490f;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f667k;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f667k;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f667k.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final j3.a startWork() {
        getBackgroundExecutor().execute(new o(this, 17));
        return this.f666j;
    }
}
