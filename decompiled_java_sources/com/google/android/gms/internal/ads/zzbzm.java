package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbzm extends zzbcs implements IInterface {
    public zzbzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbzd zzbzdVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, zzbzdVar);
        zzda(1, zza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbaVar);
        zzda(2, zza);
    }
}
