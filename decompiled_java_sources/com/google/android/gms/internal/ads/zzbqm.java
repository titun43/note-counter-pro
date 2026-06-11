package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzbqm extends zzbct implements zzbqn {
    public zzbqm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbqn zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbqn ? (zzbqn) queryLocalInterface : new zzbql(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbqg.CREATOR);
        zzbcu.zzh(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
