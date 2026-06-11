package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdy extends zzbcs implements zzea {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzv.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzv zzh() {
        Parcel zzcZ = zzcZ(4, zza());
        zzv zzvVar = (zzv) zzbcu.zzb(zzcZ, zzv.CREATOR);
        zzcZ.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() {
        Parcel zzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }
}
