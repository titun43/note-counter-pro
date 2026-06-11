package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbue extends zzbcs implements IInterface {
    public zzbue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzf() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbcu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    public final String zzg() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final zzbks zzh() {
        Parcel zzcZ = zzcZ(5, zza());
        zzbks zzh = zzbkr.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    public final String zzi() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final double zzj() {
        Parcel zzcZ = zzcZ(7, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final String zzk() {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzl() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzm() {
        zzda(10, zza());
    }

    public final void zzn(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(11, zza);
    }

    public final void zzo(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(12, zza);
    }

    public final boolean zzp() {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzq() {
        Parcel zzcZ = zzcZ(14, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final Bundle zzr() {
        Parcel zzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final void zzs(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(16, zza);
    }

    public final com.google.android.gms.ads.internal.client.zzed zzt() {
        Parcel zzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final a3.a zzu() {
        return u.f(zzcZ(18, zza()));
    }

    public final zzbkl zzv() {
        Parcel zzcZ = zzcZ(19, zza());
        zzbkl zzj = zzbkk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final a3.a zzw() {
        return u.f(zzcZ(20, zza()));
    }

    public final a3.a zzx() {
        return u.f(zzcZ(21, zza()));
    }

    public final void zzy(a3.a aVar, a3.a aVar2, a3.a aVar3) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        zzda(22, zza);
    }
}
