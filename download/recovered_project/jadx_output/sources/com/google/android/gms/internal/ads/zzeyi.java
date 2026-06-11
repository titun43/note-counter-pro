package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class zzeyi implements zzfax {
    private final Context zza;
    private final Intent zzb;

    public zzeyi(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzom)).booleanValue()) {
            return zzgzo.zza(new zzeyj(null));
        }
        boolean z4 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z4 = true;
            }
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgzo.zza(new zzeyj(Boolean.valueOf(z4)));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 60;
    }
}
