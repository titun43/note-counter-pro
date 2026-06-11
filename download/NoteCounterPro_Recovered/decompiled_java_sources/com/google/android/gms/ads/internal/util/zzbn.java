package com.google.android.gms.ads.internal.util;

import a3.a;
import a3.b;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzbn extends zzbct implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 == 1) {
            a a5 = b.a(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzbcu.zzh(parcel);
            boolean zze = zze(a5, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i5 == 2) {
            a a6 = b.a(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzf(a6);
            parcel2.writeNoException();
        } else {
            if (i5 != 3) {
                return false;
            }
            a a7 = b.a(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
            zzbcu.zzh(parcel);
            boolean zzg = zzg(a7, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}
