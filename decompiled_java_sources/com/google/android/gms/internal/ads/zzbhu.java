package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class zzbhu extends zzbhv {
    private final com.google.android.gms.ads.internal.zzg zza;
    private final String zzb;
    private final String zzc;

    public zzbhu(com.google.android.gms.ads.internal.zzg zzgVar, String str, String str2) {
        this.zza = zzgVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zzd(a3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.zza.zza((View) a3.b.b(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zzf() {
        this.zza.zzc();
    }
}
