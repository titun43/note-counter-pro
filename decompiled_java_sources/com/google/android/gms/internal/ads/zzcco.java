package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzcco implements ThreadFactory {
    private final AtomicInteger zza;

    public zzcco(zzccq zzccqVar) {
        Objects.requireNonNull(zzccqVar);
        this.zza = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new Thread(runnable, u.l(new StringBuilder(String.valueOf(andIncrement).length() + 31), "AdWorker(SCION_TASK_EXECUTOR) #", andIncrement));
    }
}
