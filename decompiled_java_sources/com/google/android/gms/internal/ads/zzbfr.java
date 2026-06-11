package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbfr extends zzbcs implements IInterface {
    public zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbfm zze(zzbfp zzbfpVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbfpVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzbfm zzbfmVar = (zzbfm) zzbcu.zzb(zzcZ, zzbfm.CREATOR);
        zzcZ.recycle();
        return zzbfmVar;
    }

    public final zzbfm zzf(zzbfp zzbfpVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbfpVar);
        Parcel zzcZ = zzcZ(2, zza);
        zzbfm zzbfmVar = (zzbfm) zzbcu.zzb(zzcZ, zzbfm.CREATOR);
        zzcZ.recycle();
        return zzbfmVar;
    }

    public final long zzg(zzbfp zzbfpVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbfpVar);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }
}
