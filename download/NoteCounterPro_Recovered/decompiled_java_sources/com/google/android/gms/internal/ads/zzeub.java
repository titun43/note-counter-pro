package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeub implements zzfav {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzeub(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z4) {
        this.zza = zzxVar;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgt)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i5 = zzxVar.zza;
            if (i5 == 1) {
                bundle.putString("avo", "p");
            } else if (i5 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
