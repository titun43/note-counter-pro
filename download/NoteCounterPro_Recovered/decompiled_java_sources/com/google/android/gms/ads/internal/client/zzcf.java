package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public final class zzcf extends zzbcs implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(String str, zzea zzeaVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, zzeaVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzg(String str, zze zzeVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
