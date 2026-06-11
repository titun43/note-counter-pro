package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzcdc extends zzbct implements zzcdd {
    public zzcdc() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcdd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcdd ? (zzcdd) queryLocalInterface : new zzcdb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzcda zzcdaVar = null;
        switch (i5) {
            case 1:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                zzcdh zzcdhVar = (zzcdh) zzbcu.zzb(parcel, zzcdh.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcdaVar = queryLocalInterface instanceof zzcda ? (zzcda) queryLocalInterface : new zzccy(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zze(a5, zzcdhVar, zzcdaVar);
                parcel2.writeNoException();
                return true;
            case 2:
                a3.a a6 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(a6);
                parcel2.writeNoException();
                return true;
            case 3:
                a3.b.a(parcel.readStrongBinder());
                a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 4:
                a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                a3.a a7 = a3.b.a(parcel.readStrongBinder());
                zzbyh zzb = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(createTypedArrayList, a7, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                a3.a a8 = a3.b.a(parcel.readStrongBinder());
                zzbyh zzb2 = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(createTypedArrayList2, a8, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbyk zzbykVar = (zzbyk) zzbcu.zzb(parcel, zzbyk.CREATOR);
                zzbcu.zzh(parcel);
                zzi(zzbykVar);
                parcel2.writeNoException();
                return true;
            case 8:
                a3.a a9 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzj(a9);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                a3.a a10 = a3.b.a(parcel.readStrongBinder());
                zzbyh zzb3 = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzk(createTypedArrayList3, a10, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                a3.a a11 = a3.b.a(parcel.readStrongBinder());
                zzbyh zzb4 = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzl(createTypedArrayList4, a11, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                a3.a a12 = a3.b.a(parcel.readStrongBinder());
                a3.a a13 = a3.b.a(parcel.readStrongBinder());
                String readString = parcel.readString();
                a3.a a14 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                a3.a zzm = zzm(a12, a13, readString, a14);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            default:
                return false;
        }
    }
}
