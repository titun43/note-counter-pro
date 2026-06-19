package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbpi extends zzbcs implements zzbpk {
    public zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() {
        zzda(2, zza());
    }
}
