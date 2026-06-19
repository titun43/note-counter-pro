package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbvb extends zzbcs implements zzbvd {
    public zzbvb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(4, zza);
    }
}
