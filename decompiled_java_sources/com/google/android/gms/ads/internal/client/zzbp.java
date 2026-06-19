package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzbp extends zzbct implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zzm zzmVar = (zzm) zzbcu.zzb(parcel, zzm.CREATOR);
            zzbcu.zzh(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
        } else if (i5 == 2) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i5 == 3) {
            boolean zzg = zzg();
            parcel2.writeNoException();
            int i7 = zzbcu.zza;
            parcel2.writeInt(zzg ? 1 : 0);
        } else if (i5 == 4) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
        } else {
            if (i5 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzbcu.zzb(parcel, zzm.CREATOR);
            int readInt = parcel.readInt();
            zzbcu.zzh(parcel);
            zzi(zzmVar2, readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
