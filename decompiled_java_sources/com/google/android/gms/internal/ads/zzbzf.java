package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbzf extends zzbcs implements zzbzh {
    public zzbzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbzuVar);
        zzbcu.zze(zza, zzbzlVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbzuVar);
        zzbcu.zze(zza, zzbzlVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbzuVar);
        zzbcu.zze(zza, zzbzlVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, zzbzlVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        throw null;
    }
}
