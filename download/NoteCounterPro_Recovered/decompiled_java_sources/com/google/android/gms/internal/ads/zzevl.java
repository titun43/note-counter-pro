package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzevl implements zzfax {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final x2.b zzc;
    private final Executor zzd;
    private final zzfax zze;
    private final long zzf;
    private final zzdxz zzg;

    public zzevl(zzfax zzfaxVar, long j2, x2.b bVar, Executor executor, zzdxz zzdxzVar) {
        this.zzc = bVar;
        this.zze = zzfaxVar;
        this.zzf = j2;
        this.zzd = executor;
        this.zzg = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        zzevi zzeviVar;
        zzevi zzeviVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznk)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznj)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcei.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzevk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzevl.this.zzc();
                    }
                };
                long j2 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j2, j2, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzeviVar = (zzevi) atomicReference.get();
                    if (zzeviVar == null) {
                        zzevi zzeviVar3 = new zzevi(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzeviVar3);
                        return zzeviVar3.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzeviVar.zza()) {
                        j3.a aVar = zzeviVar.zza;
                        zzfax zzfaxVar = this.zze;
                        zzeviVar2 = new zzevi(zzfaxVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzeviVar2);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznl)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznm)).booleanValue()) {
                                zzdxy zza = this.zzg.zza();
                                zza.zzc("action", "scs");
                                zza.zzc("sid", String.valueOf(zzfaxVar.zzb()));
                                zza.zzd();
                            }
                            return aVar;
                        }
                        zzeviVar = zzeviVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeviVar = (zzevi) atomicReference2.get();
            if (zzeviVar == null || zzeviVar.zza()) {
                zzfax zzfaxVar2 = this.zze;
                zzeviVar2 = new zzevi(zzfaxVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzeviVar2);
                zzeviVar = zzeviVar2;
            }
        }
        return zzeviVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return this.zze.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzevl.this.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzevi(this.zze.zza(), this.zzf, this.zzc));
    }
}
