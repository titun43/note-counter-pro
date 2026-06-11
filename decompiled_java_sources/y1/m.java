package y1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f3857a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f3858b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3857a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + this.f3858b.getAndIncrement());
        return newThread;
    }
}
