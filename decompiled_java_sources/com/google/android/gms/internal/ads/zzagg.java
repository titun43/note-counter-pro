package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzagg {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzagg(int i5, byte[] bArr, int i6, int i7) {
        this.zza = i5;
        this.zzb = bArr;
        this.zzc = i6;
        this.zzd = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagg.class == obj.getClass()) {
            zzagg zzaggVar = (zzagg) obj;
            if (this.zza == zzaggVar.zza && this.zzc == zzaggVar.zzc && this.zzd == zzaggVar.zzd && Arrays.equals(this.zzb, zzaggVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i5 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
