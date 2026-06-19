package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzef extends zzbct implements zzeg {
    public zzef() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            zze();
        } else if (i5 == 2) {
            zzf();
        } else if (i5 == 3) {
            zzg();
        } else if (i5 == 4) {
            zzh();
        } else {
            if (i5 != 5) {
                return false;
            }
            boolean zza = zzbcu.zza(parcel);
            zzbcu.zzh(parcel);
            zzi(zza);
        }
        parcel2.writeNoException();
        return true;
    }
}
