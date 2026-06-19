package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public final class zzdr extends zzbcs implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(zzt zztVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zztVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final boolean zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }
}
