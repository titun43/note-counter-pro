package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzeoy extends zzcaq {
    final /* synthetic */ zzddq zza;
    final /* synthetic */ zzdbd zzb;
    final /* synthetic */ zzdcm zzc;
    final /* synthetic */ zzdjv zzd;

    public zzeoy(zzeoz zzeozVar, zzddq zzddqVar, zzdbd zzdbdVar, zzdcm zzdcmVar, zzdjv zzdjvVar) {
        this.zza = zzddqVar;
        this.zzb = zzdbdVar;
        this.zzc = zzdcmVar;
        this.zzd = zzdjvVar;
        Objects.requireNonNull(zzeozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzh(a3.a aVar) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzi(a3.a aVar) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzj(a3.a aVar) {
        this.zza.zzdT(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzk(a3.a aVar, zzcas zzcasVar) {
        this.zzd.zzb(zzcasVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzl(a3.a aVar) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzn(a3.a aVar) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzo(a3.a aVar) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzp(a3.a aVar) {
        this.zzd.zzb(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zze(a3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzg(a3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzf(a3.a aVar, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzm(a3.a aVar, int i5) {
    }
}
