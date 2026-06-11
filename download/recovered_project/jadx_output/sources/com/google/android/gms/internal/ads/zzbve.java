package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbve extends zzbcs implements zzbvg {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh(zzbuc zzbucVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbucVar);
        zzda(4, zza);
    }
}
