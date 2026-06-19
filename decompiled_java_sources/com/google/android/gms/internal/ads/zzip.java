package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzip {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzip(float f5, float f6, long j2, float f7, long j5, long j6, float f8, byte[] bArr) {
        this.zza = j5;
        this.zzb = j6;
    }

    private final void zzf() {
        long j2;
        long j5 = this.zzc;
        if (j5 != -9223372036854775807L) {
            j2 = this.zzd;
            if (j2 == -9223372036854775807L) {
                long j6 = this.zzf;
                if (j6 != -9223372036854775807L && j5 < j6) {
                    j5 = j6;
                }
                j2 = this.zzg;
                if (j2 == -9223372036854775807L || j5 <= j2) {
                    j2 = j5;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.zze == j2) {
            return;
        }
        this.zze = j2;
        this.zzh = j2;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j2, long j5, float f5) {
        return (long) ((j5 * 9.999871E-4f) + (j2 * 0.999f));
    }

    public final void zza(zzaf zzafVar) {
        long j2 = zzafVar.zza;
        this.zzc = zzfj.zzq(-9223372036854775807L);
        this.zzf = zzfj.zzq(-9223372036854775807L);
        this.zzg = zzfj.zzq(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j2) {
        this.zzd = j2;
        zzf();
    }

    public final void zzc() {
        long j2 = this.zzh;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j5 = j2 + this.zzb;
        this.zzh = j5;
        long j6 = this.zzg;
        if (j6 != -9223372036854775807L && j5 > j6) {
            this.zzh = j6;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j2, long j5) {
        long max;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j6 = j2 - j5;
        long j7 = this.zzm;
        if (j7 == -9223372036854775807L) {
            this.zzm = j6;
            this.zzn = 0L;
        } else {
            long max2 = Math.max(j6, zzg(j7, j6, 0.999f));
            this.zzm = max2;
            this.zzn = zzg(this.zzn, Math.abs(j6 - max2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j8 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j8) {
            long zzq = zzfj.zzq(1000L);
            float f5 = this.zzk - 1.0f;
            float f6 = this.zzi - 1.0f;
            long j9 = this.zze;
            float f7 = zzq;
            long j10 = this.zzh - (((long) (f5 * f7)) + ((long) (f6 * f7)));
            long[] jArr = {j8, j9, j10};
            max = jArr[0];
            for (int i5 = 1; i5 < 3; i5++) {
                long j11 = jArr[i5];
                if (j11 > max) {
                    max = j11;
                }
            }
            this.zzh = max;
        } else {
            long max3 = j2 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j12 = this.zzh;
            String str = zzfj.zza;
            max = Math.max(j12, Math.min(max3, j8));
            this.zzh = max;
            long j13 = this.zzg;
            if (j13 != -9223372036854775807L && max > j13) {
                this.zzh = j13;
                max = j13;
            }
        }
        long j14 = j2 - max;
        if (Math.abs(j14) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float max4 = Math.max(this.zzj, Math.min((j14 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = max4;
        return max4;
    }

    public final long zze() {
        return this.zzh;
    }
}
