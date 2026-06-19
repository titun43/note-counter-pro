package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbvf extends zzbct implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            a3.a a5 = a3.b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(a5);
        } else if (i5 == 2) {
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(readString);
        } else if (i5 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i5 != 4) {
                return false;
            }
            zzbuc zzb = zzbub.zzb(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
