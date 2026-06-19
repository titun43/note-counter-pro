package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbtu extends zzbcs implements zzbtw {
    public zzbtu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzA(boolean z4) {
        Parcel zza = zza();
        int i5 = zzbcu.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final com.google.android.gms.ads.internal.client.zzed zzB() {
        Parcel zzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbui zzC() {
        zzbui zzbugVar;
        Parcel zzcZ = zzcZ(27, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbugVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbugVar = queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzD(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzE(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzF(a3.a aVar, zzbqk zzbqkVar, List list) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbqkVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzG(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbwh zzH() {
        Parcel zzcZ = zzcZ(33, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbwh zzI() {
        Parcel zzcZ = zzcZ(34, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzJ(a3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuc zzK() {
        zzbuc zzbuaVar;
        Parcel zzcZ = zzcZ(36, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbuaVar = queryLocalInterface instanceof zzbuc ? (zzbuc) queryLocalInterface : new zzbua(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzL(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzM(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzN(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbue zzO() {
        zzbue zzbueVar;
        Parcel zzcZ = zzcZ(15, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbueVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbueVar = queryLocalInterface instanceof zzbue ? (zzbue) queryLocalInterface : new zzbue(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuf zzP() {
        zzbuf zzbufVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbufVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbufVar = queryLocalInterface instanceof zzbuf ? (zzbuf) queryLocalInterface : new zzbuf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zze(a3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final a3.a zzf() {
        return u.f(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzg(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzh() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzi() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzj(a3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzrVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzk(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzl() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzm() {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzn(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzcar zzcarVar, String str2) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(null);
        zzbcu.zze(zza, zzcarVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzp() {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzq() {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzr(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar, zzbkh zzbkhVar, List list) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzbkhVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzs() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzu() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzw(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzx() {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzy(a3.a aVar, zzcar zzcarVar, List list) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzcarVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzblm zzz() {
        throw null;
    }
}
