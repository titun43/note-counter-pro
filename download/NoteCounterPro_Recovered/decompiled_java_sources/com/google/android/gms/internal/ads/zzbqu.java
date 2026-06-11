package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbqu extends zzbct implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzbqy zzbqwVar;
        if (i5 == 3) {
            com.google.android.gms.ads.internal.client.zzed zzb = zzb();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzb);
            return true;
        }
        if (i5 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 5) {
            a3.a a5 = a3.b.a(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbqwVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqwVar = queryLocalInterface instanceof zzbqy ? (zzbqy) queryLocalInterface : new zzbqw(readStrongBinder);
            }
            zzbcu.zzh(parcel);
            zzd(a5, zzbqwVar);
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 6) {
            a3.a a6 = a3.b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(a6);
            parcel2.writeNoException();
            return true;
        }
        if (i5 != 7) {
            return false;
        }
        zzbkp zzf = zzf();
        parcel2.writeNoException();
        zzbcu.zze(parcel2, zzf);
        return true;
    }
}
