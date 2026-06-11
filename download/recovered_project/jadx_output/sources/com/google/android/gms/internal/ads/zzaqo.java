package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
final class zzaqo implements zzafy {
    private final zzaql zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqo(zzaql zzaqlVar, int i5, long j2, long j5) {
        this.zza = zzaqlVar;
        this.zzb = i5;
        this.zzc = j2;
        long j6 = (j5 - j2) / zzaqlVar.zzd;
        this.zzd = j6;
        this.zze = zzd(j6);
    }

    private final long zzd(long j2) {
        return zzfj.zzt(j2 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long j5 = this.zzb;
        zzaql zzaqlVar = this.zza;
        long j6 = (zzaqlVar.zzc * j2) / (j5 * 1000000);
        String str = zzfj.zza;
        long j7 = this.zzd - 1;
        long max = Math.max(0L, Math.min(j6, j7));
        long j8 = zzaqlVar.zzd;
        long zzd = zzd(max);
        long j9 = this.zzc;
        zzafz zzafzVar = new zzafz(zzd, (max * j8) + j9);
        if (zzd >= j2 || max == j7) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j10 = max + 1;
        return new zzafw(zzafzVar, new zzafz(zzd(j10), (j8 * j10) + j9));
    }
}
