package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzbua extends zzbcs implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final a3.a zze() {
        return u.f(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }
}
