package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbhv extends zzbct implements zzbhw {
    public zzbhv() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i5 == 2) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i5 == 3) {
            a3.a a5 = a3.b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzd(a5);
            parcel2.writeNoException();
        } else if (i5 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i5 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
