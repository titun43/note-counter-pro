package com.google.android.gms.ads.internal.client;

import a3.a;
import a3.b;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;

/* loaded from: classes.dex */
public abstract class zzcq extends zzbct implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 1:
                a a5 = b.a(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbtt zzf = zzbts.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzb = zzb(a5, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzb);
                return true;
            case 2:
                a a6 = b.a(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbtt zzf2 = zzbts.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzc = zzc(a6, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzc);
                return true;
            case 3:
                a a7 = b.a(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbtt zzf3 = zzbts.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbt zzd = zzd(a7, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzd);
                return true;
            case 4:
                b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                a a8 = b.a(parcel.readStrongBinder());
                a a9 = b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbkw zze = zze(a8, a9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zze);
                return true;
            case 6:
                a a10 = b.a(parcel.readStrongBinder());
                zzbtt zzf4 = zzbts.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaj zzf5 = zzf(a10, zzf4, readInt4);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf5);
                return true;
            case 7:
                b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 8:
                a a11 = b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbxs zzg = zzg(a11);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 9:
                a a12 = b.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzdb zzi = zzi(a12, readInt5);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzi);
                return true;
            case 10:
                a a13 = b.a(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzj = zzj(a13, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzj);
                return true;
            case 11:
                a a14 = b.a(parcel.readStrongBinder());
                a a15 = b.a(parcel.readStrongBinder());
                a a16 = b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzblc zzk = zzk(a14, a15, a16);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzk);
                return true;
            case 12:
                a a17 = b.a(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbtt zzf6 = zzbts.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaz zzl = zzl(a17, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzl);
                return true;
            case 13:
                a a18 = b.a(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbtt zzf7 = zzbts.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzm = zzm(a18, zzrVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            case 14:
                a a19 = b.a(parcel.readStrongBinder());
                zzbtt zzf8 = zzbts.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcdd zzn = zzn(a19, zzf8, readInt9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzn);
                return true;
            case 15:
                a a20 = b.a(parcel.readStrongBinder());
                zzbtt zzf9 = zzbts.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbxl zzo = zzo(a20, zzf9, readInt10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzo);
                return true;
            case 16:
                a a21 = b.a(parcel.readStrongBinder());
                zzbtt zzf10 = zzbts.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbph zzc2 = zzbpg.zzc(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbpk zzp = zzp(a21, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzp);
                return true;
            case 17:
                a a22 = b.a(parcel.readStrongBinder());
                zzbtt zzf11 = zzbts.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzdw zzq = zzq(a22, zzf11, readInt12);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzq);
                return true;
            case 18:
                a a23 = b.a(parcel.readStrongBinder());
                zzbtt zzf12 = zzbts.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzck zzh = zzh(a23, zzf12, readInt13);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
