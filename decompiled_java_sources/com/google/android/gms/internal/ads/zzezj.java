package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzezj implements zzfax {
    private final zzfax zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzezj(zzfax zzfaxVar, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfaxVar;
        this.zzb = j2;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        j3.a zza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcV)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j2 = this.zzb;
        if (j2 > 0) {
            zza = zzgzo.zzi(zza, j2, timeUnit, this.zzc);
        }
        return zzgzo.zzh(zza, Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzezi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzezj.this.zzc((Throwable) obj);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return this.zza.zzb();
    }

    public final /* synthetic */ j3.a zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcT)).booleanValue()) {
            zzfax zzfaxVar = this.zza;
            zzcdu zzh = com.google.android.gms.ads.internal.zzt.zzh();
            int zzb = zzfaxVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            zzh.zzg(th, sb.toString());
        }
        return zzgzo.zza(null);
    }
}
