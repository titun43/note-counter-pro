package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzccz extends zzbct implements zzcda {
    public zzccz() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            parcel.readString();
            parcel.readString();
            zzbcu.zzh(parcel);
        } else if (i5 == 2) {
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzb(readString);
        } else {
            if (i5 != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
            zzbcu.zzh(parcel);
            zzc(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
