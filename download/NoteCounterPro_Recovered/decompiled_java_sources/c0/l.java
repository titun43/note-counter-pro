package c0;

import android.os.Process;

/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: g, reason: collision with root package name */
    public final int f771g;

    public l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f771g = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f771g);
        super.run();
    }
}
