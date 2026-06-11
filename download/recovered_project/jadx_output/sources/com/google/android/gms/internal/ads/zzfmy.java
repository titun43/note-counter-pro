package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfmy implements zzbdy {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    public zzfmy(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i5);
            zzfmx zzfmxVar = (zzfmx) map.get(scheduledFuture);
            if (zzfmxVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzb(zzfmxVar.zza, Math.max(0L, zzfmxVar.zzb - System.currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z4) {
        if (z4) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfmy.this.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            if (!this.zzd) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
                this.zzd = true;
            }
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            final zzfmx zzfmxVar = new zzfmx(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j2));
            ScheduledFuture<?> schedule = this.zza.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfmx zzfmxVar2;
                    zzfmx zzfmxVar3 = zzfmx.this;
                    zzfmy zzfmyVar = zzfmxVar3.zzd;
                    synchronized (zzfmyVar) {
                        try {
                            ScheduledFuture scheduledFuture = zzfmxVar3.zzc;
                            zzfmxVar2 = scheduledFuture != null ? (zzfmx) zzfmyVar.zze().remove(scheduledFuture) : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (zzfmxVar2 != null) {
                        zzfmxVar3.zzd.zzd().execute(zzfmxVar3.zza);
                    }
                }
            }, j2, timeUnit);
            zzfmxVar.zzc = schedule;
            this.zzc.put(schedule, zzfmxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
