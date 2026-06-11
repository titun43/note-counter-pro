package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzabu {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final void zza() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zzb() {
        return this.zzd > 15 && this.zzh == 0;
    }

    public final boolean zzc() {
        long j2 = this.zzd;
        if (j2 == 0) {
            return false;
        }
        return this.zzg[(int) ((j2 - 1) % 15)];
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze() {
        long j2 = this.zze;
        if (j2 == 0) {
            return 0L;
        }
        return this.zzf / j2;
    }

    public final void zzf(long j2) {
        long j5 = this.zzd;
        if (j5 == 0) {
            this.zza = j2;
        } else if (j5 == 1) {
            long j6 = j2 - this.zza;
            this.zzb = j6;
            this.zzf = j6;
            this.zze = 1L;
        } else {
            long j7 = j2 - this.zzc;
            int i5 = (int) (j5 % 15);
            if (Math.abs(j7 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j7;
                boolean[] zArr = this.zzg;
                if (zArr[i5]) {
                    zArr[i5] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i5]) {
                    zArr2[i5] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j2;
    }
}
