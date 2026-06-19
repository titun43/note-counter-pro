package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzblb extends zzbct implements zzblc {
    public zzblb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzblc zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzblc ? (zzblc) queryLocalInterface : new zzbla(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            a3.a a5 = a3.b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzb(a5);
        } else if (i5 == 2) {
            zzc();
        } else {
            if (i5 != 3) {
                return false;
            }
            a3.a a6 = a3.b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzd(a6);
        }
        parcel2.writeNoException();
        return true;
    }
}
