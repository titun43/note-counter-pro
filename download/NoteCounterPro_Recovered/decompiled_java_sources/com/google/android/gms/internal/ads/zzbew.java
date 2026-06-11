package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbew extends zzbct implements zzbex {
    public zzbew() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbex zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzbex ? (zzbex) queryLocalInterface : new zzbev(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzbfe zzbfcVar;
        switch (i5) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbx zze = zze();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbfcVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbfcVar = queryLocalInterface instanceof zzbfe ? (zzbfe) queryLocalInterface : new zzbfc(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zzf(a5, zzbfcVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzea zzg = zzg();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 6:
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdt zzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 9:
                long zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                zzbcu.zzh(parcel);
                zzl(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
