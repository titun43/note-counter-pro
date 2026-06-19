package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public abstract class zzcai extends zzbct implements zzcaj {
    public zzcai() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zzcan zzcanVar = (zzcan) zzbcu.zzb(parcel, zzcan.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzcanVar);
            parcel2.writeNoException();
        } else if (i5 != 2) {
            zzcam zzcamVar = null;
            zzcah zzcahVar = null;
            if (i5 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcamVar = queryLocalInterface instanceof zzcam ? (zzcam) queryLocalInterface : new zzcak(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzd(zzcamVar);
                parcel2.writeNoException();
            } else if (i5 != 34) {
                switch (i5) {
                    case 5:
                        boolean zze = zze();
                        parcel2.writeNoException();
                        int i7 = zzbcu.zza;
                        parcel2.writeInt(zze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        a3.a a5 = a3.b.a(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzi(a5);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        a3.a a6 = a3.b.a(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzj(a6);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        a3.a a7 = a3.b.a(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzk(a7);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(zzl);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzm(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzcb zzb = com.google.android.gms.ads.internal.client.zzca.zzb(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzn(zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzo = zzo();
                        parcel2.writeNoException();
                        zzbcu.zzd(parcel2, zzo);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcahVar = queryLocalInterface2 instanceof zzcah ? (zzcah) queryLocalInterface2 : new zzcah(readStrongBinder2);
                        }
                        zzbcu.zzh(parcel);
                        zzu(zzcahVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbcu.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        a3.a a8 = a3.b.a(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzp(a8);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzq(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i8 = zzbcu.zza;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case zzbgj.zzt.zzm /* 21 */:
                        com.google.android.gms.ads.internal.client.zzea zzt = zzt();
                        parcel2.writeNoException();
                        zzbcu.zze(parcel2, zzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzr(zza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
