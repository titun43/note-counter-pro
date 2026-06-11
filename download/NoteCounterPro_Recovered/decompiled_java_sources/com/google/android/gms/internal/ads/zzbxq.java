package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbxq extends zzbcs implements zzbxs {
    public zzbxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i5, String[] strArr, int[] iArr) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzh(Bundle bundle) {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i5, int i6, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zza.writeInt(i6);
        zzbcu.zzc(zza, intent);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(6, zza);
        if (zzcZ.readInt() != 0) {
            bundle.readFromParcel(zzcZ);
        }
        zzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() {
        zzda(9, zza());
    }
}
