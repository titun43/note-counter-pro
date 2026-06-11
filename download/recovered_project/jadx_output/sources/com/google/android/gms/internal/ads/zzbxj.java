package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbxj extends zzbcs implements zzbxl {
    public zzbxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent) {
        Parcel zza = zza();
        zzbcu.zzc(zza, intent);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf(a3.a aVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzh(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzi(String[] strArr, int[] iArr, a3.a aVar) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbcu.zze(zza, aVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzj(a3.a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzaVar);
        zzda(6, zza);
    }
}
