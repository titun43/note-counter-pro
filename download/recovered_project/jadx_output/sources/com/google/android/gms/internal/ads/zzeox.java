package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzeox implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;

    public zzeox(zzeoz zzeozVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z4, Context context, zzdbs zzdbsVar) {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z4);
            zzfkiVar.zzm();
        } catch (zzfjr e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot show rewarded video.", e4);
            throw new zzdmb(e4.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzb;
    }
}
