package u1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class q implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f3532a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.f3532a);
        this.f3532a = this.f3532a + 1;
        return newThread;
    }
}
