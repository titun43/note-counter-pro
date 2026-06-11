package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbuf extends zzbcs implements IInterface {
    public zzbuf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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

    public final String zzj() {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzk() {
        zzda(8, zza());
    }

    public final void zzl(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(9, zza);
    }

    public final void zzm(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(10, zza);
    }

    public final boolean zzn() {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzo() {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final Bundle zzp() {
        Parcel zzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final void zzq(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(14, zza);
    }

    public final a3.a zzr() {
        return u.f(zzcZ(15, zza()));
    }

    public final com.google.android.gms.ads.internal.client.zzed zzs() {
        Parcel zzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbkl zzt() {
        Parcel zzcZ = zzcZ(19, zza());
        zzbkl zzj = zzbkk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final a3.a zzu() {
        return u.f(zzcZ(20, zza()));
    }

    public final a3.a zzv() {
        return u.f(zzcZ(21, zza()));
    }

    public final void zzw(a3.a aVar, a3.a aVar2, a3.a aVar3) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        zzda(22, zza);
    }
}
