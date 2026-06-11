package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbly extends zzbct implements zzblz {
    public zzbly() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzblz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof zzblz ? (zzblz) queryLocalInterface : new zzblx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        zzblm zzblkVar;
        if (i5 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzblkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzblkVar = queryLocalInterface instanceof zzblm ? (zzblm) queryLocalInterface : new zzblk(readStrongBinder);
        }
        zzbcu.zzh(parcel);
        zze(zzblkVar);
        parcel2.writeNoException();
        return true;
    }
}
