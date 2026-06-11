package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbko extends zzbct implements zzbkp {
    public zzbko() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzbma zzbmaVar;
        switch (i5) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(a5);
                parcel2.writeNoException();
                return true;
            case 4:
                a3.a zzg = zzg();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 5:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 6:
                float zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(zzi);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzed zzj = zzj();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzj);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i7 = zzbcu.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbmaVar = queryLocalInterface instanceof zzbma ? (zzbma) queryLocalInterface : new zzbma(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzm(zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i8 = zzbcu.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
