package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfnb implements j3.a {
    private final Object zza;
    private final String zzb;
    private final j3.a zzc;

    public zzfnb(Object obj, String str, j3.a aVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = aVar;
    }

    @Override // j3.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzc.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return this.zzc.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.zzc.get(j2, timeUnit);
    }
}
