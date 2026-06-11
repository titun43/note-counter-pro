package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.emoji2.text.u;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcdb extends zzbcs implements zzcdd {
    public zzcdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze(a3.a aVar, zzcdh zzcdhVar, zzcda zzcdaVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzcdhVar);
        zzbcu.zze(zza, zzcdaVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf(a3.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(List list, a3.a aVar, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(List list, a3.a aVar, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(zzbyk zzbykVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj(a3.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(List list, a3.a aVar, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(List list, a3.a aVar, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final a3.a zzm(a3.a aVar, a3.a aVar2, String str, a3.a aVar3) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zza.writeString(str);
        zzbcu.zze(zza, aVar3);
        return u.f(zzcZ(11, zza));
    }
}
