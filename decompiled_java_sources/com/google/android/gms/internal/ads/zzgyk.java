package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class zzgyk extends AbstractExecutorService implements zzgzy, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzgzy, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhan.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (j3.a) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* renamed from: zza */
    public final j3.a submit(Runnable runnable) {
        return (j3.a) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* renamed from: zzb */
    public final j3.a submit(Runnable runnable, Object obj) {
        return (j3.a) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* renamed from: zzc */
    public final j3.a submit(Callable callable) {
        return (j3.a) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzhan(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (j3.a) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Callable callable) {
        return (j3.a) super.submit(callable);
    }
}
