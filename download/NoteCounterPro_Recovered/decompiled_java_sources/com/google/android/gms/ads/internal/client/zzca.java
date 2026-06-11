package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbct;

/* loaded from: classes.dex */
public abstract class zzca extends zzbct implements zzcb {
    public static zzcb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof zzcb ? (zzcb) queryLocalInterface : new zzbz(iBinder);
    }
}
