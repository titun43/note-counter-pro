package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaif extends zzain {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzain[] zzg;

    public zzaif(String str, int i5, int i6, long j2, long j5, zzain[] zzainVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = j2;
        this.zze = j5;
        this.zzg = zzainVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaif.class == obj.getClass()) {
            zzaif zzaifVar = (zzaif) obj;
            if (this.zzb == zzaifVar.zzb && this.zzc == zzaifVar.zzc && this.zzd == zzaifVar.zzd && this.zze == zzaifVar.zze && Objects.equals(this.zza, zzaifVar.zza) && Arrays.equals(this.zzg, zzaifVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb + 527;
        String str = this.zza;
        long j2 = this.zze;
        return str.hashCode() + (((((((i5 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j2)) * 31);
    }
}
