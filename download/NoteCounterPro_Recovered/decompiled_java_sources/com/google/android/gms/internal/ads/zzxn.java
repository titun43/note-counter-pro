package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzxn implements zzyc {
    final /* synthetic */ zzxq zza;
    private final int zzb;

    public zzxn(zzxq zzxqVar, int i5) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzb = i5;
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i5) {
        return this.zza.zzs(this.zzb, zzlhVar, zzihVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j2) {
        return this.zza.zzt(this.zzb, j2);
    }
}
