package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzcg extends zzbct implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzea zzdyVar;
        if (i5 == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzdyVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
            }
            zzbcu.zzh(parcel);
            zze(readString, zzdyVar);
        } else if (i5 == 2) {
            String readString2 = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(readString2);
        } else {
            if (i5 != 3) {
                return false;
            }
            String readString3 = parcel.readString();
            zze zzeVar = (zze) zzbcu.zzb(parcel, zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(readString3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
