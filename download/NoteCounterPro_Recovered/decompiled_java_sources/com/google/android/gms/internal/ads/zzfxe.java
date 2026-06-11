package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzfxe extends zzbcs implements zzfxg {
    public zzfxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final void zze() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final void zzf(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final void zzg(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final void zzh(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final void zzi(int i5) {
        Parcel zza = zza();
        zza.writeInt(i5);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final void zzj(a3.a aVar, String str, String str2) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zza.writeString(null);
        zzda(8, zza);
    }
}
