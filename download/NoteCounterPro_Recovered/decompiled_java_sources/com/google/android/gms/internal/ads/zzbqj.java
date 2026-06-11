package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbqj extends zzbct implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbqk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzbqk ? (zzbqk) queryLocalInterface : new zzbqi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 2) {
            zze();
        } else {
            if (i5 != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
