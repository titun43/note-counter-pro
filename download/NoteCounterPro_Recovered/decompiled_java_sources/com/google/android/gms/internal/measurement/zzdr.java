package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
final class zzdr extends zzdt {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzee zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzee zzeeVar, Long l5, String str, String str2, Bundle bundle, boolean z4, boolean z5) {
        super(zzeeVar, true);
        this.zzg = zzeeVar;
        this.zza = l5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z4;
        this.zzf = z5;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        Long l5 = this.zza;
        long longValue = l5 == null ? this.zzh : l5.longValue();
        zzccVar = this.zzg.zzj;
        b0.g(zzccVar);
        zzccVar.logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}
