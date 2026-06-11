package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzcba extends zzbcs implements zzcbc {
    public zzcba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzg(zzcaw zzcawVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcawVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzh(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzk() {
        zzda(7, zza());
    }
}
