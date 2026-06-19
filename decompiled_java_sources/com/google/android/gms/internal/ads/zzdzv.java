package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzdzv extends zzcbf {
    final /* synthetic */ zzdzx zza;

    public zzdzv(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzk(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i5) {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), zzeVar.zza);
    }
}
