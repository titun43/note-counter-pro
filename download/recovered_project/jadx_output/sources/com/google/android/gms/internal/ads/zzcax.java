package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzcax extends zzbcs implements zzcaz {
    public zzcax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzb(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, zzcbgVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, zzcbgVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcbcVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdqVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzh(zzcbn zzcbnVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzcbnVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(a3.a aVar, boolean z4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzcaw zzl() {
        zzcaw zzcauVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcauVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcauVar = queryLocalInterface instanceof zzcaw ? (zzcaw) queryLocalInterface : new zzcau(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        Parcel zzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzn() {
        Parcel zzcZ = zzcZ(16, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdtVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzp(boolean z4) {
        Parcel zza = zza();
        int i5 = zzbcu.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final long zzq() {
        Parcel zzcZ = zzcZ(17, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzr(long j2) {
        Parcel zza = zza();
        zza.writeLong(j2);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) {
        throw null;
    }
}
