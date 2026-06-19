package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzbku extends zzbcs implements zzbkw {
    public zzbku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzb(String str, a3.a aVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final a3.a zzc(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return u.f(zzcZ(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzd(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzdB(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzdC(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzdD(zzbkp zzbkpVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbkpVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zze() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzf(a3.a aVar, int i5) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeInt(i5);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zzg(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(6, zza);
    }
}
