package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class zzcmw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcmw(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcmw zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcmw(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return z2.c.a(((zzcmj) this.zza).zza()).c(0, ((ApplicationInfo) this.zzb.zzb()).packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
