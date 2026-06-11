package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfwf;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzh implements zzfwf {
    final /* synthetic */ zzk zza;

    public zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i5, long j2) {
        this.zza.zzo().zzb(i5, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i5, long j2, String str) {
        this.zza.zzo().zzf(i5, System.currentTimeMillis() - j2, str);
    }
}
