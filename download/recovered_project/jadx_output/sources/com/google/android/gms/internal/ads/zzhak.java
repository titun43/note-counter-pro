package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzhak extends zzgzf {
    private j3.a zza;
    private ScheduledFuture zzb;

    private zzhak(j3.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    public static j3.a zze(j3.a aVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhak zzhakVar = new zzhak(aVar);
        zzhai zzhaiVar = new zzhai(zzhakVar);
        zzhakVar.zzb = scheduledExecutorService.schedule(zzhaiVar, j2, timeUnit);
        aVar.addListener(zzhaiVar, zzgzd.INSTANCE);
        return zzhakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        j3.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar == null) {
            return null;
        }
        String obj = aVar.toString();
        String b2 = h1.b(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
        if (scheduledFuture == null) {
            return b2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return b2;
        }
        int length = b2.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(b2);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final /* synthetic */ j3.a zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
