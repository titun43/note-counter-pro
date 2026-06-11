package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzcbe extends zzbcs implements zzcbg {
    public zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
