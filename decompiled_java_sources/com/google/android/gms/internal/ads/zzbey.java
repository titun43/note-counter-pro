package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbey extends zzbcs implements zzbfa {
    public zzbey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbexVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
