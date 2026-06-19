package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class zzajm implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajm(long[] jArr, long[] jArr2, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2 == -9223372036854775807L ? zzfj.zzq(jArr2[jArr2.length - 1]) : j2;
    }

    public static zzajm zzd(long j2, zzaiq zzaiqVar, long j5) {
        int length = zzaiqVar.zzd.length;
        int i5 = length + 1;
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        jArr[0] = j2;
        long j6 = 0;
        jArr2[0] = 0;
        for (int i6 = 1; i6 <= length; i6++) {
            int i7 = i6 - 1;
            j2 += zzaiqVar.zzb + r0[i7];
            j6 += zzaiqVar.zzc + zzaiqVar.zze[i7];
            jArr[i6] = j2;
            jArr2[i6] = j6;
        }
        return new zzajm(jArr, jArr2, j5);
    }

    private static Pair zzh(long j2, long[] jArr, long[] jArr2) {
        int zzm = zzfj.zzm(jArr, j2, true, true);
        long j5 = jArr[zzm];
        long j6 = jArr2[zzm];
        int i5 = zzm + 1;
        if (i5 == jArr.length) {
            return Pair.create(Long.valueOf(j5), Long.valueOf(j6));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i5] == j5 ? 0.0d : (j2 - j5) / (r6 - j5)) * (jArr2[i5] - j6))) + j6));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        String str = zzfj.zza;
        Pair zzh = zzh(zzfj.zzp(Math.max(0L, Math.min(j2, this.zzc))), this.zzb, this.zza);
        zzafz zzafzVar = new zzafz(zzfj.zzq(((Long) zzh.first).longValue()), ((Long) zzh.second).longValue());
        return new zzafw(zzafzVar, zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        return zzfj.zzq(((Long) zzh(j2, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return -2147483647;
    }
}
