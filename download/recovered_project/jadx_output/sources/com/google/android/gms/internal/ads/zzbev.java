package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbev extends zzbcs implements zzbex {
    public zzbev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzf(a3.a aVar, zzbfe zzbfeVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbfeVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzea zzg() {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzh(boolean z4) {
        Parcel zza = zza();
        int i5 = zzbcu.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdtVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final String zzj() {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final long zzk() {
        Parcel zzcZ = zzcZ(9, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzl(long j2) {
        Parcel zza = zza();
        zza.writeLong(j2);
        zzda(10, zza);
    }
}
