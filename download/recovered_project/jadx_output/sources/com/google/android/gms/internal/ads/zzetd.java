package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzetd implements zzfax {
    private final j3.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzetd(j3.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        j3.a aVar = this.zza;
        zzetc zzetcVar = zzetc.zza;
        Executor executor = this.zzb;
        j3.a zzj = zzgzo.zzj(aVar, zzetcVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznV)).intValue() > 0) {
            zzj = zzgzo.zzi(zzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(zzj, Throwable.class, zzetb.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 6;
    }
}
