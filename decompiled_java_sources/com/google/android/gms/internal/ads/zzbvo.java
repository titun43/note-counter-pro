package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbvo extends zzbct implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 2) {
            zze();
        } else if (i5 == 3) {
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(readString);
        } else {
            if (i5 != 4) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
