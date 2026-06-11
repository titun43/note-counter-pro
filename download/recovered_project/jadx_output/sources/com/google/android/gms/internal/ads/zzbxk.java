package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbxk extends zzbct implements zzbxl {
    public zzbxk() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbxl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbxl ? (zzbxl) queryLocalInterface : new zzbxj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 1:
                Intent intent = (Intent) zzbcu.zzb(parcel, Intent.CREATOR);
                zzbcu.zzh(parcel);
                zze(intent);
                break;
            case 2:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzf(a5, readString, readString2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                a3.a a6 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(a6);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                a3.a a7 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(createStringArray, createIntArray, a7);
                break;
            case 6:
                a3.a a8 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzbcu.zzh(parcel);
                zzj(a8, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
