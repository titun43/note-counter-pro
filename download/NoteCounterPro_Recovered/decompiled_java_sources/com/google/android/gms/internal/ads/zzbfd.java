package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbfd extends zzbct implements zzbfe {
    public zzbfd() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zzc();
        } else if (i5 == 2) {
            zzd();
        } else if (i5 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zze(zzeVar);
        } else if (i5 == 4) {
            zzf();
        } else {
            if (i5 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
