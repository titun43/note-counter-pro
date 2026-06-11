package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzcak extends zzbcs implements zzcam {
    public zzcak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzg() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzh() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzi(zzcag zzcagVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcagVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzk(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzl() {
        zzda(8, zza());
    }
}
