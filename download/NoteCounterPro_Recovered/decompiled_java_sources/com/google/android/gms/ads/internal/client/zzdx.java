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
public final class zzdx extends zzbcs implements IInterface {
    public zzdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdw zze(a aVar, zzbtt zzbttVar, int i5) {
        zzdw zzduVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzduVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzduVar = queryLocalInterface instanceof zzdw ? (zzdw) queryLocalInterface : new zzdu(readStrongBinder);
        }
        zzcZ.recycle();
        return zzduVar;
    }
}
