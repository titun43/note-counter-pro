package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzcau extends zzbcs implements zzcaw {
    public zzcau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final String zze() {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }
}
