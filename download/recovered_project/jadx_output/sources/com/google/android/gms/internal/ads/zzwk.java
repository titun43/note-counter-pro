package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzwk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzwk(Object obj, int i5, int i6, long j2, int i7) {
        this.zza = obj;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = j2;
        this.zze = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwk)) {
            return false;
        }
        zzwk zzwkVar = (zzwk) obj;
        return this.zza.equals(zzwkVar.zza) && this.zzb == zzwkVar.zzb && this.zzc == zzwkVar.zzc && this.zzd == zzwkVar.zzd && this.zze == zzwkVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzwk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzwk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzwk(Object obj, int i5, int i6, long j2) {
        this(obj, i5, i6, j2, -1);
    }

    public zzwk(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public zzwk(Object obj, long j2, int i5) {
        this(obj, -1, -1, j2, i5);
    }
}
