package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbcy extends zzbcs implements zzbda {
    public zzbcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zze(a3.a aVar, String str) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString("GMA_SDK");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzf() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzg(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzh(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzi(int i5) {
        Parcel zza = zza();
        zza.writeInt(0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzj(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(7, zza);
    }
}
