package com.google.android.gms.internal.ads;

import android.util.Range;

/* loaded from: classes.dex */
final class zzact {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public zzact(float f5) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    public final void zza(long j2, long j5) {
        double doubleValue;
        zzgrc.zza(j2 != -9223372036854775807L);
        zzgrc.zza(j5 != -9223372036854775807L);
        long j6 = this.zza;
        if (j6 != -9223372036854775807L) {
            if (this.zzb != -9223372036854775807L && j2 != j6) {
                doubleValue = (j5 - r4) / (j2 - j6);
                this.zzc = (((Double) this.zzd.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.zzc * 0.800000011920929d);
                this.zza = j2;
                this.zzb = j5;
            }
        }
        doubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        this.zzc = (((Double) this.zzd.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.zzc * 0.800000011920929d);
        this.zza = j2;
        this.zzb = j5;
    }

    public final long zzb(long j2) {
        if (this.zza == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (((j2 - r0) * this.zzc) + this.zzb);
    }

    public final void zzc(float f5) {
        zzgrc.zza(f5 > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f5));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }
}
