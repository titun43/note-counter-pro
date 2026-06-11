package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbqx extends zzbct implements zzbqy {
    public zzbqx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            if (i5 != 2) {
                return false;
            }
            parcel.readInt();
            zzbcu.zzh(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
