package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgzh extends zzgzg {
    private final j3.a zza;

    public zzgzh(j3.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyi, j3.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return this.zza.cancel(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.zza.get(j2, timeUnit);
    }
}
