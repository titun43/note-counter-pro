package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class zzgzs implements j3.a {
    static final j3.a zza = new zzgzs(null);
    private static final zzgzw zzb = new zzgzw(zzgzs.class);
    private final Object zzc;

    public zzgzs(Object obj) {
        this.zzc = obj;
    }

    @Override // j3.a
    public final void addListener(Runnable runnable, Executor executor) {
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            Logger zza2 = zzb.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", u.n(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzc;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        return u.n(new StringBuilder(String.valueOf(obj2).length() + 25 + valueOf.length() + 2), obj2, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzc;
    }
}
