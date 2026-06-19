package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbub extends zzbct implements zzbuc {
    public zzbub() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbuc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbuc ? (zzbuc) queryLocalInterface : new zzbua(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            a3.a zze = zze();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zze);
        } else {
            if (i5 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i7 = zzbcu.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
