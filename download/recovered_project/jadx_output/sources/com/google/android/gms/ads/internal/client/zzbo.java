package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public final class zzbo extends zzbcs implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(zzm zzmVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final boolean zzg() {
        Parcel zzcZ = zzcZ(3, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzh() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzm zzmVar, int i5) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zza.writeInt(i5);
        zzda(5, zza);
    }
}
