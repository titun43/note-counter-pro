package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbkk extends zzbct implements zzbkl {
    public zzbkk() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbkl zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzbkl ? (zzbkl) queryLocalInterface : new zzbkj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 2) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
            return true;
        }
        if (i5 != 3) {
            return false;
        }
        List zzc = zzc();
        parcel2.writeNoException();
        parcel2.writeList(zzc);
        return true;
    }
}
