package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzdzw extends zzcbb {
    final /* synthetic */ zzdzx zza;

    public zzdzw(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zze() {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzm(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzf() {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzo(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzg(zzcaw zzcawVar) {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzp(zzdzxVar.zzd(), zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzh(int i5) {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzj() {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzq(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzk() {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzr(zzdzxVar.zzd());
    }
}
