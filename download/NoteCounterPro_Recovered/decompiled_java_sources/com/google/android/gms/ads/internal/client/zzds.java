package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzds extends zzbct implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zzt zztVar = (zzt) zzbcu.zzb(parcel, zzt.CREATOR);
            zzbcu.zzh(parcel);
            zze(zztVar);
            parcel2.writeNoException();
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
