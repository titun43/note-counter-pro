package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbmk extends zzbcs implements zzbmm {
    public zzbmk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzA() {
        Parcel zzcZ = zzcZ(24, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdjVar);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdfVar);
        zzda(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzD() {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzE() {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkp zzF() {
        zzbkp zzbknVar;
        Parcel zzcZ = zzcZ(29, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbknVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbknVar = queryLocalInterface instanceof zzbkp ? (zzbkp) queryLocalInterface : new zzbkn(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzG() {
        Parcel zzcZ = zzcZ(30, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final com.google.android.gms.ads.internal.client.zzea zzH() {
        Parcel zzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdtVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzJ(Bundle bundle) {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(33, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final long zzK() {
        Parcel zzcZ = zzcZ(34, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzL(long j2) {
        Parcel zza = zza();
        zza.writeLong(j2);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zze() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzf() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbcu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzg() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbks zzh() {
        zzbks zzbkqVar;
        Parcel zzcZ = zzcZ(5, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbkqVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzi() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzj() {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final double zzk() {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzl() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzm() {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final com.google.android.gms.ads.internal.client.zzed zzn() {
        Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzp() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkl zzq() {
        zzbkl zzbkjVar;
        Parcel zzcZ = zzcZ(14, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbkjVar = queryLocalInterface instanceof zzbkl ? (zzbkl) queryLocalInterface : new zzbkj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzr(Bundle bundle) {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzs(Bundle bundle) {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(16, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzt(Bundle bundle) {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final a3.a zzu() {
        return u.f(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final a3.a zzv() {
        return u.f(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final Bundle zzw() {
        Parcel zzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzx(zzbmj zzbmjVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmjVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzy() {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzz() {
        Parcel zzcZ = zzcZ(23, zza());
        ArrayList zzf = zzbcu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }
}
