package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbug extends zzbcs implements zzbui {
    public zzbug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzA() {
        Parcel zzcZ = zzcZ(24, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzB() {
        Parcel zzcZ = zzcZ(25, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzC() {
        zzda(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zze() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final List zzf() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbcu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzg() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzbks zzh() {
        Parcel zzcZ = zzcZ(5, zza());
        zzbks zzh = zzbkr.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzi() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzj() {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final double zzk() {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzl() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzm() {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final com.google.android.gms.ads.internal.client.zzed zzn() {
        Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzbkl zzo() {
        Parcel zzcZ = zzcZ(12, zza());
        zzbkl zzj = zzbkk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final a3.a zzp() {
        return u.f(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final a3.a zzq() {
        return u.f(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final a3.a zzr() {
        return u.f(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final Bundle zzs() {
        Parcel zzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzt() {
        Parcel zzcZ = zzcZ(17, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzu() {
        Parcel zzcZ = zzcZ(18, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzv() {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzw(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzx(a3.a aVar, a3.a aVar2, a3.a aVar3) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzy(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzz() {
        Parcel zzcZ = zzcZ(23, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }
}
