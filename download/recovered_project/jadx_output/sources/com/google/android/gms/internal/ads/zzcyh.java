package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzcyh implements zzdha, zzdct {
    private final x2.b zza;
    private final zzcyj zzb;
    private final zzfjk zzc;
    private final String zzd;

    public zzcyh(x2.b bVar, zzcyj zzcyjVar, zzfjk zzfjkVar, String str) {
        this.zza = bVar;
        this.zzb = zzcyjVar;
        this.zzc = zzfjkVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdha
    public final void zza() {
        x2.b bVar = this.zza;
        zzcyj zzcyjVar = this.zzb;
        String str = this.zzd;
        ((x2.c) bVar).getClass();
        zzcyjVar.zzd(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        x2.b bVar = this.zza;
        String str = this.zzd;
        ((x2.c) bVar).getClass();
        this.zzb.zze(this.zzc.zzg, str, SystemClock.elapsedRealtime());
    }
}
