package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class zzdpi {
    private final zzdxz zza;

    public zzdpi(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final void zza(View view, zzfir zzfirVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(zzfirVar);
        zza.zzd();
    }
}
