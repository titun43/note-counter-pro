package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzbtv extends zzbct implements zzbtw {
    public zzbtv() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzbtz zzbtxVar;
        zzbtz zzbtxVar2;
        zzbtz zzbtxVar3;
        zzbtz zzbtxVar4;
        zzbtz zzbtxVar5;
        zzbtz zzbtxVar6;
        zzbtz zzbtxVar7;
        zzbtz zzbtxVar8;
        zzbtz zzbtzVar = null;
        switch (i5) {
            case 1:
                a3.a a5 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbtxVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar = queryLocalInterface instanceof zzbtz ? (zzbtz) queryLocalInterface : new zzbtx(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zze(a5, zzrVar, zzmVar, readString, zzbtxVar);
                parcel2.writeNoException();
                return true;
            case 2:
                a3.a zzf = zzf();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf);
                return true;
            case 3:
                a3.a a6 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbtxVar2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar2 = queryLocalInterface2 instanceof zzbtz ? (zzbtz) queryLocalInterface2 : new zzbtx(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zzg(a6, zzmVar2, readString2, zzbtxVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                a3.a a7 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzbtxVar3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar3 = queryLocalInterface3 instanceof zzbtz ? (zzbtz) queryLocalInterface3 : new zzbtx(readStrongBinder3);
                }
                zzbcu.zzh(parcel);
                zzj(a7, zzrVar2, zzmVar3, readString3, readString4, zzbtxVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                a3.a a8 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    zzbtxVar4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar4 = queryLocalInterface4 instanceof zzbtz ? (zzbtz) queryLocalInterface4 : new zzbtx(readStrongBinder4);
                }
                zzbcu.zzh(parcel);
                zzk(a8, zzmVar4, readString5, readString6, zzbtxVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                a3.a a9 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString7 = parcel.readString();
                zzcar zzb = zzcaq.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzbcu.zzh(parcel);
                zzn(a9, zzmVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString9 = parcel.readString();
                zzbcu.zzh(parcel);
                zzo(zzmVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i7 = zzbcu.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                a3.a a10 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    zzbtxVar5 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar5 = queryLocalInterface5 instanceof zzbtz ? (zzbtz) queryLocalInterface5 : new zzbtx(readStrongBinder5);
                }
                zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzbcu.zzh(parcel);
                zzr(a10, zzmVar7, readString10, readString11, zzbtxVar5, zzbkhVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 17:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzs);
                return true;
            case 18:
                Bundle zzt = zzt();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzt);
                return true;
            case 19:
                Bundle zzu = zzu();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzbcu.zzh(parcel);
                zzv(zzmVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case zzbgj.zzt.zzm /* 21 */:
                a3.a a11 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzw(a11);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i8 = zzbcu.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                a3.a a12 = a3.b.a(parcel.readStrongBinder());
                zzcar zzb2 = zzcaq.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzbcu.zzh(parcel);
                zzy(a12, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzblm zzz = zzz();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzz);
                return true;
            case 25:
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzA(zza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzed zzB = zzB();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzB);
                return true;
            case 27:
                zzbui zzC = zzC();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzC);
                return true;
            case 28:
                a3.a a13 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    zzbtxVar6 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar6 = queryLocalInterface6 instanceof zzbtz ? (zzbtz) queryLocalInterface6 : new zzbtx(readStrongBinder6);
                }
                zzbcu.zzh(parcel);
                zzD(a13, zzmVar9, readString14, zzbtxVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                a3.a a14 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzE(a14);
                parcel2.writeNoException();
                return true;
            case 31:
                a3.a a15 = a3.b.a(parcel.readStrongBinder());
                zzbqk zzb3 = zzbqj.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbqq.CREATOR);
                zzbcu.zzh(parcel);
                zzF(a15, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                a3.a a16 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    zzbtxVar7 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar7 = queryLocalInterface7 instanceof zzbtz ? (zzbtz) queryLocalInterface7 : new zzbtx(readStrongBinder7);
                }
                zzbcu.zzh(parcel);
                zzG(a16, zzmVar10, readString15, zzbtxVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbwh zzH = zzH();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzH);
                return true;
            case 34:
                zzbwh zzI = zzI();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzI);
                return true;
            case 35:
                a3.a a17 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    zzbtxVar8 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtxVar8 = queryLocalInterface8 instanceof zzbtz ? (zzbtz) queryLocalInterface8 : new zzbtx(readStrongBinder8);
                }
                zzbcu.zzh(parcel);
                zzJ(a17, zzrVar3, zzmVar11, readString16, readString17, zzbtxVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbuc zzK = zzK();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzK);
                return true;
            case 37:
                a3.a a18 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzL(a18);
                parcel2.writeNoException();
                return true;
            case 38:
                a3.a a19 = a3.b.a(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface9 instanceof zzbtz ? (zzbtz) queryLocalInterface9 : new zzbtx(readStrongBinder9);
                }
                zzbcu.zzh(parcel);
                zzM(a19, zzmVar12, readString18, zzbtzVar);
                parcel2.writeNoException();
                return true;
            case 39:
                a3.a a20 = a3.b.a(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzN(a20);
                parcel2.writeNoException();
                return true;
        }
    }
}
