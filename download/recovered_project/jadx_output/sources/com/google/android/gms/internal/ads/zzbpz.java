package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbpz extends zzbcs implements IInterface {
    public zzbpz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbpt zzbptVar, zzbpy zzbpyVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbptVar);
        zzbcu.zze(zza, zzbpyVar);
        zzdb(2, zza);
    }
}
