package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class zzgzi extends zzgtw implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return zza().cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return zza().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zza().isDone();
    }

    public abstract Future zza();

    @Override // com.google.android.gms.internal.ads.zzgtw
    public /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return zza().get(j2, timeUnit);
    }
}
