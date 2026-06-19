package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbqz extends zzbcs implements zzbrb {
    public zzbqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zze(zzbqv zzbqvVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbqvVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
