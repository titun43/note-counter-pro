package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaiv {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzaiv(long j2, long j5, int i5) {
        zzgrc.zza(j2 < j5);
        this.zza = j2;
        this.zzb = j5;
        this.zzc = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiv.class == obj.getClass()) {
            zzaiv zzaivVar = (zzaiv) obj;
            if (this.zza == zzaivVar.zza && this.zzb == zzaivVar.zzb && this.zzc == zzaivVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j2 = this.zza;
        long j5 = this.zzb;
        int i5 = this.zzc;
        String str = zzfj.zza;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + j2 + ", endTimeMs=" + j5 + ", speedDivisor=" + i5;
    }
}
