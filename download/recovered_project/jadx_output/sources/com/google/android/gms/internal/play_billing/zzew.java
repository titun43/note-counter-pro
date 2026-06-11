package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface zzew extends ScheduledExecutorService, zzev, AutoCloseable {
    @Override // com.google.android.gms.internal.play_billing.zzev, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z4 = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z4) {
                    shutdownNow();
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }
}
