package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzhae extends zzhaa implements zzgzz {
    final ScheduledExecutorService zza;

    public zzhae(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd */
    public final zzgzx schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhan zze = zzhan.zze(runnable, null);
        return new zzhac(zze, scheduledExecutorService.schedule(zze, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze */
    public final zzgzx schedule(Callable callable, long j2, TimeUnit timeUnit) {
        zzhan zzhanVar = new zzhan(callable);
        return new zzhac(zzhanVar, this.zza.schedule(zzhanVar, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf */
    public final zzgzx scheduleAtFixedRate(Runnable runnable, long j2, long j5, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleAtFixedRate(zzhadVar, j2, j5, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg */
    public final zzgzx scheduleWithFixedDelay(Runnable runnable, long j2, long j5, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleWithFixedDelay(zzhadVar, j2, j5, timeUnit));
    }
}
