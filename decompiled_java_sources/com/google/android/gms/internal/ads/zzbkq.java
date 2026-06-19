package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbkq extends zzbcs implements zzbks {
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final a3.a zzb() {
        return u.f(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Uri zzc() {
        Parcel zzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzbcu.zzb(zzcZ, Uri.CREATOR);
        zzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final double zzd() {
        Parcel zzcZ = zzcZ(3, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zze() {
        Parcel zzcZ = zzcZ(4, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zzf() {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Map zzg() {
        Parcel zzcZ = zzcZ(6, zza());
        HashMap zzg = zzbcu.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
