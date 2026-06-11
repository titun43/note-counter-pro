package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbts extends zzbct implements zzbtt {
    public zzbts() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbtt zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbtt ? (zzbtt) queryLocalInterface : new zzbtr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzbtw zzb = zzb(readString);
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzb);
        } else if (i5 == 2) {
            String readString2 = parcel.readString();
            zzbcu.zzh(parcel);
            boolean zzc = zzc(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzc ? 1 : 0);
        } else if (i5 == 3) {
            String readString3 = parcel.readString();
            zzbcu.zzh(parcel);
            zzbvs zze = zze(readString3);
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zze);
        } else {
            if (i5 != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzbcu.zzh(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
