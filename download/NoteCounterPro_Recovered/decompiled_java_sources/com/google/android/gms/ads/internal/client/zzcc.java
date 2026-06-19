package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public final class zzcc extends zzbcs implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzft zzftVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzftVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzft zzftVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzftVar);
        zzda(2, zza);
    }
}
