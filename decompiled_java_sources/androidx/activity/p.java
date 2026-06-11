package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class p implements n, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final long f57g = SystemClock.uptimeMillis() + 10000;
    public Runnable h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f58i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f59j;

    public p(s sVar) {
        this.f59j = sVar;
    }

    public final void a(View view) {
        if (this.f58i) {
            return;
        }
        this.f58i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g4.i.e(runnable, "runnable");
        this.h = runnable;
        View decorView = this.f59j.getWindow().getDecorView();
        g4.i.d(decorView, "getDecorView(...)");
        if (!this.f58i) {
            decorView.postOnAnimation(new o(this, 0));
        } else if (g4.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.h;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f57g) {
                this.f58i = false;
                this.f59j.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.h = null;
        v fullyDrawnReporter = this.f59j.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f66b) {
            z4 = fullyDrawnReporter.f67c;
        }
        if (z4) {
            this.f58i = false;
            this.f59j.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f59j.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
