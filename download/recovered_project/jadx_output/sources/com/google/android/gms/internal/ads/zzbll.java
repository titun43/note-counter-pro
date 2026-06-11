package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbll extends zzbct implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzblm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzblm ? (zzblm) queryLocalInterface : new zzblk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 1:
                String readString = parcel.readString();
                zzbcu.zzh(parcel);
                String zze = zze(readString);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbks zzf = zzf(readString2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf);
                return true;
            case 3:
                List<String> zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(zzg);
                return true;
            case 4:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzbcu.zzh(parcel);
                zzi(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzed zzk = zzk();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                a3.a zzm = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            case 10:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                boolean zzn = zzn(a5);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i7 = zzbcu.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 13:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i8 = zzbcu.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 14:
                a3.a a6 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzq(a6);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbkp zzs = zzs();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzs);
                return true;
            case 17:
                a3.a a7 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                boolean zzt = zzt(a7);
                parcel2.writeNoException();
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
