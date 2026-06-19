package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzlo {
    public final zzwk zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public zzlo(zzwk zzwkVar, long j2, long j5, long j6, long j7, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        boolean z9 = true;
        zzgrc.zza(!z8 || z6);
        if (z7 && !z6) {
            z9 = false;
        }
        zzgrc.zza(z9);
        this.zza = zzwkVar;
        this.zzb = j2;
        this.zzc = j5;
        this.zzd = j6;
        this.zze = j7;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z6;
        this.zzi = z7;
        this.zzj = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlo.class == obj.getClass()) {
            zzlo zzloVar = (zzlo) obj;
            if (this.zzb == zzloVar.zzb && this.zzc == zzloVar.zzc && this.zzd == zzloVar.zzd && this.zze == zzloVar.zze && this.zzh == zzloVar.zzh && this.zzi == zzloVar.zzi && this.zzj == zzloVar.zzj && Objects.equals(this.zza, zzloVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j2 = this.zze;
        long j5 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j5)) * 31) + ((int) j2)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzlo zza(long j2) {
        return j2 == this.zzb ? this : new zzlo(this.zza, j2, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzlo zzb(long j2) {
        return j2 == this.zzc ? this : new zzlo(this.zza, this.zzb, j2, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
