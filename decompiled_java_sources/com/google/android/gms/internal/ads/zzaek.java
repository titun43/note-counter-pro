package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzaek implements zzafy {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaek(long j2, long j5, int i5, int i6, boolean z4) {
        long zze;
        this.zza = j2;
        this.zzb = j5;
        this.zzc = i6 == -1 ? 1 : i6;
        this.zze = i5;
        if (j2 == -1) {
            this.zzd = -1L;
            zze = -9223372036854775807L;
        } else {
            this.zzd = j2 - j5;
            zze = zze(j2, j5, i5);
        }
        this.zzf = zze;
    }

    private static long zze(long j2, long j5, int i5) {
        return (Math.max(0L, j2 - j5) * 8000000) / i5;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long j5 = this.zzd;
        if (j5 == -1) {
            zzafz zzafzVar = new zzafz(0L, this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j6 = this.zzc;
        long j7 = (((this.zze * j2) / 8000000) / j6) * j6;
        if (j5 != -1) {
            j7 = Math.min(j7, j5 - j6);
        }
        long max = this.zzb + Math.max(j7, 0L);
        long zzd = zzd(max);
        zzafz zzafzVar2 = new zzafz(zzd, max);
        if (j5 != -1 && zzd < j2) {
            long j8 = max + j6;
            if (j8 < this.zza) {
                return new zzafw(zzafzVar2, new zzafz(zzd(j8), j8));
            }
        }
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    public final long zzd(long j2) {
        return zze(j2, this.zzb, this.zze);
    }
}
