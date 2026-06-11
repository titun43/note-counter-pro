package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzagr implements zzafy {
    final /* synthetic */ zzagt zza;
    private final long zzb;

    public zzagr(zzagt zzagtVar, long j2) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzagt zzagtVar = this.zza;
        zzafw zzg = zzagtVar.zzh()[0].zzg(j2);
        for (int i5 = 1; i5 < zzagtVar.zzh().length; i5++) {
            zzafw zzg2 = zzagtVar.zzh()[i5].zzg(j2);
            if (zzg2.zza.zzc < zzg.zza.zzc) {
                zzg = zzg2;
            }
        }
        return zzg;
    }
}
