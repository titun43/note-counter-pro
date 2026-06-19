package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzdzs extends com.google.android.gms.ads.internal.client.zzbj {
    final /* synthetic */ zzdzm zza;
    final /* synthetic */ zzdzt zzb;

    public zzdzs(zzdzt zzdztVar, zzdzm zzdzmVar) {
        this.zza = zzdzmVar;
        Objects.requireNonNull(zzdztVar);
        this.zzb = zzdztVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i5) {
        this.zza.zzf(this.zzb.zzd(), i5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
    }
}
