package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzbkn extends zzbcs implements zzbkp {
    public zzbkn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zze() {
        Parcel zzcZ = zzcZ(2, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzf(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final a3.a zzg() {
        return u.f(zzcZ(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzh() {
        Parcel zzcZ = zzcZ(5, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzi() {
        Parcel zzcZ = zzcZ(6, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final com.google.android.gms.ads.internal.client.zzed zzj() {
        Parcel zzcZ = zzcZ(7, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzk() {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzl() {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzm(zzbma zzbmaVar) {
        throw null;
    }
}
