package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbmb extends zzbcs implements zzbmd {
    public zzbmb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zze(com.google.android.gms.ads.internal.client.zzbx zzbxVar, a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbxVar);
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }
}
