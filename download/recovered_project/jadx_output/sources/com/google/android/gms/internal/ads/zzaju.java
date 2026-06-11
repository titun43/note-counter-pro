package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaju implements zzajr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaju(long j2, int i5, long j5, int i6, long j6, long[] jArr) {
        this.zza = j2;
        this.zzb = i5;
        this.zzc = j5;
        this.zzd = i6;
        this.zze = j6;
        this.zzg = jArr;
        this.zzf = j6 != -1 ? j2 + j6 : -1L;
    }

    public static zzaju zzd(zzajt zzajtVar, long j2) {
        long zzb = zzajtVar.zzb();
        if (zzb == -9223372036854775807L) {
            return null;
        }
        zzafr zzafrVar = zzajtVar.zza;
        return new zzaju(j2, zzafrVar.zzc, zzb, zzafrVar.zzf, zzajtVar.zzc, zzajtVar.zzf);
    }

    private final long zzh(int i5) {
        return (this.zzc * i5) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        if (!zzb()) {
            zzafz zzafzVar = new zzafz(0L, this.zza + this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j5 = this.zzc;
        String str = zzfj.zza;
        long max = Math.max(0L, Math.min(j2, j5));
        double d5 = (max * 100.0d) / j5;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d6 = 256.0d;
            } else {
                int i5 = (int) d5;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d7 = jArr[i5];
                d6 = (((i5 == 99 ? 256.0d : jArr[i5 + 1]) - d7) * (d5 - i5)) + d7;
            }
        }
        long j6 = this.zze;
        zzafz zzafzVar2 = new zzafz(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d6 / 256.0d) * j6), j6 - 1)));
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j2) {
        if (!zzb()) {
            return 0L;
        }
        long j5 = j2 - this.zza;
        if (j5 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d5 = (j5 * 256.0d) / this.zze;
        int zzm = zzfj.zzm(jArr, (long) d5, true, true);
        long zzh = zzh(zzm);
        long j6 = jArr[zzm];
        int i5 = zzm + 1;
        long zzh2 = zzh(i5);
        return Math.round((j6 == (zzm == 99 ? 256L : jArr[i5]) ? 0.0d : (d5 - j6) / (r0 - j6)) * (zzh2 - zzh)) + zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzd;
    }
}
