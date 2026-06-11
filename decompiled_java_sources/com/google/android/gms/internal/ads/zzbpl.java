package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzbpl extends zzbcs implements zzbpn {
    public zzbpl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final zzbpk zze(a3.a aVar, zzbtt zzbttVar, int i5, zzbph zzbphVar) {
        zzbpk zzbpiVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbcu.zze(zza, zzbphVar);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbpiVar = queryLocalInterface instanceof zzbpk ? (zzbpk) queryLocalInterface : new zzbpi(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbpiVar;
    }
}
