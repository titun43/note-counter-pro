package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzctw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzctw(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzctw zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzctw(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public static zzdeg zzd(ScheduledExecutorService scheduledExecutorService, x2.b bVar, zzdxz zzdxzVar) {
        return new zzdeg(scheduledExecutorService, bVar, zzdxzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdeg zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (x2.b) this.zzb.zzb(), (zzdxz) this.zzc.zzb());
    }
}
