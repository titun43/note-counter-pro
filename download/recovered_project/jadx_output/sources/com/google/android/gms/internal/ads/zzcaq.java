package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzcaq extends zzbct implements zzcar {
    public zzcaq() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzcar zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzcar ? (zzcar) queryLocalInterface : new zzcap(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 1:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zze(a5);
                break;
            case 2:
                a3.a a6 = a3.b.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                zzf(a6, readInt);
                break;
            case 3:
                a3.a a7 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(a7);
                break;
            case 4:
                a3.a a8 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(a8);
                break;
            case 5:
                a3.a a9 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(a9);
                break;
            case 6:
                a3.a a10 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzj(a10);
                break;
            case 7:
                a3.a a11 = a3.b.a(parcel.readStrongBinder());
                zzcas zzcasVar = (zzcas) zzbcu.zzb(parcel, zzcas.CREATOR);
                zzbcu.zzh(parcel);
                zzk(a11, zzcasVar);
                break;
            case 8:
                a3.a a12 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzl(a12);
                break;
            case 9:
                a3.a a13 = a3.b.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzm(a13, readInt2);
                break;
            case 10:
                a3.a a14 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzn(a14);
                break;
            case 11:
                a3.a a15 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(a15);
                break;
            case 12:
                zzbcu.zzh(parcel);
                break;
            case 13:
                a3.a a16 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzp(a16);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
