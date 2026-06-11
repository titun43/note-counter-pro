package com.google.android.gms.ads.internal.client;

import a3.a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public final class zzdu extends zzbcs implements zzdw {
    public zzdu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, a aVar, a aVar2) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzda(1, zza);
    }
}
