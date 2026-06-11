package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzys {
    public final long zza;
    public final long zzb;

    public zzys(long j2, long j5) {
        this.zza = j2;
        this.zzb = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzys)) {
            return false;
        }
        zzys zzysVar = (zzys) obj;
        return this.zza == zzysVar.zza && this.zzb == zzysVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
