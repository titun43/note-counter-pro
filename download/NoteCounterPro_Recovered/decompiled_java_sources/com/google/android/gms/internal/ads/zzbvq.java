package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbvq extends zzbcs implements zzbvs {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(a3.a aVar, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbvv zzbvvVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zzc(zza, bundle);
        zzbcu.zzc(zza, bundle2);
        zzbcu.zzc(zza, zzrVar);
        zzbcu.zze(zza, zzbvvVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwh zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwh zzg() {
        Parcel zzcZ = zzcZ(3, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final com.google.android.gms.ads.internal.client.zzed zzh() {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvgVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvj zzbvjVar, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvjVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzk(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(15, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvpVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzm(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvmVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvpVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvgVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzrVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar, zzbkh zzbkhVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvmVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzbkhVar);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvd zzbvdVar, zzbtz zzbtzVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvdVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzt(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(24, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
