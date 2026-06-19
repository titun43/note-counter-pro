package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzcap extends zzbcs implements zzcar {
    public zzcap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zze(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzf(a3.a aVar, int i5) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzg(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzh(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzi(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzj(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzk(a3.a aVar, zzcas zzcasVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzcasVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzl(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzm(a3.a aVar, int i5) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeInt(i5);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzn(a3.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzo(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzp(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(13, zza);
    }
}
