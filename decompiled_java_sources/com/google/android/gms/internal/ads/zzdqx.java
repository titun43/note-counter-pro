package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdqx implements zzgzl {
    final /* synthetic */ zzdxh zza;
    final /* synthetic */ zzdra zzb;

    public zzdqx(zzdra zzdraVar, zzdxh zzdxhVar) {
        this.zza = zzdxhVar;
        Objects.requireNonNull(zzdraVar);
        this.zzb = zzdraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzdxh zzdxhVar = this.zza;
        u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzb.zzd().zze(), zzdxhVar.zza());
    }
}
