package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzbkr extends zzbct implements zzbks {
    public zzbkr() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbks zzh(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 1:
                a3.a zzb = zzb();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzb);
                return true;
            case 2:
                Uri zzc = zzc();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzc);
                return true;
            case 3:
                double zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeDouble(zzd);
                return true;
            case 4:
                int zze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(zze);
                return true;
            case 5:
                int zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeInt(zzf);
                return true;
            case 6:
                Map zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeMap(zzg);
                return true;
            default:
                return false;
        }
    }
}
