package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfrs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzfsa zzc;

    public zzfrs(zzfsa zzfsaVar, long j2, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j2;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzc = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzX;
        zzfsa zzfsaVar = this.zzc;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzI = zzfsaVar.zzI();
            long j2 = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfrm zzK = zzfsaVar.zzK();
            zzX = zzfsa.zzX(zzeaVar);
            zzI.zzi(j2, zzX, zzK, zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzfsaVar.zzH());
        }
    }
}
