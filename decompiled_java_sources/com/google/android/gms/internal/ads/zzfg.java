package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzfg {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfg(long j2) {
        zzd(0L);
    }

    public static long zzi(long j2) {
        return zzfj.zzt(j2, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j2) {
        return zzfj.zzt(j2, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j2 = this.zza;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j2;
    }

    public final synchronized long zzb() {
        long j2;
        try {
            j2 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j2 != -9223372036854775807L ? j2 + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j2) {
        this.zza = j2;
        this.zzb = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.zzc;
            if (j5 != -9223372036854775807L) {
                long zzj = zzj(j5);
                long j6 = (4294967296L + zzj) / 8589934592L;
                long j7 = (((-1) + j6) * 8589934592L) + j2;
                long j8 = (j6 * 8589934592L) + j2;
                j2 = Math.abs(j7 - zzj) < Math.abs(j8 - zzj) ? j7 : j8;
            }
            return zzg(zzi(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzf(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.zzc;
            if (j5 != -9223372036854775807L) {
                long zzj = zzj(j5);
                long j6 = zzj / 8589934592L;
                long j7 = (j6 * 8589934592L) + j2;
                j2 = j7 >= zzj ? j7 : ((j6 + 1) * 8589934592L) + j2;
            }
            return zzg(zzi(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzg(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzh()) {
                long j5 = this.zza;
                if (j5 == 9223372036854775806L) {
                    Long l5 = (Long) this.zzd.get();
                    if (l5 == null) {
                        throw null;
                    }
                    j5 = l5.longValue();
                }
                this.zzb = j5 - j2;
                notifyAll();
            }
            this.zzc = j2;
            return j2 + this.zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != -9223372036854775807L;
    }
}
