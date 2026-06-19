package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzcu extends zzbct implements zzcv {
    public zzcu() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zze zzeVar = (zze) zzbcu.zzb(parcel, zze.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzeVar);
        } else if (i5 == 2) {
            zzc();
        } else if (i5 == 3) {
            zzd();
        } else if (i5 == 4) {
            zze();
        } else {
            if (i5 != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
