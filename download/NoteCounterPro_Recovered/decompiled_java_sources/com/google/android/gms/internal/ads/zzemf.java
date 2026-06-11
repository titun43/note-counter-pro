package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzemf implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;
    final /* synthetic */ zzemg zzc;

    public zzemf(zzemg zzemgVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzemgVar);
        this.zzc = zzemgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z4, Context context, zzdbs zzdbsVar) {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z4);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbo)).intValue()) {
                zzfkiVar.zzd();
            } else {
                zzfkiVar.zze(context);
            }
        } catch (zzfjr e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdmb(e4.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzb;
    }
}
