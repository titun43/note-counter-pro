package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: classes.dex */
public abstract class zzcx extends zzbct implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zzfc liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, liteSdkVersion);
        } else {
            if (i5 != 2) {
                return false;
            }
            zzbtt adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
