package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzblo extends zzbcs implements zzblq {
    public zzblo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final void zze(zzblh zzblhVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblhVar);
        zzda(1, zza);
    }
}
