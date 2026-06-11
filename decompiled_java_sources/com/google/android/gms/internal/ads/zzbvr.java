package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public abstract class zzbvr extends zzbct implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbvs ? (zzbvs) queryLocalInterface : new zzbvq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzbvv zzbvvVar = null;
        zzbvd zzbvdVar = null;
        zzbvm zzbvmVar = null;
        zzbvg zzbveVar = null;
        zzbvp zzbvpVar = null;
        zzbvm zzbvmVar2 = null;
        zzbvp zzbvpVar2 = null;
        zzbvj zzbvjVar = null;
        zzbvg zzbveVar2 = null;
        if (i5 == 1) {
            a3.a a5 = a3.b.a(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzbcu.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbvvVar = queryLocalInterface instanceof zzbvv ? (zzbvv) queryLocalInterface : new zzbvt(readStrongBinder);
            }
            zzbcu.zzh(parcel);
            zze(a5, readString, bundle, bundle2, zzrVar, zzbvvVar);
            parcel2.writeNoException();
        } else if (i5 == 2) {
            zzbwh zzf = zzf();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, zzf);
        } else if (i5 == 3) {
            zzbwh zzg = zzg();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, zzg);
        } else if (i5 == 5) {
            com.google.android.gms.ads.internal.client.zzed zzh = zzh();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzh);
        } else if (i5 == 10) {
            a3.b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            parcel2.writeNoException();
        } else if (i5 != 11) {
            switch (i5) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a6 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbveVar2 = queryLocalInterface2 instanceof zzbvg ? (zzbvg) queryLocalInterface2 : new zzbve(readStrongBinder2);
                    }
                    zzbvg zzbvgVar = zzbveVar2;
                    zzbtz zzb = zzbty.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbcu.zzh(parcel);
                    zzi(readString2, readString3, zzmVar, a6, zzbvgVar, zzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a7 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbvjVar = queryLocalInterface3 instanceof zzbvj ? (zzbvj) queryLocalInterface3 : new zzbvh(readStrongBinder3);
                    }
                    zzbtz zzb2 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzj(readString4, readString5, zzmVar2, a7, zzbvjVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    a3.a a8 = a3.b.a(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    boolean zzk = zzk(a8);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzk ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a9 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvpVar2 = queryLocalInterface4 instanceof zzbvp ? (zzbvp) queryLocalInterface4 : new zzbvn(readStrongBinder4);
                    }
                    zzbtz zzb3 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzl(readString6, readString7, zzmVar3, a9, zzbvpVar2, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    a3.a a10 = a3.b.a(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    boolean zzm = zzm(a10);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzm ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a11 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvmVar2 = queryLocalInterface5 instanceof zzbvm ? (zzbvm) queryLocalInterface5 : new zzbvk(readStrongBinder5);
                    }
                    zzbtz zzb4 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzn(readString8, readString9, zzmVar4, a11, zzbvmVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzbcu.zzh(parcel);
                    zzo(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a12 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvpVar = queryLocalInterface6 instanceof zzbvp ? (zzbvp) queryLocalInterface6 : new zzbvn(readStrongBinder6);
                    }
                    zzbtz zzb5 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzp(readString11, readString12, zzmVar5, a12, zzbvpVar, zzb5);
                    parcel2.writeNoException();
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a13 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbveVar = queryLocalInterface7 instanceof zzbvg ? (zzbvg) queryLocalInterface7 : new zzbve(readStrongBinder7);
                    }
                    zzbvg zzbvgVar2 = zzbveVar;
                    zzbtz zzb6 = zzbty.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbcu.zzh(parcel);
                    zzq(readString13, readString14, zzmVar6, a13, zzbvgVar2, zzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a14 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvmVar = queryLocalInterface8 instanceof zzbvm ? (zzbvm) queryLocalInterface8 : new zzbvk(readStrongBinder8);
                    }
                    zzbtz zzb7 = zzbty.zzb(parcel.readStrongBinder());
                    zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                    zzbcu.zzh(parcel);
                    zzr(readString15, readString16, zzmVar7, a14, zzbvmVar, zzb7, zzbkhVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    a3.a a15 = a3.b.a(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbvdVar = queryLocalInterface9 instanceof zzbvd ? (zzbvd) queryLocalInterface9 : new zzbvb(readStrongBinder9);
                    }
                    zzbtz zzb8 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzs(readString17, readString18, zzmVar8, a15, zzbvdVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    a3.a a16 = a3.b.a(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    boolean zzt = zzt(a16);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzbcu.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
