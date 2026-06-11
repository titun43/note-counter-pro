package com.google.android.gms.ads.internal.client;

import a3.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: classes.dex */
public final class zzby extends zzbcs implements IInterface {
    public zzby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(a aVar, zzr zzrVar, String str, zzbtt zzbttVar, int i5, int i6) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zza.writeInt(i6);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}
